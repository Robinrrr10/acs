CREATE DATABASE IF NOT EXISTS acs;
USE acs;
CREATE TABLE account_details (account_number BIGINT(11) PRIMARY KEY AUTO_INCREMENT, name VARCHAR(250), password VARCHAR(250), aadhaar_number BIGINT(12), email varchar(250));
