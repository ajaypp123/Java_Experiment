public class wrapper {
    public static void main(String[] args) {
        // Autoboxing
        int j = 10;
        Integer i_obj = Integer.valueOf(j); // boxing
        Integer j_obj = j; // Autoboxing
        System.out.println(i_obj +""+ j_obj);

        // Autounboxing
        int p = j_obj; // Autounboxing
        int q = i_obj.intValue(); // boxing
        System.out.println(p +""+ q);

    }
}