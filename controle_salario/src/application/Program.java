package application;
import java.util.Scanner;
import entites.salariofunc;

public class Program {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		salariofunc emp = new salariofunc();
		
		System.out.println("Digite o nome do funcionario: ");
		emp.name = sc.next();
		System.out.println("Digite o valor do salario: ");
		emp.salario = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println("Funcionario: "+ emp);
		
		System.out.println("Digite o valor do aumento: ");
		
		double aumento = sc.nextDouble();
		emp.aumentosalario(aumento);
		System.out.println("Salario atual: "+emp);
		
		sc.close();
	}
}
