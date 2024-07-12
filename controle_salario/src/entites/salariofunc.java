package entites;

public class salariofunc {
	public String name;
	public double salario;
	public double imposto;
	
	
	public double salariotaxado() {
		return salario - imposto;
	}
	
	public void aumentosalario(double aumento) {
		salario += salario * (aumento/100);
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f", salariotaxado()); 
	}
	
}
