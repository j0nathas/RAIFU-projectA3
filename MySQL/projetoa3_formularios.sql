-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: projetoa3
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `formularios`
--

DROP TABLE IF EXISTS `formularios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `formularios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  `Idade` varchar(7) NOT NULL,
  `AreaInteresse` varchar(100) NOT NULL,
  `Descricao` varchar(400) NOT NULL,
  `Data` date NOT NULL,
  `Status` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formularios`
--

LOCK TABLES `formularios` WRITE;
/*!40000 ALTER TABLE `formularios` DISABLE KEYS */;
INSERT INTO `formularios` VALUES (1,'Lucas Andrade','17 Anos','Programação Web','Lucas mora em uma comunidade na zona sul e sempre sonhou em ser desenvolvedor. Ele nunca teve um computador em casa e usava a lan house do bairro, que fechou recentemente. Mesmo com pouco acesso, ele tenta aprender pelo celular.','2025-06-17','Solicitação em Aberto'),(2,'Juliana Ramos','18 Anos','Design Gráfico','Juliana tem um talento natural para desenhar, mas nunca conseguiu fazer um curso por falta de recursos. Ela mora com os avós e divide um celular simples com a irmã. Seu sonho é trabalhar com criação visual.','2025-06-17','Solicitação em Aberto'),(3,'Carlos Henrique','19 Anos','Desenvolvimento de Jogos','Desde pequeno, Carlos cria histórias e personagens, mas nunca teve um computador para aprender a programar jogos. Ele quer estudar mas precisa ajudar em casa vendendo balas na rua. O tempo e o dinheiro são seus maiores obstáculos.','2025-06-17','Solicitação em Aberto'),(4,'Bianca Souza','16 Anos','Análise de Dados','Bianca adora matemática e sonha em ser cientista de dados. Sem acesso à internet em casa, ela estudava na biblioteca da escola, que agora só funciona meio período. Ela acredita que tecnologia pode mudar sua vida.','2025-06-17','Solicitação em Aberto'),(5,'Thiago Silva','20 Anos','Suporte Técnico','Thiago sempre ajudou os vizinhos com problemas de celular e internet. Ele gostaria de fazer cursos para trabalhar com TI, mas precisa trabalhar como entregador para sustentar a família. Nunca teve um notebook próprio.','2025-06-17','Solicitação em Aberto'),(6,'Renata Oliveira','17 Anos','Marketing Digital','Renata vende doces pela internet com ajuda de uma prima. Ela gostaria de entender mais sobre marketing, mas não tem recursos para um curso pago. A única coisa que tem é vontade de aprender.','2025-06-17','Solicitação em Aberto'),(7,'João Pedro','18 Anos','Manutenção de Computadores','João sempre desmontou aparelhos velhos para entender como funcionam. Quer trabalhar com manutenção de computadores, mas não teve oportunidade de estudar. Usa um celular com a tela trincada para assistir vídeos.','2025-06-17','Em Apoio');
/*!40000 ALTER TABLE `formularios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-18 18:57:50
