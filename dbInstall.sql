CREATE DATABASE acs;
USE acs;
CREATE TABLE account_details (account_number BIGINT(11) PRIMARY KEY AUTO_INCREMENT, name VARCHAR(250), password VARCHAR(250), aadhaar_number BIGINT(12));