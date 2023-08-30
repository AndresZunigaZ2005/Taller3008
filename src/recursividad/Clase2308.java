package recursividad;

import javax.swing.JOptionPane;

public class Clase2308 {

	public static void main(String[] args) {
		System.out.println(multiplicar(2, 4));
		System.out.println("/////////////////////////////////////");
		try {
			System.out.println(dividir(100, 3, 0));
		} catch (Exception e) {
			JOptionPane.showConfirmDialog(null, "Estoy cansado jefe");
			e.printStackTrace();
		}
		System.out.println("/////////////////////////////////////");
		System.out.println(sumarImpares(0, 11));
		System.out.println("/////////////////////////////////////");
		int arr []= {5,3,2};
		imprimirArreglo(0, arr);
		System.out.println("/////////////////////////////////////");
		System.out.println(sumarElementosArreglo(0, arr));
		System.out.println("/////////////////////////////////////");
		System.out.println(mostrarMenorArreglo(1, arr, arr[0]));

	}
	
	public static int multiplicar(int a, int b) {
		if(b<=0) {
			if(b==0) {
				return 0;
			}
			else {
				return a+multiplicar(a, b+1);
			}
		}else {
			if(b==0) {
				return 0;
			}
			else {
				return a+multiplicar(a, b-1);
			}
		}
	}
	
	public static int dividir(int a, int b, int resp) throws Exception{
		if(b<=0) {
			throw new Exception("El divisor debe ser mayor a 0");
		}
		if(a<b) {
			return resp; 
		}else {
			return dividir(a-b, b, resp+1);
		}
	}
	
	public static int sumarImpares(int i,int n) {
		if(i<n) {
			return i+sumarImpares(i+2, n);
		}else {
			return 0;
		}
	}
	
	public static void imprimirArreglo(int i,int[] arr) {
		if(i<arr.length) {
			System.out.println(arr[i]);
			imprimirArreglo(i+1, arr);
		}
	}
	
	public static int sumarElementosArreglo(int i, int[]arr) {
		if(i<arr.length) {
			return arr[i]+sumarElementosArreglo(i+1, arr);
		}else {
			return 0;
		}
	}
	
	public static int mostrarMenorArreglo(int i, int [] arr, int menor) {
		if(i<arr.length) {
			if(menor>arr[i]) {
				return mostrarMenorArreglo(i+1, arr, arr[i]); 
			}else {
				return mostrarMenorArreglo(i+1, arr, menor);
			}
		}
		return menor;
	}
	
	//public static int contarElemento
	
	//Pregunta 8
	public static int contarElemntoArray(int num, int[]arr, int i, int resp){
	 if(i==arr.length){
	 return resp;
	 }
	 if(arr[i]==num) {
	 return resp += 1 + contarElemntoArray(num, arr, i + 1, resp);
	 }
	 return resp += contarElemntoArray(num, arr, i + 1, resp);
	}

	//Pregunta 9
	public static void impMatriz(int i,int j){
	 if(j>0){
	 System.out.print("0 ");
	 impMatriz(i-1, j);
	 }else{
	 System.out.println();
	 }
	 if(i==0){
	 impMatriz(i,j);
	 }
	}

	//Pregunta 10
	public static int sumarElementosMatriz(int[][] m,int i, int j){
	 if(i<m.length){
	 if(j<m[0].length){
	 return m[i][j] + sumarElementosMatriz(m,i,j+1);
	 }
	 else{
	 return sumarElementosMatriz(m,i+1,0);
	 }
	 }
	 return 0;
	}

	//Pregunta 11
	public static boolean determinarPalindroma(String palabra,boolean resp, int i, int j) {
	 if (i == j || i > j || resp==false) {
	 return resp;
	 }
	 if (palabra.charAt(i) == palabra.charAt(j)) {
	 return determinarPalindroma(palabra, resp, i + 1, j - 1);
	 }
	 return false;
	}
}
