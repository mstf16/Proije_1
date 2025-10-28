import java.util.Scanner;

public class ReverseRecursive {

    public static void run(Scanner scanner) {
        boolean running = true;
        while (running) {
            clearScreen();
            title("Reverse Letters Only (Recursive)");

            System.out.println();
            System.out.println("1) Enter text and reverse only letters");
            System.out.println("2) Run quick samples");
            System.out.println("3) Manual test mode");
            System.out.println("X) Exit");
            System.out.print("\nChoice: ");

            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1" -> {
                    clearScreen();
                    title("Enter Text");
                    System.out.print("\nText: ");
                    String in = scanner.nextLine();
                    String out = reverseLettersOnly(in);
                    System.out.println("\nResult: " + out);
                    pause(scanner);
                }
                case "2" -> {
                    clearScreen();
                    title("Quick Samples");
                    runQuickSamples();
                    pause(scanner);
                }
                case "3" -> {
                    clearScreen();
                    title("Manual Test Mode");
                    manualTest(scanner);
                }
                case "X" -> running = false;
                default -> {
                    System.out.println("\nInvalid choice");
                    pause(scanner);
                }
            }
        }
    }

    /** Public API: only letters are reversed; digits/punct stay in place. */
    public static String reverseLettersOnly(String input) {
        if (input == null || input.length() < 2) return input;
        char[] a = input.toCharArray();
        reverseRecursive(a, 0, a.length - 1);
        return new String(a);
    }

    /** Core recursive routine. */
    private static void reverseRecursive(char[] s, int left, int right) {
        if (left >= right) return;

        if (!Character.isLetter(s[left])) {
            reverseRecursive(s, left + 1, right);
            return;
        }
        if (!Character.isLetter(s[right])) {
            reverseRecursive(s, left, right - 1);
            return;
        }
        char t = s[left];
        s[left] = s[right];
        s[right] = t;
        reverseRecursive(s, left + 1, right - 1);
    }

    /* ===== UI helpers & samples ===== */

    private static void manualTest(Scanner scanner) {
        boolean again = true;
        while (again) {
            System.out.println();
            System.out.println("1) Single line");
            System.out.println("2) Multiple lines");
            System.out.println("3) Back");
            System.out.print("\nChoice: ");
            String c = scanner.nextLine().trim();
            if ("1".equals(c)) {
                System.out.print("\nText: ");
                String s = scanner.nextLine();
                String r = reverseLettersOnly(s);
                System.out.println("\nOutput: " + r);
                pause(scanner);
            } else if ("2".equals(c)) {
                System.out.println("\nHow many lines?");
                System.out.print("N: ");
                String nTxt = scanner.nextLine().trim();
                int n = parseIntSafe(nTxt, 1);
                for (int i = 1; i <= n; i++) {
                    System.out.print("[" + i + "] Text: ");
                    String s = scanner.nextLine();
                    String r = reverseLettersOnly(s);
                    System.out.println("[" + i + "] Output: " + r);
                }
                pause(scanner);
            } else if ("3".equals(c)) {
                again = false;
            } else {
                System.out.println("\nInvalid choice");
                pause(scanner);
            }
        }
    }

    private static void runQuickSamples() {
        sample("Merhaba", "abahreM");
        sample("İğne! ğüşöç 123", "çoşüğ !enğİ 123");
        sample("M3er?ha!b,a", "a3bh?ar!e,M");
        sample("1234!!! :)", "1234!!! :)");
        sample("Koç, Boğa; İkizler!", "relzikİ ;ağoB, çoK!");
        sample("ABC 123 def", "fed 123 CBA");
        sample("ŞEFTALİ ve SÜTLAÇ!", "ÇALTÜS ev İLTAFEŞ!");
        sample("Ankara - İstanbul", "lubnatsİ - araknA");
        sample("ğĞüÜşŞöÖçÇıİ", "İıÇçÖöŞşÜüĞğ");
        sample("Hello, Dünya!", "aynüD, olleH!");
        batchEdgeCases();
    }

    private static void batchEdgeCases() {
        sample("", "");
        sample("a", "a");
        sample("!", "!");
        sample("a!", "a!");
        sample("!a", "!a");
        sample("aa!", "aa!");
        sample("!aa", "!aa");
        sample("a!a", "a!a");
        sample("İ", "İ");
        sample("ı", "ı");
        sample("İı", "ıİ");
        sample("ıİ", "İı");
        sample("öçşğü", "üğşço");
        sample("ĞÜŞÖÇ", "ÇOŞÜĞ");
        sample("abc123xyz", "zyx123cba");
        sample("123abc", "123cba");
        sample("abc123", "cba123");
        sample("a1b2c3", "c1b2a3");
        sample(" abc ", " cba ");
        sample("A B C", "C B A");
        sample("Çoklu boşluk", "kulşob ulköÇ");
        sample("—abc—", "—cba—");
        sample("abc…xyz", "zyx…cba");
        sample("abc, xyz!", "zyx, cba!");
        sample("şeker, çikolata; kahve.", "evhak ;atalokıç ,rekeş.");
        sample("2025-10-27", "2025-10-27");
        sample("🙂abc🙂def🙂", "🙂fed🙂cba🙂");
        sample("🔥Merhaba🔥Dünya🔥", "🔥aynüD🔥abahreM🔥");
        sample("a_b-c=d+e", "e_d-c=b+a");
        sample("A1B2C3D4E5", "E1D2C3B4A5");
        sample("İstanbul 34", "43 lubnatsİ");
        sample("ÇĞİÖŞÜ ıiöüşç", "çşüöiı ÜŞÖİĞÇ");
        sample("No letters: 12345!?", "No letters: 12345!?");
        sample("Edge_case_end.", "dne_esac_gdE.");
        sample("Test-Case#42", "esaC-tseT#42");
        sample("Z", "Z");
        sample("zz", "zz");
        sample("Zz", "zZ");
        sample("Türkçe Karakterler: ç ğ ı i ö ş ü",
                "ü ş ö i ı ğ ç : r e l r e t k a r a K e ç k r ü T");
    }

    private static void sample(String input, String expected) {
        String out = reverseLettersOnly(input);
        System.out.println();
        System.out.println("Input   : " + input);
        System.out.println("Expected: " + expected);
        System.out.println("Output  : " + out);
        System.out.println("Correct?: " + out.equals(expected));
    }

    private static int parseIntSafe(String s, int fallback) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return fallback;
        }
    }

    private static void clearScreen() {
        try {
            System.out.print("\u001b[H\u001b[2J");
            System.out.flush();
        } catch (Exception ignored) {}
    }

    private static void title(String text) {
        printLine('=');
        System.out.println(text);
        printLine('=');
    }

    private static void printLine(char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 48; i++) sb.append(ch);
        System.out.println(sb);
    }

    private static void pause(Scanner sc) {
        System.out.print("\nPress Enter to continue...");
        sc.nextLine();
    }
}


