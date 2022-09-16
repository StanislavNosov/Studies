package Java.codewars;

public class whoLikes {
    public static String whoLikesIt(String... names) {
        String tmpl = " likes this";
        String str = "";
        if (names.length == 0) {
            str = "no one" + tmpl;
            return str;
        }
        if (names.length < 2) {
            str = "names[1]" + tmpl;
            //return str;
        }
        if (names.length < 3) {
            str += names[0] + " and " + names[1] + tmpl;
            //return str;
        }

        if (names.length < 4) {
            str += names[0] +", " + names[1] + " and " + names[2] + tmpl;
            //return str;
        }

        if (names.length < 5) {
            str += names[0] +", " + names[1] + " and " + (names.length-2) + " others" + tmpl;
            //return str;
        }
        return str;
    }


    public static void main(String[] args) {
        String[] names = {};
        System.out.println(whoLikesIt(names));
    }
}