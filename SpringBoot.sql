-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 18, 2024 at 11:44 AM
-- Server version: 8.0.36-0ubuntu0.22.04.1
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `SpringBoot`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `email`, `name`) VALUES
(1, 'amrat@gmail.com', 'amrat');

-- --------------------------------------------------------

--
-- Table structure for table `order_model`
--

CREATE TABLE `order_model` (
  `id` int NOT NULL
) ;

--
-- Dumping data for table `order_model`
--

INSERT INTO `order_model` (`id`) VALUES
(1),
(3),
(4);

-- --------------------------------------------------------

--
-- Table structure for table `order_model_products`
--

CREATE TABLE `order_model_products` (
  `order_id` int NOT NULL,
  `products_id` int NOT NULL
) ;

--
-- Dumping data for table `order_model_products`
--

INSERT INTO `order_model_products` (`order_id`, `products_id`) VALUES
(1, 1),
(4, 2);

-- --------------------------------------------------------

--
-- Table structure for table `product_model`
--

CREATE TABLE `product_model` (
  `id` int NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `quantity` int NOT NULL
) ;

--
-- Dumping data for table `product_model`
--

INSERT INTO `product_model` (`id`, `name`, `price`, `quantity`) VALUES
(1, 'amrat', 5000, 23),
(2, 'aniket', 7000, 12),
(3, 'khushi', 7000, 12);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order_model`
--
ALTER TABLE `order_model`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order_model_products`
--
ALTER TABLE `order_model_products`
  ADD UNIQUE KEY `UK_g2mxr6rulvptoa2hicxnu0n6o` (`products_id`),
  ADD KEY `FK5p6nodw0wgwgm8wkaq31t1vxe` (`order_id`);

--
-- Indexes for table `product_model`
--
ALTER TABLE `product_model`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `order_model`
--
ALTER TABLE `order_model`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `product_model`
--
ALTER TABLE `product_model`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `order_model_products`
--
ALTER TABLE `order_model_products`
  ADD CONSTRAINT `FK1qb5qb4sqo1gbr9pfjxr0p9b0` FOREIGN KEY (`products_id`) REFERENCES `product_model` (`id`),
  ADD CONSTRAINT `FK5p6nodw0wgwgm8wkaq31t1vxe` FOREIGN KEY (`order_id`) REFERENCES `order_model` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
