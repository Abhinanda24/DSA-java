class Main{
    public static void main(String args[]){
        pattern obj;
        obj=new pattern();
        // obj.square(5);
        obj.rightangle_triangle(5);
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
}