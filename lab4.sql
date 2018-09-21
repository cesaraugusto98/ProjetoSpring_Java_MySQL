CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8

SELECT * FROM LAB4.STUDENT;

INSERT INTO LAB4.STUDENT(FIRST_NAME, LAST_NAME, EMAIL) VALUES('Lucas', 'Nadalete', 'abc@teste.com');

INSERT INTO LAB4.STUDENT(FIRST_NAME, LAST_NAME, EMAIL)  VALUES('Lucas', 'Nadalete', 'abc@teste.com');

INSERT INTO LAB4.STUDENT(FIRST_NAME, LAST_NAME, EMAIL)  VALUES('Lucas', 'Nadalete', 'abc@teste.com');
