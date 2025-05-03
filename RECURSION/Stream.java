package StringsRecursion;

public class Stream {
    public static void main(String[] args) {
//        skip("","baccad");
//        System.out.println(skip2("baccad"));
//        System.out.println(skipApple("imappleok"));
        System.out.println(skipAppNotApple("harsapplfgf"));  // skip "app" because there is not "apple" there is "appl"

    }
    static void skip(String made , String given){
        if(given.isEmpty()){
            System.out.println(made);
            return;
        }
        char ch = given.charAt(0);
        if( ch=='a'){
            skip( made , given.substring(1));
        }else{
            skip(made + ch , given.substring(1));
        }

    }

    // another approach

    static String skip2(String given){
        if(given.isEmpty()){
            return "";
        }
        char ch = given.charAt(0);
        if( ch=='a'){
            return skip2(given.substring(1));
        }else{
            return ch + skip2(given.substring(1));
        }
    }
    static String skipApple(String given){
        if(given.isEmpty()){
            return "";
        }
        if(given.startsWith("apple")){
            return skipApple(given.substring(5));
        }else{
            return given.charAt(0) + skipApple(given.substring(1));
        }
    }
    static String skipAppNotApple(String given){
        if(given.isEmpty()){
            return "";
        }
        if(given.startsWith("app") && !given.startsWith("apple")){
            return skipAppNotApple(given.substring(3));
        }else{
            return given.charAt(0) + skipAppNotApple(given.substring(1));
        }
    }
}
