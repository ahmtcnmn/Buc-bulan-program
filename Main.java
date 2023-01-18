import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int ay, gun;
        out.print("Doğum ayınızı giriniz : ");
        ay = input.nextInt();
        out.print("Doğum gününüzü giriniz : ");
        gun = input.nextInt();

        if (ay == 1) {
            if ((31 > gun) && (gun > 22)) out.print("Burcunuz KOVA");
            else out.print("Burcunuz OĞLAK");
        }
        if (ay == 2) {
            if ((29 > gun) && (gun > 20)) out.print("Burcunuz BALIK");
            else out.print("Burcunuz KOVA");
        }
        if (ay == 3) {
            if ((31 > gun) && (gun > 21)) out.print("Burcunuz KOÇ");
            else out.print("Burcunuz BALIK");
        }
        if (ay == 4) {
            if ((30 > gun) && (gun > 20)) out.print("Burcunuz BOĞA");
            else out.print("Burcunuz KOÇ");
        }
        if (ay == 5) {
            if ((31 > gun) && (gun > 22)) out.print("Burcunuz İKİZLER");
            else out.print("Burcunuz BOĞA");
        }
        if (ay == 6) {
            if ((30 > gun) && (gun > 23)) out.print("Burcunuz YENGEÇ");
            else out.print("Burcunuz İKİZLER");
        }
        if (ay == 7) {
            if ((31 > gun) && (gun > 23)) out.print("Burcunuz ASLAN");
            else out.print("Burcunuz YENGEÇ");
        }
        if (ay == 8) {
            if ((30 > gun) && (gun > 22)) out.print("Burcunuz BAŞAK");
            else out.print("Burcunuz ASLAN");
        }
        if (ay == 9) {
            if ((31 > gun) && (gun > 23)) out.print("Burcunuz TERAZİ");
            else out.print("Burcunuz BAŞAK");
        }
        if (ay == 10) {
            if ((30 > gun) && (gun > 22)) out.print("Burcunuz AKREP");
            else out.print("Burcunuz TERAZİ");
        }
        if (ay == 11) {
            if ((31 > gun) && (gun > 22)) out.print("Burcunuz YAY");
            else out.print("Burcunuz AKREP");
        }
        if (ay == 12) {
            if ((30 > gun) && (gun > 21)) out.print("Burcunuz OĞLAK");
            else out.print("Burcunuz YAY");
        }



    }
}