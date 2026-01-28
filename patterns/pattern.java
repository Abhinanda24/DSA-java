class Main{
    public static void main(String args[]){
        pattern obj;
        obj=new pattern();
        // obj.square(5);
        // obj.rightangle_triangle(5);
        // obj.rightangle_triangle_number(5);
        // obj.reverse_triangle(5);
        // obj.reverse_number_triangle(5);
        // obj.pyramid(5);
        // obj.sharp_star(5);
        // obj.zero_one(5);
        // obj.butterfly(5);
        // obj.number_Rtriangle(5);
        // obj.char_Triangle(5);
        obj.square_outer(5);    }
}
class pattern{
    public void square(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            System.out.print("* ");
        }
        System.err.println();
    }
    }
    public void rightangle_triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void rightangle_triangle_number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Other!....");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void reverse_triangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void reverse_number_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void pyramid(int n){
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*"); 
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*(n-i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void sharp_star(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public void zero_one(int n){

        for(int i=1;i<=n;i++){
            int start;
            if(i%2==0){
                    start=0;
                }
                else{
                    start=1;
                }
            for(int j=1;j<=i;j++){
                
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(" "+l);
            }
            System.out.println();
    
    }
}
    public void number_Rtriangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+num);
                num++;
            }
            System.out.println();

        }
    }
    public void char_Triangle(int n){
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(" "+ch);
                ch++;
            }
            System.out.println();
        }
        System.out.println("2");
         for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=n-i+1;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
         }
         System.out.println(3);
         char ch='A';
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);

            }
            ch++;
            System.out.println();
         }
    }
    public void square_outer(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i==1 || i==n)||(j==1||j==n)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
