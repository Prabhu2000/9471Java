select FIRST_NAME WORKER_NAME from worker; 															-- q1
select upper(FIRST_NAME) UPPER_CASE from worker;													-- q2
select distinct DEPARTMENT from worker;																-- q3
select left(FIRST_NAME, 3) "Pehle 3 Letters" from worker;											-- q4
select instr(BINARY FIRST_NAME,'a') from worker where FIRST_NAME = 'Amitabh';						-- q5
select rtrim(FIRST_NAME) FIRST_NAME from worker;													-- q6
select ltrim(DEPARTMENT) DEPARTMENT from worker;													-- q7
select distinct length(DEPARTMENT) from worker;														-- q8
select replace(FIRST_NAME, 'a', 'A') FIRST_NAME from worker;										-- q9
select concat(FIRST_NAME, " ", LAST_NAME) COMPLETE_NAME from worker;								-- q10
select * from worker order by FIRST_NAME;															-- q11
select * from worker order by FIRST_NAME, DEPARTMENT desc;											-- q12
select * from worker where FIRST_NAME in ('Vipul', 'Satish');										-- q13
select * from worker where FIRST_NAME not in ('Vipul', 'Satish');									-- q14
select * from worker where DEPARTMENT like 'Admin%';												-- q15
select * from worker where FIRST_NAME like '%a%';													-- q16
select * from worker where FIRST_NAME like '%a';													-- q17
select * from worker where FIRST_NAME like '%_____h';												-- q18
select * from worker where SALARY between 100000 and 500000;										-- q19
select * from worker where year(JOINING_DATE) = 2014 and month(JOINING_DATE) = 2;
select * from worker;
