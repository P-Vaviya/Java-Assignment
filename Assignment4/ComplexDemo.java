class Complex{
    private double real, imag;

    public Complex(){
        this.real = 0;
        this.imag = 0;
    }

    public Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public Complex add (Complex obj){
        return new Complex(this.real + obj.real, this.imag + obj.imag);
        
    }

    public Complex diff (Complex obj){
        return new Complex(this.real - obj.real, this.imag - obj.imag);
        
    }

    public void setReal(double real){
        this.real = real;
    }

    public void setImag(double imag){
        this.imag = imag;
    }

    public double getReal(double real){
        return this.real;
    }

    public double getImag(double imag){
        return this.imag;
    }

    public String toString(){
        return ("Real part of complex number is : " + this.real + "\nImaginary part of complex number is : " + this.imag);
    }
}

class ComplexDemo{
    public static void main(String[] args){
        Complex c1 = new Complex(2, 4);
        Complex c2 = new Complex(2, 0);
        System.out.println("Complex Number 1 : \n" + c1);
        System.out.println("Complex Number 2 : \n" + c2);

        System.out.println("The addition of both : \n" + c1.add(c2));
        System.out.println("The subtraction of both : \n" + c1.diff(c2));
    }
}