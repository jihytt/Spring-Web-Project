# Spring-Web-Project

## 0. 소개

- **주제 선정 이유** : 환경 문제는 꾸준하게 대두되어 왔으나, 실생활에서 실천하는 사람들이 현저하게 적고 어려워 하는 사람이 많다는 통계를 접하였습니다. <br/>   
**Save earth Save us** 는 일상 생활에서 사용자가 실천할 수 있는 환경 보호 관련 정보를 제공하고, 펀딩 진행 및 회원 간 중고 거래, 커뮤니티 등 사용자의 환경 보호 자발적 참여를 촉진합니다.

<br/>

- **프로젝트명** : Save earth Save us
- **개발 기간** : 2021.06.28 ~ 2021.08.01
- **인원** : 4명
- 📒 **프로젝트 기획서** : https://transparent-nebula-b31.notion.site/6c38c2ad5625449cb5387b171807a315

- **담당 역할** :
  - 프로젝트 개발 환경 구축
  - ERD 모델링
  - 메인 페이지 미세먼지 농도 크롤링
  - 로그인 유지 기능
  - SNS 로그인(KAKAO,NAVER)
  - 쪽지 기능
  - 챗봇
  - 펀딩 게시판, Q&A게시판, 관리자 페이지
<br/>

<br/>

## 1. 구현 기능
 
  &emsp;**회원가입** (SMTP, 도로명주소 API)   
  &emsp;**로그인** (Spring-Security, Google reCHAPCHA, 로그인 유지 기능)   
  &emsp;**SNS로그인** (KAKAO, NAVER)   
  &emsp;**지도** (Kakao Map)   
  &emsp;**결제** (아임포트-카카오페이 API)   
  &emsp;**현재 미세먼지 농도 정보 제공** (Jsoup)   
  &emsp;**분리수거 안내** (Teachable Machine을 활용한 이미지 인식)   
  &emsp;**관련 기사 출력 및 검색** (News API)   
  &emsp;**캘린더 : 사이트 등록 일정 확인** (moment.js)   
  &emsp;**실시간 채팅 기능/채팅 기록 유지** (Spring-WebSocket)      
  &emsp;**쪽지, 쪽지 알림 기능** (Spring-WebSocket)   
  &emsp;**챗봇, 다국어 번역 기능** (dialogflow, papago API)     
  &emsp;**게시판 기능** (글작성 : summer note, 페이징, 검색, 이미지 업로드, 조회수 확인, 댓글, 비밀글)   
<br/>

## 2. 개발 환경
  - OS : Window 10
  - IDE : Eclipse, VSCODE
  - Front-end : HTML, CSS, JSP, JavaScript, JQuery, Ajax, BootStrap
  - Back-end :
     Language - JAVA
     Server - Apache Tomcat 9.0
     DataBase - ORACLE 11g with SqlDeveloper
     Framework - Spring Framework-5.3.7, Mybatis-3.5.7, Maven-3.6.3 
  - 버전관리 : Git, Github

<br/>

## 3. DB ERD
&emsp; ![DB](https://user-images.githubusercontent.com/75427390/127845586-5b964a91-9b4d-4af2-b81e-0d26a2d97b8b.png)