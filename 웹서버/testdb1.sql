select * from member_tbl_11;



--1페이지 (5개씩)    (성기훈 ~ 김새벽)
--2페이지 (5개씩)    (최덕수 ~ 박해수)




--rownum 활용한 페이징 쿼리 작성하기
--1페이지 -> rownum 1~5 (between 1 and 5)
select m_id, m_pw, m_name from member_tbl_11;

--서브쿼리를 활용해서 rownum값이 있는 결과집합을 만든 후에 페이징 쿼리를 사용할 수 있다

select *
from
(select rownum num, m_id, m_pw, m_name from member_tbl_11);

--1
select *
from
(select rownum num, m_id, m_pw, m_name from member_tbl_11)
where num between 1 and 5;


--2
select *
from
(select rownum num, m_id, m_pw, m_name from member_tbl_11)
where num between 6 and 10;

select  count(*)  from  member_tbl_11;



select  *
from
(select  rownum num,  m_id, m_pw, m_name , m_tel, m_birthday, m_point , m_grade from member_tbl_11)
where num  between  1 and  5;



select * from member_tbl_11;


select * from acorntbl;

select * from acorntbl2;

update acorntbl2 set pw=1234 where id='test';
commit;



WEB-INF/ lib 폴더에  ojdbc8.jar  확인하시오


CREATE TABLE ACTOR (
    ACTOR_ID VARCHAR2(50) PRIMARY KEY,
    FIRST_NAME VARCHAR2(50),
    LAST_NAME VARCHAR2(50),
    GENDER CHAR(1)
);
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME,  GENDER) VALUES (1, '강', '동원',  'M');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME,  GENDER) VALUES (2, '손', '예진',  'F');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME,  GENDER) VALUES (3, '이', '병헌',  'M');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME,  GENDER) VALUES (4, '전', '도연',  'F');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME,  GENDER) VALUES (5, '변', '우석',  'M');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME,  GENDER) VALUES (6, '배', '수지',  'F');


COMMIT;

###  mysql
CREATE TABLE ACTOR (
    ACTOR_ID VARCHAR(50) PRIMARY KEY,
    FIRST_NAME VARCHAR(50),
    LAST_NAME VARCHAR(50),
    GENDER CHAR(1)
);

INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME, GENDER) VALUES ('1', '강', '동원', 'M');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME, GENDER) VALUES ('2', '손', '예진', 'F');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME, GENDER) VALUES ('3', '이', '병헌', 'M');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME, GENDER) VALUES ('4', '전', '도연', 'F');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME, GENDER) VALUES ('5', '변', '우석', 'M');
INSERT INTO ACTOR (ACTOR_ID, FIRST_NAME, LAST_NAME, GENDER) VALUES ('6', '배', '수지', 'F');


SELECT * FROM ACTOR;

commit;


create table ordersample(
   id varchar2(10) primary key,
   name varchar2(50)  
);

--시퀀스 만들기
create sequence  order_seq start with 1;


--시퀀스 값 가져오기
select order_seq.nextval from dual;


--등록시 자동으로 시퀀시 값을 가져온다음   값 추가하기
insert into   ordersample ( id, name ) values( order_seq.nextval, 'test주문');


select * from ordersample;


drop sequence order_seq;
