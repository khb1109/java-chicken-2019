# java-chicken-2019

# 치킨집 사장님이 사용하는 간단한 POS 프로그램 구현


# 기능목록
- 유저는 처음에 주문등록, 결제하기, 프로그램 종료를 할 수 있다.
    - 주문등록을 하게 되면 테이블을 선택한다
        - 예외 : 1~8의 테이블 중 선택해야한다.
    - 유저는 메뉴를 선택한다.
        - 예외 : 메뉴에 있는 번호를 골라야한다
    - 유저는 메뉴의 수량을 입력한다.
        - 예외 : 해당 메뉴가 99개가 넘으면 안된다.
    
    - 결제하기를 하게 되면 테이블을 선택한다
        - 필요 : 주문한 테이블은 표시를 남긴다.
        - 예외 : 1건이라도 주문이 있는 테이블을 선택해야한다.
    - 주문내역을 확인한다.
    - 결제 방식을 고른다.
        - 예외 : 현금, 카드 이외에는 입력을 받지않는다.
    - 최종 결제 금액을 확인한다.
        - 필요 : 치킨 구매에 따른 할인 기능과 현금 구매에따른 할인 기능이 필요하다.
      
    

# 프로세스
- 기능선택
    - 주문 등록 시
        - 테이블 목록 출력 및 선택
        - 메뉴 출력 및 선택
        - 메뉴 수량 선택
    - 결제하기
        - 테이블 목록 출력 및 선택
        - 주문내역 출력
        - 결제방법 선택
        - 최종 결제 금액 출력
    - 프로그램 종료       