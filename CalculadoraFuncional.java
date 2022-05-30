package Calculadoraq;
import java.util.*;
import java.util.Random;
public class CalculadoraFuncional {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		double x,y,z;
		double resultado = 0;
		char oper ;
		Random gerador = new Random();
		System.out.println ("Instruções: \nDigite o Sinal dos operadores:\n+ - Soma \n- - Subtração \n* - Multiplicação\n/ - Divisão\n^ - Potencia  (Primeiro Numero base, segundo numero Expoente)\nr - Raiz\ns - Para Sair\nc - apagar histórico  ");
		System.out.println ("Digite o primeiro valor");
		x = sc.nextDouble();		
		System.out.println ("Digite o sinal da operação");
		oper = sc.next(). charAt(0);

		
	
		
		do {
			
			switch (oper) {
			case '+':
				System.out.println ("Digite o segundo valor");
				y = sc.nextDouble();
					resultado = x+y;
						 System.out.println (resultado);
							System.out.println ("Digite o operador ou S para sair");
						 oper = sc.next(). charAt(0);
						 do { if (oper=='-') {
								System.out.println ("Digite o segundo valor");
								     y = sc.nextDouble();
									resultado = resultado-y;
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
								}
							 else if (oper=='*') {
								 System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado*y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
									
								
							}
							else if (oper == '/') {
								System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								// tratamento da divisão por zero
							     if (y==0 ) {
							    	 System.out.println ("Não pode ser divido por 0");
							    	 System.out.println ("Digite o operador");
							    	 oper = sc.next(). charAt(0);
									break;
								 }
							     
								 else
							        resultado = x/y;
							 	System.out.println(resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
					
							}
						
							else if (oper == '+') {
								System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado+y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
							}
									 else if (oper == '^') {
										 System.out.println ("Digite o primeiro valor");
										 x = sc.nextDouble();
										 System.out.println ("Digite o segundo valor");
										 y = sc.nextDouble();
											resultado = Math.pow(x,y);
											 System.out.println (resultado);
												System.out.println ("Digite o operador ou S para sair");
											 oper = sc.next(). charAt(0);
						 }
									 else if (oper == 'r') {
										// tratamento raiz negativa
										 if (resultado<0 ) {
									    	 System.out.println ("Operação invalida");
									    	 System.out.println ("Digite o primeiro numero");
												x = sc.nextDouble();
												resultado = x;
												 System.out.println ("Digite o operador");
												 oper = sc.next(). charAt(0);
											
										 }
										 else {
										 resultado = Math.sqrt(resultado);
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
										 }
						 }
						 
									 
									 else if (oper=='c') {
											
											resultado = 0;
											 System.out.println ("Digite o primeiro numero");
											x = sc.nextDouble();
											resultado = x;
											 System.out.println ("Digite o operador");
											 oper = sc.next(). charAt(0);
										
										}
								
					} while (oper != 's');
							break;
		
						
			case '-':
				System.out.println ("Digite o segundo valor");
				y = sc.nextDouble();
				resultado = x-y;
					 System.out.println (resultado);
						System.out.println ("Digite o operador ou S para sair");
					 oper = sc.next(). charAt(0);
					 do { if (oper=='-') {
							System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado-y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
							}
						 else if (oper=='*') {
							 System.out.println ("Digite o segundo valor");
						     y = sc.nextDouble();
							resultado = resultado*y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								
							
						}
						else if (oper == '/') {
							System.out.println ("Digite o segundo valor");
						     y = sc.nextDouble();
							// tratamento da divisão por zero
						     if (y==0 ) {
						    	 System.out.println ("Não pode ser divido por 0");
						    	 System.out.println ("Digite o operador");
						    	 oper = sc.next(). charAt(0);
								break;
							 }
						     
							 else
						        resultado = x/y;
						 	System.out.println(resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
				
						}
						else if (oper == '+') {
							System.out.println ("Digite o segundo valor");
						     y = sc.nextDouble();
							resultado = resultado+y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
						}
								 else if (oper == '^') {
									 System.out.println ("Digite o primeiro valor");
									 x = sc.nextDouble();
									 System.out.println ("Digite o segundo valor");
									 y = sc.nextDouble();
										resultado = Math.pow(x,y);
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
					 }
								 else if (oper == 'r') {
										// tratamento raiz negativa
									 if (resultado<0 ) {
								    	 System.out.println ("Operação invalida");
								    	 System.out.println ("Digite o primeiro numero");
											x = sc.nextDouble();
											resultado = x;
											 System.out.println ("Digite o operador");
											 oper = sc.next(). charAt(0);
										
									 }
									 else {
									 resultado = Math.sqrt(resultado);
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
									 }
					 }
						 
								 else if (oper=='c') {
										
										resultado = 0;
										 System.out.println ("Digite o primeiro numero");
										x = sc.nextDouble();
										resultado = x;
										 System.out.println ("Digite o operador");
										 oper = sc.next(). charAt(0);
									
									}
								
				} while (oper != 's');
						break;
	
				case '*':
					System.out.println ("Digite o segundo valor");
					y = sc.nextDouble();
				resultado = x*y;
					 System.out.println (resultado);
						System.out.println ("Digite o operador ou S para sair");
					 oper = sc.next(). charAt(0);
					 do { if (oper=='-') {
							System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado-y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
							}
						 else if (oper=='*') {
							 System.out.println ("Digite o segundo valor");
						     y = sc.nextDouble();
							resultado = resultado*y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
								
							
						}
						else if (oper == '/') {
							System.out.println ("Digite o segundo valor");
						     y = sc.nextDouble();
							// tratamento da divisão por zero
						     if (y==0 ) {
						    	 System.out.println ("Não pode ser divido por 0");
						    	 System.out.println ("Digite o operador");
						    	 oper = sc.next(). charAt(0);
								break;
							 }
						     
							 else
						        resultado = x/y;
						 	System.out.println(resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
				
						}
						else if (oper == '+') {
							System.out.println ("Digite o segundo valor");
						     y = sc.nextDouble();
							resultado = resultado+y;
								 System.out.println (resultado);
									System.out.println ("Digite o operador ou S para sair");
								 oper = sc.next(). charAt(0);
						}
								 else if (oper == '^') {
									 System.out.println ("Digite o primeiro valor");
									 x = sc.nextDouble();
									 System.out.println ("Digite o segundo valor");
									 y = sc.nextDouble();
										resultado = Math.pow(x,y);
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
					 }
								 else if (oper == 'r') {
										// tratamento raiz negativa
									 if (resultado<0 ) {
								    	 System.out.println ("Operação invalida");
								    	 System.out.println ("Digite o primeiro numero");
											x = sc.nextDouble();
											resultado = x;
											 System.out.println ("Digite o operador");
											 oper = sc.next(). charAt(0);
										
									 }
									 else {
									 resultado = Math.sqrt(resultado);
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
									 }
					 }
								 else if (oper=='c') {
										
										resultado = 0;
										 System.out.println ("Digite o primeiro numero");
										x = sc.nextDouble();
										resultado = x;
										 System.out.println ("Digite o operador");
										 oper = sc.next(). charAt(0);
									
									}
								
				} while (oper != 's');
						break;
	
				case '/':
					System.out.println ("Digite o segundo valor");
					y = sc.nextDouble();
					  if (y==0 ) {
					    	 System.out.println ("Não pode ser divido por 0");
					    	 System.out.println ("Digite o operador");
					    	 oper = sc.next(). charAt(0);
							break;
						 }
					resultado = x/y;
						 System.out.println (resultado);
							System.out.println ("Digite o operador ou S para sair");
						 oper = sc.next(). charAt(0);
						 do { if (oper=='-') {
								System.out.println ("Digite o segundo valor");
								     y = sc.nextDouble();
									resultado = resultado-y;
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
								}
							 else if (oper=='*') {
								 System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado*y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
									
								
							}
							else if (oper == '/') {
								System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								// tratamento da divisão por zero
							     if (y==0 ) {
							    	 System.out.println ("Não pode ser divido por 0");
							    	 System.out.println ("Digite o operador");
							    	 oper = sc.next(). charAt(0);
									break;
								 }
							     
								 else
							        resultado = x/y;
							 	System.out.println(resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
					
							}
							
								
							
						
							else if (oper == '+') {
								System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado+y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
							}
									 else if (oper == '^') {
										 System.out.println ("Digite o primeiro valor");
										 x = sc.nextDouble();
										 System.out.println ("Digite o segundo valor");
										 y = sc.nextDouble();
											resultado = Math.pow(x,y);
											 System.out.println (resultado);
												System.out.println ("Digite o operador ou S para sair");
											 oper = sc.next(). charAt(0);
						 }
									 else if (oper == 'r') {
											// tratamento raiz negativa
										 if (resultado<0 ) {
									    	 System.out.println ("Operação invalida");
									    	 System.out.println ("Digite o primeiro numero");
												x = sc.nextDouble();
												resultado = x;
												 System.out.println ("Digite o operador");
												 oper = sc.next(). charAt(0);
											
										 }
										 else {
										 resultado = Math.sqrt(resultado);
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
										 }
						 }
							 
									 else if (oper=='c') {
											
											resultado = 0;
											 System.out.println ("Digite o primeiro numero");
											x = sc.nextDouble();
											resultado = x;
											 System.out.println ("Digite o operador");
											 oper = sc.next(). charAt(0);
										
										}
									
					} while (oper != 's');
							break;
		
				case '^':
					System.out.println ("Digite o segundo valor");
					y = sc.nextDouble();
					resultado = Math.pow(x,y);
						 System.out.println (resultado);
							System.out.println ("Digite o operador ou S para sair");
						 oper = sc.next(). charAt(0);
						 do { if (oper=='-') {
								System.out.println ("Digite o segundo valor");
								     y = sc.nextDouble();
									resultado = resultado-y;
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
								}
							 else if (oper=='*') {
								 System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado*y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
									
								
							}
							else if (oper == '/') {
								System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								// tratamento da divisão por zero
							     if (y==0 ) {
							    	 System.out.println ("Não pode ser divido por 0");
							    	 System.out.println ("Digite o operador");
							    	 oper = sc.next(). charAt(0);
									break;
								 }
							     
								 else
							        resultado = x/y;
							 	System.out.println(resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
					
							}
							else if (oper == '+') {
								System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado+y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
							}
									 else if (oper == '^') {
										 System.out.println ("Digite o primeiro valor");
										 x = sc.nextDouble();
										 System.out.println ("Digite o segundo valor");
										 y = sc.nextDouble();
											resultado = Math.pow(x,y);
											 System.out.println (resultado);
												System.out.println ("Digite o operador ou S para sair");
											 oper = sc.next(). charAt(0);
						 }
									 else if (oper == 'r') {
											// tratamento raiz negativa
										 if (resultado<0 ) {
									    	 System.out.println ("Operação invalida");
									    	 System.out.println ("Digite o primeiro numero");
												x = sc.nextDouble();
												resultado = x;
												 System.out.println ("Digite o operador");
												 oper = sc.next(). charAt(0);
											
										 }
										 else {
										 resultado = Math.sqrt(resultado);
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
										 }
						 }
									 else if (oper=='c') {
											
											resultado = 0;
											 System.out.println ("Digite o primeiro numero");
											x = sc.nextDouble();
											resultado = x;
											 System.out.println ("Digite o operador");
											 oper = sc.next(). charAt(0);
										
										}
									
					} while (oper != 's');
							break;
		
	case 'r':

		 if (resultado<0 ||  x<0 ) {
	    	 System.out.println ("Operação invalida");
	    	 System.out.println ("Digite o primeiro valor");
	    	x = sc.nextDouble();
	    	System.out.println ("Digite o sinal da operação");
	    	 oper = sc.next(). charAt(0);
	    	 resultado = Math.sqrt(x);
			break;
		 }
		 else {
		 resultado = Math.sqrt(x);
		 System.out.println (resultado);
			System.out.println ("Digite o operador ou S para sair");
		 oper = sc.next(). charAt(0);
		 }
					resultado = Math.sqrt(x);
						 System.out.println (resultado);
							System.out.println ("Digite o operador ou S para sair");
						 oper = sc.next(). charAt(0);
							do { if (oper=='-') {
								System.out.println ("Digite o segundo valor");
								     y = sc.nextDouble();
									resultado = resultado-y;
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
								}
							 else if (oper=='*') {
								 System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado*y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
									
								
							}
							else if (oper == '/') {
								System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								// tratamento da divisão por zero
							     if (y==0 ) {
							    	 System.out.println ("Não pode ser divido por 0");
							    	 System.out.println ("Digite o operador");
							    	 oper = sc.next(). charAt(0);
									break;
								 }
							     
								 else
							        resultado = x/y;
							 	System.out.println(resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
					
							}
							else if (oper == '+') {
								System.out.println ("Digite o segundo valor");
							     y = sc.nextDouble();
								resultado = resultado+y;
									 System.out.println (resultado);
										System.out.println ("Digite o operador ou S para sair");
									 oper = sc.next(). charAt(0);
							}
									 else if (oper == '^') {
										 System.out.println ("Digite o primeiro valor");
										 x = sc.nextDouble();
										 System.out.println ("Digite o segundo valor");
										 y = sc.nextDouble();
											resultado = Math.pow(x,y);
											 System.out.println (resultado);
												System.out.println ("Digite o operador ou S para sair");
											 oper = sc.next(). charAt(0);
						 }
									 else if (oper == 'r') {
											// tratamento raiz negativa
										 if (resultado<0 ) {
									    	 System.out.println ("Operação invalida");
									    	 System.out.println ("Digite o primeiro numero");
												x = sc.nextDouble();
												resultado = x;
												 System.out.println ("Digite o operador");
												 oper = sc.next(). charAt(0);
											
										 }
										 else {
										 resultado = Math.sqrt(resultado);
										 System.out.println (resultado);
											System.out.println ("Digite o operador ou S para sair");
										 oper = sc.next(). charAt(0);
										 }
						 }
									 else if (oper=='c') {
											
											resultado = 0;
											 System.out.println ("Digite o primeiro numero");
											x = sc.nextDouble();
											resultado = x;
											 System.out.println ("Digite o operador");
											 oper = sc.next(). charAt(0);
										
										}
									
					} while (oper != 's');
							break;

			}
			
		} while (oper != 's');
		System.out.println (resultado);
	}
	

}
	