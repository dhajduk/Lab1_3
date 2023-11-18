import java.util.Scanner;

class Hello
{
    static String name;
    static String age;
    static String hight;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = scanner.nextLine();
        System.out.print("What is your age? ");
        age = scanner.nextLine();
        System.out.print("What is your hight? ");
        hight = scanner.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Hight : " + hight);
        scanner.close();
    }
}