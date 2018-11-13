drop schema if exists SIS_DB;
create database if not exists SIS_DB charset UTF8MB4;
use SIS_DB;
CREATE TABLE IF NOT EXISTS Department (
    idDepartment INT,
    name VARCHAR(50),
    description VARCHAR(255),
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idDepartment)
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS Genre (
    idGenre INT,
    idDepartment INT,
    name VARCHAR(50),
    description VARCHAR(255),
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idGenre),
    FOREIGN KEY (idDepartment)
        REFERENCES Department (idDepartment)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS Program (
    idProgram INT,
    idDepartment INT,
    length INT,
    credit INT,
    optionalCredit INT,
    description VARCHAR(255),
    PRIMARY KEY (idProgram , idDepartment),
    FOREIGN KEY (idDepartment)
        REFERENCES Department (idDepartment)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS Permission (
    idPermission INT,
    name VARCHAR(50),
    content VARCHAR(255),
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idPermission)
)  DEFAULT CHARACTER SET=UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailPermission (
    idPermission INT,
    idDetailPermission INT,
    name VARCHAR(50),
    status VARCHAR(20),
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idPermission , idDetailPermission),
    FOREIGN KEY (idPermission)
        REFERENCES Permission (idPermission)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;
CREATE TABLE IF NOT EXISTS Account (
    idAccount INT,
    idPermission INT,
    username VARCHAR(16),
    `password` VARCHAR(255),
    salt VARCHAR(255),
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idAccount),
    FOREIGN KEY (idPermission)
        REFERENCES Permission (idPermission)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;
CREATE TABLE IF NOT EXISTS Student (
    idStudent INT,
    idProgram INT,
    fullName VARCHAR(50),
    address VARCHAR(255),
    phoneNumber VARCHAR(15),
    dateOfBirth DATE,
    email VARCHAR(50),
    type INT,
    position VARCHAR(255),
    warningLevel INT,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idStudent),
    FOREIGN KEY (idStudent)
        REFERENCES Account (idAccount)
        ON UPDATE CASCADE ON DELETE NO ACTION,
    FOREIGN KEY (idProgram)
        REFERENCES Program (idProgram)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS Subject (
    idSubject VARCHAR(10),
    idGenre INT,
    name VARCHAR(255),
    creditSubject INT,
    creditTuition INT,
    lenght INT,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idSubject),
    FOREIGN KEY (idGenre)
        REFERENCES Genre (idGenre)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS SubjectParent (
    idSubject VARCHAR(10),
    idSubjectParent VARCHAR(10),
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idSubject , idSubjectParent),
    FOREIGN KEY (idSubject)
        REFERENCES Subject (idSubject)
        ON UPDATE CASCADE ON DELETE NO ACTION,
    FOREIGN KEY (idSubjectParent)
        REFERENCES Subject (idSubject)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS SubjectRegister (
    idRegister INT,
    idStudent INT,
    semester VARCHAR(5),
    credit INT,
    maxCredit INT,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idRegister),
    FOREIGN KEY (idStudent)
        REFERENCES Student (idStudent)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS DetailSubjectRegister (
    idRegister INT,
    idSubject VARCHAR(10),
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idRegister , idSubject),
    FOREIGN KEY (idRegister)
        REFERENCES SubjectRegister (idRegister)
        ON UPDATE CASCADE ON DELETE NO ACTION,
    FOREIGN KEY (idSubject)
        REFERENCES Subject (idSubject)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS Schedule (
    idSubject VARCHAR(10),
    idSchedule INT,
    room VARCHAR(20),
    time VARCHAR(20),
    startWeek INT,
    size INT,
    maxSize INT,
    status INT,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idSchedule),
    FOREIGN KEY (idSubject)
        REFERENCES Subject (idSubject)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;
CREATE TABLE IF NOT EXISTS RegisterClass (
    idRegister INT,
    idStudent INT,
    semester VARCHAR(5),
    totalCredit INT,
    tuitionPaid INT,
    totalTuition INT,
    tuitionDeadline1 DATE,
    tuitionDeadline2 DATE,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idRegister),
    FOREIGN KEY (idStudent)
        REFERENCES Student (idStudent)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;
-- Có thể thêm bảng giáo viên nhưng để đơn giản sẽ bỏ ... QUản lý nhân lực
CREATE TABLE IF NOT EXISTS DetailRegisterClass (
    idRegister INT,
    idSchedule INT,
    classCode VARCHAR(10),
    tuition INT,
    midSemPoint INT,
    finalSemPoint INT,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idRegister , idSchedule),
    FOREIGN KEY (idRegister)
        REFERENCES RegisterClass (idRegister)
        ON UPDATE CASCADE ON DELETE NO ACTION,
    FOREIGN KEY (idSchedule)
        REFERENCES Schedule (idSchedule)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;

CREATE TABLE IF NOT EXISTS Toeic (
    idstudent INT,
    semester VARCHAR(5),
    `date` DATE,
    point INT,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idstudent),
    FOREIGN KEY (idstudent)
        REFERENCES Student (idStudent)
)  DEFAULT CHARACTER SET=UTF8MB4;
CREATE TABLE IF NOT EXISTS Manager (
    idManager INT,
    fullname VARCHAR(50),
    address VARCHAR(255),
    phonenumber VARCHAR(15),
    dateofbirth DATE,
    email VARCHAR(25),
    position VARCHAR(255),
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idManager),
    FOREIGN KEY (idManager)
        REFERENCES Account (idAccount)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;
CREATE TABLE IF NOT EXISTS LearningChart (
    idLearningChart INT,
    idStudent INT,
    totalCredit INT,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idLearningChart),
    FOREIGN KEY (idStudent)
        REFERENCES Student (idStudent)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;
CREATE TABLE IF NOT EXISTS DetailLearningChart (
    idLearningChart INT,
    idSubject VARCHAR(10),
    semester VARCHAR(5),
    credit INT,
    stt INT,
    timeModified VARCHAR(20),
    PRIMARY KEY (idLearningChart , idSubject),
    FOREIGN KEY (idLearningChart)
        REFERENCES LearningChart (idLearningChart)
        ON UPDATE CASCADE ON DELETE NO ACTION,
    FOREIGN KEY (idSubject)
        REFERENCES Subject (idSubject)
        ON UPDATE CASCADE ON DELETE NO ACTION
)  DEFAULT CHARACTER SET=UTF8MB4;
