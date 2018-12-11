CREATE DATABASE  IF NOT EXISTS `sis_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `sis_db`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: sis_db
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `account` (
  `idAccount` int(11) NOT NULL,
  `idPermission` int(11) DEFAULT NULL,
  `username` varchar(16) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idAccount`),
  KEY `idPermission` (`idPermission`),
  CONSTRAINT `Account_ibfk_1` FOREIGN KEY (`idPermission`) REFERENCES `permission` (`idpermission`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `department` (
  `idDepartment` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idDepartment`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `detaillearningchart`
--

DROP TABLE IF EXISTS `detaillearningchart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detaillearningchart` (
  `idLearningChart` int(11) NOT NULL,
  `idSubject` varchar(10) NOT NULL,
  `semester` varchar(5) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idLearningChart`,`idSubject`),
  KEY `idSubject` (`idSubject`),
  CONSTRAINT `DetailLearningChart_ibfk_1` FOREIGN KEY (`idLearningChart`) REFERENCES `learningchart` (`idlearningchart`) ON UPDATE CASCADE,
  CONSTRAINT `DetailLearningChart_ibfk_2` FOREIGN KEY (`idSubject`) REFERENCES `subject` (`idsubject`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `detailpermission`
--

DROP TABLE IF EXISTS `detailpermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detailpermission` (
  `idPermission` int(11) NOT NULL,
  `idDetailPermission` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPermission`,`idDetailPermission`),
  CONSTRAINT `DetailPermission_ibfk_1` FOREIGN KEY (`idPermission`) REFERENCES `permission` (`idpermission`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `detailregisterclass`
--

DROP TABLE IF EXISTS `detailregisterclass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detailregisterclass` (
  `idRegister` int(11) NOT NULL,
  `idSchedule` int(11) NOT NULL,
  `classCode` varchar(10) DEFAULT NULL,
  `tuition` int(11) DEFAULT NULL,
  `midSemPoint` int(11) DEFAULT NULL,
  `finalSemPoint` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRegister`,`idSchedule`),
  KEY `idSchedule` (`idSchedule`),
  CONSTRAINT `DetailRegisterClass_ibfk_1` FOREIGN KEY (`idRegister`) REFERENCES `registerclass` (`idregister`) ON UPDATE CASCADE,
  CONSTRAINT `DetailRegisterClass_ibfk_2` FOREIGN KEY (`idSchedule`) REFERENCES `schedule` (`idschedule`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `detailsubjectregister`
--

DROP TABLE IF EXISTS `detailsubjectregister`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `detailsubjectregister` (
  `idRegister` int(11) NOT NULL,
  `idSubject` varchar(10) NOT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRegister`,`idSubject`),
  KEY `idSubject` (`idSubject`),
  CONSTRAINT `DetailSubjectRegister_ibfk_1` FOREIGN KEY (`idRegister`) REFERENCES `subjectregister` (`idregister`) ON UPDATE CASCADE,
  CONSTRAINT `DetailSubjectRegister_ibfk_2` FOREIGN KEY (`idSubject`) REFERENCES `subject` (`idsubject`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `genre`
--

DROP TABLE IF EXISTS `genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `genre` (
  `idGenre` int(11) NOT NULL,
  `idDepartment` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idGenre`),
  KEY `idDepartment` (`idDepartment`),
  CONSTRAINT `Genre_ibfk_1` FOREIGN KEY (`idDepartment`) REFERENCES `department` (`iddepartment`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `learningchart`
--

DROP TABLE IF EXISTS `learningchart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `learningchart` (
  `idLearningChart` int(11) NOT NULL,
  `idStudent` int(11) DEFAULT NULL,
  `totalCredit` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idLearningChart`),
  KEY `idStudent` (`idStudent`),
  CONSTRAINT `LearningChart_ibfk_1` FOREIGN KEY (`idStudent`) REFERENCES `student` (`idstudent`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `manager`
--

DROP TABLE IF EXISTS `manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `manager` (
  `idManager` int(11) NOT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phonenumber` varchar(15) DEFAULT NULL,
  `dateofbirth` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idManager`),
  CONSTRAINT `Manager_ibfk_1` FOREIGN KEY (`idManager`) REFERENCES `account` (`idaccount`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `permission`
--

DROP TABLE IF EXISTS `permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `permission` (
  `idPermission` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idPermission`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `program`
--

DROP TABLE IF EXISTS `program`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `program` (
  `idProgram` int(11) NOT NULL,
  `idDepartment` int(11) NOT NULL,
  `length` int(11) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `optionalCredit` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idProgram`,`idDepartment`),
  KEY `idDepartment` (`idDepartment`),
  CONSTRAINT `Program_ibfk_1` FOREIGN KEY (`idDepartment`) REFERENCES `department` (`iddepartment`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `registerclass`
--

DROP TABLE IF EXISTS `registerclass`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `registerclass` (
  `idRegister` int(11) NOT NULL,
  `idStudent` int(11) DEFAULT NULL,
  `semester` varchar(5) DEFAULT NULL,
  `totalCredit` int(11) DEFAULT NULL,
  `tuitionPaid` int(11) DEFAULT NULL,
  `totalTuition` int(11) DEFAULT NULL,
  `tuitionDeadline1` varchar(255) DEFAULT NULL,
  `tuitionDeadline2` varchar(255) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRegister`),
  KEY `idStudent` (`idStudent`),
  CONSTRAINT `RegisterClass_ibfk_1` FOREIGN KEY (`idStudent`) REFERENCES `student` (`idstudent`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `schedule`
--

DROP TABLE IF EXISTS `schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `schedule` (
  `idSubject` varchar(10) DEFAULT NULL,
  `idSchedule` int(11) NOT NULL,
  `room` varchar(20) DEFAULT NULL,
  `time` varchar(20) DEFAULT NULL,
  `startWeek` int(11) DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `maxSize` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idSchedule`),
  KEY `idSubject` (`idSubject`),
  CONSTRAINT `Schedule_ibfk_1` FOREIGN KEY (`idSubject`) REFERENCES `subject` (`idsubject`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `student` (
  `idStudent` int(11) NOT NULL,
  `idProgram` int(11) DEFAULT NULL,
  `fullName` varchar(50) DEFAULT NULL,
  `gender` int(1) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `personality` varchar(50) DEFAULT NULL,
  `religion` varchar(50) DEFAULT NULL,
  `placeOfBirth` varchar(255) DEFAULT NULL,
  `highSchoolGraduatedYear` int(4) DEFAULT NULL,
  `highSchool` varchar(255) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `identityID` varchar(50) DEFAULT NULL,
  `issuedDate` varchar(255) DEFAULT NULL,
  `issuedPlace` varchar(255) DEFAULT NULL,
  `phoneNumber` varchar(15) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `currentAddress` varchar(255) DEFAULT NULL,
  `permanentAddress` varchar(255) DEFAULT NULL,
  `contactAddress` varchar(255) DEFAULT NULL,
  `zone` varchar(5) DEFAULT NULL,
  `dateOfBirth` varchar(255) DEFAULT NULL,
  `position` varchar(255) DEFAULT NULL,
  `warningLevel` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idStudent`),
  KEY `idProgram` (`idProgram`),
  CONSTRAINT `Student_ibfk_1` FOREIGN KEY (`idStudent`) REFERENCES `account` (`idaccount`) ON UPDATE CASCADE,
  CONSTRAINT `Student_ibfk_2` FOREIGN KEY (`idProgram`) REFERENCES `program` (`idprogram`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subject` (
  `idSubject` varchar(10) NOT NULL,
  `idGenre` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `coefficient` float DEFAULT NULL,
  `creditSubject` int(11) DEFAULT NULL,
  `creditTuition` int(11) DEFAULT NULL,
  `lenght` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idSubject`),
  KEY `idGenre` (`idGenre`),
  CONSTRAINT `Subject_ibfk_1` FOREIGN KEY (`idGenre`) REFERENCES `genre` (`idgenre`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `subjectparent`
--

DROP TABLE IF EXISTS `subjectparent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subjectparent` (
  `idSubject` varchar(10) NOT NULL,
  `idSubjectParent` varchar(10) NOT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idSubject`,`idSubjectParent`),
  KEY `idSubjectParent` (`idSubjectParent`),
  CONSTRAINT `SubjectParent_ibfk_1` FOREIGN KEY (`idSubject`) REFERENCES `subject` (`idsubject`) ON UPDATE CASCADE,
  CONSTRAINT `SubjectParent_ibfk_2` FOREIGN KEY (`idSubjectParent`) REFERENCES `subject` (`idsubject`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `subjectregister`
--

DROP TABLE IF EXISTS `subjectregister`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `subjectregister` (
  `idRegister` int(11) NOT NULL,
  `idStudent` int(11) DEFAULT NULL,
  `semester` varchar(5) DEFAULT NULL,
  `credit` int(11) DEFAULT NULL,
  `maxCredit` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idRegister`),
  KEY `idStudent` (`idStudent`),
  CONSTRAINT `SubjectRegister_ibfk_1` FOREIGN KEY (`idStudent`) REFERENCES `student` (`idstudent`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `toeic`
--

DROP TABLE IF EXISTS `toeic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `toeic` (
  `idstudent` int(11) NOT NULL,
  `semester` varchar(5) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  `stt` int(11) DEFAULT NULL,
  `timeModified` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idstudent`),
  CONSTRAINT `Toeic_ibfk_1` FOREIGN KEY (`idstudent`) REFERENCES `student` (`idstudent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Temporary view structure for view `v_detailregisterclass`
--

DROP TABLE IF EXISTS `v_detailregisterclass`;
/*!50001 DROP VIEW IF EXISTS `v_detailregisterclass`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `v_detailregisterclass` AS SELECT 
 1 AS `idStudent`,
 1 AS `semester`,
 1 AS `idSubject`,
 1 AS `name`,
 1 AS `time`,
 1 AS `creditSubject`,
 1 AS `creditTuition`,
 1 AS `tuition`,
 1 AS `classCode`,
 1 AS `stt`,
 1 AS `nameDepartment`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_personalscoreboard`
--

DROP TABLE IF EXISTS `v_personalscoreboard`;
/*!50001 DROP VIEW IF EXISTS `v_personalscoreboard`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `v_personalscoreboard` AS SELECT 
 1 AS `idStudent`,
 1 AS `semester`,
 1 AS `idSubject`,
 1 AS `name`,
 1 AS `creditSubject`,
 1 AS `classCode`,
 1 AS `midSemPoint`,
 1 AS `finalSemPoit`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_schedule`
--

DROP TABLE IF EXISTS `v_schedule`;
/*!50001 DROP VIEW IF EXISTS `v_schedule`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `v_schedule` AS SELECT 
 1 AS `idStudent`,
 1 AS `time`,
 1 AS `lenght`,
 1 AS `room`,
 1 AS `classCode`,
 1 AS `idSubject`,
 1 AS `nameSubject`,
 1 AS `semester`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_subject`
--

DROP TABLE IF EXISTS `v_subject`;
/*!50001 DROP VIEW IF EXISTS `v_subject`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `v_subject` AS SELECT 
 1 AS `idSubject`,
 1 AS `nameSubject`,
 1 AS `length`,
 1 AS `creditSubject`,
 1 AS `creditTuition`,
 1 AS `weight`,
 1 AS `genreName`,
 1 AS `departmentName`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_toeic`
--

DROP TABLE IF EXISTS `v_toeic`;
/*!50001 DROP VIEW IF EXISTS `v_toeic`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `v_toeic` AS SELECT 
 1 AS `idStudent`,
 1 AS `fullName`,
 1 AS `dateOfBirth`,
 1 AS `semester`,
 1 AS `date`,
 1 AS `point`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `v_tuitionfee`
--

DROP TABLE IF EXISTS `v_tuitionfee`;
/*!50001 DROP VIEW IF EXISTS `v_tuitionfee`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8mb4;
/*!50001 CREATE VIEW `v_tuitionfee` AS SELECT 
 1 AS `idStudent`,
 1 AS `semester`,
 1 AS `totalCredit`,
 1 AS `tuitionPaid`,
 1 AS `totalTuition`,
 1 AS `tuitionDeadline1`,
 1 AS `tuitionDeadline2`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping events for database 'sis_db'
--

--
-- Dumping routines for database 'sis_db'
--

--
-- Final view structure for view `v_detailregisterclass`
--

/*!50001 DROP VIEW IF EXISTS `v_detailregisterclass`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_detailregisterclass` AS select `s`.`idStudent` AS `idStudent`,`rc`.`semester` AS `semester`,`sc`.`idSubject` AS `idSubject`,`su`.`name` AS `name`,`sc`.`time` AS `time`,`su`.`creditSubject` AS `creditSubject`,`su`.`creditTuition` AS `creditTuition`,`drc`.`tuition` AS `tuition`,`drc`.`classCode` AS `classCode`,`drc`.`stt` AS `stt`,`d`.`name` AS `nameDepartment` from ((((((`student` `s` join `registerclass` `rc`) join `schedule` `sc`) join `subject` `su`) join `detailregisterclass` `drc`) join `department` `d`) join `genre`) where ((`s`.`idStudent` = `rc`.`idStudent`) and (`sc`.`idSubject` = `su`.`idSubject`) and (`sc`.`idSchedule` = `drc`.`idSchedule`) and (`su`.`idGenre` = `genre`.`idGenre`) and (`genre`.`idDepartment` = `d`.`idDepartment`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_personalscoreboard`
--

/*!50001 DROP VIEW IF EXISTS `v_personalscoreboard`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_personalscoreboard` AS select `s`.`idStudent` AS `idStudent`,`rc`.`semester` AS `semester`,`su`.`idSubject` AS `idSubject`,`su`.`name` AS `name`,`su`.`creditSubject` AS `creditSubject`,`drc`.`classCode` AS `classCode`,`drc`.`midSemPoint` AS `midSemPoint`,`drc`.`finalSemPoint` AS `finalSemPoit` from ((((`student` `s` join `subject` `su`) join `detailregisterclass` `drc`) join `registerclass` `rc`) join `schedule`) where ((`s`.`idStudent` = `rc`.`idStudent`) and (`rc`.`idRegister` = `drc`.`idRegister`) and (`schedule`.`idSubject` = `su`.`idSubject`) and (`schedule`.`idSchedule` = `drc`.`idSchedule`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_schedule`
--

/*!50001 DROP VIEW IF EXISTS `v_schedule`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_schedule` AS select `s`.`idStudent` AS `idStudent`,`sc`.`time` AS `time`,`su`.`lenght` AS `lenght`,`sc`.`room` AS `room`,`drc`.`classCode` AS `classCode`,`su`.`idSubject` AS `idSubject`,`su`.`name` AS `nameSubject`,`rc`.`semester` AS `semester` from ((((`student` `s` join `subject` `su`) join `registerclass` `rc`) join `detailregisterclass` `drc`) join `schedule` `sc`) where ((`s`.`idStudent` = `rc`.`idStudent`) and (`rc`.`idRegister` = `drc`.`idRegister`) and (`drc`.`idSchedule` = `sc`.`idSchedule`) and (`sc`.`idSubject` = `su`.`idSubject`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_subject`
--

/*!50001 DROP VIEW IF EXISTS `v_subject`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_subject` AS select `s`.`idSubject` AS `idSubject`,`s`.`name` AS `nameSubject`,`s`.`lenght` AS `length`,`s`.`creditSubject` AS `creditSubject`,`s`.`creditTuition` AS `creditTuition`,`s`.`coefficient` AS `weight`,`g`.`name` AS `genreName`,`d`.`name` AS `departmentName` from ((`subject` `s` join `genre` `g`) join `department` `d`) where ((`s`.`idGenre` = `g`.`idGenre`) and (`g`.`idDepartment` = `d`.`idDepartment`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_toeic`
--

/*!50001 DROP VIEW IF EXISTS `v_toeic`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_toeic` AS select `s`.`idStudent` AS `idStudent`,`s`.`fullName` AS `fullName`,`s`.`dateOfBirth` AS `dateOfBirth`,`t`.`semester` AS `semester`,`t`.`date` AS `date`,`t`.`point` AS `point` from (`student` `s` join `toeic` `t`) where (`s`.`idStudent` = `t`.`idstudent`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `v_tuitionfee`
--

/*!50001 DROP VIEW IF EXISTS `v_tuitionfee`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `v_tuitionfee` AS select `s`.`idStudent` AS `idStudent`,`rc`.`semester` AS `semester`,`rc`.`totalCredit` AS `totalCredit`,`rc`.`tuitionPaid` AS `tuitionPaid`,`rc`.`totalTuition` AS `totalTuition`,`rc`.`tuitionDeadline1` AS `tuitionDeadline1`,`rc`.`tuitionDeadline2` AS `tuitionDeadline2` from (`student` `s` join `registerclass` `rc`) where (`s`.`idStudent` = `rc`.`idStudent`) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-09 22:46:26
