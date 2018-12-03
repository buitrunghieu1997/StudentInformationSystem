drop schema if exists SIS_DB;
create database if not exists SIS_DB charset UTF8MB4;
use SIS_DB;
-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 01, 2018 at 04:07 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `SIS_DB`
--

-- --------------------------------------------------------

--
-- Table structure for table `Account`
--

CREATE TABLE `Account` (
  `idAccount` int(11) NOT NULL,
  `idPermission` int(11) DEFAULT NULL,
  `username` varchar(16) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Department`
--

CREATE TABLE `Department` (
  `idDepartment` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `DetailLearningChart`
--

CREATE TABLE `DetailLearningChart` (
  `idLearningChart` int(11) NOT NULL,
  `idSubject` varchar(10) NOT NULL,
  `semester` varchar(5) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `DetailPermission`
--

CREATE TABLE `DetailPermission` (
  `idPermission` int(11) NOT NULL,
  `idDetailPermission` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `DetailRegisterClass`
--

CREATE TABLE `DetailRegisterClass` (
  `idRegister` int(11) NOT NULL,
  `idSchedule` int(11) NOT NULL,
  `classCode` varchar(10) DEFAULT NULL,
  `tuition` int(11) DEFAULT NULL,
  `midSemPoint` int(11) DEFAULT NULL,
  `finalSemPoint` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `DetailSubjectRegister`
--

CREATE TABLE `DetailSubjectRegister` (
  `idRegister` int(11) NOT NULL,
  `idSubject` varchar(10) NOT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Genre`
--

CREATE TABLE `Genre` (
  `idGenre` int(11) NOT NULL,
  `idDepartment` int(11) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `LearningChart`
--

CREATE TABLE `LearningChart` (
  `idLearningChart` int(11) NOT NULL,
  `idStudent` int(11) DEFAULT NULL,
  `totalCredit` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Manager`
--

CREATE TABLE `Manager` (
  `idManager` int(11) NOT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(15) DEFAULT NULL,
  `dateofbirth` date DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Permission`
--

CREATE TABLE `Permission` (
  `idPermission` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Program`
--

CREATE TABLE `Program` (
  `idProgram` int(11) NOT NULL,
  `idDepartment` int(11) NOT NULL,
  `length` int(11) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `optionalCredit` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `RegisterClass`
--

CREATE TABLE `RegisterClass` (
  `idRegister` int(11) NOT NULL,
  `idStudent` int(11) DEFAULT NULL,
  `semester` varchar(5) DEFAULT NULL,
  `totalCredit` int(11) DEFAULT NULL,
  `tuitionPaid` int(11) DEFAULT NULL,
  `totalTuition` int(11) DEFAULT NULL,
  `tuitionDeadline1` date DEFAULT NULL,
  `tuitionDeadline2` date DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Schedule`
--

CREATE TABLE `Schedule` (
  `idSubject` varchar(10) DEFAULT NULL,
  `idSchedule` int(11) NOT NULL,
  `room` varchar(20) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `startWeek` int(11) DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `maxSize` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Student`
--

CREATE TABLE `Student` (
  `idStudent` int(11) NOT NULL,
  `idProgram` int(11) DEFAULT NULL,
  `fullName` varchar(50) DEFAULT NULL,
  `gender` int(1) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `personality` varchar(50) DEFAULT NULL,
  `religion` varchar(50) DEFAULT NULL,
  `placeOfBirth` varchar(255) DEFAULT NULL,
  `highSchoolGraduatedYeqar` int(4) DEFAULT NULL,
  `highSchool` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `identityID` int(12) DEFAULT NULL,
  `issuedDate` date DEFAULT NULL,
  `issuedPlace` date DEFAULT NULL,
  `phoneNumber` varchar(15) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `currentAddress` varchar(255) DEFAULT NULL,
  `permanentAddress` varchar(255) DEFAULT NULL,
  `contactAddress` varchar(255) DEFAULT NULL,
  `zone` varchar(5) DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `warningLevel` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Subject`
--

CREATE TABLE `Subject` (
  `idSubject` varchar(10) NOT NULL,
  `idGenre` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `coefficient` float DEFAULT NULL,
  `creditSubject` int(11) DEFAULT NULL,
  `creditTuition` int(11) DEFAULT NULL,
  `lenght` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `SubjectParent`
--

CREATE TABLE `SubjectParent` (
  `idSubject` varchar(10) NOT NULL,
  `idSubjectParent` varchar(10) NOT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `SubjectRegister`
--

CREATE TABLE `SubjectRegister` (
  `idRegister` int(11) NOT NULL,
  `idStudent` int(11) DEFAULT NULL,
  `semester` varchar(5) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `maxCredit` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `Toeic`
--

CREATE TABLE `Toeic` (
  `idstudent` int(11) NOT NULL,
  `semester` varchar(5) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Stand-in structure for view `V_DetailRegisterClass`
-- (See below for the actual view)
--
CREATE TABLE `V_DetailRegisterClass` (
`idStudent` int(11)
,`semester` varchar(5)
,`idSubject` varchar(10)
,`name` varchar(255)
,`time` varchar(20)
,`creditSubject` int(11)
,`creditTuition` int(11)
,`tuition` int(11)
,`classCode` varchar(10)
,`stt` int(11)
,`nameDepartment` varchar(50)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `V_PersonalScoreboard`
-- (See below for the actual view)
--
CREATE TABLE `V_PersonalScoreboard` (
`idStudent` int(11)
,`semester` varchar(5)
,`idSubject` varchar(10)
,`name` varchar(255)
,`creditSubject` int(11)
,`classCode` varchar(10)
,`midSemPoint` int(11)
,`finalSemPoit` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `V_Schedule`
-- (See below for the actual view)
--
CREATE TABLE `V_Schedule` (
`idStudent` int(11)
,`time` varchar(20)
,`lenght` int(11)
,`room` varchar(20)
,`classCode` varchar(10)
,`idSubject` varchar(10)
,`nameSubject` varchar(255)
,`semester` varchar(5)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `V_Toeic`
-- (See below for the actual view)
--
CREATE TABLE `V_Toeic` (
`idStudent` int(11)
,`fullName` varchar(50)
,`dateOfBirth` date
,`semester` varchar(5)
,`date` date
,`point` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `V_TuitionFee`
-- (See below for the actual view)
--
CREATE TABLE `V_TuitionFee` (
`idStudent` int(11)
,`semester` varchar(5)
,`totalCredit` int(11)
,`tuitionPaid` int(11)
,`totalTuition` int(11)
,`tuitionDeadline1` date
,`tuitionDeadline2` date
);

-- --------------------------------------------------------

--
-- Structure for view `V_DetailRegisterClass`
--
DROP TABLE IF EXISTS `V_DetailRegisterClass`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `V_DetailRegisterClass`  AS  select `s`.`idStudent` AS `idStudent`,`rc`.`semester` AS `semester`,`sc`.`idSubject` AS `idSubject`,`su`.`name` AS `name`,`sc`.`time` AS `time`,`su`.`creditSubject` AS `creditSubject`,`su`.`creditTuition` AS `creditTuition`,`drc`.`tuition` AS `tuition`,`drc`.`classCode` AS `classCode`,`drc`.`stt` AS `stt`,`d`.`name` AS `nameDepartment` from ((((((`Student` `s` join `RegisterClass` `rc`) join `Schedule` `sc`) join `Subject` `su`) join `DetailRegisterClass` `drc`) join `Department` `d`) join `Genre`) where ((`s`.`idStudent` = `rc`.`idStudent`) and (`sc`.`idSubject` = `su`.`idSubject`) and (`sc`.`idSchedule` = `drc`.`idSchedule`) and (`su`.`idGenre` = `Genre`.`idGenre`) and (`Genre`.`idDepartment` = `d`.`idDepartment`)) ;

-- --------------------------------------------------------

--
-- Structure for view `V_PersonalScoreboard`
--
DROP TABLE IF EXISTS `V_PersonalScoreboard`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `V_PersonalScoreboard`  AS  select `s`.`idStudent` AS `idStudent`,`rc`.`semester` AS `semester`,`su`.`idSubject` AS `idSubject`,`su`.`name` AS `name`,`su`.`creditSubject` AS `creditSubject`,`drc`.`classCode` AS `classCode`,`drc`.`midSemPoint` AS `midSemPoint`,`drc`.`finalSemPoint` AS `finalSemPoit` from ((((`Student` `s` join `Subject` `su`) join `DetailRegisterClass` `drc`) join `RegisterClass` `rc`) join `Schedule`) where ((`s`.`idStudent` = `rc`.`idStudent`) and (`rc`.`idRegister` = `drc`.`idRegister`) and (`Schedule`.`idSubject` = `su`.`idSubject`) and (`Schedule`.`idSchedule` = `drc`.`idSchedule`)) ;

-- --------------------------------------------------------

--
-- Structure for view `V_Schedule`
--
DROP TABLE IF EXISTS `V_Schedule`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `V_Schedule`  AS  select `s`.`idStudent` AS `idStudent`,`sc`.`time` AS `time`,`su`.`lenght` AS `lenght`,`sc`.`room` AS `room`,`drc`.`classCode` AS `classCode`,`su`.`idSubject` AS `idSubject`,`su`.`name` AS `nameSubject`,`rc`.`semester` AS `semester` from ((((`Student` `s` join `Subject` `su`) join `RegisterClass` `rc`) join `DetailRegisterClass` `drc`) join `Schedule` `sc`) where ((`s`.`idStudent` = `rc`.`idStudent`) and (`rc`.`idRegister` = `drc`.`idRegister`) and (`drc`.`idSchedule` = `sc`.`idSchedule`) and (`sc`.`idSubject` = `su`.`idSubject`)) ;

-- --------------------------------------------------------

--
-- Structure for view `V_Toeic`
--
DROP TABLE IF EXISTS `V_Toeic`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `V_Toeic`  AS  select `s`.`idStudent` AS `idStudent`,`s`.`fullName` AS `fullName`,`s`.`dateOfBirth` AS `dateOfBirth`,`t`.`semester` AS `semester`,`t`.`date` AS `date`,`t`.`point` AS `point` from (`Student` `s` join `Toeic` `t`) where (`s`.`idStudent` = `t`.`idstudent`) ;

-- --------------------------------------------------------

--
-- Structure for view `V_TuitionFee`
--
DROP TABLE IF EXISTS `V_TuitionFee`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `V_TuitionFee`  AS  select `s`.`idStudent` AS `idStudent`,`rc`.`semester` AS `semester`,`rc`.`totalCredit` AS `totalCredit`,`rc`.`tuitionPaid` AS `tuitionPaid`,`rc`.`totalTuition` AS `totalTuition`,`rc`.`tuitionDeadline1` AS `tuitionDeadline1`,`rc`.`tuitionDeadline2` AS `tuitionDeadline2` from (`Student` `s` join `RegisterClass` `rc`) where (`s`.`idStudent` = `rc`.`idStudent`) ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Account`
--
ALTER TABLE `Account`
  ADD PRIMARY KEY (`idAccount`),
  ADD KEY `idPermission` (`idPermission`);

--
-- Indexes for table `Department`
--
ALTER TABLE `Department`
  ADD PRIMARY KEY (`idDepartment`);

--
-- Indexes for table `DetailLearningChart`
--
ALTER TABLE `DetailLearningChart`
  ADD PRIMARY KEY (`idLearningChart`,`idSubject`),
  ADD KEY `idSubject` (`idSubject`);

--
-- Indexes for table `DetailPermission`
--
ALTER TABLE `DetailPermission`
  ADD PRIMARY KEY (`idPermission`,`idDetailPermission`);

--
-- Indexes for table `DetailRegisterClass`
--
ALTER TABLE `DetailRegisterClass`
  ADD PRIMARY KEY (`idRegister`,`idSchedule`),
  ADD UNIQUE KEY `idRegister` (`idRegister`),
  ADD KEY `idSchedule` (`idSchedule`);

--
-- Indexes for table `DetailSubjectRegister`
--
ALTER TABLE `DetailSubjectRegister`
  ADD PRIMARY KEY (`idRegister`,`idSubject`),
  ADD KEY `idSubject` (`idSubject`);

--
-- Indexes for table `Genre`
--
ALTER TABLE `Genre`
  ADD PRIMARY KEY (`idGenre`),
  ADD KEY `idDepartment` (`idDepartment`);

--
-- Indexes for table `LearningChart`
--
ALTER TABLE `LearningChart`
  ADD PRIMARY KEY (`idLearningChart`),
  ADD KEY `idStudent` (`idStudent`);

--
-- Indexes for table `Manager`
--
ALTER TABLE `Manager`
  ADD PRIMARY KEY (`idManager`);

--
-- Indexes for table `Permission`
--
ALTER TABLE `Permission`
  ADD PRIMARY KEY (`idPermission`);

--
-- Indexes for table `Program`
--
ALTER TABLE `Program`
  ADD PRIMARY KEY (`idProgram`,`idDepartment`),
  ADD KEY `idDepartment` (`idDepartment`);

--
-- Indexes for table `RegisterClass`
--
ALTER TABLE `RegisterClass`
  ADD PRIMARY KEY (`idRegister`),
  ADD KEY `idStudent` (`idStudent`);

--
-- Indexes for table `Schedule`
--
ALTER TABLE `Schedule`
  ADD PRIMARY KEY (`idSchedule`),
  ADD KEY `idSubject` (`idSubject`);

--
-- Indexes for table `Student`
--
ALTER TABLE `Student`
  ADD PRIMARY KEY (`idStudent`),
  ADD KEY `idProgram` (`idProgram`);

--
-- Indexes for table `Subject`
--
ALTER TABLE `Subject`
  ADD PRIMARY KEY (`idSubject`),
  ADD KEY `idGenre` (`idGenre`);

--
-- Indexes for table `SubjectParent`
--
ALTER TABLE `SubjectParent`
  ADD PRIMARY KEY (`idSubject`,`idSubjectParent`),
  ADD KEY `idSubjectParent` (`idSubjectParent`);

--
-- Indexes for table `SubjectRegister`
--
ALTER TABLE `SubjectRegister`
  ADD PRIMARY KEY (`idRegister`),
  ADD KEY `idStudent` (`idStudent`);

--
-- Indexes for table `Toeic`
--
ALTER TABLE `Toeic`
  ADD PRIMARY KEY (`idstudent`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Account`
--
ALTER TABLE `Account`
  ADD CONSTRAINT `Account_ibfk_1` FOREIGN KEY (`idPermission`) REFERENCES `Permission` (`idPermission`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `DetailLearningChart`
--
ALTER TABLE `DetailLearningChart`
  ADD CONSTRAINT `DetailLearningChart_ibfk_1` FOREIGN KEY (`idLearningChart`) REFERENCES `LearningChart` (`idLearningChart`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `DetailLearningChart_ibfk_2` FOREIGN KEY (`idSubject`) REFERENCES `Subject` (`idSubject`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `DetailPermission`
--
ALTER TABLE `DetailPermission`
  ADD CONSTRAINT `DetailPermission_ibfk_1` FOREIGN KEY (`idPermission`) REFERENCES `Permission` (`idPermission`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `DetailRegisterClass`
--
ALTER TABLE `DetailRegisterClass`
  ADD CONSTRAINT `DetailRegisterClass_ibfk_1` FOREIGN KEY (`idRegister`) REFERENCES `RegisterClass` (`idRegister`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `DetailRegisterClass_ibfk_2` FOREIGN KEY (`idSchedule`) REFERENCES `Schedule` (`idSchedule`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `DetailSubjectRegister`
--
ALTER TABLE `DetailSubjectRegister`
  ADD CONSTRAINT `DetailSubjectRegister_ibfk_1` FOREIGN KEY (`idRegister`) REFERENCES `SubjectRegister` (`idRegister`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `DetailSubjectRegister_ibfk_2` FOREIGN KEY (`idSubject`) REFERENCES `Subject` (`idSubject`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `Genre`
--
ALTER TABLE `Genre`
  ADD CONSTRAINT `Genre_ibfk_1` FOREIGN KEY (`idDepartment`) REFERENCES `Department` (`idDepartment`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `LearningChart`
--
ALTER TABLE `LearningChart`
  ADD CONSTRAINT `LearningChart_ibfk_1` FOREIGN KEY (`idStudent`) REFERENCES `Student` (`idStudent`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `Manager`
--
ALTER TABLE `Manager`
  ADD CONSTRAINT `Manager_ibfk_1` FOREIGN KEY (`idManager`) REFERENCES `Account` (`idAccount`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `Program`
--
ALTER TABLE `Program`
  ADD CONSTRAINT `Program_ibfk_1` FOREIGN KEY (`idDepartment`) REFERENCES `Department` (`idDepartment`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `RegisterClass`
--
ALTER TABLE `RegisterClass`
  ADD CONSTRAINT `RegisterClass_ibfk_1` FOREIGN KEY (`idStudent`) REFERENCES `Student` (`idStudent`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `Schedule`
--
ALTER TABLE `Schedule`
  ADD CONSTRAINT `Schedule_ibfk_1` FOREIGN KEY (`idSubject`) REFERENCES `Subject` (`idSubject`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `Student`
--
ALTER TABLE `Student`
  ADD CONSTRAINT `Student_ibfk_1` FOREIGN KEY (`idStudent`) REFERENCES `Account` (`idAccount`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `Student_ibfk_2` FOREIGN KEY (`idProgram`) REFERENCES `Program` (`idProgram`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `Subject`
--
ALTER TABLE `Subject`
  ADD CONSTRAINT `Subject_ibfk_1` FOREIGN KEY (`idGenre`) REFERENCES `Genre` (`idGenre`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `SubjectParent`
--
ALTER TABLE `SubjectParent`
  ADD CONSTRAINT `SubjectParent_ibfk_1` FOREIGN KEY (`idSubject`) REFERENCES `Subject` (`idSubject`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `SubjectParent_ibfk_2` FOREIGN KEY (`idSubjectParent`) REFERENCES `Subject` (`idSubject`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `SubjectRegister`
--
ALTER TABLE `SubjectRegister`
  ADD CONSTRAINT `SubjectRegister_ibfk_1` FOREIGN KEY (`idStudent`) REFERENCES `Student` (`idStudent`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `Toeic`
--
ALTER TABLE `Toeic`
  ADD CONSTRAINT `Toeic_ibfk_1` FOREIGN KEY (`idstudent`) REFERENCES `Student` (`idStudent`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
