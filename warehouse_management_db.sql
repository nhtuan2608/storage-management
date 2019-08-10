-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 27, 2019 at 08:00 AM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlkho`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `address_id` int(11) NOT NULL,
  `city` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `country` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `district` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `postalCode` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `street` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ward` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`address_id`, `city`, `country`, `district`, `postalCode`, `street`, `ward`) VALUES
(1, 'Texas', 'United States', NULL, '100000', '14 Washington', 'Adward'),
(2, 'Kunkka', 'United States', NULL, '100000', '78 Spike', 'Ashka');

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Table structure for table `import_detail_note`
--

CREATE TABLE `import_detail_note` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `amount` int(11) DEFAULT NULL,
  `import_Note_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `merchandise_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `note` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` decimal(19,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `import_detail_note`
--

INSERT INTO `import_detail_note` (`id`, `amount`, `import_Note_id`, `merchandise_id`, `note`, `price`) VALUES
('DID1', 5, 'NDID1', 'MID1', NULL, '150.00'),
('DID2', 70, 'NDID2', 'MID2', NULL, '600.00'),
('DID3', 100, 'NDID2', 'MID2', NULL, '450.00');

-- --------------------------------------------------------

--
-- Table structure for table `import_note`
--

CREATE TABLE `import_note` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `createdAt` datetime DEFAULT current_timestamp(),
  `date` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `numberOfObject` int(11) NOT NULL,
  `status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `updatedAt` datetime DEFAULT current_timestamp(),
  `user_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `import_note`
--

INSERT INTO `import_note` (`id`, `createdAt`, `date`, `numberOfObject`, `status`, `updatedAt`, `user_id`) VALUES
('NDID1', NULL, '', 0, NULL, '2019-07-27 12:53:28', NULL),
('NDID2', '2019-07-27 12:54:22', '', 0, NULL, '2019-07-27 12:54:22', NULL),
('NDID3', '2019-07-27 12:54:50', '', 0, NULL, '2019-07-27 12:54:50', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `merchandise`
--

CREATE TABLE `merchandise` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `amount` int(11) NOT NULL,
  `merchandise_type_id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `numberOfObject` int(11) NOT NULL,
  `supplier_id` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `unit` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `merchandise`
--

INSERT INTO `merchandise` (`id`, `amount`, `merchandise_type_id`, `name`, `numberOfObject`, `supplier_id`, `unit`) VALUES
('MID1', 0, 'MTID1', 'Lightning Yet 1', 0, 'SID1', NULL),
('MID2', 0, 'MTID1', 'Adidas Speed Core', 0, 'SID1', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `merchandise_type`
--

CREATE TABLE `merchandise_type` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `media` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `numberOfObject` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `merchandise_type`
--

INSERT INTO `merchandise_type` (`id`, `media`, `name`, `numberOfObject`) VALUES
('MTID1', NULL, 'Adidas', 0),
('MTID4', NULL, 'Converse', 0),
('MTID2', NULL, 'Nike', 0),
('MTID3', NULL, 'Biti\'s', 0);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `address_id` int(11) DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `numberOfObject` int(11) NOT NULL,
  `phoneNumber` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `address_id`, `email`, `name`, `numberOfObject`, `phoneNumber`) VALUES
('SID1', 1, 'adidas.hr@gmail.com', 'Adidas', 0, 124759645),
('SID2', 2, 'nike.hr@gmail.com', 'Nike', 0, 14678634);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `numberOfObject` int(11) NOT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `role` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `userName` varchar(20) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `numberOfObject`, `password`, `role`, `userName`) VALUES
('UID1', 0, '$2a$10$jt9Wco1k.HKSe4i700AnPO04y7MalS9UeXc884VhfMl0BbADJAZta', 'USER', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`address_id`);

--
-- Indexes for table `import_detail_note`
--
ALTER TABLE `import_detail_note`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `import_note`
--
ALTER TABLE `import_note`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `merchandise`
--
ALTER TABLE `merchandise`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `merchandise_type`
--
ALTER TABLE `merchandise_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `address`
--
ALTER TABLE `address`
  MODIFY `address_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
