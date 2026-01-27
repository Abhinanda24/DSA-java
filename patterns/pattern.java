class Main{
    public static void main(String args[]){
        pattern obj;
        obj=new pattern();
        // obj.square(5);
        // obj.rightangle_triangle(5);
        // obj.rightangle_triangle_number(5);
        // obj.reverse_triangle(5);
        // obj.reverse_number_triangle(5);
        obj.pyramid(5);
    }
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
}