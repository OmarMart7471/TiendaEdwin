create database tienda;
use tienda;

CREATE TABLE `Empleado` (
  `id` varchar(6) NOT NULL,
  `nombre` varchar(120) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `numeroTelefono` varchar(10) DEFAULT NULL,
  `puesto` varchar(15) DEFAULT NULL,
  `sexo` varchar(15) DEFAULT NULL,
  `pagoPorHora` float(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `Asistencia` (
  `idEmpleado` varchar(6) NOT NULL DEFAULT '',
  `fecha` date NOT NULL,
  `horaEntrada` time DEFAULT NULL,
  `horaSalida` time DEFAULT NULL,
  `observacion` varchar(120) DEFAULT NULL,
  `monto` float(5,2) DEFAULT NULL,
  PRIMARY KEY (`idEmpleado`,`fecha`),
  CONSTRAINT `idEmpleadoAsis` FOREIGN KEY (`idEmpleado`) REFERENCES `Empleado` (`id`)
);

CREATE TABLE `Nomina` (
  `pagoPorHora` float(5,2) DEFAULT NULL,
  `horasTrabajadas` time DEFAULT NULL,
  `horasExtras` time DEFAULT NULL,
  `idEmpleado` varchar(6) NOT NULL DEFAULT '',
  `fechaPago` date NOT NULL,
  PRIMARY KEY (`idEmpleado`,`fechaPago`),
  CONSTRAINT `idEmpleadoNomi` FOREIGN KEY (`idEmpleado`) REFERENCES `Empleado` (`id`)
);

CREATE TABLE `proveedor` (
  `id` varchar(10) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `empresa` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `producto` (
  `id` int(20) NOT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `precio` float(7,2) DEFAULT NULL,
  `stock` int(4) DEFAULT NULL,
  `idProveedor` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idProveedor` (`idProveedor`),
  CONSTRAINT `idProveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`id`)
);

CREATE TABLE `Venta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `precioTotal` decimal(7,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `DetalleVenta` (
  `idProducto` int(20) NOT NULL DEFAULT '0',
  `idVenta` int(20) NOT NULL DEFAULT '0',
  `cantidad` int(10) DEFAULT NULL,
  `precio` decimal(7,2) DEFAULT NULL,
  `total` decimal(7,2) DEFAULT NULL,
  PRIMARY KEY (`idProducto`,`idVenta`),
  KEY `idV` (`idVenta`),
  CONSTRAINT `idP` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`id`),
  CONSTRAINT `idV` FOREIGN KEY (`idVenta`) REFERENCES `Venta` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
);