import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        
        for(int i=2;i<N;i++){
           for(int j=2;j<=i;j++){
                if(i%j == 0){
                    if(i==j && count<1){
                        System.out.println("Prime No : " + i);
                        break;
                    }
                    //System.out.print(i + " ");
                    count++;
                }
            }
            count = 0;
        }    
    }
}