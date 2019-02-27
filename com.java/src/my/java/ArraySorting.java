package my.java;

public class ArraySorting {

	public static void main(String[] args) {
		int temp=0;
		int []arry= {5,2,7,8,1,0};
		for(int i=0;i<arry.length;i++) {
			for(int j=i+1;j<arry.length;j++) {
				if(arry[i]>arry[j]) {
					temp=arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
					
				}
				
			}
			System.out.println(arry[i]);
		}
	
//		for(int i=0;i<=(arry.length-1);i++) {
//			System.out.println(arry[i]);
//		}

}
}