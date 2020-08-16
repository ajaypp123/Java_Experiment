class Codechef
{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 1;
        
        for(int p=2;p<x;p++)
        {
            if(x%p == 0){
                n=0;
            }
        }
        if(n==0){
        System.out.println("not prime");
        }else
            System.out.println("prime");
    }
}