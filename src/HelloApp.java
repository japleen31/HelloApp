public class HelloApp {
    public static void main(String[] args){
        String name;
        if (args.length > 0) {
            StringBuilder names = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            name = "Hello, " + names.toString() + "!";
        } else {
            name = "Hello, World!";
        }
        System.out.println(name);
    }
}