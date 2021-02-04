
public class AlgoSayna {

	public static void main(String[] args) {
		// vous pouvez mettre les méthodes ici pour faire des tests
	}
	
	
	// somme de 2 nombres entiers
	public static int somme (int a, int b){
		int sum;
		sum = a + b;
		return sum;
	}
	
	// factorielle de n
		public static int factorielle (int n){
			int fact=1;
			for (int i=1; i<=n; i++){
				fact = fact*i;
			}
			return fact;
		}
		
	// vérifie si a divise b
		public static boolean divise(int a, int b){
			if (a%b ==0){
				return true;
			}
			else {
				return false;
			}			
		}
		
	// calcul quotient et reste de la division entiere de 2 nombre entiers
		public static void calculQuotientReste(int a, int b){
			int q = a / b;
			int r = a % b;
			System.out.println("Le quotient est: " + q);
			System.out.println("Le reste est: " + r);
		}
		
	// caractère voyelle
				public static boolean voyelle(char c){
					if ((c =='a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')||(c == 'y')){
						return true;
					}
					else return false;
				}
				
	// echange contenu 2 variables reelles
				public static void echange(int a, int b){
					int tmp = a;
					a = b;
					b = tmp;
				}
				
	// valeur absolue
				public static int echange(int a){
					int va=a;
					if (a<0){
						return -va;
					}
					else return va;
				}
		
		
		
	
	
	

}
