-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 02, 2020 at 02:06 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `learnersacademydemo`
--

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `classID` int(10) NOT NULL,
  `className` varchar(30) NOT NULL,
  `subjectCode` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`classID`, `className`, `subjectCode`) VALUES
(1, 'V', 'LA_FIVE'),
(2, 'VI', 'LA_SIX'),
(3, 'VII', 'LA_SEVEN'),
(4, 'VIII', 'LA_EIGHT'),
(5, 'IX', 'LA_NINE'),
(6, 'X', 'LA_TEN');

-- --------------------------------------------------------

--
-- Table structure for table `classmappingsubject`
--

CREATE TABLE `classmappingsubject` (
  `serialNo` int(20) NOT NULL,
  `className` text NOT NULL,
  `subjectName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classmappingsubject`
--

INSERT INTO `classmappingsubject` (`serialNo`, `className`, `subjectName`) VALUES
(16, 'V', 'Mathematics'),
(17, 'V', 'Computer'),
(18, 'V', 'Drawing');

-- --------------------------------------------------------

--
-- Table structure for table `classmappingsubjectmappingteacher`
--

CREATE TABLE `classmappingsubjectmappingteacher` (
  `serialNo` int(20) NOT NULL,
  `className` varchar(30) NOT NULL,
  `subjectName` varchar(30) NOT NULL,
  `teacherName` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classmappingsubjectmappingteacher`
--

INSERT INTO `classmappingsubjectmappingteacher` (`serialNo`, `className`, `subjectName`, `teacherName`) VALUES
(3, 'V', 'Mathematics', 'Sanjay'),
(4, 'V', 'Computer', 'Jayanta'),
(5, 'V', 'Computer', 'Dharanidharan'),
(6, 'V', 'Drawing', 'SimplilearnTeacher');

-- --------------------------------------------------------

--
-- Table structure for table `studentmaster`
--

CREATE TABLE `studentmaster` (
  `studentID` int(10) NOT NULL,
  `studentName` varchar(30) NOT NULL,
  `studentClass` varchar(5) NOT NULL,
  `subjectCode` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentmaster`
--

INSERT INTO `studentmaster` (`studentID`, `studentName`, `studentClass`, `subjectCode`) VALUES
(1, 'Vinay Madugula', 'IX', 'LA_NINE'),
(4, 'Mahesh Paliwal', 'VIII', 'LA_EIGHT'),
(5, 'Ajay Kumar', 'VIII', 'LA_EIGHT'),
(6, 'Roshan Giri', 'VIII', 'LA_EIGHT'),
(7, 'Rohit Ahuja', 'VIII', 'LA_EIGHT'),
(8, 'Keerthana Umesh', 'VIII', 'LA_EIGHT'),
(9, 'Gokula Annamalai', 'IX', 'LA_NINE'),
(14, 'Tom Olsen', 'V', 'LA_FIVE'),
(15, 'Samantha Doherthy', 'V', 'LA_FIVE'),
(16, 'Ganesh Mittal', 'V', 'LA_FIVE'),
(17, 'Arjun Srinivasan', 'IX', 'LA_NINE'),
(18, 'Paranthaman Shivaramakrishnan', 'VII', 'LA_SEVEN'),
(19, 'Zara Ali', 'VI', 'LA_SIX'),
(22, 'Megha Sethia', 'VI', 'LA_SIX'),
(23, 'Shubham Shetia', 'VI', 'LA_SIX'),
(24, 'Sourav Malik', 'VI', 'LA_SIX'),
(25, 'Dinesh Solanki', 'VII', 'LA_SEVEN'),
(26, 'Supreet Mishra', 'VII', 'LA_SEVEN'),
(27, 'Rahul Pokhriwal', 'VII', 'LA_SEVEN'),
(28, 'Ishwaran Jagadishan', 'IX', 'LA_NINE'),
(29, 'Susanta Acharjee', 'X', 'LA_TEN'),
(30, 'Simplilearn Student', 'V', 'LA_FIVE');

-- --------------------------------------------------------

--
-- Table structure for table `subjects`
--

CREATE TABLE `subjects` (
  `subjectID` int(20) NOT NULL,
  `subjectName` varchar(30) NOT NULL,
  `subjectDescription` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `subjects`
--

INSERT INTO `subjects` (`subjectID`, `subjectName`, `subjectDescription`) VALUES
(1, 'English', 'literature subject'),
(2, 'Mathematics', 'Science Subject'),
(5, 'Biology', 'Sciences'),
(6, 'Geography', 'Science Subject'),
(7, 'Physics', 'Science Subject'),
(8, 'Chemistry', 'Science Subject'),
(9, 'Computer Science', 'Science Subject'),
(10, 'Hindi', 'literature subject'),
(11, 'Kannada', 'literature subject'),
(12, 'Drawing', 'leisure');

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `teacherID` int(10) NOT NULL,
  `teacherName` varchar(30) NOT NULL,
  `teacherQualification` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teachers`
--

INSERT INTO `teachers` (`teacherID`, `teacherName`, `teacherQualification`) VALUES
(1, 'Nilesh Mehra', 'M.SC in Mathematics'),
(2, 'Jayanta Acharjee', 'B.Tech ECE'),
(3, 'Omkar', 'BSc'),
(4, 'Dharanidharan', 'BSc'),
(5, 'Manish', 'MTech'),
(6, 'Sanjay', 'M.SC in Mathematics'),
(7, 'Keerthana', 'M.SC in Mathematics'),
(8, 'Keerthana', 'M.SC in Mathematics'),
(9, 'Ravi', 'BA'),
(10, 'Keshav', 'BA'),
(11, 'Kundan', 'BA'),
(12, 'Ankit', 'BA'),
(13, 'Deborah', 'BA'),
(14, 'SimplilearnTeacher', 'MTech');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `classes`
--
ALTER TABLE `classes`
  ADD PRIMARY KEY (`classID`);

--
-- Indexes for table `classmappingsubject`
--
ALTER TABLE `classmappingsubject`
  ADD PRIMARY KEY (`serialNo`);

--
-- Indexes for table `classmappingsubjectmappingteacher`
--
ALTER TABLE `classmappingsubjectmappingteacher`
  ADD PRIMARY KEY (`serialNo`);

--
-- Indexes for table `studentmaster`
--
ALTER TABLE `studentmaster`
  ADD PRIMARY KEY (`studentID`);

--
-- Indexes for table `subjects`
--
ALTER TABLE `subjects`
  ADD PRIMARY KEY (`subjectID`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`teacherID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `classes`
--
ALTER TABLE `classes`
  MODIFY `classID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `classmappingsubject`
--
ALTER TABLE `classmappingsubject`
  MODIFY `serialNo` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `classmappingsubjectmappingteacher`
--
ALTER TABLE `classmappingsubjectmappingteacher`
  MODIFY `serialNo` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `studentmaster`
--
ALTER TABLE `studentmaster`
  MODIFY `studentID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `subjects`
--
ALTER TABLE `subjects`
  MODIFY `subjectID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `teachers`
--
ALTER TABLE `teachers`
  MODIFY `teacherID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
