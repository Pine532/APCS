
public class Complex {
	private double a;
	private double b;

	public Complex(double num1, double num2) {
		a = num1;
		b = num2;
	}

	public Complex(double num1) {
		a = num1;
		b = 0;
	}

	public Complex() {
		a = 0;
		b = 0;
	}

	public String toString() {
		return a + " + " + b + "i";
	}

	public double abs() {
		double num = a * a + b * b;
		num = Math.sqrt(num);
		return num;
	}
	public Complex add(Complex other){
		Complex foo = new Complex(a + other.a, b + other.b);
		return foo;
			
	}


	public Complex add(double other){ 
		Complex bar = new Complex(a + other, b);
		return bar;
	}
	public Complex multiply(Complex other) {
		Complex aaa = new Complex (other.a*a-b*other.b, a*other.b+b*other.a);
		return aaa;
	
	}
	public Complex multiply(double z) {
		Complex bbb = new Complex (a * z, b * z);
		return bbb;
		
	}
	}
	

