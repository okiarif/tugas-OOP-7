
public class Main{
	public static void main (String[] args) {
		Operator op = new Operator();
		Calculator cal = new Calculator();
		op.setX(5);
		op.setY(2);				
		System.out.println(cal.tambah(op.getX(),op.getY()));
		System.out.println(cal.kurang(op.getX(),op.getY()));
	}
}