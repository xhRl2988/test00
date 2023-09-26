package test000;

class P {
	P(){System.out.println("A");}
	P(int a){System.out.println("B");}
}

class C extends P {
	C() {System.out.println("C");}
	C(int a) {System.out.println("D");}
	C(int a, int b) {
			super(a);
			System.out.println("E");
		}
	}

public class After2_Exec201 {
	public static void main(String[] args) {
		P p1=new C();
		P p2=new C(1);
		P p3=new C(1,2);
		
	}
}

