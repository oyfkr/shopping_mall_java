package shopping_mall;

public abstract class Product {
    // 상품 이름과 가격
    String pname;
    int price;
    //상품 이름과 가격을 출력하는 기본 정보 출력 메서드
    public void printDetail(){
        System.out.print("상품명 : " + pname + " , ");
        System.out.print("가격 : " + price + " , ");
        printExtra();
    }
    //printExtra() 추상메서드로 위에 메서드에서 호출
    public abstract void printExtra();

}
