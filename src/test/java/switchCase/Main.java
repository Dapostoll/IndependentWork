package switchCase;

public class Main {
    public static void main(String[] args) {
        int a = 23;
        switch (a) {
            case 12:
                System.out.println("Это не может быть правдой");
                break;
            case 22:
                System.out.println("Интересно, но ложь");
                break;
            case 23:
                System.out.println(a + "Правда");
                while (a < 50) {


//                for (a = 23; a < 50; a++)
                    System.out.println(a);
                a++;
                }
                break;
            default:
                System.out.println("default = else");
        }
        System.out.println("И тперь а = " + a);
    }

}
