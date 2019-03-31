CREATE DATABASE `share_bike` DEFAULT CHARACTER SET utf8;

DROP TABLE IF EXISTS `share_bike`.`stations`;

CREATE TABLE `share_bike`.`stations` (
  `id` int PRIMARY KEY AUTO_INCREMENT NOT NULL ,
  `station_id` int NOT NULL DEFAULT 0,
  `name` varchar(128) NOT NULL DEFAULT '',
  `lng` float NOT NULL DEFAULT 0.0,
  `lat` float NOT NULL DEFAULT 0.0,
  `dock_count` int NOT NULL DEFAULT 0,
  `installation_time` datetime NOT NULL DEFAULT '1970-01-01 00:00:00'
) ENGINE = InnoDB CHARSET = utf8;

DROP TABLE IF EXISTS `share_bike`.`status`;
CREATE TABLE `share_bike`.`status` (
  `id` int PRIMARY KEY AUTO_INCREMENT NOT NULL ,
  `station_id` int NOT NULL DEFAULT 0,
  `bikes_available` int NOT NULL DEFAULT 0,
  `docks_available` int NOT NULL DEFAULT 0,
  `date` datetime NOT NULL DEFAULT '1970/01/01 00:00:00'
) ENGINE = InnoDB CHARSET = utf8;