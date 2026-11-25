-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 25, 2026 at 02:58 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tvet`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `password` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `user_name`, `password`) VALUES
(1, 'admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `id` int(5) NOT NULL,
  `course_name` varchar(45) NOT NULL,
  `course_code` varchar(45) NOT NULL,
  `sector` varchar(45) NOT NULL,
  `entry_qualification` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `mode` varchar(45) NOT NULL,
  `language` varchar(45) NOT NULL,
  `duration` varchar(45) NOT NULL,
  `course_fee` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`id`, `course_name`, `course_code`, `sector`, `entry_qualification`, `type`, `mode`, `language`, `duration`, `course_fee`) VALUES
(1, 'Software Developer', 'STD/VTA/CC07', 'ICT', 'GCE O/L Passed (6 subjects)', 'NVQ Level 4', 'Full Time', 'English', '12', '3000'),
(5, 'Multi Media', 'MTM/VTA/CC07', 'ICT', 'GCE O/L Passed (6 subjects)', 'NVQ Level 4', 'Full Time', 'English', '12', '3000'),
(7, 'Cookary', 'CK/VTA/CC07', 'Food & Beverage', 'GCE O/L Passed (6 subjects)', 'NVQ Level 4', 'Full Time', 'Sinhala', '12', '60000');

-- --------------------------------------------------------

--
-- Table structure for table `course_planner`
--

CREATE TABLE `course_planner` (
  `id` int(11) NOT NULL,
  `center_name` varchar(45) NOT NULL,
  `course_name` varchar(45) NOT NULL,
  `year` varchar(4) NOT NULL,
  `start_month` varchar(10) NOT NULL,
  `intake_capacity` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `course_planner`
--

INSERT INTO `course_planner` (`id`, `center_name`, `course_name`, `year`, `start_month`, `intake_capacity`) VALUES
(13, 'Kaluthara North', 'Software Developer', '2025', 'May', '30'),
(15, 'Kaluthara North', 'Software Developer', '2025', 'December', '30');

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `id` int(11) NOT NULL,
  `teacher_id` varchar(25) NOT NULL,
  `teacher_name` varchar(25) NOT NULL,
  `nic` varchar(15) NOT NULL,
  `center_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teachers`
--

INSERT INTO `teachers` (`id`, `teacher_id`, `teacher_name`, `nic`, `center_name`) VALUES
(15, 'CK001/VTA', 'Chinthani Kulathunga', '200633602385', 'Kaluthara North'),
(16, 'CU001/VTA', 'Chamari Ulathunga', '200633602324', 'Kaluthara North'),
(19, 'AK002/VTA', 'Amodh Kushan', '200655301615', 'Kaluthara North');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_course`
--

CREATE TABLE `teacher_course` (
  `id` int(11) NOT NULL,
  `teacher_id` varchar(25) NOT NULL,
  `course_code` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher_course`
--

INSERT INTO `teacher_course` (`id`, `teacher_id`, `course_code`) VALUES
(18, 'CA001/VTA', 'MTM/VTA/CC07'),
(14, 'CA001/VTA', 'STD/VTA/CC07');

-- --------------------------------------------------------

--
-- Table structure for table `training_centers`
--

CREATE TABLE `training_centers` (
  `id` int(10) NOT NULL,
  `Registration_No` varchar(20) NOT NULL,
  `center_name` varchar(20) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `contact_no` varchar(10) NOT NULL,
  `GPS_Location` varchar(10) NOT NULL,
  `District` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `training_centers`
--

INSERT INTO `training_centers` (`id`, `Registration_No`, `center_name`, `Address`, `contact_no`, `GPS_Location`, `District`) VALUES
(9, 'VTA/RC00/KAUN/01', 'Kaluthara North', 'hshhsh', '0729286735', '13.456', 'Kalutara'),
(12, 'VTA/RC00/HOA', 'Horana', 'hshhsh', '0729286735', '13.456', 'Kalutara'),
(15, 'VTA/RC00/PAA', 'Payagala', 'fghfgddxv', '1542254155', '14.557', 'Kalutara'),
(18, 'VTA/RC00/KAD', 'Kandewiharaya', 'hdhdbgvcgdgdg', '034558569', '14.585', 'Kalutara'),
(23, 'VTA/RC00/VAA', 'Valana', 'qwertyui', '0111458754', '14.583', 'Colombo');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `course_code` (`course_code`);

--
-- Indexes for table `course_planner`
--
ALTER TABLE `course_planner`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `planner` (`center_name`,`course_name`,`year`,`start_month`) USING BTREE;

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `teacher_id` (`teacher_id`),
  ADD UNIQUE KEY `nic` (`nic`);

--
-- Indexes for table `teacher_course`
--
ALTER TABLE `teacher_course`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Foreign Key` (`teacher_id`,`course_code`) USING BTREE;

--
-- Indexes for table `training_centers`
--
ALTER TABLE `training_centers`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `Registration_No` (`Registration_No`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `course_planner`
--
ALTER TABLE `course_planner`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `teachers`
--
ALTER TABLE `teachers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `teacher_course`
--
ALTER TABLE `teacher_course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `training_centers`
--
ALTER TABLE `training_centers`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
