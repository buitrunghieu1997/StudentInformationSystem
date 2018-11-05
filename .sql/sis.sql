-- drop schema SIS_DB;
-- Có thể tạo thêm bảng khoa viện bộ môn, bảng nhóm ngành |-> lớp -> sinh viên. Nếu có điều kiện sẽ sửa lại db sau
drop schema SIS_DB;
create
database
if
not
exists
SIS_DB
charset
UTF8MB4;
use
SIS_DB;
CREATE TABLE IF NOT EXISTS Permission
(
  idPermission
  INT,
  name
  VARCHAR
(
  50
),
  content VARCHAR
(
  255
),
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idPermission
)
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailPermission
(
  idPermission
  INT,
  idDetailPermission
  INT,
  name
  VARCHAR
(
  50
),
  status VARCHAR
(
  20
),
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idPermission,
  idDetailPermission
),
  FOREIGN KEY
(
  idPermission
)
  REFERENCES Permission
(
  idPermission
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS Account
(
  idAccount
               INT,
  idPermission
               INT,
  username
               VARCHAR
(
  16
),
  `password`   VARCHAR
(
  255
),
  salt         varchar(255),
  stt          INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idAccount
),
  FOREIGN KEY
(
  idPermission
)
  REFERENCES Permission
(
  idPermission
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS Student
(
  idStudent
  INT,
  fullname
  VARCHAR
(
  50
),
  address VARCHAR
(
  255
),
  phonenumber VARCHAR
(
  15
),
  dateofbirth DATE,
  email VARCHAR
(
  50
),
  stt INT,
  timeModified varchar
(
  20
),
  position VARCHAR
(
  255
),
  PRIMARY KEY
(
  idStudent
),
  FOREIGN KEY
(
  idStudent
)
  REFERENCES Account
(
  idAccount
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS RegisterFee
(
  idRegister
  INT,
  idStudent
  INT,
  semester
  VARCHAR
(
  5
),
  totalCredit INT,
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idRegister
),
  FOREIGN KEY
(
  idStudent
)
  REFERENCES Student
(
  idStudent
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS Subject
(
  idSubject
  INT,
  name
  VARCHAR
(
  255
),
  creditSubject INT,
  creditTuition INT,
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idSubject
)
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailRegisterFee
(
  idRegiter
  INT,
  idSubject
  INT,
  credit
  INT,
  stt
  INT,
  timeModified
  varchar
(
  20
),
  PRIMARY KEY
(
  idSubject,
  idRegiter
),
  FOREIGN KEY
(
  idRegiter
)
  REFERENCES RegisterFee
(
  idRegister
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION,
  FOREIGN KEY
(
  idSubject
)
  REFERENCES Subject
(
  idSubject
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailSubject
(
  idDetailSubject
  INT,
  idSubject
  INT,
  semester
  VARCHAR
(
  5
),
  room VARCHAR
(
  10
),
  time VARCHAR
(
  20
),
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idDetailSubject,
  idSubject
),
  FOREIGN KEY
(
  idSubject
)
  REFERENCES Subject
(
  idSubject
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS RegisterSubject
(
  idRegister
  INT,
  idSubject
  INT,
  semester
  VARCHAR
(
  5
),
  credit INT,
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idRegister,
  idSubject
),
  FOREIGN KEY
(
  idSubject
)
  REFERENCES Subject
(
  idSubject
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailRegisterSubject
(
  idRegister
  INT,
  idDetailRegister
  INT,
  idSubject
  INT,
  stt
  INT,
  timeModified
  varchar
(
  20
),
  PRIMARY KEY
(
  idRegister,
  idDetailRegister
),
  FOREIGN KEY
(
  idRegister
)
  REFERENCES RegisterSubject
(
  idRegister
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION,
  FOREIGN KEY
(
  idSubject
)
  REFERENCES Subject
(
  idSubject
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS TimeTable
(
  idTimeTable
  INT,
  idStudent
  INT,
  semester
  VARCHAR
(
  5
),
  totalCredit INT,
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idTimeTable
),
  FOREIGN KEY
(
  idStudent
)
  REFERENCES Student
(
  idStudent
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailTimeTable
(
  idDetailTimeTable
  INT,
  idTimeTable
  INT,
  idDetailSubject
  INT,
  credit
  INT,
  midSemPoint
  INT,
  endSemPoint
  INT,
  stt
  INT,
  timeModified
  varchar
(
  20
),
  PRIMARY KEY
(
  idTimeTable,
  idDetailTimeTable
),
  FOREIGN KEY
(
  idTimeTable
)
  REFERENCES TimeTable
(
  idTimeTable
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION,
  FOREIGN KEY
(
  idDetailSubject
)
  REFERENCES DetailSubject
(
  idDetailSubject
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS Toeic
(
  idstudent
  INT,
  semester
  VARCHAR
(
  5
),
  `date` DATE,
  point INT,
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idstudent
),
  FOREIGN KEY
(
  idstudent
)
  REFERENCES Student
(
  idStudent
)
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS Manager
(
  idManager
  INT,
  fullname
  VARCHAR
(
  50
),
  address VARCHAR
(
  255
),
  phonenumber VARCHAR
(
  15
),
  dateofbirth DATE,
  email VARCHAR
(
  25
),
  position VARCHAR
(
  255
),
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idManager
),
  FOREIGN KEY
(
  idManager
)
  REFERENCES Account
(
  idAccount
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS LearningChart
(
  idLearningChart
  INT,
  idStudent
  INT,
  stt
  INT,
  timeModified
  varchar
(
  20
),
  PRIMARY KEY
(
  idLearningChart
),
  FOREIGN KEY
(
  idStudent
)
  REFERENCES Student
(
  idStudent
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailLearningChart
(
  idLearningChart
  INT,
  idDetailLeaningChart
  INT,
  idSubject
  INT,
  semester
  VARCHAR
(
  5
),
  credit INT,
  stt INT,
  timeModified varchar
(
  20
),
  PRIMARY KEY
(
  idLearningChart,
  idDetailLeaningChart
),
  FOREIGN KEY
(
  idLearningChart
)
  REFERENCES LearningChart
(
  idLearningChart
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION,
  FOREIGN KEY
(
  idSubject
)
  REFERENCES Subject
(
  idSubject
)
  ON UPDATE CASCADE
  ON DELETE NO ACTION
  ) DEFAULT CHARACTER SET =UTF8MB4;
