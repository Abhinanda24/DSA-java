 class Main {
    public static void main(String args[]){
        Basic_Math obj;
        obj=new Basic_Math();
    //    System.out.println(obj.count_no_digit(123456));
    // System.out.println(obj.reverse_digit(12345));
    // System.err.println(obj.is_palindrome(123));
    // System.out.println(obj.is_Amstrong(153));
    // System.out.println(obj.is_Amstrong(123));
    System.out.println(obj.is_prime(10));
}
}

class Basic_Math{
    public int count_no_digit(int num){
        int count=0;
        while(num!=0){
            count++;
            num/=10;
        }
        return count;
    }
    public int reverse_digit(int num){
        int reverse=0;
        while (num!=0) {
         int digit=num%10;
         reverse=(reverse*10) + digit;
         num/=10;  
        }
        return reverse;
    }
    public boolean is_palindrome(int num){
        int onum=num;
        int reverse=0;
        while(num!=0){
            int digit=num%10;
            reverse=(reverse*10)+digit;
            num/=10;
        }
        if(onum==reverse){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean is_Amstrong(int num){
    int onum=num;
    int sum=0;
    while(num!=0){
        int digit = num %10;
        sum=sum+(digit*digit*digit);
        num/=10;
    }
    if(onum==sum){
        return true;
    }
    else{
        return false;
    }
}
    public boolean is_prime(int num){
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
 

