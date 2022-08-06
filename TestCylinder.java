package Part_2;
	

	public class Prectical_1 {
	    double r;
	    double h;
	

	    Prectical_1() {      //default constructor..
	        r = 1;
	        h = 1;
	    }
	    Prectical_1(double re) {    //perameterized constructor with 1 argument..
	        r = re;
	        h = 1;
	    }
	    Prectical_1(double red, double hi) {   //perameterized constructor with 2 argument..
	        r = red;
	        h = hi;
	    }
	    double getArea() {
	        return (2 * (3.14) * r * h);
	    }
	}
	class TestCylinder {
	    public static void main(String args[]) {
	        Prectical_1 c1 = new Prectical_1();
	        Prectical_1 c2 = new Prectical_1(2);
	        Prectical_1 c3 = new Prectical_1(2, 2);
	

	        System.out.println("Area of obj 1 is :" + c1.getArea());
	        System.out.println("Area of obj 2 is :" + c2.getArea());
	        System.out.println("Area of obj 3 is :" + c3.getArea());
	
	    }
	}

