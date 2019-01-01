package yidong.Util;

public class Check {
    public static float check(String a){

        if(a==null){return 0;}
        else {
            return (Float.parseFloat(a))/100;
        }

    }
}
