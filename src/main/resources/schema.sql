CREATE TABLE IF NOT EXISTS todo (
	id INT AUTO_INCREMENT,
	username VARCHAR(255) NOT NULL,
	description VARCHAR(255) NOT NULL,
	target_date DATE,
	done BIT,
	PRIMARY KEY(id)		
);