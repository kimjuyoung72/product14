drop user c##product;
--계정생성
CREATE USER c##test14 IDENTIFIED BY test14
    DEFAULT TABLESPACE users
    TEMPORARY TABLESPACE temp
    PROFILE DEFAULT;
--권한부여
GRANT CONNECT, RESOURCE TO c##test14;
GRANT CREATE VIEW, CREATE SYNONYM TO c##test14;
GRANT UNLIMITED TABLESPACE TO c##test14;
--락 풀기
ALTER USER c##test14 ACCOUNT UNLOCK;