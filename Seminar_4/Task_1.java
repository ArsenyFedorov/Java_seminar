package Seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work){
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            String numString = arr[1];
            int num = Integer.parseInt(numString);
            if (num > list.size() || num < 0){
                System.out.println("Нельзя");
                continue;
            }
            switch (text){
                case "print":
                    if (num == list.size()){
                        System.out.println("Нельзя");
                        continue;
                    }
                    System.out.println(list.remove(num));
                    break;
                case "end":
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }
}
