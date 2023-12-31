-- MySQL Script generated by MySQL Workbench
-- Tue Oct 24 20:45:44 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema basereserva
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema basereserva
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `basereserva` DEFAULT CHARACTER SET utf8 ;
USE `basereserva` ;

-- -----------------------------------------------------
-- Table `basereserva`.`empleados`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `basereserva`.`empleados` ;

CREATE TABLE IF NOT EXISTS `basereserva`.`empleados` (
  `idempleado` INT(11) NOT NULL,
  `usuario` VARCHAR(15) NOT NULL,
  `clave` VARCHAR(20) NULL DEFAULT NULL,
  `estado` BIT(1) NULL DEFAULT NULL,
  `alias` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`idempleado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `basereserva`.`habitaciones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `basereserva`.`habitaciones` ;

CREATE TABLE IF NOT EXISTS `basereserva`.`habitaciones` (
  `idhabitacion` INT(11) NOT NULL,
  `numero` VARCHAR(4) NOT NULL,
  `piso` VARCHAR(2) NOT NULL,
  `descripcion` VARCHAR(255) NULL DEFAULT NULL,
  `caracteristicas` VARCHAR(512) NULL DEFAULT NULL,
  `precio_diario` DECIMAL(7,2) NOT NULL,
  `estado` BIT(1) NOT NULL,
  `tipo_habitacion` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`idhabitacion`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = armscii8;


-- -----------------------------------------------------
-- Table `basereserva`.`huespedes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `basereserva`.`huespedes` ;

CREATE TABLE IF NOT EXISTS `basereserva`.`huespedes` (
  `idhuesped` INT(11) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `apellido` VARCHAR(20) NOT NULL,
  `tipo_documento` VARCHAR(15) NOT NULL,
  `nro_documento` VARCHAR(8) NOT NULL,
  `direccion` VARCHAR(50) NOT NULL,
  `telefono` VARCHAR(10) NULL DEFAULT NULL,
  `email` VARCHAR(25) NULL DEFAULT NULL,
  PRIMARY KEY (`idhuesped`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `basereserva`.`reservas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `basereserva`.`reservas` ;

CREATE TABLE IF NOT EXISTS `basereserva`.`reservas` (
  `idreserva` INT(11) NOT NULL,
  `idhabitacion` INT(11) NOT NULL,
  `idhuesped` INT(11) NOT NULL,
  `idempleado` INT(11) NOT NULL,
  `tipo_reserva` VARCHAR(20) NULL DEFAULT NULL,
  `fecha_ingreso` DATE NOT NULL,
  `fecha_salida` DATE NOT NULL,
  `costo_alojamiento` DECIMAL(7,2) NOT NULL,
  `estado` BIT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`idreserva`),
  CONSTRAINT `fk_reservas_empleado`
    FOREIGN KEY (`idempleado`)
    REFERENCES `basereserva`.`empleados` (`idempleado`),
  CONSTRAINT `fk_reservas_habitacion`
    FOREIGN KEY (`idhabitacion`)
    REFERENCES `basereserva`.`habitaciones` (`idhabitacion`),
  CONSTRAINT `fk_reservas_huesped`
    FOREIGN KEY (`idhuesped`)
    REFERENCES `basereserva`.`huespedes` (`idhuesped`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
