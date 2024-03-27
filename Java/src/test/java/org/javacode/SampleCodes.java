package org.javacode;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SampleCodes {

	public static void main(String[] args) {

		// Arm Strong number

//	Scanner sc=new Scanner(System.in);
//  int arm=0;
//  System.out.println("Enter Ur number ");
//	
//  int num=sc.nextInt();
//  int temp=num;
//	while(num>0) {
//		int n=num%10;
//		arm=arm+(n*n*n);
//		num/=10;
//	}
//	
//	if(arm==temp) {
//		System.out.println("ArmStrong number ");
//	}
//	else {
//		System.out.println("Not Armstrong number");
//	}

		// program for count and print armstrong number

//	int count=0;
//	for(int i=1;i<1000;i++) {
//		int num=i;
//		int arm=0;
//		while(num>0) {
//			int n=num%10;
//			arm=arm+(n*n*n);
//			num/=10;
//		}
//		if(arm==i) {
//			System.out.println("ArmStrong Number: "+i);
//			count++;
//		}
//	}
//	System.out.println("Count of Armstrong Number: "+count);
//	

		// Ascending order Number program

//	int a[]= {30,50,30,70,10,20,40,60};
//	
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]>a[j]) {
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//	}
//	
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//	}
//	System.out.println("Maximum value in arry: "+a[a.length-1]);
//	System.out.println("Maximum 2nd value in Array: "+a[a.length-2]);
//	System.out.println("Miminum Value in array: "+a[0]);
//	System.out.println("Minimum 2nd value In Array: "+a[1]);

		// Desending order Array

//	int a[]= {10,40,50,30,20};
//	
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]<a[j]) {
//				int temp=a[i];
//				a[i]=a[j];
//				a[j]=temp;
//			}
//		}
//	}
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//	}

		// manipulation program in String

//	String str="welcomeTo@Java123";
//	
//	int c=0,s=0,d=0,spl=0;
//	
//	for(int i=0;i<str.length();i++) {
//		char ch=str.charAt(i);
//		if(ch>=97 && ch<=122) {
//			s++;
//		}
//		else if(ch>=65 && ch<90) {
//			c++;
//		}
//		else if(ch>=48 && ch<57) {
//			d++;
//		}
//		else {
//			spl++;
//		}
//	}
//	System.out.println("Capital letter: "+c);
//	System.out.println("Small letter: "+s);
//	System.out.println("Digit letter: "+d);
//	System.out.println("SplCharacter letter: "+spl);

//	String str="welcome to world";
//	String[] sp=str.split(" ");
//	StringBuffer sb=new StringBuffer();
//	for(int i=0;i<sp.length;i++) {
//		
//		char ch=sp[i].charAt(0);
//		char a=Character.toUpperCase(ch);
//		String b=sp[i].substring(1);
//		sb.append(a).append(b).append(" " );
//		
//	}
//	String tr=sb.toString().trim();
//	System.out.println(tr);
//	
//	
//String str ="welcome geni";
//String rpl=str.replace("e", ")")	;
//
//	System.out.println(rpl);
//	

		// 21/3/24
		// Swap Number In 5 ways

//	int a=10, b=20;

		// Logic 1:
//	int temp=a;
//	a=b;
//	b=temp;

		// logic 2:
//	a=a+b;
//	b=a-b;
//	a=a-b;

		// Logic 3:
//	a=a*b;
//	b=a/b;
//	a=a/b;
//	
		// logic 4: XOR(^)

//	a=a^b;
//	b=a^b;
//	a=a^b;

		// logic 5:

//	b=a+b-(a=b);
//	System.out.println("Swap number a:"+a+" ,b: "+b);
//	

		// Reverse number [3 ways]

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Ur number");
//	int num =sc.nextInt();
//	int rev=0;
		// logic 1:
//	while(num!=0) {
//		rev=rev*10+num%10;
//		num=num/10;
//	}
//	

		// logic 2:
//	StringBuffer sb=new StringBuffer(String.valueOf(num));
//	StringBuffer rev=sb.reverse();

		// logic 3:
//	StringBuilder sb=new StringBuilder();
//	sb.append(num);
//	StringBuilder rev=sb.reverse();
//	
//	System.out.println(rev);

		// string Rev [3 different ways]

//	String str="ABCD";
//	String rev="";
//	
		// Logic 1:
//    int lent=str.length();
//	
//	for(int i=lent-1;i>=0;i--) {
//		rev=rev+str.charAt(i);
//	}
//	System.out.println(rev);
//	
		// logic 2:

//	char []ch=str.toCharArray();
//	
//	int lent=ch.length;
//	
//	for(int i=lent-1;i>=0;i--) {
//		rev=rev+ch[i];
//	}
//	
//	System.out.println(rev);

		// logic 3:

//	StringBuffer sb=new StringBuffer(str);
//	StringBuffer reverse = sb.reverse();
//	System.out.println(reverse);

		// Palindrom number

//   Scanner sc=new Scanner(System.in);
//	System.out.println("Enter number:");
//   int num=sc.nextInt();
//   int temp=num;
//   int rev=0;
//	while(num>0) {
//		int n=num%10;
//		rev=(rev*10)+n;
//		num=num/10;
//	}
//	if(rev==temp) {
//		System.out.println("Palindrom Number");
//	}
//	else {
//		System.out.println("not Palindrom number");
//	}

		// palindrom String
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter ur string");
//	String str=sc.next();
//	String org_str=str;
//	String rev="";
//	
//	int lent=str.length();
//	for(int i=lent-1;i>=0;i--) {
//		rev=rev+str.charAt(i);
//	}
//	if(str.equals(rev)) {
//		System.out.println("Palindrom String");
//	}
//	else {
//		System.out.println("Not palindrom string");
//	}

		// Count On number

//	int num=123;
//	int count=0;
//	
//	while(num>0) {
//		num=num/10;
//		count++;
//	}
//	System.out.println(count);
//	
		// Number Even number

//	int num=1234;
//	int even_count=0;
//	int odd_count=0;
//	
//	while(num>0) {
//		
//		int n=num%10;
//			if(n%2==0) {
//				even_count++;
//			}
//			else {
//				odd_count++;
//			}
//		num=num/10;
//	}
//	
//	
//	System.out.println("even count: "+even_count+" \n odd count:"+odd_count);
//	

		// Sum of Digit in Number

//	int num=1234;
//	int sum=0;
//	
//	while(num>0) {
//		sum=sum+num%10;
//		num=num/10;
//	}
//	
//	System.out.println(sum);

		// largest 3 number

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter Frist number:");
//int a=	sc.nextInt();
//System.out.println("Enter Second number:");
//int b=sc.nextInt();
//System.out.println("Enter Third number:");
//int c=sc.nextInt();
//	
//		//logic=1
//if(a>b && a>c) {
//	System.out.println("a greater");
//}
//else if(b>a && b>c) {
//	System.out.println("b greater");
//}
//else {
//	System.out.println("c greater");
//}

		// logic 2

		// ternery operator
//	
//	int largest=a>b?a:b;
//	int largest2=c>largest?c:largest;
//	
//	System.out.println(largest2);

//logic 2.1{Single Statement}

//	int largest=c>(a>b?a:b)?c:(a>b?a:b);
//	System.out.println(largest);
//	

		// swap number 5 different ways

//	int a=20,b=30;

		// logic 1:

//	int temp=a;
//	a=b;
//	b=temp;

		// logic 2:

//	a=a+b;
//	b=a-b;
//	a=a-b;

		// logic 3:

//	a=a*b;
//	b=a/b;
//	a=a/b;

		// logic 4:XOR

//	a=a^b;
//	b=a^b;
//	a=a^b;

		// logic 5:
//	b=a+b-(a=b);
//	
//	System.out.println("a="+a+" ,b="+b);
//	
		// Reverse Number

		// logic 1:
//	int num=1234;
		// int rev=0;

//	while(num!=0) {
//		rev=rev*10+num%10;
//		num=num/10;
//	}

		// logic 2:
//	StringBuffer sb=new StringBuffer(String.valueOf(num));
//	StringBuffer rev=sb.reverse();

		// logic 3:
//	StringBuilder sb=new StringBuilder();
//	sb.append(num);
//	StringBuilder reverse = sb.reverse();
//	System.out.println("Reversed Number: "+reverse);

		// String Reverse [3 different ways]

//	String str="ABCD";
//	String rev="";
		// logic 1;
//	int lent=str.length();
//	for(int i=lent-1;i>=0;i--) {
//		rev=rev+str.charAt(i);
//	}
		// logic 2:

//	char[] ch=str.toCharArray();
//	int lent=ch.length;
//	for(int i=lent-1;i>=0;i--) {
//		rev=rev+ch[i];
//	}

		// logic 3:
//	StringBuffer sb=new StringBuffer(str);
//	StringBuffer rev = sb.reverse();
//	System.out.println(rev);

		// palindrom number

//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter ur number: ");
//    int num=sc.nextInt();
//	int temp=num;
//	int rev=0;
//	while(num>0) {
//		rev=rev*10+num%10;
//		num=num/10;
//	}
//	
//	if(temp==rev) {
//		System.out.println("palindrom NUMBER");
//	}else {
//		System.out.println("Not palindrom");
//	}

		// Palindrom In String

//	Scanner sc=new Scanner (System.in);
//	System.out.println("Enter ur String");
//	String str=sc.next();
//	String org_str=str;
//	String rev="";
//	
//	int lent=str.length();
//	
//	for(int i=lent-1;i>=0;i--) {
//		rev=rev+str.charAt(i);
//	}
//	
//	if(org_str.equals(rev)) {
//		System.out.println("Palindrom String");
//	}
//	else {
//		System.out.println("Not Plaindrom String");
//	}

		// count number

//	int num=1234;
//	int count=0;
//	
//	while(num>0) {
//		num=num/10;
//		count++;
//	}
//	
//	System.out.println(count +" =Count of number");
//	

		// Number Even number and Odd

//	Scanner sc=new Scanner(System.in);	
//	System.out.println("Enter ur number");
//	int num=sc.nextInt();
//	int even_count=0,odd_count=0;
//	
//	while(num>0) {
//		int n=num%10;
//		if(n%2==0) {
//			even_count++;
//		}else {
//			odd_count++;
//		}
//		num=num/10;
//	}
//	System.out.println("EvenCount: "+even_count+" ,Odd Count:"+odd_count);
//	

		// Sum of number

//	int num=1234;
//	int sum=0;
//	while(num>0) {
//		sum=sum+num%10;
//		num=num/10;
//	}
//	System.out.println("Sum of number: "+sum);

		// largest three number

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Frist number");
//		int a = sc.nextInt();
//		System.out.println("Second number");
//
//		int b = sc.nextInt();
//		System.out.println("Third number");
//
//		int c = sc.nextInt();

		//logic 1:
			
//		if(a>b && a>c) {
//			System.out.println("A grater");
//		}
//		else if(b>a && b>c) {
//			System.out.println("B grater");
//		}
//		else {
//			System.out.println("C grater");
//		}
		
		// logic2:
//		int largest=a>b?a:b;
//		int largest1=c>largest?c:largest;
//		
//		
//		System.out.println(largest1);
		
		
		// Fibonicce series
		
		
//		int n1=0,n2=1,n3;
//		
//		System.out.print(n1+" "+n2);
//		
//		for(int i=1;i<10;i++) {
//			n3=n1+n2;
//			System.out.print(" "+n3);
//			n1=n2;
//			n2=n3;
//		}
//		
		
		// Mergeing array
		
//		int a1[]= {1,3,4,5,6};
//		int a2[]= {3,4,5,6,7};
//		int len1 =a1.length;
//		int lent2= a2.length;
//		
//		int [] mergedArry=new int[len1+lent2];
//		
//          System.arraycopy(a1, 0, mergedArry, 0, len1);
//          System.arraycopy(a2,0,mergedArry,len1,lent2);		
//		
//		System.out.println(Arrays.toString(mergedArry));
		
		
		
		//swap number 
		
		//logic 1
		
//		int a=10,b=20;
//		int temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("Swap Number: "+a+", "+b);
		
		//logic 2:
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//	System.out.println("Swap Number: "+a+", "+b);

		
	//	logic 3:
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
		//logic 4:
//		a=a^b;
//		b=a^b;
//		a=a^b;
		
		//logic 5:
//		b=a+b-(a=b);
//		System.out.println("Swap Number: a= "+a+",b= "+b);

		// reverse Number  3 ways 
		// logic 1;
//		int num=1234;
//		int rev=0;
//		
//		while(num!=0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		
//		System.out.println("Reversed number: "+rev);
//		
		//logic 2:
			
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Ur Number");
//		int num=sc.nextInt();
//		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer reverse = sb.reverse();
//		System.out.println("Reversed Number: "+reverse);
		
		//logic 3:
			
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter ur Number");
//		int num=sc.nextInt();
//		StringBuilder sb=new StringBuilder();
//		sb.append(num);
//		StringBuilder reverse = sb.reverse();
//		System.out.println(reverse);
		
		// Reverse string 3 diff ways
		
		//logic 1:
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Ur String");
//		String str=sc.next();
//		String rev="";
//		
//		int lent=str.length();
//		for(int i=lent-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
		
		//logic 2:
		
//		String str="redei";
//		String rev="";
//		
//		char[] arr=str.toCharArray();
//		
//		for(int i=arr.length-1;i>=0;i--) {
//			rev=rev+arr[i];
//		}
//		
//		logic 3:
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter ur String");
//		String str=sc.next();
//		StringBuffer sb=new StringBuffer(str);
//		StringBuffer rev = sb.reverse();
//		
//		System.out.println("Reversed String: "+rev);
		
		
		//Plaindrom number 
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter ur Number: ");
//		int num=sc.nextInt();
//		int rev=0;
//		int temp=num;
//		
//		while(num>0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		
//		if(temp==rev) {
//			System.out.println("Palindrom Number");
//		}
//		else {
//			System.out.println("Not Palindrom");
//		}
		
		
		// palindrom in String
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter String");
//		String str=sc.next();
//		String rev="";
//		String temp=str;
//		
//		int lent=str.length();
//		for(int i=lent-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		if(temp.equalsIgnoreCase(rev)) {
//			System.out.println("Palindrom");
//		}
//		else {
//			System.out.println("Not Palindrom");
//		}
		
		// Count on number
		
//		int num=123424552;
//		int count =0;
//		
//		while(num>0) {
//		num=num/10;
//		count++;
//		
//		}
		
		
		//System.out.println(count);
		
		// number Even or Odd
		
//		Scanner sc=new Scanner (System.in);
//		System.out.println("Enter Ur Number");
//		int num=sc.nextInt();
//		int even_count = 0,odd_count = 0;
//		while(num>0) {
//			int n=num%10;
//			if(n%2==0) {
//				even_count++;
//			}
//			else {
//				odd_count++;
//			}
//			num=num/10;
//			
//			
//			
//		}
//		System.out.println("Event number:"+even_count+" ,Odd count: "+odd_count);
//		
		
		// Sum Digit in Number
		
//		int num=1234;
//		int sum=0;
//		
//		while(num>0) {
//			sum=sum+num%10;
//			num=num/10;
//		}
//		
//		System.out.println("Sum of Digit in number: "+sum);
		
		
		//Largest in 3 number
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Frist Number");
//		int a=sc.nextInt();
//		System.out.println("Enter Secound number");
//		int b=sc.nextInt();
//		System.out.println("Third number");
//		int c=sc.nextInt();
//		
//		if(a>b && a>c) {
//			System.out.println("A grater");
//		}
//		else if(b>a && b>c) {
//			System.out.println("B greater");
//		}
//		
//		else {
//			System.out.println("C grater");
//		}
//		
	//	Fibonoicee series
		
		
//		int n1=0,n2=1,n3=0;	
//		System.out.print(n1+", "+n2);
//		
//		for(int i=0;i<10;i++) {
//			n3=n1+n2;
//			System.out.print(", "+n3);
//			n1=n2;
//			n2=n3;
//		}
		
		//Check prime NUMBER OR NOT
		
//		 int num=3;
//		 int count=0;
//		 
//		 
//		 if(num>1) {
//			 for(int i=1;i<=num;i++) {
//				 if(num%i==0) {
//					 count++;
//				 }
//				 
//			 }
//			 if(count==2) {
//				 System.out.println("Prime number");
//			 }else {
//				 System.out.println("Not Prime Number");
//			 }
//		 }
		 
		// check the prime number from 1 to 10;
		 
//		int count_prime =0;
//		for(int i=1;i<=10;i++) {
//			int num=i;
//			int count=0;
//			
//				for(int j=1;j<=num;j++) {
//					if(num%j==0) {
//						count++;
//					}
//				}
//				if(count==2) {
//					count_prime++;
//				}
//				
//			
//		}
//				System.out.println("County prime number:"+count_prime);
//		
		
		
		// How to generate random number and string
		
//		Random rand=new Random();
//		
//		int nextInt = rand.nextInt(10);
//		
//		System.out.println(nextInt);
		
		// Factorial number 
//		int  fac=1;
//		int num=5;
//		
//		for(int i=1;i<=num;i++) {
//			fac=fac*i;
//			
//		}
//		System.out.println("Factorial:"+fac);
		
		// Sum Element in Array
		
//		int a[]= {5,2,7,9,6};
//		
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println("Sum of array element: "+sum);
		
		
		//Print eVEN ODD FROM aRRAY
		
		//int a[]= {2,3,4,6,7,2,1,899};
//		
//		for(int i=0;i<a.length;i++) {
//			if(a[i]%2==0) {
//				System.out.println("Even number: "+a[i]);
//			}else {
//				System.out.println("Odd Number: "+a[i]);
//			}
//		}
		// check 2 array are equal or not
//		int a[]= {1,2,3,4,5};
//		int a2[]= {1,2,3,4,5};
//		
//		boolean status=Arrays.equals(a, a2);
//		
//		if(status == true) {
//			System.out.println("Arrays r equal");
//		}
//		else {
//			System.out.println("Arrays not Equal");
//		}
		
		//Missing number in Array
		
//		int a[]= {1,2,3,4,5,6,7,9};
//		int sum1=0;
//		
//		for(int i=0;i<a.length;i++) {
//			sum1=sum1+i;
//		}
//		System.out.println(sum1);
//		int sum2=0;
//		for(int i=1;i<9;i++) {
//			sum2=sum2+i;
//		}
//		System.out.println(sum2);
//		System.out.println("Missing number In Array: "+(sum2-sum1));
		
		//maximum and minimum in array
		
		int a[]= {10,30,40,50,60,20};
		
		int max=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>=max) {
			max=a[i];
		}
		}
		System.out.println("maximum Number Array: "+max);

		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<=min) {
				min=a[i];
			}
		}
		System.out.println("Minimum Number Array: "+min);

		//duplicate element in array
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
	}

}
