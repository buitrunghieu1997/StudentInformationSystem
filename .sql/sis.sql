drop schema if exists SIS_DB;
create database if not exists SIS_DB charset UTF8MB4;
use SIS_DB;
create table if not exists Department
(
  idDepartment int,
  name         varchar(50),
  description  varchar(255),
  stt          INT,
  timeModified VARCHAR(20),
  primary key (idDepartment)
) DEFAULT CHARACTER SET = UTF8MB4;

create table if not exists Genre
(
  idGenre      int,
  idDepartment int,
  name         varchar(50),
  description  varchar(255),
  stt          INT,
  timeModified VARCHAR(20),
  primary key (idGenre),
  FOREIGN KEY (idDepartment)
    REFERENCES Department (idDepartment)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;

create table if not exists Program
( -- chương trình học
  idProgram      int, -- Một viện có nhiều ctr đào tạo, một ctr đào tạo có thể nhiều viện có vd: Cơ khí - Việt nhật, CNTT - Việt nhật
  idDepartment   int,
  length         int,
  credit         int, -- tín chỉ cần học
  optionalCredit int, -- tín chỉ tự chọn tự do
  description    varchar(255),
  primary key (idProgram, idDepartment),
  FOREIGN KEY (idDepartment)
    REFERENCES Department (idDepartment)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;

CREATE TABLE IF NOT EXISTS Permission
(
  idPermission INT,
  name         VARCHAR(50),
  content      VARCHAR(255),
  stt          INT,
  timeModified VARCHAR(20),
  PRIMARY KEY (idPermission)
) DEFAULT CHARACTER SET = UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailPermission
(
  idPermission       INT, -- một quyền có thể thuộc về nhiều nhóm quyền 1 nhóm quyền có thể có nhiều quyền
  idDetailPermission INT,
  name               VARCHAR(50),
  status             VARCHAR(20),
  stt                INT,
  timeModified       VARCHAR(20),
  PRIMARY KEY (idPermission, idDetailPermission),
  FOREIGN KEY (idPermission)
    REFERENCES Permission (idPermission)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;
CREATE TABLE IF NOT EXISTS Account
(
  idAccount    INT,
  idPermission INT,
  username     VARCHAR(16),
  `password`   VARCHAR(255),
  salt         VARCHAR(255),
  stt          INT,
  timeModified VARCHAR(20),
  PRIMARY KEY (idAccount),
  FOREIGN KEY (idPermission)
    REFERENCES Permission (idPermission)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;
CREATE TABLE IF NOT EXISTS Student
(
  idStudent    INT,
  idProgram    int,
  fullName     VARCHAR(50),
  address      VARCHAR(255),
  phoneNumber  VARCHAR(15),
  dateOfBirth  DATE,
  email        VARCHAR(50),
  type         int, -- loại học sinh vd: loại 1: học sinh bt loại 2: khó khăn được miễn x% học phí ...  có thể dùng chính hệ số để làm type vd: 56 = 56%
  position     VARCHAR(255), -- vị trí trong trường vd: cán bộ liên chi đoàn
  warningLevel int, -- cảnh cáo học tập mức 0 1 2 3
  stt          INT,
  timeModified VARCHAR(20),
  PRIMARY KEY (idStudent),
  FOREIGN KEY (idStudent)
    REFERENCES Account (idAccount)
      ON UPDATE CASCADE ON DELETE NO ACTION,
  FOREIGN KEY (idProgram)
    REFERENCES Program (idProgram)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;

CREATE TABLE IF NOT EXISTS Subject
(
  idSubject    INT, -- Một môn học chỉ thuộc về một bộ môn
  idGenre      int,
  name         VARCHAR(255),
  stt          INT,
  timeModified VARCHAR(20),
  PRIMARY KEY (idSubject),
  foreign key (idGenre)
    references Genre (idGenre)
      on update cascade on delete no action
) DEFAULT CHARACTER SET = UTF8MB4;

CREATE TABLE IF NOT EXISTS DetailSubject
(
  idDetailSubject INT,
  idSubject       INT, -- Một môn học có thể có nhiều detail khác nhau, như thuộc về chương trình này viện này hay ct kia viện kia là bao nhiêu tín chỉ
  idSubjectParent int, -- học phần tiên quyết -- với môn tự chọn có thể k cần
  subjectCode     varchar(10), -- mã học phần
  creditSubject   INT, -- tín chỉ
  creditTuition   INT, -- Tín chỉ học phí
  lenght          int, -- độ dài là bao nhiêu tuần
  stt             INT,
  timeModified    VARCHAR(20),
  PRIMARY KEY (idDetailSubject),
  FOREIGN KEY (idSubject)
    REFERENCES Subject (idSubject)
      ON UPDATE CASCADE ON DELETE NO ACTION,
  foreign key (idSubjectParent)
    REFERENCES DetailSubject (idDetailSubject)
      ON UPDATE cascade on delete no action
) DEFAULT CHARACTER SET = UTF8MB4;

create table if not exists SubjectRegister -- đây là bảng đăng ký học phần
(
  idRegister   int,
  idStudent    int,
  semester     varchar(5),
  credit       int, -- Tín chỉ đk hiện tại
  maxCredit    int, -- tín chỉ cho phép đk tối đa phụ thuộc vào bị cảnh cáo mấy có bị giới hạn hay không
  stt          INT,
  timeModified VARCHAR(20),
  primary key (idRegister),
  foreign key (idStudent)
    references Student (idStudent)
      on UPDATE cascade on DELETE no action
) DEFAULT CHARACTER SET = UTF8MB4;

create table if not exists DetailSubjectRegister -- Đây là bảng chi tiết đăng ký học phần
(
  idRegister      int, -- 1 đk có thể có nhiều học phần
  idDetailSubject int,
  stt             INT,
  timeModified    VARCHAR(20),
  primary key (idRegister, idDetailSubject),
  foreign key (idRegister)
    references SubjectRegister (idRegister)
      on UPDATE cascade on delete no action,
  FOREIGN KEY (idDetailSubject)
    REFERENCES DetailSubject (idDetailSubject)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;

CREATE TABLE IF NOT EXISTS Schedule
(
  idDetailSubject INT,
  idSchedule      INT, -- Một chi tiết môn học có thể có nhiều lịch khác nhau
  room            VARCHAR(20),
  time            VARCHAR(20),
  startWeek       INT,
  size            int, -- số lượng người hiện tại
  maxSize         int, -- số người tối đa cho phép
  status          int, -- cancel huỷ closed chỉ cho người đã đk hay open cho cả những ng chưa đk
  stt             INT,
  timeModified    VARCHAR(20),
  PRIMARY KEY (idSchedule),
  FOREIGN KEY (idDetailSubject)
    REFERENCES DetailSubject (idDetailSubject)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;
CREATE TABLE IF NOT EXISTS RegisterClass -- đăng ký lớp
(
  idRegister       INT, -- Một đăng ký thuộc về một học sinh
  idStudent        int,
  semester         VARCHAR(5),
  totalCredit      INT,
  tuitionPaid      int, -- học phí đã đóng
  totalTuition     int, -- tổng học phí
  tuitionDeadline1 date, -- hạn đóng học phí mức đóng phải đạt trên x% với đợt 1 nếu k sẽ cảnh cáo +1
  tuitionDeadline2 date, -- hạn chót đóng học phí mức đóng phải đạt 100% k sẽ cảnh cáo + 1
  stt              INT,
  timeModified     VARCHAR(20),
  PRIMARY KEY (idRegister),
  foreign key (idStudent)
    references Student (idStudent)
      ON update cascade on delete no action
) DEFAULT CHARACTER SET = UTF8MB4;
-- Có thể thêm bảng giáo viên nhưng để đơn giản sẽ bỏ ... QUản lý nhân lực
CREATE TABLE IF NOT EXISTS DetailRegisterClass -- chi tiết đăng ký lớp
(
  idRegister    INT,
  idSchedule    int,
  classCode     varchar(10), -- mã lớp
  tuition       int, -- học phí của môn này
  midSemPoint   int, -- điểm giữa kỳ
  finalSemPoint int, -- điểm cuối kỳ
  stt           INT,
  timeModified  VARCHAR(20),
  PRIMARY KEY (idRegister, idSchedule),
  FOREIGN KEY (idRegister)
    REFERENCES RegisterClass (idRegister)
      ON UPDATE CASCADE ON DELETE NO ACTION,
  FOREIGN KEY (idSchedule)
    REFERENCES Schedule (idSchedule)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;

CREATE TABLE IF NOT EXISTS Toeic
(
  idstudent    INT,
  semester     VARCHAR(5),
  `date`       DATE,
  point        INT, -- endate = date + 2 năm nên k cần liệt kê ở đây
  stt          INT,
  timeModified VARCHAR(20),
  PRIMARY KEY (idstudent),
  FOREIGN KEY (idstudent)
    REFERENCES Student (idStudent)
) DEFAULT CHARACTER SET = UTF8MB4;
CREATE TABLE IF NOT EXISTS Manager
(
  idManager    INT,
  fullname     VARCHAR(50),
  address      VARCHAR(255),
  phonenumber  VARCHAR(15),
  dateofbirth  DATE,
  email        VARCHAR(25),
  position     VARCHAR(255),
  stt          INT,
  timeModified VARCHAR(20),
  PRIMARY KEY (idManager),
  FOREIGN KEY (idManager)
    REFERENCES Account (idAccount)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;
CREATE TABLE IF NOT EXISTS LearningChart
(
  idLearningChart INT,
  idStudent       INT,
  totalCredit     int, -- Tổng tín chỉ
  stt             INT,
  timeModified    VARCHAR(20),
  PRIMARY KEY (idLearningChart),
  FOREIGN KEY (idStudent)
    REFERENCES Student (idStudent)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailLearningChart
(
  idLearningChart INT,
  idDetailSubject INT,
  semester        VARCHAR(5),
  credit          INT,
  stt             INT,
  timeModified    VARCHAR(20),
  PRIMARY KEY (idLearningChart, idDetailSubject),
  FOREIGN KEY (idLearningChart)
    REFERENCES LearningChart (idLearningChart)
      ON UPDATE CASCADE ON DELETE NO ACTION,
  FOREIGN KEY (idDetailSubject)
    REFERENCES DetailSubject (idDetailSubject)
      ON UPDATE CASCADE ON DELETE NO ACTION
) DEFAULT CHARACTER SET = UTF8MB4;
