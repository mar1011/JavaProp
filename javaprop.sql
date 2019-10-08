CREATE DATABASE  IF NOT EXISTS `javaprop` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;
USE `javaprop`;
-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: javaprop
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
-- Table structure for table `casa`
--

DROP TABLE IF EXISTS `casa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8 ;
CREATE TABLE `casa` (
  `fk_id_inmueble` int(11) NOT NULL,
  `tiene_garaje` tinyint(1) NOT NULL,
  `tiene_pileta` tinyint(1) NOT NULL,
  `tiene_jardin` tinyint(1) NOT NULL,
  PRIMARY KEY (`fk_id_inmueble`),
  UNIQUE KEY `fk_id_inmueble_UNIQUE` (`fk_id_inmueble`),
  CONSTRAINT `fk_id_inmueble_casa` FOREIGN KEY (`fk_id_inmueble`) REFERENCES `inmueble` (`id_inmueble`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `casa`
--

LOCK TABLES `casa` WRITE;
/*!40000 ALTER TABLE `casa` DISABLE KEYS */;
INSERT INTO `casa` VALUES (1,1,0,1),(2,1,0,0),(6,0,0,0),(11,0,1,0),(12,0,0,1),(18,1,1,0),(19,1,1,1),(21,0,1,1);
/*!40000 ALTER TABLE `casa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8 ;
CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `movil` varchar(16) NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Nelida Maitena','Vaz','nelida_vaz157@ma1l.com','1151715129'),(2,'Eliana Ailen','Reyna','reyna.eliana153@hushma1l.com','1123354472'),(3,'Blas Fabian','Morais','blas_morais@yah00.com','1129787273'),(4,'Herminia ','Moraes','herminia_moraes113@h0tma1l.com','1167191057'),(5,'Angel Roque','Albuquerque','angel_albuquerque127@yah00.com','1155998732'),(6,'Yanina ','Mongelos Cotto','yanina_mongelos189@1nb0x.com','1150207651'),(7,'Silvina Tamara','Paez','silvina_paez@yah00.com','1167674057'),(8,'Galo Isaias','Melgar','melgar.galo175@z0h0.com','1169053238'),(9,'Luna Sol','Reyes','luna_reyes@0utl00k.com','1136868774'),(10,'Avril Malvina','Rodriguez Arocho','avril_rodriguez70@hushma1l.com','1148633623'),(11,'Alejandro Tadeo','Robin','alejandro_robin@h0tma1l.com','1149680005'),(12,'Lisandro Reinaldo','Siqueira','lisandro.siqueira@gma1l.com','1137208094'),(13,'Simona Juliana','Bertrand','simona_bertrand@h0tma1l.com','1146680272'),(14,'Felisa Kiara','Kaufmann','kaufmann_felisa134@1nb0x.com','1137522441'),(15,'Tahiel Thiago','Barros','tahiel.barros128@yah00.com','1136994120'),(16,'Evangelina ','Ferrufino','evangelina.ferrufino76@f1bertel.com','1124128420'),(17,'Aylen Analia','Cristaldo Britez','aylen.cristaldo@z0h0.com','1130902354'),(18,'Lucio ','Familia','lucio_familia@1nb0x.com','1157136173'),(19,'Claudio Arturo','Parisi Ortigoza','claudio_parisi73@hushma1l.com','1149764557'),(20,'Amelia ','Valmond','amelia_valmond159@1nb0x.com','1165113441'),(21,'Gian Teo','Langer','gian.langer173@h0tma1l.com','1160545047'),(22,'Celia Mercedes','Olmedo','olmedo.celia@z0h0.com','1143273240'),(23,'Florencia Antonela','Oliveira Villamizar','florencia_oliveira166@0utl00k.com','1135945214'),(24,'Gregoria ','Vidal','gregoria_vidal100@gma1l.com','1149375383'),(25,'Juan ','Hinojosa Servin','juan.hinojosa181@h0tma1l.com','1169260072'),(26,'Fabrizio Alcides','Coelho','fabrizio_coelho118@1nb0x.com','1124339541'),(27,'Azul Herminia','Vitali','vitali.azul163@f1bertel.com','1126611616'),(28,'Gregoria Justina','Zegarra','gregoria.zegarra144@gma1l.com','1169607150'),(29,'Estefania Helena','Jean','estefania.jean132@1nb0x.com','1150978928'),(30,'Matilde Ines','Volpe Russell','matilde_volpe137@1nb0x.com','1135643295'),(31,'Tomasa Xiomara','Schumann','tomasa.schumann189@gma1l.com','1133201627'),(32,'Sonia Oriana','Palumbo','sonia.palumbo112@z0h0.com','1166824765'),(33,'Ambar ','Alcivar','ambar.alcivar145@yah00.com','1144354076'),(34,'Manuel Gabriel','Bobadilla Jackson','manuel.bobadilla@h0tma1l.com','1164490600'),(35,'Isidro Marco','Cardona German','isidro.cardona114@ma1l.com','1163062378'),(36,'Julio Nahuel','Chicaiza','chicaiza.julio178@0utl00k.com','1142262769'),(37,'Enrique Alfredo','Quiones','quiones_enrique184@yah00.com','1165543326'),(38,'Fernando Richard','Mariani Castaño','fernando.mariani@yah00.com','1155895684'),(39,'Richard Faustino','Ferrara','richard_ferrara82@gma1l.com','1121889193'),(40,'Azul ','Donoso','azul_donoso@gma1l.com','1128210647'),(41,'Mauro Fermin','Bannis','mauro_bannis@h0tma1l.com','1159057101'),(42,'Eduardo Miguel','Li','li_eduardo134@h0tma1l.com','1125279881'),(43,'Vito Camilo','Coleman Pichardo','vito.coleman99@1nb0x.com','1145154509'),(44,'Victoria ','Soza','victoria.soza147@ma1l.com','1161471155'),(45,'Adolfo Matias','Terrazas Serafini','adolfo.terrazas107@1nb0x.com','1142365250'),(46,'Mary Angelina','Oyarzun','mary.oyarzun151@0utl00k.com','1147464697'),(47,'Jorgelina Helena','Benito','benito.jorgelina@f1bertel.com','1162257002'),(48,'Paola Elba','Alderete','alderete_paola115@hushma1l.com','1162754648'),(49,'Emily Beatriz','Jung','jung.emily130@f1bertel.com','1140417688'),(50,'Nahuel ','Cabral Watson','cabral.nahuel57@ma1l.com','1127126484'),(51,'Pamela Paula','Francois','pamela_francois126@hushma1l.com','1142271070'),(52,'Cristina Leticia','Hinojosa Oporta','cristina_hinojosa147@gma1l.com','1146185039'),(53,'Gregorio Ramon','Navarrete','gregorio_navarrete@f1bertel.com','1152638491'),(54,'Benito Oscar','Sacco Mancia','benito.sacco193@1nb0x.com','1155159126'),(55,'Angelica ','Ulloa','angelica.ulloa185@0utl00k.com','1133099795'),(56,'Valentino Iñaki','Amaya','valentino.amaya123@yah00.com','1139883062'),(57,'David Braian','Roldan','david.roldan@h0tma1l.com','1137192829'),(58,'Norma Serena','Pontes','norma_pontes192@0utl00k.com','1159401600'),(59,'Francisco Gerardo','Martnez','francisco_martnez@yah00.com','1123654991'),(60,'Rosana ','Ruggeri','rosana_ruggeri79@z0h0.com','1120606722'),(61,'Johanna Nelida','Aramayo','johanna.aramayo@hushma1l.com','1153070114'),(62,'Rita Mariana','Reynoso','rita_reynoso@gma1l.com','1131988483'),(63,'Helena Lucila','Powell','helena_powell111@yah00.com','1160536017'),(64,'Susana Vanina','Varas','susana_varas102@gma1l.com','1123592421'),(65,'Elida Melany','Gaitan','gaitan.elida142@1nb0x.com','1163299802'),(66,'Teresa Mabel','Morinigo Joseph','morinigo_teresa@gma1l.com','1164151106'),(67,'Giuliana Ayelen','Titre Napoles','giuliana.titre107@ma1l.com','1132303016'),(68,'Delfina Irina','Stedman','stedman.delfina@1nb0x.com','1153693156'),(69,'Mariela Florentina','Lozano','lozano.mariela140@z0h0.com','1126774936'),(70,'Ariel Amadeo','Alas','ariel.alas@z0h0.com','1122386189'),(71,'Barbara Luz','Martini','barbara_martini@f1bertel.com','1156806316'),(72,'Arturo Roman','Iraheta','arturo.iraheta137@z0h0.com','1156621860'),(73,'Santiago Joaquin','Fabien','santiago.fabien@ma1l.com','1138172067'),(74,'Paulina Abril','Cardenas','paulina_cardenas@f1bertel.com','1129465807'),(75,'Gustavo Sergio','Conde','conde_gustavo105@hushma1l.com','1146918778'),(76,'Catalina Zulma','Mosca Alleyne','catalina_mosca128@f1bertel.com','1162608597'),(77,'Roberto Gaston','Carvajal','roberto.carvajal150@gma1l.com','1166260736'),(78,'Hugo Claudio','Morancie','hugo_morancie67@h0tma1l.com','1143438135'),(79,'Felicitas ','Menendez Sanabria','felicitas_menendez@1nb0x.com','1167475918'),(80,'Julieta Helena','Pascal Barboza','julieta.pascal80@gma1l.com','1165525008'),(81,'Ambar Solange','Villamar','ambar.villamar@ma1l.com','1133839886'),(82,'Lautaro Arnaldo','Zhang Deoliveira','lautaro.zhang@h0tma1l.com','1146802362'),(83,'Evangelina Haydee','Dacosta','evangelina.dacosta61@0utl00k.com','1137608264'),(84,'Guadalupe Angelina','Bruno D\'Ambrosio','guadalupe.bruno115@hushma1l.com','1124143689'),(85,'Javier Mariano','Melgar','melgar_javier152@gma1l.com','1154525979'),(86,'Carmen Luisana','Sommer Zalazar','carmen.sommer57@h0tma1l.com','1124360036');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8 ;
CREATE TABLE `departamento` (
  `fk_id_inmueble` int(11) NOT NULL,
  `tiene_cochera` tinyint(1) NOT NULL,
  `tiene_baulera` tinyint(1) NOT NULL,
  PRIMARY KEY (`fk_id_inmueble`),
  KEY `fk_id_inmueble_departamento_idx` (`fk_id_inmueble`),
  CONSTRAINT `fk_id_inmueble_departamento` FOREIGN KEY (`fk_id_inmueble`) REFERENCES `inmueble` (`id_inmueble`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES (3,0,0),(4,1,0),(5,0,0),(7,1,0),(8,1,1),(9,0,0),(10,1,0),(13,0,1),(14,0,1),(15,0,0),(16,1,1),(17,0,0),(20,0,1),(22,1,1);
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inmobiliaria`
--

DROP TABLE IF EXISTS `inmobiliaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8 ;
CREATE TABLE `inmobiliaria` (
  `id_inmobiliaria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `comision` double NOT NULL,
  PRIMARY KEY (`id_inmobiliaria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inmobiliaria`
--

LOCK TABLES `inmobiliaria` WRITE;
/*!40000 ALTER TABLE `inmobiliaria` DISABLE KEYS */;
INSERT INTO `inmobiliaria` VALUES (1,'Sweet Home','sw.ho@javaprop.com',0.032),(2,'Casita Feliz','ca.fe@javaprop.com',0.037),(3,'4 Paredes','cuatro_paredes@javaprop.com',0.034);
/*!40000 ALTER TABLE `inmobiliaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inmueble`
--

DROP TABLE IF EXISTS `inmueble`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8 ;
CREATE TABLE `inmueble` (
  `id_inmueble` int(11) NOT NULL AUTO_INCREMENT,
  `fk_id_inmobiliaria` int(11) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `altura` int(10) unsigned NOT NULL,
  `piso` int(11) DEFAULT NULL,
  `depto` varchar(4) DEFAULT NULL,
  `barrio` varchar(45) NOT NULL,
  `superficie` double unsigned NOT NULL,
  `cant_ambientes` int(11) NOT NULL,
  `precio` double unsigned NOT NULL,
  `reservado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_inmueble`),
  KEY `fk_id_inmobiliaria_idx` (`fk_id_inmobiliaria`),
  CONSTRAINT `fk_id_inmobiliaria` FOREIGN KEY (`fk_id_inmobiliaria`) REFERENCES `inmobiliaria` (`id_inmobiliaria`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inmueble`
--

LOCK TABLES `inmueble` WRITE;
/*!40000 ALTER TABLE `inmueble` DISABLE KEYS */;
INSERT INTO `inmueble` VALUES (1,1,'Laferrere Gregorio De',1007,NULL,NULL,'Flores',41.3,3,98000,1),(2,1,'Caracas',84,NULL,NULL,'Flores',58.4,4,163000,0),(3,1,'Berg Carlos',1368,11,'I','Villa Soldati',43.2,3,43500,1),(4,1,'Pedernera',166,5,'H','Flores',29.4,1,54000,0),(5,1,'Tinogasta',1515,11,'I','Villa Del Parque',40.4,3,101000,1),(6,1,'Yerbal',538,NULL,'F','Caballito',34.4,2,75300,0),(7,1,'Culpina',30,9,'D','Flores',35.1,2,77800,0),(8,1,'Chivilcoy Av.',3342,0,'D','Villa Devoto',38.7,2,87000,1),(9,2,'Simbron',416,11,'G','Villa Devoto',32,2,98000,1),(10,2,'Rivera Pedro I. Dr.',2296,3,'B','Belgrano',38.2,2,113000,0),(11,2,'Figueroa Alcorta Pres. Av.',2713,NULL,'C','Palermo',65.4,4,231000,0),(12,2,'Zapiola',2124,NULL,'G','Belgrano',49.1,3,123000,0),(13,2,'Camarones',2338,14,'I','Versalles',26.2,2,55000,1),(14,2,'Pacheco',144,14,'G','Villa Urquiza',28.1,1,76500,1),(15,2,'Baez',78,4,NULL,'Palermo',88.9,5,364000,0),(16,2,'Gallo',148,14,'D','Recoleta',62.8,3,228000,1),(17,3,'Lavalle',84,6,'G','San Nicolas',24.2,1,62000,0),(18,3,'Mexico',517,NULL,'E','Monserrat',52.8,3,126000,1),(19,3,'Fonrouge',390,NULL,NULL,'Liniers',76.3,5,197000,0),(20,3,'Rafaela',3365,2,'G','Villa Luro',33.9,2,64400,0),(21,3,'Lugones',1385,NULL,'H','Villa Ortuzar',48.3,3,133000,0),(22,3,'Tinogasta',5110,7,'C','Villa Real',36.6,2,76000,0);
/*!40000 ALTER TABLE `inmueble` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inmuebles_clientes`
--

DROP TABLE IF EXISTS `inmuebles_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8 ;
CREATE TABLE `inmuebles_clientes` (
  `fk_id_inmueble` int(11) NOT NULL,
  `fk_id_cliente` int(11) NOT NULL,
  PRIMARY KEY (`fk_id_inmueble`,`fk_id_cliente`),
  KEY `fk_id_cliente_idx` (`fk_id_cliente`),
  CONSTRAINT `fk_id_cliente` FOREIGN KEY (`fk_id_cliente`) REFERENCES `cliente` (`id_cliente`),
  CONSTRAINT `fk_id_inmueble_inmuebles_clientes` FOREIGN KEY (`fk_id_inmueble`) REFERENCES `inmueble` (`id_inmueble`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inmuebles_clientes`
--

LOCK TABLES `inmuebles_clientes` WRITE;
/*!40000 ALTER TABLE `inmuebles_clientes` DISABLE KEYS */;
INSERT INTO `inmuebles_clientes` VALUES (17,1),(18,2),(15,3),(2,8),(4,8),(8,8),(18,8),(11,9),(18,9),(3,10),(22,10),(8,12),(12,13),(7,14),(17,14),(20,14),(22,15),(22,16),(18,17),(13,18),(7,21),(12,21),(7,22),(20,23),(10,24),(1,27),(16,27),(9,29),(19,29),(5,30),(6,31),(8,34),(18,35),(20,35),(21,35),(6,36),(11,36),(14,37),(5,38),(5,39),(7,40),(15,41),(2,43),(19,45),(1,46),(19,46),(2,48),(3,49),(11,49),(13,50),(21,50),(9,51),(15,51),(21,51),(12,52),(13,52),(21,52),(1,55),(8,55),(11,55),(3,56),(9,56),(11,57),(6,58),(8,58),(17,58),(22,58),(14,59),(15,59),(16,59),(6,60),(12,61),(14,61),(17,61),(6,63),(8,64),(6,65),(17,65),(3,66),(6,66),(1,68),(6,68),(21,68),(10,71),(14,71),(1,72),(19,72),(4,73),(18,73),(1,74),(3,75),(3,79),(22,79),(8,80),(11,81),(9,82),(12,82),(17,83),(11,84),(9,85),(7,86);
/*!40000 ALTER TABLE `inmuebles_clientes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

SET GLOBAL time_zone = '-3:00';

-- Dump completed on 2019-06-14 21:05:16




