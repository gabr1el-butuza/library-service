CREATE TABLE IF NOT EXISTS `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `text` longtext,
  `categoryId` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
  CONSTRAINT FK_BookCategory FOREIGN KEY (`categoryId`)
    REFERENCES category(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

