public class TestAccount {
	public static void main(String[] args) {
		Account primeraCuenta = new Account();
		primeraCuenta.saldo = 100;
		
		Account segundaCuenta = primeraCuenta;
		segundaCuenta.saldo = 200;
		
		Account terceraCuenta = new Account();
		terceraCuenta.saldo = 400;
		
		System.out.println(segundaCuenta);
		System.out.println(primeraCuenta);
		System.out.println(terceraCuenta);
		
	}
}
