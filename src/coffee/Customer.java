package coffee;

public class Customer {
    public void order(String menuName, Menu menu, Barista barista){
        MenuItem menuItem = menu.choose(menuName);
        if(menuItem == null){
            System.out.println("주문하세요.");
        }
        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println("주문을 완료하셨습니다.");
        System.out.println("커피의 이름은 : "+coffee.getName());
        System.out.println("커피 가격은 : "+coffee.getPrice());
    }
    }
    
