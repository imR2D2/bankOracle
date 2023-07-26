
public class TestAccount2 {
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "12345";
		diego.sexo = "Masculino";
		diego.telefono = "1212128128128";
		
		Account cuentaDeDiego = new Account();
		cuentaDeDiego.saldo = 200;
		
		cuentaDeDiego.titular = diego;
		
		System.out.println(cuentaDeDiego.saldo);
		System.out.println(cuentaDeDiego.titular.nombre);
		
		System.out.println(cuentaDeDiego.titular);
		System.out.println(diego);
	}
}
