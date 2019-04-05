-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 05, 2019 at 10:22 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java5assignment`
--

-- --------------------------------------------------------

--
-- Table structure for table `departs`
--

CREATE TABLE `departs` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `departs`
--

INSERT INTO `departs` (`Id`, `Name`) VALUES
(1, 'Accounting '),
(3, 'HR'),
(4, 'IT'),
(5, 'Administration'),
(6, 'Sales');

-- --------------------------------------------------------

--
-- Table structure for table `records`
--

CREATE TABLE `records` (
  `id` int(11) NOT NULL,
  `type` bit(1) DEFAULT NULL,
  `reason` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `dateRecord` date DEFAULT NULL,
  `staffId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `records`
--

INSERT INTO `records` (`id`, `type`, `reason`, `dateRecord`, `staffId`) VALUES
(1, b'1', '......', '2019-04-06', 1),
(2, b'1', '......', '2019-04-06', 1),
(3, b'0', '......', '2019-04-06', 47),
(4, b'1', '......', '2019-04-06', 48),
(5, b'1', '......', '2019-04-06', 49),
(6, b'0', '......', '2019-04-06', 50),
(7, b'1', '......', '2019-04-06', 51),
(8, b'1', '......', '2019-04-06', 52),
(9, b'0', '......', '2019-04-06', 53),
(10, b'1', '......', '2019-04-06', 54),
(11, b'1', '......', '2019-04-06', 55),
(12, b'0', '......', '2019-04-06', 56),
(13, b'1', '......', '2019-04-06', 57),
(14, b'1', '......', '2019-04-06', 58),
(15, b'0', '......', '2019-04-06', 59),
(16, b'1', '......', '2019-04-06', 60),
(17, b'1', '......', '2019-04-06', 61),
(18, b'0', '......', '2019-04-06', 1),
(19, b'1', '......', '2019-04-06', 47),
(20, b'1', '......', '2019-04-06', 48),
(21, b'0', '......', '2019-04-06', 49);

-- --------------------------------------------------------

--
-- Table structure for table `staffs`
--

CREATE TABLE `staffs` (
  `id` int(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` bit(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `photo` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` int(11) DEFAULT NULL,
  `salary` float DEFAULT NULL,
  `notes` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `DepartId` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `staffs`
--

INSERT INTO `staffs` (`id`, `name`, `gender`, `birthday`, `photo`, `email`, `phone`, `salary`, `notes`, `DepartId`) VALUES
(1, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 1),
(47, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 1),
(48, 'Phan Vinh Bính', b'1', '1991-07-23', NULL, 'vanbinh@gmail.com', 123456789, 8000000, 'Nothing', 1),
(49, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 1),
(50, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 3),
(51, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 3),
(52, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 3),
(53, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 4),
(54, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 4),
(55, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 4),
(56, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 5),
(57, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 6),
(58, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 5),
(59, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 5),
(60, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 6),
(61, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 6);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `departs`
--
ALTER TABLE `departs`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `records`
--
ALTER TABLE `records`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_re_sta` (`staffId`);

--
-- Indexes for table `staffs`
--
ALTER TABLE `staffs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_staff_depart` (`DepartId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `departs`
--
ALTER TABLE `departs`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `records`
--
ALTER TABLE `records`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `staffs`
--
ALTER TABLE `staffs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `records`
--
ALTER TABLE `records`
  ADD CONSTRAINT `fk_re_sta` FOREIGN KEY (`staffId`) REFERENCES `staffs` (`id`);

--
-- Constraints for table `staffs`
--
ALTER TABLE `staffs`
  ADD CONSTRAINT `fk_staff_depart` FOREIGN KEY (`DepartId`) REFERENCES `departs` (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
