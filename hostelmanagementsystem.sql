-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2017 at 12:42 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hostelmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `father_name` varchar(255) NOT NULL,
  `cnic` int(17) NOT NULL,
  `date_of_birth` varchar(255) NOT NULL,
  `eductionLevel` varchar(255) NOT NULL,
  `college_name` varchar(255) NOT NULL,
  `securityFee` int(22) NOT NULL,
  `user_type` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `father_name`, `cnic`, `date_of_birth`, `eductionLevel`, `college_name`, `securityFee`, `user_type`) VALUES
(1, 'Alfaha', 'ii', 88, 'Sat Sep 16 00:00:00 PKT 1995', 'no', 'no', 99, NULL),
(2, 'ss', 'ee', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL),
(3, 'dd', 'ii', 44, 'Sat Sep 16 00:00:00 PKT 1995', 'bs ', 'riu', 2000, NULL),
(4, 'kk', 'kk', 88, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'kk', 2999, NULL),
(5, 'kk', 'kk', 88, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 2000, NULL),
(6, 'kk', 'rr', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL),
(7, 'kk', 'rr', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL),
(8, 'kk', 'rr', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL),
(9, 'kk', 'rr', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL),
(10, 'ss', 'dd', 88, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL),
(11, 'kkKK', 'kk', 88, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'eiu', 2000, NULL),
(12, 'ss', 'kk', 99, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL),
(13, 'dd', 'ir', 88, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 2000, NULL),
(14, 'kk', 'rr', 22, 'Sat Sep 16 00:00:00 PKT 1995', 'bw', 'riu', 299, NULL),
(15, 'sohail', 'Rahmat Gul', 17301, '16/09/1995', 'BS Soft', 'RIU', 2000, 'A'),
(16, 'ss', 's', 17, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 2000, NULL),
(17, 'ss', 'rr', 88, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL),
(18, 'ss', 'kk', 88, 'Sat Sep 16 00:00:00 PKT 1995', 'bs', 'riu', 200, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`,`cnic`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
