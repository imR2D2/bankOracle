
public class PruebaMetodos {
	public static void main(String[] args) {
		Account accountArturo = new Account();
		accountArturo.depositar(50);
		System.out.println(accountArturo.getSaldo());
		
		Account accountRicardo = new Account();
		accountRicardo.depositar(100);
		System.out.println(accountRicardo.getSaldo());
		
		accountRicardo.transferir(50, accountArturo);
		System.out.println(accountRicardo.getSaldo());
		System.out.println(accountArturo.getSaldo());

		accountRicardo.retirar(20);
		System.out.println(accountRicardo.getSaldo());
		
	}
}
