package ex22;

class 사과 {
    String name = "사과";
}

class 딸기 {
    String name = "딸기";

}

class 오렌지 {
    String name = "오렌지";
}

class ResponseBox<T> {
    T data;

    public ResponseBox(T data) {
        this.data = data;
    }
}

public class GenericEx01 {
    public static void main(String[] args) {
        ResponseBox<사과> rb1 = new ResponseBox<사과>(new 사과());
        // rb 응답!!
        System.out.println(rb1.data.name);
        ResponseBox<딸기> rb2 = new ResponseBox<딸기>(new 딸기());
        System.out.println(rb2.data.name);
        // rb2응답!!
        ResponseBox<오렌지> rb3 = new ResponseBox<오렌지>(new 오렌지());
        System.out.println(rb3.data.name);
    }
}
