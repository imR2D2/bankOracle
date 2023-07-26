class Account {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	//Constructor
	private static int contador = 0;

	public Account (int agencia) {
		if(agencia < 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		contador ++;
		System.out.println("Total cuentas: " + contador);
		System.out.println("Aqui se crea una nueva cuenta");
	}
	
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	public boolean retirar(double saldo) {
		if(saldo <= this.saldo) {
			this.saldo -= saldo;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferir(double saldo, Account account) {
		if(saldo <= this.saldo) {
			this.saldo = this.saldo - saldo;
			account.depositar(saldo);
		return true;
		}else {
			return false;
		}
	}

	//GETTER-SALDO Metodo para obtener el saldo privado
	public double getSaldo() {
		return this.saldo;
	}

	//GETTER-AGENCIA	
	public int getAgencia(){
		return this.agencia;
	}

	//SETTER-NUMERO
	public void setNumero(int numero) {
		this.numero = numero;
	}

	//SETTER-TITULAR
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular(){
		return this.titular;
	}

	public static int getContador(){
		return Account.contador;
	}
	
	
}

