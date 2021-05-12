# SpringBoot AOP, Filter, Interceptor

&nbsp;

&nbsp;

&nbsp;

**작성자 : 김보현**

**작성일자 : 2021-05-12**

&nbsp;

&nbsp;

&nbsp;

### AOP, Filter, Interceptor 의 흐름

- Filter -> Interceptor -> AOP -> Interceptor -> Filter
- Filter 와 Interceptor 는 Servlet 단위에서 이루어진다.

&nbsp;

&nbsp;

### AOP

- 관점 지향 프로그래밍
- 로직을 핵심적인 관점과 부가적인 관점으로 나누어 보고 관점을 기준으로 모듈화하는 프로그래밍 
- OOP 를 보완하기 위해 나온 개념
  - 객체 지향 프로그래밍
  - 애플리케이션을 구성하는 요소들을 객체로 바라보고, 객체들을 유기적으로 연결하여 프로그래밍
  - 코드의 재사용성과 중복제거가 가장 큰 목적
  - 추상화, 캡슐화, 상속성, 다형성
- 메소드 전후의 지점에서 자유롭게 설정 가능
- 주로 비즈니스 로직에서 실행된다.

&nbsp;

&nbsp;

### Filter

- Dispatcher Servlet 영역에 들어가기 전 Controller 앞 범위에서 수행된다.
- 주로 인코딩 변환처리, XSS 방어 개발에 사용
- init(), doFilter(), destroy()

&nbsp;

&nbsp;

### Inspector

- DispatcherServlet 이 Controller 를 호출하기 전, 후에 끼어들기 때문에 스프링 컨텍스트 내붸서 Controller 에 관한 요청과 응답에 관여한다.
- 스프림의 모든 Bean 에 접근 가능
- preHandler(), postHandler(), afterCompletion()

&nbsp;

&nbsp;

&nbsp;

### 참고

https://velog.io/@sa833591/Spring-Filter-Interceptor-AOP-%EC%B0%A8%EC%9D%B4-yvmv4k96