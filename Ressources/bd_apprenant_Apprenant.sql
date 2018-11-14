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
-- Table structure for table `Apprenant`
--

DROP TABLE IF EXISTS `Apprenant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `Apprenant` (
  `idApprenant` int(11) NOT NULL,
  `nomApprenant` varchar(50) NOT NULL,
  `prenomApprenant` varchar(50) NOT NULL,
  `dateNaissance` date NOT NULL,
  `emailApprenant` varchar(50) NOT NULL,
  `photoApprenant` blob NOT NULL,
  `idRegion` int(11) NOT NULL,
  PRIMARY KEY (`idApprenant`),
  KEY `Apprenant_Region_FK` (`idRegion`),
  CONSTRAINT `Apprenant_Region_FK` FOREIGN KEY (`idRegion`) REFERENCES `region` (`idregion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Apprenant`
--

LOCK TABLES `Apprenant` WRITE;
/*!40000 ALTER TABLE `Apprenant` DISABLE KEYS */;
INSERT INTO `Apprenant` VALUES (1,'AUTRIQUE','Géraldine','1970-12-27','geraldine.autrique@laposte.fr',_binary '\\func ',2),(2,'FILINE','Nicolas','1986-08-07','nicolas.filine@laposte.fr',_binary '\\func ',1),(3,'GORCE','Pierre','1976-08-07','pierrexgorce@gmail.com',_binary '\\func ',1),(4,'JOBLON','Samuel','1973-10-18','samuel.joblon@gmail.com',_binary '\\func ',1),(5,'KHAMVONGSA','Phoneprasong','1985-05-26','pomlao@hotmail.com',_binary '\\func ',2),(6,'LEBEGUE','Vincent','1986-08-13','vincent.lebegue@labanquepostale.fr',_binary '\\func ',1),(7,'LONDEIX','Matthieu','1981-05-19','matthieu.londeix@laposte.fr',_binary '\\func ',3),(8,'LONGUEVILLE','Thomas','1972-04-26','thomas.longueville@laposte.fr',_binary '\\func ',2),(9,'METIVIER','Christine','1980-04-29','christine.pereira@laposte.fr',_binary '\\func ',1),(10,'PICARD','Laurent','1972-05-23','laurent2.picard@laposte.fr',_binary '\\func ',1),(11,'POULINE','David','1982-07-07','david.pouline@facteo.fr',_binary '\\func ',2),(12,'PROD\'HOMME','Julien','1990-08-31','prodhomme.julien@gmail.com',_binary '\\func ',1),(13,'SABOT','Samuel','1980-04-10','samuel.sabot@facteo.fr',_binary '\\func ',2),(14,'SANCESARIO','Salva','1975-05-10','salvatore.sancesario@facteo.fr',_binary '\\func ',1),(15,'SYLVESTRE','David','1986-07-06','david.sylvestre@mfacteur.fr',_binary '\\func ',3),(16,'TRESSOUS','Cédric','1984-08-08','cedric.tressous@gmail.com',_binary '\\func ',3),(17,'ZEBUTRUC','Zébulon','1977-03-13','zebulon.zeb@free.fr',_binary '\\func ',2);
/*!40000 ALTER TABLE `Apprenant` ENABLE KEYS */;
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
