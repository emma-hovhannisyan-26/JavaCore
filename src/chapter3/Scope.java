package chapter3;

public class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;
        if (x == 10) {
            int y = 20;
            // обе переменные х и у доступны в
            //этой области действия
            System.out.println("x и у: " + x + " " + y);
            x = y * 2;
            // y = 100; // ОШИБКА! пременная у недоступна
            //в этой области действия, тогда как
            //переменная х доступна и здесь
            System.out.println("x равно " + x);
        }

    }
}
