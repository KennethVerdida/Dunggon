-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 18, 2020 at 05:46 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dunggon`
--

-- --------------------------------------------------------

--
-- Table structure for table `dunggon_user`
--

CREATE TABLE `dunggon_user` (
  `user_ID` int(11) NOT NULL,
  `username` varchar(100) DEFAULT NULL,
  `pass` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dunggon_user`
--

INSERT INTO `dunggon_user` (`user_ID`, `username`, `pass`) VALUES
(1, 'dunggonadmin', 'dunggonadmin123'),
(37, 'kenpalms', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `longtreatmentsched`
--

CREATE TABLE `longtreatmentsched` (
  `longSessionID` int(11) DEFAULT NULL,
  `sched_start` varchar(100) DEFAULT NULL,
  `sched_end` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `longtreatmentsched`
--

INSERT INTO `longtreatmentsched` (`longSessionID`, `sched_start`, `sched_end`) VALUES
(213, ' 06/07/2020', ' 11/10/2020'),
(214, ' 09/09/2020', ' 01/03/2021'),
(215, ' 12/01/2020', ' 06/01/2021'),
(217, ' 07/11/2020', ' 12/11/2020'),
(218, ' 08/09/2020', ' 05/03/2021'),
(219, ' 05/05/2020', ' 12/12/2020'),
(220, ' 07/07/2020', ' 03/03/2021'),
(221, ' 11/01/2020', ' 01/11/2021'),
(222, ' 05/01/2020', ' 06/01/2020'),
(223, '06/06/2020', ' 01/01/2021'),
(224, ' 08/08/2020', ' 05/09/2021'),
(225, ' 09/03/2020', ' 12/01/2020'),
(226, ' 04/22/2020', ' 05/22/2020'),
(227, ' 05/05/2020', ' 09/09/2020'),
(228, ' 06/06/2020', ' 07/06/2020'),
(229, ' 09/23/2020', ' 08/29/2020'),
(230, '10/10/2020', ' 01/10/2021'),
(231, ' 09/05/2020', ' 04/01/2021'),
(241, ' 09/03/2020', ' 08/01/2021');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `SessionID` int(11) NOT NULL,
  `FirstName` varchar(100) NOT NULL,
  `MiddleName` varchar(100) NOT NULL,
  `LastName` varchar(100) NOT NULL,
  `Age` varchar(100) NOT NULL,
  `Birthday` varchar(100) NOT NULL,
  `Gender` varchar(100) NOT NULL,
  `Occupation` varchar(100) NOT NULL,
  `Status` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `ContactNumber1` varchar(100) NOT NULL,
  `Email1` varchar(100) NOT NULL,
  `MentalCondition` varchar(100) NOT NULL,
  `PrevHospital` varchar(100) NOT NULL,
  `Guardian` varchar(100) NOT NULL,
  `ContactNumber2` varchar(100) NOT NULL,
  `Email2` varchar(100) NOT NULL,
  `DunggonID` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`SessionID`, `FirstName`, `MiddleName`, `LastName`, `Age`, `Birthday`, `Gender`, `Occupation`, `Status`, `Address`, `ContactNumber1`, `Email1`, `MentalCondition`, `PrevHospital`, `Guardian`, `ContactNumber2`, `Email2`, `DunggonID`) VALUES
(205, 'Laurence Jean', 'Lepon', 'Umpad', '45', '04/27/1985', 'Female', 'Cardiac Technician', 'Single', 'Gairan Bogo City, Cebu', '09548726547', 'lau@gmail.com', 'Generalized Anxiety Disorder', '', 'Maria Liza Umpad', '098745263154', '', 'DNGGN-205'),
(206, 'Glendyl', 'Dibdib', 'Lepon', '53', '07/23/1967', 'Male', 'Carpenter', 'Single', 'Cogon Cebu', '09874528769', 'gdyls@gmail.com', 'Manic Episode', 'none', 'Sepulvida LLepon', '098756325478', '', 'DNGGN-206'),
(207, 'Jashua', 'Bentulan', 'Plenous', '23', '01/02/1997', 'Male', 'Chief Executive or Managing Director', 'Single', 'Balamban Cebu', '098752635487', 'jas@gmail.com', 'Dissociative Amnesia', 'Verallo Hospital', 'Archer Bentulan', '098745263897', '', 'DNGGN-207'),
(208, 'Kathleen Grace', 'Nonong', 'Vibar', '64', '05/28/1962', 'Female', 'none', 'Single', 'Sambag Bogo City, Cebu', '098745263156', 'kaths@gmail.com', 'Schizophrenia', 'Cebu Provincial Hospital', 'Jean Vibar', '0987526545846', 'jean@gmail.com', 'DNGGN-208'),
(209, 'ZD', 'Verdida', 'Duroy', '44', '04/01/1976', 'Male', 'Police', 'Single', 'Banawa Cebu City', '09325468712', 'zd@gmail.com', 'Bipolar', '', 'none', 'none', '', 'DNGGN-209'),
(210, 'Jovi Ann', 'Tipon-tipon', 'Canama', '77', '04/23/1943', 'Female', 'Customer Service Manager', 'Married', 'A. Soriano Avenue', '098746625874', 'jovi@gmail.com', 'Insomnia Disorder', 'Bogo-Medellin Medical Center, Inc.', 'Merly Canama', '0987452635874', 'mar@gmail.com', 'DNGGN-210'),
(211, 'Jun Mark', 'Molejon', 'Alburo', '67', '09/06/1953', 'Male', 'Dietitian', 'Single', 'Arellano Street / Arellano Boulevard', '098745622569', 'jun@gmail.com', 'Stuttering', 'none', 'Jovi Alburo', '098746625668', '', 'DNGGN-211'),
(212, 'Erwin', 'Ramos', 'Villarojo', '33', '07/01/1987', 'Male', 'Economist', 'Single', 'M. J. Cuenco Avenue', '09874563256', '', 'Tourette’s Disorder', 'Ormoc District Hospital', 'John Villarojo', '09852635463', '', 'DNGGN-212'),
(213, 'Geraldine Dindi', 'Cau', 'Dela Cerna', '23', '06/22/1997', 'Female', 'Electrician (General)', 'Single', 'M. C. Briones Street / M. C. Briones Highway', '09856325647', 'dindi@gmail.com', 'Social (Pragmatic) Communication Disorder', 'Dr. Ignacio M. Cortes General Hospital, Inc.', 'Dandy Dela Cerna', '09874563258', '', 'DNGGN-213'),
(214, 'John Nicholson', 'Tercero', 'Dela Cruz', '55', '11/02/1965', 'Male', 'Environmental Manager', 'Single', 'Sanciangko Street', '09896587458', 'john@gmail.com', 'Selective Mutism', '09856325656', 'Jean Dela Cruz', '09852478888', '', 'DNGGN-214'),
(215, 'Emanuel', 'Togonon', 'Rabe', '22', '09/09/1998', 'Male', 'Finance Manager', 'Single', 'Eduardo Aboitiz Street (formerly L. Jaena Street)', '09587444778', 'rab@gmail.com', 'Reading Disorder', 'Perpetual Succour Hospital', 'Rain Rabe', '0988555256', '', 'DNGGN-215'),
(217, 'Princess Eramie', 'Arenas', 'Arenas', '55', '11/13/1965', 'Female', 'Health Information Manager', 'Single', 'Natalio B. Bacalso Avenue / Cebu South Road', '0985858574545', 'press2gmail.com', 'Rapid Eye Movement Sleep Behavior Disorder', 'St. Vincent General Hospital - CEBU', 'none', 'none', '', 'DNGGN-217'),
(218, 'Jerald', 'Co', 'Felices', '20', '02/02/2000', 'Male', 'none', 'Single', 'J. Urgello Street', '0985746235897', 'jed@gmail.com', 'Transvestic Disorder', 'Cebu Doctors’ University Hospital', 'Kate Felices ', 'none', '', 'DNGGN-218'),
(219, 'Diane Isabelle', 'Lambojo', 'Emorecha', '31', '12/01/1989', 'Female', 'Insurance Agent', 'Single', 'Don Jose Avila Street/ J. Avila Street', '09858578789', 'daine@gmail.com', 'Dissociative Fugue', 'Cebu Doctors’ University Hospital', ' Jarry Emorecha ', '08747414545', 'jar@gmail.com', 'DNGGN-219'),
(220, 'Kate', 'Sy', 'Bicol', '29', '09/09/1991', 'Female', 'none', 'Single', 'General Echavez Street / Extension Street', '0954789652365', 'kate@gmail.com', 'Anorexia Nervosa', 'Mandaue City Hospital', 'Den Bicol', '085471523698', 'den@gmail.com', 'DNGGN-220'),
(221, 'Yanni Jan', 'Co', 'Mondejar', '29', '02/02/1955', 'Male', 'Librarian', 'Single', 'Pasteur Street', '098585865657', 'yanni@gmail.com', 'Anorexia Nervosa1', 'ARC Hospital', 'Den Bicol', '085471523698', 'yan@gmail.com', 'DNGGN-221'),
(222, 'Trisha May', 'Loberiano', 'Capangpangan', '43', '01/01/1977', 'Female', 'Mechanical Engineer', 'Single', 'S. Cabahug Street / S.B. Cabahug Street', '0969685853231', 'tri@gmail.com', 'Disorder of Written Expression', '', 'Tie Capangpangan', '09655666447', '', 'DNGGN-222'),
(223, 'Justin Dee', 'Sy', 'Dy', '22', '09/09/1998', 'Male', 'Medical Technicians ', 'Single', 'A. Miñoza Highway / A. Miñoza Street', '09587462587', 'dee2gmail.com', 'Rumination Disorder', '', 'none', 'none', '', 'DNGGN-223'),
(224, 'Lee', 'Ly', 'Dele Cerna', '39', '09/09/1981', 'Male', 'Minister of Religion', 'Widowed', 'Sepulveda Street', '09856478451', 'lee2gmail.com', 'Social (Pragmatic) Communication Disorder', '', 'none', 'none', '', 'DNGGN-224'),
(225, 'Jane', 'Dee', 'Lepon', '33', '01/23/1987', 'Female', 'Mine Deputy', 'Married', 'I. Villamor Street', '098585746265', 'janedee@gmail.com', 'Circadian Rhythm Sleep-Wake Disorder', 'St. Anthony Street', 'Jun Lepon', '09854785968', 'jl@gmail.com', 'DNGGN-225'),
(226, 'Mary Grace', 'Bentulan', 'Repunte', '21', '01/09/1999', 'Female', 'Network Analyst', 'Single', 'Don Sulpicio Go Street', '09857462321', 'mary@gmail.com', 'Hypersomnolence (Hypersomnia, Primary)', 'Clinica Gatchalian and Hospital', 'Naneth Repunte', '0985863635222', 'nan@gmail.com', 'DNGGN-226'),
(227, 'Kin Tryon', 'Lee', 'Escolar', '44', '04/04/1976', 'Male', 'Nurse Researcher', 'Single', 'St. Michael Street', '098585623214', 'tryon@gmail.com', 'Narcolepsy', '', 'Laurence Umpad', '098525245124', 'lau@gmail.com', 'DNGGN-227'),
(228, 'Therese Jane', 'Babao', 'Aton', '23', '03/03/1997', 'Female', 'Otorhinolaryngologist', 'Single', 'Don Sulpicio Go Street', '096582323333', 'ter@gmail.com', 'Non-Rapid Eye Movement Sleep Arousal Disorders', 'Clinica Gatchalian and Hospital', 'none', 'none', '', 'DNGGN-228'),
(229, 'Rezan Mae', 'Alferez', 'Alarde', '66', '09/04/1954', 'Female', 'none', 'Married', 'Woolbright Drive', 'none', 'rai@gmail.com', 'Autism', '', 'Alva Alarde', '095855522153', '', 'DNGGN-229'),
(230, 'Earl', 'Pangilinan', 'Apanitan', '37', '01/29/1983', 'Male', 'Petroleum Engineer', 'Divorced', 'E. S. Baclig Jr. Avenue', '096322254156', 'earl@gmail.com', 'Expressive Language Disorder', 'St. Vincent General Hospital - CEBU', 'Richell Go', '0952541116367', '', 'DNGGN-230'),
(231, 'Dave', 'Gelig', 'Bolambao', '26', '03/03/1994', 'Male', 'Podiatrist', 'Separated', 'Padre Cabantan Street', '09582666325416', 'dave@gmail.com', 'Oppositional Defiant Disorder', 'Juan B. Dosado Memorial Hospital', 'Breeza Gelig', '09523331654', 'bring@gmail.com', 'DNGGN-231'),
(240, 'Kenneth', 'Sy', 'Palma', '23', '04/27/1997', 'Female', 'Interpreter', 'Single', 'St. Joseph Village Cogo Bogo City, Cebu', '09273561425', 'kenpalms@gmail.com', 'Anxiety Attacks', 'Verallo Hospital', 'Mariah Palma', '09063237939', '', 'DNGGN-240'),
(241, 'Juliet', 'Go', 'Verdida', '20', '01/01/2000', 'Female', 'Driver', 'Single', 'Linao Talisay Cebu City', '09253641789', 'juls@gmail.com', 'Depression', '', 'Roal Verdida', '09652874963', '', 'DNGGN-241');

-- --------------------------------------------------------

--
-- Table structure for table `shorttreatmentsched`
--

CREATE TABLE `shorttreatmentsched` (
  `shortSessionID` int(11) DEFAULT NULL,
  `sched_time` varchar(100) DEFAULT NULL,
  `sched_day` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shorttreatmentsched`
--

INSERT INTO `shorttreatmentsched` (`shortSessionID`, `sched_time`, `sched_day`) VALUES
(205, '8:00-9:00', 'Monday'),
(206, '2:00-3:00', 'Friday'),
(207, '1:00-2:00', 'Wednesday'),
(208, '9:00-10:00', 'Tuesday'),
(209, '8:00-9:00', 'Monday'),
(210, '8:00-9:00', 'Monday'),
(211, '2:00-3:00', 'Thursday'),
(212, '8:00-9:00', 'Monday'),
(240, '3:00-4:00', 'Friday');

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `info_ID` int(11) DEFAULT NULL,
  `fname` varchar(100) DEFAULT NULL,
  `lname` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`info_ID`, `fname`, `lname`, `email`) VALUES
(37, 'Kenneth', 'Palma', 'kenpalms@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dunggon_user`
--
ALTER TABLE `dunggon_user`
  ADD PRIMARY KEY (`user_ID`);

--
-- Indexes for table `longtreatmentsched`
--
ALTER TABLE `longtreatmentsched`
  ADD KEY `FK_longtreatmentsched` (`longSessionID`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`SessionID`);

--
-- Indexes for table `shorttreatmentsched`
--
ALTER TABLE `shorttreatmentsched`
  ADD KEY `FK_shorttreatmentsched` (`shortSessionID`);

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD KEY `FK_user_info` (`info_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dunggon_user`
--
ALTER TABLE `dunggon_user`
  MODIFY `user_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `SessionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=261;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `longtreatmentsched`
--
ALTER TABLE `longtreatmentsched`
  ADD CONSTRAINT `FK_longtreatmentsched` FOREIGN KEY (`longSessionID`) REFERENCES `patient` (`SessionID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `shorttreatmentsched`
--
ALTER TABLE `shorttreatmentsched`
  ADD CONSTRAINT `FK_shorttreatmentsched` FOREIGN KEY (`shortSessionID`) REFERENCES `patient` (`SessionID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user_info`
--
ALTER TABLE `user_info`
  ADD CONSTRAINT `FK_user_info` FOREIGN KEY (`info_ID`) REFERENCES `dunggon_user` (`user_ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
