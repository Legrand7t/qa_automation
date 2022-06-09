public class DataTypes {
    public static void main(String[] args) {
        byte a = 65;                //(цілі числа, 1 байт)
        short b = 3254;             //(цілі числа, 2 байти)
        int c = 33782;              //(цілі числа, 4 байти)
        long d = 1_000_000_000L;    //(цілі числа, 8 байтів)
        float e = 3.8f;             //(дійсні числа, 4 байти)
        double f = 18.5;            //(дійсні числа, 8 байтів)
        char g = 'R';               //(символ Unicode, 2 байти)
        boolean h = true;           //(значення істина/хибність, 1 байт в масивах, 4 байти не в масивах)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}