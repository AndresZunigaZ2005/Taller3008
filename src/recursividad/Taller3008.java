package recursividad;

public class Taller3008 {
	
	/*
	 * Andrés Felipe Zúñiga Zuluaga 
	 * Luis Carlos Calderón Calvo 
	 * Andrés Eduardo Pérez Martínez 
	 */

	public static void main(String[] args) {
		System.out.println("Pregunta 1= "+multiplicacionRusa(27, 31, 0));
		int num = 3728;
		System.out.println("Pregunta 2= "+invertirEntero(num, 0, contarUnidades(num)-1));
		System.out.println("Pregunta 3= "+calcularModulo(35, 2));
		String arr[] = {"A","B","C","D","E","F"};
		System.out.print("Pregunta 4= ");imprimirCombinaciones(arr, 0, 1);
		int n = 4578;
		System.out.println();
		System.out.println("Pregunta 6= "+sumaDescendente(n, 0, contarUnidades(n)-1));
	}
	
	//Pregunta 1
	public static int multiplicacionRusa(int m, int n, int acumulado) {
		if(m==0) {
			return acumulado;
		}
		if(m%2!=0) {
			return multiplicacionRusa(m/2, n*2, acumulado+n);
		}else {
			return multiplicacionRusa(m/2, n*2, acumulado);
		}
	}
	
	//Pregunta 2
	public static int invertirEntero(int n, int resp, int cont) {
		if(n==0) {
			return resp;
		}
		return resp+=invertirEntero(n/10, ((n%10))*((int)Math.pow(10, cont)), cont-1);		
	}
	
    public static int contarUnidades(int num) {
        if (num == 0) {
            return 0;
        } else {
            return 1 + contarUnidades(num / 10);
        }
    }
	
	//Pregunta 3
    public static int calcularModulo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return calcularModulo(a - b, b);
        }
    }
    
    //Pregunta 4
    public static void imprimirCombinaciones(String[]arr, int i, int j) {
		if(i<arr.length) {
			if(i<j && j <arr.length) {
				System.out.print(arr[i]+arr[j]+" ");
				imprimirCombinaciones(arr, i, j+1);
			}else {
			imprimirCombinaciones(arr, i+1, i+2);
			}
		}
	}
    
    //Pregunta 6
	public static int sumaDescendente(int n, int resp, int cont) {
		if(n==0) {
			return resp;
		}
		return sumaDescendente(n%((int)Math.pow(10, cont)), resp+n, --cont);		
	}
}
