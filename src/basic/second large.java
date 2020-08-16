import java.util.Scanner;

class Codeines
{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = 0;
        sc.close();
        int a[] = {x,y,z};
        for(int i=0;i<a.length;i++)
        {
            if(a[0]<a[i])
            {
                n=a[i];
                a[i]=a[0];
                a[0]=n;
            }
        }
        n=0;
        for(int j =1;j<a.length;j++){
            if(a[j]>a[1]){
                n=a[j];
                a[j]=a[1];
                a[1]=n;
            }
        }
        System.out.println(a[1]);
    }
}