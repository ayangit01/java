import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your birth year: ");

        boolean ifInt = scan.hasNextInt();
        if (ifInt){
            int birthYear = scan.nextInt();
            int age = 2022-birthYear;
            scan.nextLine();
            if(age>=0 && age<=100){
                System.out.print("enter you name: ");
                String name = scan.nextLine();
                System.out.println(name+" you are "+age+" years old");
            }else {
                System.out.println(birthYear+" is Invalid year, please enter correct year");
                birthYear = scan.nextInt();
                age = 2022-birthYear;
                scan.nextLine();
                if(age>=0 && age<=100){
                    System.out.print("enter you name: ");
                    String name = scan.nextLine();
                    System.out.println(name+" you are "+age+" years old");
                }else {
                    System.out.println("program exit becasue your entered year is not valid!!");
                }
            }
        }else {
            scan.nextLine();
            System.out.println("please enter only number");
            boolean iffInt = scan.hasNextInt();
            if (iffInt) {
                int birthYear = scan.nextInt();
                int age = 2022 - birthYear;
                scan.nextLine();
                if (age >= 0 && age <= 100) {
                    System.out.print("enter you name: ");
                    String name = scan.nextLine();
                    System.out.println(name + " you are " + age + " years old");
                } else {
                    System.out.println(birthYear + " is Invalid year, please enter correct year");
                    birthYear = scan.nextInt();
                    age = 2022 - birthYear;
                    scan.nextLine();
                    if (age >= 0 && age <= 100) {
                        System.out.print("enter you name: ");
                        String name = scan.nextLine();
                        System.out.println(name + " you are " + age + " years old");
                    } else {
                        System.out.println("program exit becasue your entered year is not valid!!");
                    }
                }
            }
        }
    }
}
