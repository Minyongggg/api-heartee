# 1. 생성형 AI 기반 연애 상담 솔루션 heartee (Backend)

<!--
<p align="center"><img width="600" alt="logoImage4" src=""></p> -->

## 📄 About Project

[Github](https://github.com/Minyongggg/api-heartee)

### 개요

<strong>heartee는 생성형 AI기반 연애 상담 솔루션</strong>입니다. 유저가 제공한 이성과의 채팅 이미지 데이터를 기반으로 해당 상황을 이해하고 상황에 맞는 평가 및 조언을 제공하는 서비스입니다. 본 프로젝트는 LLM 기반의 생성형 AI가 사람들의 실제 대화 속 다양한 맥락을 얼마나 정확히 파악하여 대응할 수 있는지, 또한 이러한 <strong>AI 기반 솔루션이 시장에서 얼마나 유효한지</strong> 확인하기 위해 진행되었습니다.

### 기간

2023.07 ~ 2023.09

### 핵심 기능

#### 1) ChatGPT 기반 채팅 데이터 분석

heartee는 유저가 제공한 채팅 이미지를 파싱하고, LLM을 통해 텍스트 데이터를 분석합니다. 사전에 시스템 프롬프팅을 통해 이성 관계에서의 대화 맥락을 학습한 모델은 Input 데이터의 대화 상황을 분석하여 친밀도, 호기심, 갈등 관리 등의 측정 지표를 평가합니다.

<!-- <img width="369" alt="bb" src=""> -->

<br>

#### 2) 분석 결과 기반 상담 리포트 제공

heartee는 Input 데이터에 근거한 LLM의 분석 결과를 바탕으로 각종 지표를 시각화하고 적절한 상황 진단과 이에 맞는 조언을 더해 개별 리포트 형태로 제공합니다. 또한 추가적인 상담에 따른 지표 변화 추이와 상담기록 관리 등의 편의 기능을 제공합니다.

<!-- <img width="550" alt="bb" src=""> -->

<br>
<br>

## 🛠 Tech Stack

### Frontend

<p>
  <img src="https://img.shields.io/badge/Next.js-000000?style=for-the-badge&logo=next.js&logoColor=white">
  <img src="https://img.shields.io/badge/Recoil-007396?style=for-the-badge&logo=recoil&logoColor=white">
  <img src="https://img.shields.io/badge/Styled Components-C5599D?style=for-the-badge&logo=styledcomponents&logoColor=white">
</p>

### Backend

<p>

  <img src="https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white">
  <img src="https://img.shields.io/badge/jpa-222222?style=for-the-badge&logo=db&logoColor=white">
  <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=SpringBoot&logoColor=white">
  <img src="https://img.shields.io/badge/Querydsl-0F70BC?style=for-the-badge&logo=querydsl&logoColor=white">
</p>

### DB

<p>
  <img src="https://img.shields.io/badge/Postgresql-26507A?style=for-the-badge&logo=Postgresql&logoColor=white">
</p>

### Infra

<p>
  <img src="https://img.shields.io/badge/Linux-202020?style=for-the-badge&logo=Linux&logoColor=white">
  <img src="https://img.shields.io/badge/AWS-232F3E?style=for-the-badge&logo=Amazon AWS&logoColor=white">
  <img src="https://img.shields.io/badge/Git-E03826?style=for-the-badge&logo=git&logoColor=white">
</p>

<br>

## 📊 ER Diagram

<img width="600" src="">

<br>
<br>

## 👩‍👩‍👧‍👦 Members

### [Backend 이민용](https://github.com/Minyongggg)

✅ DB & HTTP API 설계 및 개발
<br>
✅ 인증 모듈 개발
<br>

### [Backend 김동민](https://github.com/toto9602)

✅ AWS 기반 운영 인프라 설계
<br>
✅ 이미지 데이터 파싱 모듈 개발
<br>

### [Frontend 양효령](https://github.com/onCloud33)

✅ User Flow 설계 및 UI/UX 기획
<br>
✅ Next.js 기반 클라이언트 어플리케이션 개발
<br>

### [Prompt 김지성](https://github.com/Kim-Jiseong)

✅ 시스템 프롬프트 개발
<br>
✅ 상담 모델 Fine-Tuning
