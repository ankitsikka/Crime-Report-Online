-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2017 at 07:34 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `crimefiledb`
--
CREATE DATABASE IF NOT EXISTS `crimefiledb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `crimefiledb`;

-- --------------------------------------------------------

--
-- Table structure for table `addlocation`
--

DROP TABLE IF EXISTS `addlocation`;
CREATE TABLE IF NOT EXISTS `addlocation` (
  `stateid` int(100) NOT NULL,
  `cityid` int(100) NOT NULL,
  `pname` varchar(100) NOT NULL,
  `address` varchar(1000) NOT NULL,
  `shoname` varchar(200) NOT NULL,
  `image` varchar(100) NOT NULL,
  `phone` bigint(100) NOT NULL,
  `locationid` int(100) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`locationid`),
  KEY `categoryid` (`stateid`,`cityid`),
  KEY `subcatid` (`cityid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `addlocation`
--

INSERT INTO `addlocation` (`stateid`, `cityid`, `pname`, `address`, `shoname`, `image`, `phone`, `locationid`) VALUES
(1, 5, 'div 5', 'ue1', 'ijij', 'default.gif', 655, 6),
(1, 5, 'hjhu', 'ue3', 'ijij', 'default.gif', 544, 7),
(1, 5, 'hjhu', 'ue2', 'ijij', 'default.gif', 999, 8);

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
CREATE TABLE IF NOT EXISTS `adminlogin` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `pdivno` varchar(100) NOT NULL,
  `pid` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`username`, `password`, `state`, `city`, `pdivno`, `pid`) VALUES
('admin', '123', '', '', '', ''),
('div156', '156', '1', '5', '6', '156');

-- --------------------------------------------------------

--
-- Table structure for table `citytable`
--

DROP TABLE IF EXISTS `citytable`;
CREATE TABLE IF NOT EXISTS `citytable` (
  `cityid` int(100) NOT NULL AUTO_INCREMENT,
  `stateid` int(100) NOT NULL,
  `cityname` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`cityid`),
  KEY `categoryid` (`stateid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `citytable`
--

INSERT INTO `citytable` (`cityid`, `stateid`, `cityname`, `image`) VALUES
(5, 1, 'Jalandhar', 'default.gif');

-- --------------------------------------------------------

--
-- Table structure for table `complaintform`
--

DROP TABLE IF EXISTS `complaintform`;
CREATE TABLE IF NOT EXISTS `complaintform` (
  `firno` bigint(100) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `state` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `pdivno` varchar(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `phone` bigint(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `idproof` varchar(100) NOT NULL,
  `idno` varchar(100) NOT NULL,
  `cdetails` varchar(2000) NOT NULL,
  `cname` varchar(100) NOT NULL,
  `cfname` varchar(100) NOT NULL,
  `cphone` bigint(100) NOT NULL,
  `caddress` varchar(200) NOT NULL,
  `aname` varchar(100) NOT NULL,
  `afname` varchar(100) NOT NULL,
  `aphone` bigint(100) NOT NULL,
  `aaddress` varchar(200) NOT NULL,
  `dateofreg` date NOT NULL,
  PRIMARY KEY (`firno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20170001240 ;

--
-- Dumping data for table `complaintform`
--

INSERT INTO `complaintform` (`firno`, `username`, `status`, `state`, `city`, `pdivno`, `name`, `phone`, `email`, `idproof`, `idno`, `cdetails`, `cname`, `cfname`, `cphone`, `caddress`, `aname`, `afname`, `aphone`, `aaddress`, `dateofreg`) VALUES
(20170001230, 'ankit', 'Pending', '1', '5', '6', 'sp', 646, '''xm', 'qsx', '6584', 'kl kj', 'kjb', 'kjbb', 4, '65', '651', '611', 616, '651', '2017-03-10'),
(20170001231, 'ankit', 'Pending', '1', '5', '6', 'sp', 646, '''xm', 'qsx', '6584', 'kl kj', 'kjb', 'kjbb', 4, '65', '651', '611', 616, '651', '2017-03-04'),
(20170001232, 'ankit', 'Pending', '1', '5', '6', 'ss', 5656, 'bvhhgj', 'hbj', 'hjjkk', 'jkjk', 'hjhj', 'kjjkjk', 5555, 'ghhju', 'gtfg', 'bnkj', 5556, 'hjhjhj', '2017-04-13'),
(20170001233, 'ankit', 'Pending', '1', '5', '6', 'ss', 5656, 'bvhhgj', 'hbj', 'hjjkk', 'jkjk', 'hjhj', 'kjjkjk', 5555, 'ghhju', 'gtfg', 'bnkj', 5556, 'hjhjhj', '2017-03-01'),
(20170001234, 'ankit', 'Pending', '1', '5', '6', 'ss', 5656, 'bvhhgj', 'hbj', 'hjjkk', 'jkjk', 'hjhj', 'kjjkjk', 5555, 'ghhju', 'gtfg', 'bnkj', 5556, 'hjhjhj', '2017-03-31'),
(20170001235, 'ankit', 'Pending', '1', '5', '6', 'ss', 5656, 'bvhhgj', 'hbj', 'hjjkk', 'jkjk', 'hjhj', 'kjjkjk', 5555, 'ghhju', 'gtfg', 'bnkj', 5556, 'hjhjhj', '2017-05-20'),
(20170001238, 'sikka', 'Pending', '1', '5', '6', 'kk', 4444444444, 'j', 'kk', 'kk', 'kk', 'jj', 'kk', 4444444444, 'kk', 'oo', 'oo', 7777777777, 'jj', '2016-12-02'),
(20170001239, 'sikka', 'Pending', '1', '5', '6', 'hh', 7777777777, 'gg', 'hh', 'hh', 'hh', 'jj', 'jj', 8888888888, 'hh', 'hh', 'jj', 9999999999, 'hhu', '2017-03-14');

-- --------------------------------------------------------

--
-- Table structure for table `lostfound`
--

DROP TABLE IF EXISTS `lostfound`;
CREATE TABLE IF NOT EXISTS `lostfound` (
  `firno` bigint(100) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `fmname` varchar(200) NOT NULL,
  `address` varchar(500) NOT NULL,
  `phone` bigint(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `place` varchar(500) NOT NULL,
  `idproof` varchar(200) NOT NULL,
  `idno` varchar(200) NOT NULL,
  `date` date NOT NULL,
  `time` varchar(100) NOT NULL,
  `article` varchar(200) NOT NULL,
  `description` varchar(500) NOT NULL,
  `dateofreg` date NOT NULL,
  `type` varchar(100) NOT NULL,
  `city` varchar(100) NOT NULL,
  `location` varchar(200) NOT NULL,
  `state` varchar(100) NOT NULL,
  PRIMARY KEY (`firno`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=20177000133 ;

--
-- Dumping data for table `lostfound`
--

INSERT INTO `lostfound` (`firno`, `username`, `status`, `name`, `fmname`, `address`, `phone`, `email`, `place`, `idproof`, `idno`, `date`, `time`, `article`, `description`, `dateofreg`, `type`, `city`, `location`, `state`) VALUES
(20177000127, 'ankit', 'Pending', 'jg', 'ghgh', 'ghgh', 1111111111, 'hj', 'hhjhj', 'hjhj', 'hj', '2017-03-03', 'hjhj', 'hjhj', 'hjhj', '2017-03-10', 'found', '5', '7', '1'),
(20177000128, 'sikka', 'Pending', 'aaAA', 'aa', 'aa', 9999999999, 'ghgh', 'ghhg', 'bh', 'bh', '2017-03-12', 'bhbh', 'bhbh', 'bhbh', '2017-03-14', 'lost', '5', '6', '1'),
(20177000129, 'sikka', 'Pending', 'ju', 'j', 'hh', 9999999999, 'hh', 'hh', 'hh', 'hh', '2017-11-03', 'ghgh', 'hjjh', 'hh', '2017-03-14', 'lost', '5', '6', '1'),
(20177000130, 'ankit', 'Pending', 'hjhjhjhjhj', 'hjhj', 'hjhj', 7777777777, 'hjjh', 'kjkj', 'kjkj', 'njkj', '2016-01-01', 'jjk', 'jkjk', 'jkkj', '2017-03-15', 'found', '5', '6', '1'),
(20177000131, 'ankit', 'Pending', 'fghj', 'vbn', 'vbnm', 5444444444, 'fgvhbj', 'ghbjn', 'gvhbjn', 'vghb', '2017-03-03', 'ghjk', 'fcghj', 'gvhbjnk', '2017-04-23', 'lost', '5', '6', '1'),
(20177000132, 'ankit', 'Pending', 'ghbjn', 'gvhbjn', 'ghbjn', 5444444444, 'bhjk', 'bhjn', 'bn', 'bhjn', '2016-11-05', 'gvbh', 'ghj', 'gvh', '2017-04-23', 'found', '5', '6', '1');

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

DROP TABLE IF EXISTS `signup`;
CREATE TABLE IF NOT EXISTS `signup` (
  `username` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(500) NOT NULL,
  `phone` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`username`, `password`, `name`, `address`, `phone`, `gender`, `image`) VALUES
('ankit', '1159', 'Ankit', 'gfhjkl', '8427832336', 'male', 'default.gif'),
('ankit1', 'ankit', 'bhhbj', 'bhjhj', '51545', 'male', 'default.gif'),
('ankit1159', 'sikka', 'ankit', 'jjj', '123', 'male', 'default.gif'),
('ankitsikka', 'gy', 'hjhj', 'hjkj', '5252', 'male', 'default.gif');

-- --------------------------------------------------------

--
-- Table structure for table `statetable`
--

DROP TABLE IF EXISTS `statetable`;
CREATE TABLE IF NOT EXISTS `statetable` (
  `stateid` int(100) NOT NULL AUTO_INCREMENT,
  `statename` varchar(100) NOT NULL,
  `image` varchar(100) NOT NULL,
  PRIMARY KEY (`stateid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Dumping data for table `statetable`
--

INSERT INTO `statetable` (`stateid`, `statename`, `image`) VALUES
(1, 'Punjab', '1482668006808IMG_2726.JPG'),
(4, 'Gujrat', '1482668112143WhatsApp Image 2016-12-22 at 2.24.59 PM.jpeg'),
(11, 'MP', 'default.gif');

-- --------------------------------------------------------

--
-- Table structure for table `statustable`
--

DROP TABLE IF EXISTS `statustable`;
CREATE TABLE IF NOT EXISTS `statustable` (
  `firno` double NOT NULL,
  `status` longtext NOT NULL,
  PRIMARY KEY (`firno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `statustable`
--

INSERT INTO `statustable` (`firno`, `status`) VALUES
(20170001230, 'fgvhbjnkm');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `addlocation`
--
ALTER TABLE `addlocation`
  ADD CONSTRAINT `mycons1` FOREIGN KEY (`stateid`) REFERENCES `statetable` (`stateid`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `mycons2` FOREIGN KEY (`cityid`) REFERENCES `citytable` (`cityid`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `citytable`
--
ALTER TABLE `citytable`
  ADD CONSTRAINT `mycons` FOREIGN KEY (`stateid`) REFERENCES `statetable` (`stateid`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
