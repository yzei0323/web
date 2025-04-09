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




