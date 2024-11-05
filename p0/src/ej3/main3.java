package ej3;

public class main3 {

	public static void main(String[] args) {
		int [] a  = {1, 2, 3, 4};
		int pares=0;
	
	for(int i=0; i<a.length; i++) {
		if(a[i]%2==0) {
			pares++;
		}
	}
	System.out.println(pares);

}
}
