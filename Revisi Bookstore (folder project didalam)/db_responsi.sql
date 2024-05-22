-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2024 at 03:43 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_responsi`
--

-- --------------------------------------------------------

--
-- Table structure for table `sewa_buku`
--

CREATE TABLE `sewa_buku` (
  `id` int(11) NOT NULL,
  `nama_penyewa` varchar(50) NOT NULL,
  `judul_buku` varchar(100) NOT NULL,
  `jenis_buku` varchar(50) NOT NULL,
  `nomor_telepon` varchar(14) NOT NULL,
  `durasi_sewa` int(11) NOT NULL,
  `total_biaya` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sewa_buku`
--

INSERT INTO `sewa_buku` (`id`, `nama_penyewa`, `judul_buku`, `jenis_buku`, `nomor_telepon`, `durasi_sewa`, `total_biaya`) VALUES
(1, 'Nathaleon', 'The Alchemist', 'Fiksi', '082242719909', 2, 20000),
(2, 'Ren', 'No Longer Human', 'Novel', '082242719999', 4, 30000),
(3, 'Leon', 'Before the Coffee Gets Cold', 'Novel', '082242719910', 3, 25000),
(5, 'Leonhart', 'Belajar Java', 'Pendidikan', '0811969876', 7, 45000),
(6, 'Nathan', 'Belajar Java', 'Pendidikan', '0822445578', 1, 10000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sewa_buku`
--
ALTER TABLE `sewa_buku`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `sewa_buku`
--
ALTER TABLE `sewa_buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
