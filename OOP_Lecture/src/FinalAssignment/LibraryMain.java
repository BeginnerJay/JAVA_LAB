package FinalAssignment;

public class LibraryMain {
    static java.util.Scanner scanner = null;

    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        int user_number;

        System.out.print("User --> 1, Admin --> 2 : ");
        //user_number=Integer.parseInt(in.nextLine());
        user_number=scanner.nextInt();

        switch(user_number) {
            case 1 :
                while (user_menu()) {
                    ;
                }
                break;
            case 2 :
                while (admin_menu()) {
                    ;
                }
                break;

            default :
                System.out.println("Wrong Number!!");
                System.out.println("Try again!!!!");
        }


        scanner.close();
    }

    public static boolean user_menu() {
        boolean ret=true;
        int menu_num;
        scanner=new java.util.Scanner(System.in);
        System.out.println("***********************");
        System.out.println("  1. 대출  ");
        System.out.println("  2. 반납  ");
        System.out.println("  3. 검색  ");
        System.out.println("  4. 종료  ");
        System.out.println("***********************");
        System.out.print("input menu number : ");
        //menu_num=Integer.parseInt(in.nextLine());
        menu_num=scanner.nextInt();

        switch (menu_num) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4 :
                ret=false;
                break;
            default:
                System.out.println("The menu number is Wrong!!!");

        }

        return ret;
    }

    public static boolean admin_menu() {
        return true;
    }
}
