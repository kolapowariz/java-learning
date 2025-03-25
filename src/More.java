import java.text.NumberFormat;

public class More {

    public static void main(String[] args) {
        // Casting
        // Implicit casting
        // byte > short > int > long > float > double
        short a = 1;
        int b = a + 2;
        System.out.println(b);

        // Explicit casting
        double c = 1.1;
        int d = (int)c + 2;
        System.out.println(d);

        String e = "1";
        int f = Integer.parseInt(e) + 2;
        System.out.println(f);

        String g = "1.1";
        double h = Double.parseDouble(g) + 2;
        System.out.println(h);

        // Math method

        int i = Math.round(1.1F);
        System.out.println(i);

        int j = (int)Math.ceil(1.1F);
        System.out.println(j);

        int k = (int) Math.floor(1.1F);
        System.out.println(k);

        int l = Math.max(1, 3);
        System.out.println(l);

        int m = Math.min(1, 4);
        System.out.println(m);

        double n = Math.random();
        System.out.println(n);

        int o = (int) Math.round(Math.random() * 100);
        System.out.println(o);

        int p = (int) (Math.random() * 100);
        System.out.println(p);



        // Formatting numbers
        // Currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String r = currency.format(123456.789);
        System.out.println(r);

        // Percentage
        String s = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(s);



    }
}
