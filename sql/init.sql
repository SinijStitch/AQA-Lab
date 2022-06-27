CREATE SCHEMA 'aqa_lab_six';

CREATE TABLE `aqa_lab_six`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `age` INT NULL,
  `city_id` INT NOT NULL,
  PRIMARY KEY (`id`));

  CREATE TABLE `aqa_lab_six`.`city` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    `post_index` INT NULL,
    PRIMARY KEY (`id`));