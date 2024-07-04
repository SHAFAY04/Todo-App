-- Database lab project file

show databases;
use todolist;
create table signup (username varchar (20),  email varchar(100),  pass varchar(30));
 
create table login (username varchar (20), pass varchar(20));
  
create table task (username varchar (20), taskname varchar (50), taskdis varchar (300), taskdatetime varchar (100), assignedBy varchar (20));
 
create table organizations (username varchar (20), company varchar(20), role varchar(20));
 
 insert into task values ("shaeel","teach","teach me probability and statistics before exams","9th july 2024","waniya");
  insert into task values ("hassan","get project","get a new node.js project from the client","7th june 2024","shafay");

  
  alter table userdata add dateOfJoining date;
  alter table userdata add firstName varchar (20) first;
    alter table userdata add lastName varchar (20) after firstName;
        alter table userdata add fullName varchar (20) after lastName;
  alter table userdata add company varchar(20);
  alter table task change username assignedTo varchar (20);
ALTER TABLE userdata ADD PRIMARY KEY (username);
  alter table userdata modify username varchar(20) primary key;
  alter table organizations drop foreign key organizations_ibfk_1;
  alter table task add foreign key(assignedBy) references userdata(username) ON UPDATE CASCADE ON DELETE CASCADE;
  alter table organizations add foreign key(username) references userdata(username) ON UPDATE CASCADE ON DELETE CASCADE;
set sql_safe_updates=0;

  delimiter $$
  create procedure getOrganizationUsers(in organization varchar(20), in userRole varchar (20), in currentUser varchar (20))
  begin
  
	drop temporary table if exists organizationUsers;
    create temporary table organizationUsers (
        username VARCHAR(50),
        role VARCHAR(50)
    );
    
	insert into organizationUsers select distinct username,role from organizations where company = organization;
	
     IF userRole = 'architect' then select username from organizationUsers where username != currentUser;
     ELSEIF userRole = 'lead' then select username from organizationUsers where role in ('lead','senior dev','junior dev') and username != currentUser;
     ELSEIF userRole = 'senior dev' then select username from organizationUsers where role in ('senior dev','junior dev')and username != currentUser;
     ELSEIF userRole = 'junior dev' then select username from organizationUsers where role in ('junior dev')and username != currentUser;
    END IF;
    
END $$
  delimiter ;
  call getOrganizationUsers('SellSoft','junior dev','hamza');
  
 
  
DELIMITER $$
CREATE PROCEDURE insertDataIntoTables(
    IN firstName VARCHAR(255),
    IN lastName VARCHAR(255),
    IN username VARCHAR(255),
    IN email VARCHAR(255),
    IN password VARCHAR(255),
    IN date DATE,
    IN gender VARCHAR(50),
    IN organization VARCHAR(255),
    IN role VARCHAR(255)
)
BEGIN
    INSERT INTO userdata (firstName, lastName, fullName, username, email, pass, dateOfJoining, gender)
    VALUES (firstName, lastName, NULL, username, email, password, date, gender);

    INSERT INTO login (username, pass)
    VALUES (username, password);

    INSERT INTO organizations (username, company, role)
    VALUES (username, organization, role);
END $$

DELIMITER ;

/* TRIGGERS */
 delimiter $$
  create trigger updateFullName 
  before UPDATE on userdata for each row 
  begin
  set NEW.fullName = concat(NEW.firstName,' ',NEW.lastName);
  end $$
  delimiter ;
  
  delimiter $$
  create trigger insertFullName
  before INSERT on userdata for each row
  begin
  set NEW.fullName = concat(NEW.firstName,' ',NEW.lastName);
  end $$
  delimiter ;
  
drop procedure insertDataIntoTables;
  select * from login;
  select * from userdata;
  select * from task;
  select * from organizations;  
