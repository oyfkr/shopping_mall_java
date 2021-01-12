package shopping_mall;

public interface IShop {
    //쇼핑몰 이름 생성
    public abstract  void setTitle(String title);

    // 쇼핑모을 이용할 수 있는 예제 사용자들 생성
    public abstract  void genUser();

    //쇼핑몰의 예제 상품들 생성
    public abstract  void genProduct();

    // 쇼핑몰 프로그램을 실행하는 시작 메서드
    public abstract void start();
}
