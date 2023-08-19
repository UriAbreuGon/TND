-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-08-2023 a las 23:00:06
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `dbtnd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `IDTarjetaRecarga` int(11) NOT NULL,
  `Fechacompra` varchar(8) NOT NULL,
  `Cantidadrecargas` int(11) NOT NULL,
  `Montocompra` int(11) NOT NULL,
  `Usuario` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compras`
--

INSERT INTO `compras` (`IDTarjetaRecarga`, `Fechacompra`, `Cantidadrecargas`, `Montocompra`, `Usuario`) VALUES
(1, '110120', 120, 20, 'Juan'),
(2, '1123', 1, 0, '0'),
(3, '1123', 2, 0, '0'),
(4, '1223', 4, 0, '0'),
(5, '1123', 1, 0, '0'),
(6, '1123', 1, 0, '0'),
(7, '1123', 2, 0, '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjetasdecredito`
--

CREATE TABLE `tarjetasdecredito` (
  `Idtarjeta` int(11) NOT NULL,
  `Numerotarjeta` int(16) NOT NULL,
  `Fechadevenc` varchar(6) NOT NULL,
  `Cantidadarecargar` int(3) NOT NULL,
  `Codigodeseguridad` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuario`
--

CREATE TABLE `tipo_usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo_usuario`
--

INSERT INTO `tipo_usuario` (`id`, `nombre`) VALUES
(1, 'Administrador'),
(2, 'Usuario ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IDusuario` int(11) NOT NULL,
  `NomU` varchar(20) NOT NULL,
  `Usuario` varchar(35) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Correo` varchar(20) NOT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  `IdTipo` int(11) DEFAULT NULL,
  `IDTarjetaRecarga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IDusuario`, `NomU`, `Usuario`, `Password`, `Correo`, `Telefono`, `IdTipo`, `IDTarjetaRecarga`) VALUES
(12, 'Juan', 'juan', '71', 'Juan', '8095697960', 2, 0),
(13, 'Mariela Diaz', 'Mariela', '8c', 'Mariela@gmail.com', '809-594-0850', 2, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`IDTarjetaRecarga`);

--
-- Indices de la tabla `tarjetasdecredito`
--
ALTER TABLE `tarjetasdecredito`
  ADD PRIMARY KEY (`Idtarjeta`);

--
-- Indices de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IDusuario`),
  ADD KEY `OTRAS` (`IDTarjetaRecarga`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `IDTarjetaRecarga` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `tarjetasdecredito`
--
ALTER TABLE `tarjetasdecredito`
  MODIFY `Idtarjeta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_usuario`
--
ALTER TABLE `tipo_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IDusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`Idtarjeta`) REFERENCES `tarjetasdecredito` (`Idtarjeta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
