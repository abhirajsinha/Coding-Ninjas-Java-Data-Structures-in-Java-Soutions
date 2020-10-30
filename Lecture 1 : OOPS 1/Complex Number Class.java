public class ComplexNumbers {
    private int real;
	private int imaginary;
	
	public ComplexNumbers(int real, int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void plus(ComplexNumbers c2) {
		int newReal=this.real + c2.real;
		int newImaginary=this.imaginary+c2.imaginary;
		this.real=newReal;
		this.imaginary=newImaginary;
	}
	
	public void multiply(ComplexNumbers c2) {
		int newReal=(this.real*c2.real)-(this.imaginary*c2.imaginary);
		int newImaginary=this.real*c2.imaginary+this.imaginary*c2.real;
        this.real=newReal;
		this.imaginary=newImaginary;    
	}
	public void print() {
		System.out.println(this.real+" "+"+"+" "+"i"+this.imaginary);
	}

}
