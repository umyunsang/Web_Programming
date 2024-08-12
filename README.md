아래는 요청하신 내용을 기존 README 파일에 추가한 예시입니다. 이 파일을 GitHub 리포지토리의 `README.md` 파일로 사용하면 됩니다.

---

# 🖥️ 웹 프로그래밍 수업 노트

이 리포지토리는 웹 프로그래밍 수업에서 배운 내용을 정리한 것입니다. 각 수업 내용은 다음과 같습니다:

## 📋 목차

1. [HTML 기초](https://github.com/umyunsang/Web_Programming/tree/main/%EC%9B%B9%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/1.%20HTML%20%EA%B8%B0%EC%B4%88)
2. [Spring Boot 개발 환경 세팅](https://github.com/umyunsang/Web_Programming/tree/main/%EC%9B%B9%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/2.%20Spring%20Boot%20%EA%B0%9C%EB%B0%9C%20%ED%99%98%EA%B2%BD%20%EC%84%B8%ED%8C%85)
3. [Spring Boot 기초](https://github.com/umyunsang/Web_Programming/tree/main/%EC%9B%B9%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/3.%20Spring%20Boot%20%EA%B8%B0%EC%B4%88)
4. [쿠키와 세션](https://github.com/umyunsang/Web_Programming/tree/main/%EC%9B%B9%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/4.%20%EC%BF%A0%ED%82%A4%EC%99%80%20%EC%84%B8%EC%85%98)
5. [데이터베이스](https://github.com/umyunsang/Web_Programming/tree/main/%EC%9B%B9%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/5.%20%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4)
6. [HTML 기초2](https://github.com/umyunsang/Web_Programming/tree/main/%EC%9B%B9%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/6.%20HTML%20%EA%B8%B0%EC%B4%882)
7. [웹 시스템 제작](https://github.com/umyunsang/Web_Programming/tree/main/%EC%9B%B9%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/7.%20%EC%9B%B9%20%EC%8B%9C%EC%8A%A4%ED%85%9C%20%EC%A0%9C%EC%9E%91)

---

## 📚 HTML 기초

HTML의 기본 구조와 태그 사용법에 대해 배웠습니다. 이 내용은 웹 페이지를 만드는 기본적인 기술로, HTML의 기본 요소와 속성들을 다룹니다.

## 🚀 Spring Boot 개발 환경 세팅

Spring Boot를 사용하여 개발 환경을 설정하는 방법에 대해 배웠습니다. Java 기반의 웹 애플리케이션을 쉽게 만들고 배포할 수 있도록 도와주는 Spring Boot의 설정 및 초기 설정 과정을 포함합니다.

## 🛠️ Spring Boot 기초

Spring Boot를 사용하여 간단한 웹 애플리케이션을 만드는 방법에 대해 배웠습니다. 여기에는 컨트롤러, 서비스, 리포지토리 등의 개념과 이를 구현하는 방법이 포함됩니다.

## 🍪 쿠키와 세션

웹 애플리케이션에서 상태를 관리하는 방법에 대해 배웠습니다. 쿠키와 세션의 차이점, 사용법, 그리고 보안 고려사항에 대해 다룹니다.

## 🗄️ 데이터베이스

데이터베이스의 기본 개념과 SQL 쿼리에 대해 배웠습니다. 또한 Spring Boot와 데이터베이스를 연동하여 데이터를 저장하고 조회하는 방법을 학습했습니다.

## 📑 HTML 기초2

HTML 기초에 이어 좀 더 심화된 HTML 태그와 속성들에 대해 배웠습니다. 폼, 테이블, 멀티미디어 요소 등을 다룹니다.

---

이 리포지토리는 웹 프로그래밍 수업 내용을 복습하고 정리하는 데에 도움을 주기 위해 만들어졌습니다. 각 주제에 대한 자세한 내용은 해당 폴더의 문서를 참고해 주세요.

---

# p1 웹 프로그래밍 프로젝트

이 프로젝트는 웹 프로그래밍 수업에서 실습한 내용을 포함하고 있습니다. 프로젝트는 Spring Framework를 사용하여 작성되었으며, 다양한 HTML 파일과 Java Spring Controller로 구성되어 있습니다.

## 프로젝트 구조

### 1. `gradle/wrapper/`
- Gradle 빌드 시스템 관련 파일이 포함된 디렉토리입니다.

### 2. `src/main/java/com/web/p1/`
- **`MyController.java`**: 기본 컨트롤러로, 여러 웹 요청을 처리하는 메서드들이 포함되어 있습니다.
- **`P1Application.java`**: 이 프로젝트의 메인 애플리케이션 파일로, Spring Boot 애플리케이션을 실행하는 엔트리 포인트입니다.
- **`YourController.java`**: 추가적인 웹 요청을 처리하는 컨트롤러입니다.

### 3. `src/main/resources/templates/`
이 디렉토리에는 프로젝트에서 사용된 HTML 템플릿 파일들이 포함되어 있습니다. 각 HTML 파일의 링크를 클릭하면 파일 내용을 확인할 수 있습니다.

- [bread.html](./src/main/resources/templates/bread.html): `Bread` 페이지 템플릿.
- [breadAnswer.html](./src/main/resources/templates/breadAnswer.html): `BreadAnswer` 페이지 템플릿.
- [coffee.html](./src/main/resources/templates/coffee.html): `Coffee` 페이지 템플릿.
- [ex01.html](./src/main/resources/templates/ex01.html): 첫 번째 예제 페이지 템플릿.
- [ex01Answer.html](./src/main/resources/templates/ex01Answer.html): 첫 번째 예제의 답안 페이지 템플릿.
- [ex02.html](./src/main/resources/templates/ex02.html): 두 번째 예제 페이지 템플릿.
- [ex02Answer.html](./src/main/resources/templates/ex02Answer.html): 두 번째 예제의 답안 페이지 템플릿.
- [ex03.html](./src/main/resources/templates/ex03.html): 세 번째 예제 페이지 템플릿.
- [ex03Answer.html](./src/main/resources/templates/ex03Answer.html): 세 번째 예제의 답안 페이지 템플릿.
- [ex04.html](./src/main/resources/templates/ex04.html): 네 번째 예제 페이지 템플릿.
- [ex05.html](./src/main/resources/templates/ex05.html): 다섯 번째 예제 페이지 템플릿.
- [home.html](./src/main/resources/templates/home.html): 메인 홈 페이지 템플릿.
- [login.html](./src/main/resources/templates/login.html): 로그인 페이지 템플릿.
- [logout.html](./src/main/resources/templates/logout.html): 로그아웃 페이지 템플릿.
- [menu.html](./src/main/resources/templates/menu.html): 메뉴 페이지 템플릿.
- [popup.html](./src/main/resources/templates/popup.html): 팝업 페이지 템플릿.
- [popuptest.html](./src/main/resources/templates/popuptest.html): 팝업 테스트 페이지 템플릿.
- [q06.html](./src/main/resources/templates/q06.html): 6번 문제 페이지 템플릿.
- [q06a.html](./src/main/resources/templates/q06a.html): 6번 문제(a)의 페이지 템플릿.
- [q06aa.html](./src/main/resources/templates/q06aa.html): 6번 문제(aa)의 페이지 템플릿.
- [q06b.html](./src/main/resources/templates/q06b.html): 6번 문제(b)의 페이지 템플릿.
- [q06bb.html](./src/main/resources/templates/q06bb.html): 6번 문제(bb)의 페이지 템플릿.
- [wise.html](./src/main/resources/templates/wise.html): `Wise` 페이지 템플릿.
- [wiseAnswer.html](./src/main/resources/templates/wiseAnswer.html): `WiseAnswer` 페이지 템플릿.

---

각 HTML 파일은 `/src/main/resources/templates/` 디렉토리에 위치하며, Spring Boot 애플리케이션에서 동적으로 렌더링됩니다. GitHub에서 이 README 파일을 통해 각 HTML 파일을 쉽게 확인할 수 있습니다.

---

<div align="center">
    <

img src="https://img.shields.io/badge/HTML-E34F26?style=for-the-badge&logo=html5&logoColor=white">
    <img src="https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white">
    <img src="https://img.shields.io/badge/Database-003B57?style=for-the-badge&logo=database&logoColor=white">
</div>
