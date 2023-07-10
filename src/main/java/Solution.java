import java.util.Scanner;

//public class Test_javaRush {
//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        int age = scanner.nextInt();
//        System.out.println("Через: " + age + " лет " + name + " захватит мир. Му-ха-ха!");
//
//
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Зарплата через 5 лет
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        System.out.println(name1+ "+ " +name2+ " + " +name3+ " = Чистая любовь, да-да!");

    }
}