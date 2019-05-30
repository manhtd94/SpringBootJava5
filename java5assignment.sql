-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2019 at 01:26 PM
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
(1, 'Accounting'),
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
  `date_record` date DEFAULT NULL,
  `staff_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `records`
--

INSERT INTO `records` (`id`, `type`, `reason`, `dateRecord`, `date_record`, `staff_id`) VALUES
(1, b'1', '......', '2019-04-06', NULL, 1),
(2, b'1', '......', '2019-04-06', NULL, 1),
(3, b'0', '......', '2019-04-06', NULL, 47),
(4, b'1', '......', '2019-04-06', NULL, 48),
(5, b'1', '......', '2019-04-06', NULL, 49),
(6, b'0', '......', '2019-04-06', NULL, 50),
(7, b'1', '......', '2019-04-06', NULL, 51),
(8, b'1', '......', '2019-04-06', NULL, 52),
(9, b'0', '......', '2019-04-06', NULL, 53),
(10, b'1', '......', '2019-04-06', NULL, 54),
(11, b'1', '......', '2019-04-06', NULL, 50),
(12, b'0', '......', '2019-04-06', NULL, 56),
(13, b'1', '......', '2019-04-06', NULL, 57),
(14, b'1', '......', '2019-04-06', NULL, 58),
(15, b'0', '......', '2019-04-06', NULL, 59),
(16, b'1', '......', '2019-04-06', NULL, 60),
(17, b'1', '......', '2019-04-16', NULL, 61),
(18, b'0', '......', '2019-04-06', NULL, 1),
(19, b'1', '......', '2019-04-06', NULL, 47),
(20, b'1', '......', '2019-04-06', NULL, 48),
(21, b'0', '......', '2019-04-06', NULL, 49),
(22, b'0', 'test', NULL, '2019-04-18', 62),
(23, b'1', 'adasd', NULL, '2019-04-22', 62),
(24, b'1', 'adasd', NULL, '2019-04-22', 62);

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `role` int(11) NOT NULL,
  `name` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`role`, `name`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

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
  `depart_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `staffs`
--

INSERT INTO `staffs` (`id`, `name`, `gender`, `birthday`, `photo`, `email`, `phone`, `salary`, `notes`, `depart_id`) VALUES
(1, 'Bùi Kim Quyên', b'0', '1991-04-01', 'sad.jpg', 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 1),
(47, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 1),
(48, 'Phan Vinh Bính', b'1', '1991-07-23', NULL, 'vanbinh@gmail.com', 123456789, 8000000, 'Nothing', 1),
(49, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 1),
(50, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 3),
(51, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 3),
(52, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 3),
(53, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 4),
(54, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 4),
(55, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 4),
(56, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, '', 123456789, 7000000, 'Nothing', 5),
(57, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 6),
(58, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 5),
(59, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 5),
(60, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 6),
(61, 'Bùi Kim Quyên', b'0', '1991-04-01', NULL, 'kimquyen@gmail.com', 123456789, 7000000, 'Nothing', 6),
(62, 'John', b'1', '1988-12-31', 'cute-halloween-black-cats.jpg', 'weboth12@gmail.com', 123456789, 10000000, 'Test', 1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(60) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'dbuser1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu'),
(2, 'dbadmin1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu');

-- --------------------------------------------------------

--
-- Table structure for table `user_role`
--

CREATE TABLE `user_role` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_role` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `user_role`
--

INSERT INTO `user_role` (`id`, `id_user`, `id_role`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 2);

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
  ADD KEY `FKh8ohht48yul18ihlwbf8em406` (`staff_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`role`);

--
-- Indexes for table `staffs`
--
ALTER TABLE `staffs`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKlq1kinn71te2nigo4g4pjecvx` (`depart_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user_role`
--
ALTER TABLE `user_role`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK2aam9nt2tv8vcfymi3jo9c314` (`id_role`),
  ADD KEY `FKfhxaael2m459kbk8lv8smr5iv` (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `departs`
--
ALTER TABLE `departs`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `records`
--
ALTER TABLE `records`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `role` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `staffs`
--
ALTER TABLE `staffs`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=64;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user_role`
--
ALTER TABLE `user_role`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `records`
--
ALTER TABLE `records`
  ADD CONSTRAINT `FKh8ohht48yul18ihlwbf8em406` FOREIGN KEY (`staff_id`) REFERENCES `staffs` (`id`);

--
-- Constraints for table `staffs`
--
ALTER TABLE `staffs`
  ADD CONSTRAINT `FKlq1kinn71te2nigo4g4pjecvx` FOREIGN KEY (`depart_id`) REFERENCES `departs` (`Id`);

--
-- Constraints for table `user_role`
--
ALTER TABLE `user_role`
  ADD CONSTRAINT `FK2aam9nt2tv8vcfymi3jo9c314` FOREIGN KEY (`id_role`) REFERENCES `role` (`role`),
  ADD CONSTRAINT `FKfhxaael2m459kbk8lv8smr5iv` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
