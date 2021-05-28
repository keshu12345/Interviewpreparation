package BinaryStringBitAddition;

public class AdditionOfTwoBinaryNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1="101";
     String str2="111";
      int carry=0;
      int arr[]=new int[str1.length()+1];
      int rem=0;
      int count=0;
     for(int i=0,j=0;i<str1.length()&&j<str2.length();i++,j++) {
    	 int num1=str1.charAt(i)-'0';
    	// System.out.printf("%s",str1.charAt(i));
    	 int num2=str2.charAt(j)-'0';
    	 int add=num1+num2+carry;
    	 carry=add/2;
    	 rem=add%2;
    	 arr[i]=rem;
    	 
    	 System.out.println("i"+i+ "="+ add);
    	 count++;
    	 //00101
    	 //0010
    	 //00110
    	 //0011
    	 
    	// System.out.println("ASCII Value of "+str1.charAt(i)+" is"+"="+asciiValue);
     }
     arr[count]=carry;
     for(int i=0;i<arr.length;i++) {
    	 System.out.print(arr[i]); 
     }
     
	}

}

	

