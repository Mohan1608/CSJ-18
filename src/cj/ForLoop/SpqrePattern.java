package cj.ForLoop;

public class SpqrePattern {
    public static void main(String[] args){
        int n=5;
        for (int i=1;i<=n;i++){
            System.out.print("*");
            char disp=i==1||i==n?'*':' ';
            for (int j=1;j<=n-2;j++){
                System.out.print(disp);
                }
                System.out.println("*");
        }
    }
}
