
public class Main {
    public static void main(String[] args) {
        System.out.println("Fatorial: " + fatorial(6));
        System.out.println("Somatório: " + somatorio(-6));
        System.out.println("Fibonacci: " + fibonacci(8));
        System.out.println("Somatório com limites: " + somatorioComLimites(8, 11));
        System.out.println("É palíndromo: " + isPal("aaaaaaaaaa"));
        System.out.println("É palíndromo: " + isPal("abcx"));
        System.out.println("Convbase2: " + convBase2(32));


    }

    public static int fatorial(int num){
        if(num <= 0){
            return 1;
        }
        return num * fatorial(num - 1);
    }

    public static int somatorio(int num){
        if (num > 0){
            return num + somatorio(num - 1);
        }
        else if (num < 0){
            return num + somatorio(num + 1);
        }
        return 0;
    }

    public static int fibonacci(int num){
        if(num <= 0){
            return 0;
        }
        else if (num == 1){
            return 1;
        }
        else{
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static int somatorioComLimites(int j, int k){
        if (j == k){
            return j;
        }
        else if (j < k){
            return j + somatorioComLimites(j + 1, k);
        }
        else{
            return somatorioComLimites(k, j);
        }
    }

    public static boolean isPal(String s){
        if (s == null){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (s.length() == 0 || s.length() == 1){
            return true;
        }
        else if(s.charAt(0) != s.charAt(s.length() - 1)){
            return false;
        }
        return isPal(s.substring(1, s.length() - 1));
    }

    // public static String convBase2(int n){
    //     if(n < 0){
    //         return "";
    //     }
    //     else if(n == 0){
    //         return "0";
    //     }
    //     else if(n == 1){
    //         return "1";
    //     }
    //     else if(){
            
    //     }
    //     return "1" + convBase2(n / 2);

    // } 
}