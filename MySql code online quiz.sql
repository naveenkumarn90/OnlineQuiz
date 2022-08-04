create database quiz;
use quiz;
create table user(emailid varchar(255) primary key , password varchar(255), category varchar(255));

create table scorecard(id bigint primary key auto_increment, paperid bigint, emailid varchar(255),
 marks bigint ,  testdate varchar(255), 
 foreign key (paperid) references question_paper(paperid), foreign key (emailid) references user(emailid));
create table question_paper(paperid bigint primary key auto_increment, category varchar(50), subcategory varchar(50));
create table questions(paperid bigint , question_no bigint, question varchar(1000) ,
 option_a varchar(1000), option_b varchar(1000), option_c varchar(1000) , option_d varchar(1000), 
 correct_option varchar(100) , foreign key (paperid) references question_paper(paperid), primary key(paperid, question_no));
