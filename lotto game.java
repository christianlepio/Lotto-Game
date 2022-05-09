import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		int arr[] = new int[6], arr1[]=new int[6], counter = 0;
		System.out.print("\tWelcome to Lotto 6/55\n\n");
		for(int i=0 ; i<arr.length ; i++){
			arr[i] = (int)(Math.random()*56);
			}
		
		label: for(int i=0 ; i<arr.length ; i++){
			for(int a = 0 ; a <arr.length ; a++){
				if(i==a)
				continue label;
				else if(arr[i]==arr[a]){
					arr[i]=(int)(Math.random()*56);
					i=0;
					continue label;
					}
				}
			}
		for(int i=0 ; i<arr.length ; i++){
			System.out.print((i+1)+". Enter your taya: ");
			arr1[i] = g.nextInt();
			}
			lab: for(int i=0 ; i<arr1.length ; i++){
			for(int a = 0 ; a <arr1.length ; a++){
				if(i==a)
				continue lab;
				else if(arr1[i]==arr1[a]){
					System.out.print("\nYou have already "+arr1[i]+" please replace it: ");
					arr1[i]=g.nextInt();
					i=0;
					continue lab;
					}
				}
			}
		System.out.print("\nLabas sa Lotto: ");
		for(int i = 0 ; i<arr.length ; i++){
			System.out.print(arr[i]);
			if(i==5)
			break;
			System.out.print(", ");
			}
		for(int i = 0 ; i<arr.length ; i++){
			for(int a=0 ; a<arr1.length ; a++){
				if(arr[i] == arr1[a])
				counter++;
				}
			}
		
			System.out.println("\n\nYou got "+counter+" out of "+arr.length+" lottery balls...");
			
			
	}
}