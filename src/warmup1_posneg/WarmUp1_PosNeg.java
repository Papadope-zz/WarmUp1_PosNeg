package warmup1_posneg;

public class WarmUp1_PosNeg {

    public static void main(String[] args) {
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
    }
    
    public static boolean posNeg(int a,int b, boolean negative){
        if((a < 0 && b > 0) || (a > 0 && b <0)){
            return !negative;
        }
        if (negative){
            if(a < 0 && b < 0){
                return true;
            }
        }
        return false; 
    }
    
}
