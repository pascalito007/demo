CREATE TABLE ROOM(
  ROOM_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(16) NOT NULL,
  ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
  BED_INFO CHAR(2) NOT NULL
);
CREATE TABLE employee(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    hrid VARCHAR (50)
);
CREATE TABLE territory(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name varchar (50)
);
CREATE TABLE transcode(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    code VARCHAR (10)
);
create table employee_territory_function(
  employee_id BIGINT NOT NULL,
  territory_id BIGINT NOT NULL,
  transcode_id BIGINT NOT NULL,
  PRIMARY KEY (employee_id,territory_id),
  CONSTRAINT employeeref FOREIGN KEY (employee_id) REFERENCES employee (id),
  CONSTRAINT territoryref FOREIGN KEY (territory_id) REFERENCES territory (id) ,
  CONSTRAINT transcoderef FOREIGN KEY (transcode_id) REFERENCES transcode (id)
);