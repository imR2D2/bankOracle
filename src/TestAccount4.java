public class TestAccount4 {
    public static void main(String[] args) {
        Account account = new Account();
        account.depositar(500);
        account.retirar(300);
        System.out.println(account.getSaldo());

        account.setAgencia(100);
        System.out.println(account.getAgencia());
    }
}