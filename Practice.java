public class Practice {
    public static void main(String[] args) {
        String name = "Dipak";
        int value = name.length();

        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String ustring = name.toUpperCase();
        System.out.println(ustring);
        String sub = name.substring(2, 5);
        System.out.println(sub);
        System.out.println(name.replace("pak", "ed"));
    }
}
