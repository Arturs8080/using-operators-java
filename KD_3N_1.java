package kd_3n_1;

import java.util.Scanner;

public class KD_3N_1 {
    public static void main(String[] args) {

        System.out.println("\t\tKontroldarbs par operatoru lietosanu");
        System.out.println("---------------------------------------------------------");
        Scanner input = new Scanner(System.in);

        System.out.println("Ievadiet veselu skaitli a: ");
        int a = input.nextInt();

        System.out.println("Ivadiet veselu skaitli b: ");
        int b = input.nextInt();

        float rezLielakais = (a > b) ? a : b;
        System.out.println("Lielakais no skaitliem " + a + " un " + b + " ir: " + rezLielakais);

        System.out.println("Skaitlu " + a + " un " + b + " starpiba kas pieskirta mainigajam a, ir: " + (a -= b));

        b--;
        System.out.println("Skaitlis b samazinats par 1: " + b);

        boolean rezLielaksvaiVienads = (a >= 1000);
        System.out.println(
                "Skaitlis " + a + " ir lielaks vai vienads ar 1000 (true - ja, false = ne)): " + rezLielaksvaiVienads);

        System.out.println("Ivadiet realu skaitli c: ");
        int c = input.nextInt();

        boolean rezVai = (c < 1) || (c > 99);
        System.out.println(
                "Ievaditais skaitlis ir mazaks par 0 vai lielaks par 100 (true - ja, false = ne): " + rezVai);
    }
}
