public class MeiaPiramide {
    public static void main(String[] args) {
        String str = "76 26 76 89 98 28 65 45 28 76 54 23 1 25 78 65 47 29 98 26 76 52 21 25 56 28 90 12 09 98 24 13 20 67 98 76 ";
        String[] vetstr = str.split(" ");
        int i, num2 = 1, num3 = 0;

        int[] num = new int[vetstr.length];

        for (i = 0; i < vetstr.length; i++) {
            num[i] = Integer.parseInt(vetstr[i]);
        }

        System.out.println("Lista: [" + str + "]\n");
        for (i = 0; i < num.length; num2++) {
            int numero = num[i];
            for (int a = 0; a < num2 && i < num.length; a++, i++) {
                System.out.printf("%02d ", num[i]);
                if (num[i] < numero) {
                    numero = num[i];
                }
            }
            num3 += numero;
            System.out.println();
        }
        System.out.println("\n" + "A soma dos números de cada linha é: " + num3 + "\n");
    }
}
