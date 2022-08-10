import java.util.*; 
class AsciiChars
{
			public static void printNumbers (){
				// print valid numeric numbers 
				
				System.out.print("\nThe valid numbers are :");
				for (int i =0; i<10; i++) {
					System.out.print(i+" ");
			     }   
			    }
			    public static void printLowerCase(){
			        // prints valid lovercase alphebets
			        System.out.print("\nThe valid lowercase alphebets are : ");
			        for(char ch='a';ch<='z';ch++){
						System.out.print(ch + " ");	
			        }   
			    }
			    public static void printUpperCase(){
			        // prints valid lovercase alphebets
			        System.out.print("\nThe valid uppercase alphebets are : ");
			        for(char ch='A';ch<='Z';ch++){
						System.out.print(ch + " ");	
			        }   
			    }
			


	}

