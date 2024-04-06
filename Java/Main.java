package Java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Phavour\\Desktop\\File1.txt");
        
        ArrayList<String> lines = new ArrayList<>();
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
            lines.add(line);

        }
        System.out.println(lines);
        System.out.println(lines.size());
        lines.remove(3);
        lines.remove(5);
        System.out.println(lines);

        lines.clear();
        System.out.println(lines);

        Set<String> A = new HashSet<>();
        Set<String> B = new HashSet<>();
        Set<String> C = new HashSet<>();
        
        A.add("30");
        A.add("-20");
        A.add("46");
        A.add("Joyce");
        A.add("15");
        A.add("Abena");
        A.add("35");
        System.out.println(A);

        B.add("25");
        B.add("19");
        B.add("46");
        B.add("30");
        B.add("35");
        B.add("-20");
        System.out.println(B);

        C.add("30");
        C.add("45");
        C.add("35");
        C.add("-20");
        C.add("10");
        C.add("12");
        C.add("15");
        System.out.println(C);

        A.remove("Abena");
        A.remove("Joyce");
        System.out.println(A);

        A.addAll(B);
        System.out.println(A);

        B.retainAll(C);
        System.out.println(B);

        Set<String> D = new HashSet<>();

        C.removeAll(A);
        System.out.println(C);
        D.addAll(C);

        B.removeAll(D);
        System.out.println(B);
        
    }
}
