## 프로젝트 타이틀 : Eody

> 만남 장소 추천 웹 애플리케이션


### 프로젝트 주제 및 내용

* **만남 장소 추천 플랫폼 서비스**

* 사람간 만남 약속에 앞서 참석 인원들의 거리, 목적 등 여러 요인을 고려하여 만남 장소를 선정하기 어려운 문제를 발견했습니다. 이에 **장소 탐색을 원하는 고객, 장소를 운영하는 사업자를 중개하는 웹 애플리케이션**을 개발하고자 합니다.

* **장소를 탐색하는 고객**에게는 **3가지 시나리오\***에 해당하는 지역 및 장소 추천 기능, 장소 상세 정보와 리뷰, 평점, 예약 기능을 제공합니다.

- 참석자 거리 우선 탐색, 내 위치 주변 탐색, 구체적 희망 지역 탐색

*  **장소를 운영하는 사업자**에게는 장소 관리/광고/통계 기능, 사업관리 지식 콘텐츠 열람, 예약/리뷰 관리 기능을 제공하고, 플랫폼 전체 장소 데이터 입출력을 연동합니다.


### 팀원간 역할 분담 및 일정

![일정](https://user-images.githubusercontent.com/24764210/93493335-c1a40400-f946-11ea-99c7-0dc1f91a77d1.png)


### 시스템 구성도

![시스템구성도](https://user-images.githubusercontent.com/24764210/93493549-fb750a80-f946-11ea-8117-9b2b0628021a.png)


### 사용 기술

![사용기술](https://user-images.githubusercontent.com/24764210/93493562-fdd76480-f946-11ea-9be0-e244bc6fdc9e.png)


### ERD

![ERD](https://user-images.githubusercontent.com/24764210/93493620-121b6180-f947-11ea-91d4-e67a14dc2948.png)


### 핵심 기능

#### 1. 거리우선탐색 구현 방안

> (`장소탐색 고객`) 참석자 거리 우선 탐색 알고리즘

![거리탐색](https://user-images.githubusercontent.com/24764210/93493568-ff089180-f946-11ea-9f43-4087d6b23d9a.png)

##### 1) 참석자들의 위도와 경도 입력

##### 2) 참석자 좌표와 Rawdata 두 점의 거리 계산 반복

##### 3) Rawdata별 참석자 좌표들과의 평균 거리 계산

##### 4) 참석자들의 출발지를 제외한 상위 3개 지역 반환

![1-r](https://user-images.githubusercontent.com/24764210/93493662-20697d80-f947-11ea-944e-e0b4b6cad1ec.png)

![1](https://user-images.githubusercontent.com/24764210/93493659-1f385080-f947-11ea-8d8b-4da563442adc.png)

#### 2. Searcher/Myroom

> JSTL의 forEach, choose 구문을 활용
> 예약 데이터의 상태(Shop 운영자의 승인)에 따라 동적으로 예약 데이터 Display.

![2-r](https://user-images.githubusercontent.com/24764210/93493669-22334100-f947-11ea-8153-f91a2cd4739f.png)

![2](https://user-images.githubusercontent.com/24764210/93493667-21021400-f947-11ea-8523-bf70419a959d.png)

#### 3. Searcher/Review 작성

> multipartFile 을 활용한 리뷰 작성 내 여러 이미지 파일 업로드 처리\

![3-1](https://user-images.githubusercontent.com/24764210/93493681-23fd0480-f947-11ea-9f6e-6ab60b88d173.png)

#### 4. Searcher/Myroom Review List

> Ajax를 이용한 JSON 비동기 데이터 송수신

![3-2](https://user-images.githubusercontent.com/24764210/93493686-25c6c800-f947-11ea-9989-02925139d030.png)

#### 5. 기상청 외부 API

> 기상청 API로 날씨데이터를 주기적으로 요청하여 화면 Display

![5](https://user-images.githubusercontent.com/24764210/93493700-295a4f00-f947-11ea-8b9d-2b22b8bcbcc2.png)

#### 6. 카카오지도 외부 API

> Searcher에 의해 선택된 지역(지하철역)의 지도 Display & 마커 표시

![6](https://user-images.githubusercontent.com/24764210/93493708-2b241280-f947-11ea-811d-f2c91ad4bcd8.png)
