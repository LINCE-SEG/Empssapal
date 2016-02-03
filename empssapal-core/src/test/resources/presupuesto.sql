-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-01-2016 a las 21:09:21
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `presupuesto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cajamedidor`
--

CREATE TABLE IF NOT EXISTS `cajamedidor` (
`IdCajaMedidor` int(11) NOT NULL,
  `NombreCajamedidor` varchar(15) NOT NULL,
  `PrecioCajaMedidor` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cajamedidor`
--

INSERT INTO `cajamedidor` (`IdCajaMedidor`, `NombreCajamedidor`, `PrecioCajaMedidor`) VALUES
(1, '15', 136.25),
(2, '20', 158.92),
(3, '25', 203.31),
(4, '38', 347.71);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cajaregistradora`
--

CREATE TABLE IF NOT EXISTS `cajaregistradora` (
`IdCajaRegistradora` int(11) NOT NULL,
  `NombreCajaregistradora` varchar(15) NOT NULL,
  `PrecioCajaRegistradora` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cajaregistradora`
--

INSERT INTO `cajaregistradora` (`IdCajaRegistradora`, `NombreCajaregistradora`, `PrecioCajaRegistradora`) VALUES
(1, '6', 109.85),
(2, '160', 109.85),
(3, '200', 109.85);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camaapoyo`
--

CREATE TABLE IF NOT EXISTS `camaapoyo` (
`IdCama` int(11) NOT NULL,
  `ServicioCama` varchar(15) NOT NULL,
  `PrecioCama` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `camaapoyo`
--

INSERT INTO `camaapoyo` (`IdCama`, `ServicioCama`, `PrecioCama`) VALUES
(1, 'Agua', 3.92),
(2, 'Alcantarillado', 9.42);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camposagua`
--

CREATE TABLE IF NOT EXISTS `camposagua` (
`IdCampos` int(11) NOT NULL,
  `Interesado` varchar(50) NOT NULL,
  `Fecha` date NOT NULL,
  `IdVereda` int(11) NOT NULL,
  `IdPista` int(11) NOT NULL,
  `IdDiametroAgua` int(11) NOT NULL,
  `IdEmpalmeRed` int(11) NOT NULL,
  `IdEliminacion` int(11) NOT NULL,
  `IdRelleno` int(11) NOT NULL,
  `IdCama` int(11) NOT NULL,
  `IdPruebaHidraulica` int(11) NOT NULL,
  `IdEscavacion` int(11) NOT NULL,
  `Distancia` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camposalcantarillado`
--

CREATE TABLE IF NOT EXISTS `camposalcantarillado` (
`IdCamposAlcantarillado` int(11) NOT NULL,
  `Interesado` varchar(15) NOT NULL,
  `Fecha` date NOT NULL,
  `Distancia` double NOT NULL,
  `IdCama` int(11) NOT NULL,
  `IdEscavacion` int(11) NOT NULL,
  `IdPruebaHidraulica` int(11) NOT NULL,
  `IdDiametroAlcantarillado` int(11) NOT NULL,
  `IdEliminacion` int(11) NOT NULL,
  `IdRelleno` int(11) NOT NULL,
  `IdEmpalmeRed` int(11) NOT NULL,
  `IdPista` int(11) NOT NULL,
  `IdVereda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diametroagua`
--

CREATE TABLE IF NOT EXISTS `diametroagua` (
`IdDiametroAgua` int(11) NOT NULL,
  `NombreDiametro` varchar(15) NOT NULL,
  `IdCajaMedidor` int(11) NOT NULL,
  `IdTendido` int(11) NOT NULL,
  `CostoDiametro` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `diametroagua`
--

INSERT INTO `diametroagua` (`IdDiametroAgua`, `NombreDiametro`, `IdCajaMedidor`, `IdTendido`, `CostoDiametro`) VALUES
(1, '15', 1, 1, 137.73),
(2, '20', 2, 2, 160.73),
(3, '25', 3, 3, 205.56),
(4, '38', 4, 4, 352.12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `diametroalcantarillado`
--

CREATE TABLE IF NOT EXISTS `diametroalcantarillado` (
`IdDiametroAlcantarillado` int(11) NOT NULL,
  `NombreDiametro` varchar(15) NOT NULL,
  `CostoDiametro` double NOT NULL,
  `IdTendido` int(11) NOT NULL,
  `IdCajaRegistradora` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `diametroalcantarillado`
--

INSERT INTO `diametroalcantarillado` (`IdDiametroAlcantarillado`, `NombreDiametro`, `CostoDiametro`, `IdTendido`, `IdCajaRegistradora`) VALUES
(1, '6', 123.66, 5, 1),
(2, '160', 127.59, 6, 2),
(3, '200', 141.32, 7, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eliminacionexedente`
--

CREATE TABLE IF NOT EXISTS `eliminacionexedente` (
`IdEliminacion` int(11) NOT NULL,
  `TipoServicioEliminacion` varchar(15) NOT NULL,
  `CostoEliminacion` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `eliminacionexedente`
--

INSERT INTO `eliminacionexedente` (`IdEliminacion`, `TipoServicioEliminacion`, `CostoEliminacion`) VALUES
(1, 'Agua', 27.31),
(2, 'Alcantarillado', 27.31);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empalmered`
--

CREATE TABLE IF NOT EXISTS `empalmered` (
`IdEmpalmeRed` int(11) NOT NULL,
  `NombreDiametro` varchar(15) NOT NULL,
  `TipoEmpalme` varchar(15) NOT NULL,
  `TipoServicioEmpalme` varchar(15) NOT NULL,
  `PrecioEmpalme` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empalmered`
--

INSERT INTO `empalmered` (`IdEmpalmeRed`, `NombreDiametro`, `TipoEmpalme`, `TipoServicioEmpalme`, `PrecioEmpalme`) VALUES
(1, '15', '63', 'Agua', 37.31),
(2, '15', '90', 'Agua', 40.54),
(3, '15', '110', 'Agua', 45.54),
(4, '20', '63', 'Agua', 49.31),
(5, '20', '90', 'Agua', 55.31),
(6, '20', '110', 'Agua', 53.66),
(7, '25', '63', 'Agua', 58.31),
(8, '25', '90', 'Agua', 60.06),
(9, '25', '110', 'Agua', 63.36),
(10, '38', '90', 'Agua', 92.21),
(11, '38', '110', 'Agua', 83.38),
(12, '6', '8', 'Alcantarillado', 16.39),
(13, '6', '10', 'Alcantarillado', 16.39),
(14, '160', '200', 'Alcantarillado', 57.13),
(15, '160', '250', 'Alcantarillado', 67.13),
(16, '160', '315', 'Alcantarillado', 67.13),
(17, '200', '250', 'Alcantarillado', 67.13),
(18, '200', '315', 'Alcantarillado', 67.13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `excavacion`
--

CREATE TABLE IF NOT EXISTS `excavacion` (
`IdEscavacion` int(11) NOT NULL,
  `ServicicioExcavacion` varchar(15) NOT NULL,
  `PrecioExcavacion` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `excavacion`
--

INSERT INTO `excavacion` (`IdEscavacion`, `ServicicioExcavacion`, `PrecioExcavacion`) VALUES
(1, 'Agua', 24.39),
(2, 'alcantarillado', 30.49);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pruebahidraulica`
--

CREATE TABLE IF NOT EXISTS `pruebahidraulica` (
`IdPruebaHidraulica` int(11) NOT NULL,
  `NombreServicioPrueba` varchar(15) NOT NULL,
  `CostoPrueba` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pruebahidraulica`
--

INSERT INTO `pruebahidraulica` (`IdPruebaHidraulica`, `NombreServicioPrueba`, `CostoPrueba`) VALUES
(1, 'Agua', 1.7),
(2, 'Alcantarillado', 3.06);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relleno`
--

CREATE TABLE IF NOT EXISTS `relleno` (
`IdRelleno` int(11) NOT NULL,
  `TipoServicioRelleno` varchar(15) NOT NULL,
  `CostoRelleno` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `relleno`
--

INSERT INTO `relleno` (`IdRelleno`, `TipoServicioRelleno`, `CostoRelleno`) VALUES
(1, 'Agua', 20.89),
(2, 'Alcantarillado', 28.82);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reposicion`
--

CREATE TABLE IF NOT EXISTS `reposicion` (
`IdReposicion` int(11) NOT NULL,
  `NombreReposicion` varchar(15) NOT NULL,
  `TipoServicioReposicion` varchar(15) NOT NULL,
  `CostoReposicion` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `reposicion`
--

INSERT INTO `reposicion` (`IdReposicion`, `NombreReposicion`, `TipoServicioReposicion`, `CostoReposicion`) VALUES
(1, 'Tierra', 'Agua', 0),
(2, 'Asfalto', 'Agua', 63.81),
(3, 'Concreto', 'Agua', 57.01),
(4, 'Tierra', 'Alcantarillado', 0),
(5, 'Asfalto', 'Alcantarillado', 69.94),
(6, 'Concreto', 'Alcantarillado', 57.01);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rotura`
--

CREATE TABLE IF NOT EXISTS `rotura` (
`IdRotura` int(11) NOT NULL,
  `NombreRotura` varchar(15) NOT NULL,
  `TipoServicioRotura` varchar(15) NOT NULL,
  `CostoRotura` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `rotura`
--

INSERT INTO `rotura` (`IdRotura`, `NombreRotura`, `TipoServicioRotura`, `CostoRotura`) VALUES
(1, 'Tierra', 'Agua', 0),
(2, 'Asfalto', 'Agua', 6.67),
(3, 'Concreto', 'Agua', 23.31),
(4, 'Tierra', 'Alcantarillado', 0),
(5, 'Asfalto', 'Alcantarillado', 7.91),
(6, 'Concreto', 'Alcantarillado', 22.26);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tendido`
--

CREATE TABLE IF NOT EXISTS `tendido` (
`IdTendido` int(11) NOT NULL,
  `NombreTendido` varchar(15) NOT NULL,
  `TipoServicioTendido` varchar(15) NOT NULL,
  `CostoTendido` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tendido`
--

INSERT INTO `tendido` (`IdTendido`, `NombreTendido`, `TipoServicioTendido`, `CostoTendido`) VALUES
(1, '15', 'Agua', 1.48),
(2, '20', 'Agua', 1.81),
(3, '25', 'Agua', 2.25),
(4, '38', 'Agua', 4.41),
(5, '6', 'Alcantarillado', 13.81),
(6, '160', 'Alcantarillado', 17.74),
(7, '200', 'Alcantarillado', 31.47);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipopista`
--

CREATE TABLE IF NOT EXISTS `tipopista` (
`IdPista` int(11) NOT NULL,
  `IdRotura` int(11) NOT NULL,
  `IdReposicion` int(11) NOT NULL,
  `NombrePista` varchar(15) NOT NULL,
  `TipoServicioPista` varchar(15) NOT NULL,
  `CostoPista` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tipopista`
--

INSERT INTO `tipopista` (`IdPista`, `IdRotura`, `IdReposicion`, `NombrePista`, `TipoServicioPista`, `CostoPista`) VALUES
(1, 1, 1, 'Tierra', 'Agua', 0),
(2, 2, 2, 'Asfalto', 'Agua', 70.48),
(3, 3, 3, 'Concreto', 'Agua', 80.32),
(4, 4, 4, 'Tierra', 'Alcantarillado', 0),
(5, 5, 5, 'Asfalto', 'Alcantarillado', 77.85),
(6, 6, 6, 'Concreto', 'Alcantarillado', 79.27);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `total`
--

CREATE TABLE IF NOT EXISTS `total` (
`IdTotal` int(11) NOT NULL,
  `IdCampos` int(11) NOT NULL,
  `CostoTotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `total2`
--

CREATE TABLE IF NOT EXISTS `total2` (
`IdTotal2` int(11) NOT NULL,
  `IdCamposAlcantarillado` int(11) NOT NULL,
  `CostoTotal2` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vereda`
--

CREATE TABLE IF NOT EXISTS `vereda` (
`IdVereda` int(11) NOT NULL,
  `NombreVere` varchar(10) NOT NULL,
  `TipoServicioVere` varchar(15) NOT NULL,
  `CostoVere` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `vereda`
--

INSERT INTO `vereda` (`IdVereda`, `NombreVere`, `TipoServicioVere`, `CostoVere`) VALUES
(1, 'Sin vereda', 'Agua', 0),
(2, 'Con vereda', 'Agua', 16.92),
(3, 'Sin vereda', 'Alcantarillado', 0),
(4, 'Con vereda', 'Alcantarillado', 28.01);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cajamedidor`
--
ALTER TABLE `cajamedidor`
 ADD PRIMARY KEY (`IdCajaMedidor`);

--
-- Indices de la tabla `cajaregistradora`
--
ALTER TABLE `cajaregistradora`
 ADD PRIMARY KEY (`IdCajaRegistradora`);

--
-- Indices de la tabla `camaapoyo`
--
ALTER TABLE `camaapoyo`
 ADD PRIMARY KEY (`IdCama`);

--
-- Indices de la tabla `camposagua`
--
ALTER TABLE `camposagua`
 ADD PRIMARY KEY (`IdCampos`), ADD KEY `pruebahidraulica_camposagua_fk` (`IdPruebaHidraulica`) USING BTREE, ADD KEY `eliminacionexedente_camposagua_fk` (`IdEliminacion`) USING BTREE, ADD KEY `relleno_camposagua_fk` (`IdRelleno`) USING BTREE, ADD KEY `empalmered_camposagua_fk` (`IdEmpalmeRed`) USING BTREE, ADD KEY `diametroagua_camposagua_fk` (`IdDiametroAgua`) USING BTREE, ADD KEY `camaapoyo_camposagua_fk` (`IdCama`) USING BTREE, ADD KEY `excavacion_camposagua_fk` (`IdEscavacion`) USING BTREE, ADD KEY `tipopista_camposagua_fk` (`IdPista`) USING BTREE, ADD KEY `vereda_camposagua_fk` (`IdVereda`) USING BTREE;

--
-- Indices de la tabla `camposalcantarillado`
--
ALTER TABLE `camposalcantarillado`
 ADD PRIMARY KEY (`IdCamposAlcantarillado`), ADD KEY `camaapoyo_camposalcantarillado_fk` (`IdCama`) USING BTREE, ADD KEY `excavacion_camposalcantarillado_fk` (`IdEscavacion`) USING BTREE, ADD KEY `pruebahidraulica_camposalcantarillado_fk` (`IdPruebaHidraulica`) USING BTREE, ADD KEY `eliminacionexedente_camposalcantarillado_fk` (`IdEliminacion`) USING BTREE, ADD KEY `relleno_camposalcantarillado_fk` (`IdRelleno`) USING BTREE, ADD KEY `empalmered_camposalcantarillado_fk` (`IdEmpalmeRed`) USING BTREE, ADD KEY `tipopista_camposalcantarillado_fk` (`IdPista`) USING BTREE, ADD KEY `vereda_camposalcantarillado_fk` (`IdVereda`) USING BTREE, ADD KEY `diametroalcantarillado_camposalcantarillado_fk` (`IdDiametroAlcantarillado`) USING BTREE;

--
-- Indices de la tabla `diametroagua`
--
ALTER TABLE `diametroagua`
 ADD PRIMARY KEY (`IdDiametroAgua`), ADD KEY `tendido_diametroagua_fk` (`IdTendido`) USING BTREE, ADD KEY `cajamedidor_diametroagua_fk` (`IdCajaMedidor`) USING BTREE;

--
-- Indices de la tabla `diametroalcantarillado`
--
ALTER TABLE `diametroalcantarillado`
 ADD PRIMARY KEY (`IdDiametroAlcantarillado`), ADD KEY `tendido_diametroalcantarillado_fk` (`IdTendido`), ADD KEY `cajaregistradora_diametroalcantarillado_fk` (`IdCajaRegistradora`);

--
-- Indices de la tabla `eliminacionexedente`
--
ALTER TABLE `eliminacionexedente`
 ADD PRIMARY KEY (`IdEliminacion`);

--
-- Indices de la tabla `empalmered`
--
ALTER TABLE `empalmered`
 ADD PRIMARY KEY (`IdEmpalmeRed`);

--
-- Indices de la tabla `excavacion`
--
ALTER TABLE `excavacion`
 ADD PRIMARY KEY (`IdEscavacion`);

--
-- Indices de la tabla `pruebahidraulica`
--
ALTER TABLE `pruebahidraulica`
 ADD PRIMARY KEY (`IdPruebaHidraulica`);

--
-- Indices de la tabla `relleno`
--
ALTER TABLE `relleno`
 ADD PRIMARY KEY (`IdRelleno`);

--
-- Indices de la tabla `reposicion`
--
ALTER TABLE `reposicion`
 ADD PRIMARY KEY (`IdReposicion`);

--
-- Indices de la tabla `rotura`
--
ALTER TABLE `rotura`
 ADD PRIMARY KEY (`IdRotura`);

--
-- Indices de la tabla `tendido`
--
ALTER TABLE `tendido`
 ADD PRIMARY KEY (`IdTendido`);

--
-- Indices de la tabla `tipopista`
--
ALTER TABLE `tipopista`
 ADD PRIMARY KEY (`IdPista`), ADD KEY `reposicion_tipopista_fk` (`IdReposicion`) USING BTREE, ADD KEY `rotura_tipopista_fk` (`IdRotura`) USING BTREE;

--
-- Indices de la tabla `total`
--
ALTER TABLE `total`
 ADD PRIMARY KEY (`IdTotal`), ADD KEY `camposagua_total_fk` (`IdCampos`) USING BTREE;

--
-- Indices de la tabla `total2`
--
ALTER TABLE `total2`
 ADD PRIMARY KEY (`IdTotal2`);

--
-- Indices de la tabla `vereda`
--
ALTER TABLE `vereda`
 ADD PRIMARY KEY (`IdVereda`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cajamedidor`
--
ALTER TABLE `cajamedidor`
MODIFY `IdCajaMedidor` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `cajaregistradora`
--
ALTER TABLE `cajaregistradora`
MODIFY `IdCajaRegistradora` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `camaapoyo`
--
ALTER TABLE `camaapoyo`
MODIFY `IdCama` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `camposagua`
--
ALTER TABLE `camposagua`
MODIFY `IdCampos` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `camposalcantarillado`
--
ALTER TABLE `camposalcantarillado`
MODIFY `IdCamposAlcantarillado` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `diametroagua`
--
ALTER TABLE `diametroagua`
MODIFY `IdDiametroAgua` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `diametroalcantarillado`
--
ALTER TABLE `diametroalcantarillado`
MODIFY `IdDiametroAlcantarillado` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `eliminacionexedente`
--
ALTER TABLE `eliminacionexedente`
MODIFY `IdEliminacion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `empalmered`
--
ALTER TABLE `empalmered`
MODIFY `IdEmpalmeRed` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT de la tabla `excavacion`
--
ALTER TABLE `excavacion`
MODIFY `IdEscavacion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `pruebahidraulica`
--
ALTER TABLE `pruebahidraulica`
MODIFY `IdPruebaHidraulica` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `relleno`
--
ALTER TABLE `relleno`
MODIFY `IdRelleno` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `reposicion`
--
ALTER TABLE `reposicion`
MODIFY `IdReposicion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `rotura`
--
ALTER TABLE `rotura`
MODIFY `IdRotura` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `tendido`
--
ALTER TABLE `tendido`
MODIFY `IdTendido` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT de la tabla `tipopista`
--
ALTER TABLE `tipopista`
MODIFY `IdPista` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `total`
--
ALTER TABLE `total`
MODIFY `IdTotal` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `total2`
--
ALTER TABLE `total2`
MODIFY `IdTotal2` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `vereda`
--
ALTER TABLE `vereda`
MODIFY `IdVereda` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `diametroagua`
--
ALTER TABLE `diametroagua`
ADD CONSTRAINT `cajamedidor_diametroagua_fk` FOREIGN KEY (`IdCajaMedidor`) REFERENCES `cajamedidor` (`IdCajaMedidor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `tendido_diametroagua_fk` FOREIGN KEY (`IdTendido`) REFERENCES `tendido` (`IdTendido`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `diametroalcantarillado`
--
ALTER TABLE `diametroalcantarillado`
ADD CONSTRAINT `cajaregistradora_diametroalcantarillado_fk` FOREIGN KEY (`IdCajaRegistradora`) REFERENCES `cajaregistradora` (`IdCajaRegistradora`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `tendido_diametroalcantarillado_fk` FOREIGN KEY (`IdTendido`) REFERENCES `tendido` (`IdTendido`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `total`
--
ALTER TABLE `total`
ADD CONSTRAINT `camposagua_total_fk` FOREIGN KEY (`IdCampos`) REFERENCES `camposagua` (`IdCampos`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
