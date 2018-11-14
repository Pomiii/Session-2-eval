-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: localhost    Database: bd_apprenant
-- ------------------------------------------------------
-- Server version	8.0.13

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
-- Table structure for table `fait`
--

DROP TABLE IF EXISTS `fait`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `fait` (
  `idActivite` int(11) NOT NULL,
  `idApprenant` int(11) NOT NULL,
  PRIMARY KEY (`idActivite`,`idApprenant`),
  KEY `fait_Apprenant0_FK` (`idApprenant`),
  CONSTRAINT `fait_Apprenant0_FK` FOREIGN KEY (`idApprenant`) REFERENCES `apprenant` (`idapprenant`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fait`
--

LOCK TABLES `fait` WRITE;
/*!40000 ALTER TABLE `fait` DISABLE KEYS */;
INSERT INTO `fait` VALUES (1,1),(3,1),(5,1),(2,2),(4,2),(6,2),(7,3),(8,4),(10,4),(2,5),(4,5),(6,5),(1,6),(3,6),(5,6),(2,7),(4,7),(6,7),(8,8),(9,8),(10,8),(1,9),(2,9),(5,9),(11,10),(2,11),(4,11),(6,11),(1,12),(3,12),(5,12),(11,13),(8,14),(10,14),(1,15),(3,15),(5,15),(8,16);
/*!40000 ALTER TABLE `fait` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-14 15:59:19
