package TESTE1;

import java.util.Scanner;

public class CalculadoraFuncional {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double x,y,z;
		double resultado = 0;
		char oper;
		System.out.println ("Digite o valor de x");
		x = sc.nextDouble();
		System.out.println ("Digite o valor da operação");
		oper = sc.next(). charAt(0);
		System.out.println ("Digite o valor de y");
	
		
		do {
			y = sc.nextDouble();
			switch (oper) {
			case '+':
					
					resultado = x+y;
						 System.out.println (resultado);
							System.out.println ("Digite o operador ou S para sair");
						 oper = sc.next(). charAt(0);
						do { if (oper=='-') {
							System.out.println ("Digite o valor de y");
							     y = sc.nextDouble();
								resultado = resultado-y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
							}
						 else if (oper=='*') {
							 System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado*y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								
							
						}
						else if (oper == '/') {
							System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado/y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								
							
						}
						else if (oper == '-') {
							System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado-y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								 	
					 }
						else if (oper == '+') {
							System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado+y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								 	
					 }
				} while (oper != 's');
						
			case '-':
				
				resultado = x-y;
					 System.out.println (resultado);
						System.out.println ("Digite o operador ou S para sair");
					 oper = sc.next(). charAt(0);
					do { if (oper=='-') {
						System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado-y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
						}
					 else if (oper=='*') {
						 System.out.println ("Digite o valor de y");
					     y = sc.nextDouble();
						resultado = resultado*y;
							 System.out.println (resultado);
								System.out.println ("Digite o operador ou S para sair");
							 oper = sc.next(). charAt(0);
							
						
					}
					else if (oper == '/') {
						System.out.println ("Digite o valor de y");
					     y = sc.nextDouble();
						resultado = resultado/y;
							 System.out.println (resultado);
								System.out.println ("Digite o operador ou S para sair");
							 oper = sc.next(). charAt(0);
							
						
					}
					else if (oper == '-') {
						System.out.println ("Digite o valor de y");
					     y = sc.nextDouble();
						resultado = resultado-y;
							 System.out.println (resultado);
								System.out.println ("Digite o operador ou S para sair");
							 oper = sc.next(). charAt(0);
							 	
				 }
					else if (oper == '+') {
						System.out.println ("Digite o valor de y");
					     y = sc.nextDouble();
						resultado = resultado+y;
							 System.out.println (resultado);
								System.out.println ("Digite o operador ou S para sair");
							 oper = sc.next(). charAt(0);
							 	
				 }
			} while (oper != 's');
				case '*':
				
				resultado = x*y;
					 System.out.println (resultado);
						System.out.println ("Digite o operador ou S para sair");
					 oper = sc.next(). charAt(0);
					do { if (oper=='-') {
						System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado-y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
						}
					 else if (oper=='*') {
						 System.out.println ("Digite o valor de y");
					     y = sc.nextDouble();
						resultado = resultado*y;
							 System.out.println (resultado);
								System.out.println ("Digite o operador ou S para sair");
							 oper = sc.next(). charAt(0);
							
						
					}
					else if (oper == '/') {
						System.out.println ("Digite o valor de y");
					     y = sc.nextDouble();
						resultado = resultado/y;
							 System.out.println (resultado);
								System.out.println ("Digite o operador ou S para sair");
							 oper = sc.next(). charAt(0);
							
						
					}
					else if (oper == '-') {
						System.out.println ("Digite o valor de y");
					     y = sc.nextDouble();
						resultado = resultado-y;
							 System.out.println (resultado);
								System.out.println ("Digite o operador ou S para sair");
							 oper = sc.next(). charAt(0);
							 	
				 }
					else if (oper == '+') {
						System.out.println ("Digite o valor de y");
					     y = sc.nextDouble();
						resultado = resultado+y;
							 System.out.println (resultado);
								System.out.println ("Digite o operador ou S para sair");
							 oper = sc.next(). charAt(0);
							 	
				 }
			} while (oper != 's');
				case '/':
					
					resultado = x/y;
						 System.out.println (resultado);
							System.out.println ("Digite o operador ou S para sair");
						 oper = sc.next(). charAt(0);
						do { if (oper=='-') {
							System.out.println ("Digite o valor de y");
							     y = sc.nextDouble();
								resultado = resultado-y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
							}
						 else if (oper=='*') {
							 System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado*y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								
							
						}
						else if (oper == '/') {
							System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado/y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								
							
						}
						else if (oper == '-') {
							System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado-y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								 	
					 }
						else if (oper == '+') {
							System.out.println ("Digite o valor de y");
						     y = sc.nextDouble();
							resultado = resultado+y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								 	
					 }
				} while (oper != 's');
		
				
		 }
			
						
			 
			
			
			
		} while (oper != 's');
		System.out.println (resultado);
	}
	

}
