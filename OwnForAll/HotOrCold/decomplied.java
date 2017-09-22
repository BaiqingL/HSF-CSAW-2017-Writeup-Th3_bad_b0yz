//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

public class HotOrCold {
    private static String flag_format = "flag{%s}\n";
    private static String PASSCODE = "Java coffee";

    public HotOrCold() {
    }

    public static void main(String[] var0) {
        System.out.print("Let's play hot or cold! What is the passcode?\n>> ");
        Scanner var1 = new Scanner(System.in);
        String var2 = var1.nextLine();
        if (var2.equals(PASSCODE)) {
            char[] var3 = new char[32];
            translate_input(var2, var3);
            String var4 = new String(var3);
            System.out.println(String.format("%n%s IS \"hot\"!! Haha, get it? Anyway, here's the flag:", var2));
            System.out.println(String.format(flag_format, var4));
        } else {
            System.out.println("Too cold!");
        }

    }

    private static void translate_input(String var0, char[] var1) {
        var1[29] = (char)(var0.charAt(6) - 63);
        var1[17] = (char)(var0.charAt(2) - 23);
        var1[26] = (char)(var0.charAt(9) + 3);
        var1[2] = (char)(var0.charAt(10) - 6);
        var1[19] = (char)(var0.charAt(1) + 7);
        var1[8] = (char)(var0.charAt(8) + 14);
        var1[7] = (char)(var0.charAt(1) + 24);
        var1[16] = (char)(var0.charAt(0) + 36);
        var1[1] = (char)(var0.charAt(8) + 14);
        var1[11] = (char)(var0.charAt(4) + 16);
        var1[12] = (char)(var0.charAt(7) + 6);
        var1[9] = (char)(var0.charAt(8) - 51);
        var1[14] = (char)(var0.charAt(9) - 6);
        var1[20] = (char)(var0.charAt(1) - 46);
        var1[18] = (char)(var0.charAt(5) + 17);
        var1[3] = (char)(var0.charAt(9) + 4);
        var1[10] = (char)(var0.charAt(10) - 2);
        var1[27] = (char)(var0.charAt(4) + 63);
        var1[30] = (char)(var0.charAt(6) - 3);
        var1[24] = (char)(var0.charAt(0) + 43);
        var1[22] = (char)(var0.charAt(4) + 83);
        var1[15] = (char)(var0.charAt(7) + 3);
        var1[6] = (char)(var0.charAt(2) - 20);
        var1[31] = (char)(var0.charAt(6) - 60);
        var1[5] = (char)(var0.charAt(3) - 2);
        var1[21] = (char)(var0.charAt(6) - 16);
        var1[0] = (char)(var0.charAt(10) + 4);
        var1[28] = (char)(var0.charAt(5) + 13);
        var1[23] = (char)(var0.charAt(9) - 53);
        var1[25] = (char)(var0.charAt(7) + 14);
        var1[4] = (char)(var0.charAt(2) - 3);
        var1[13] = (char)(var0.charAt(8) - 2);
    }
}
