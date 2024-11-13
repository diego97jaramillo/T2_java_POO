import java.util.ArrayList;


public class Ejercicio5 {}


class CuentaBancaria {
    long numeroCuenta;
    String titular;
    long saldo;
    ArrayList<Transaction> historial = new ArrayList<>() ;

    public CuentaBancaria(long numeroCuenta, String titular, long saldo) {
    this.numeroCuenta = numeroCuenta;
    this.titular = titular;
    this.saldo = saldo;
    }

    public long withdraw(long monto) {
        this.historial.add(new Transaction(monto, "retiro"));
        return this.saldo -= monto;
    }

    public long deposit(long monto) {
        this.historial.add(new Transaction(monto, "deposito"));
        return this.saldo += monto;
    }

    public void mostrarHistorial() {
        for (Transaction transaction : historial) {
            System.out.println(transaction.toString());;
        }
    };

    public static void main(String[] args) {
        CuentaBancaria ctaAhorros = new CuentaBancaria(432984821, "pepe el Pollo", 1000000 );
        ctaAhorros.deposit(15000);
        ctaAhorros.deposit(25000);
        ctaAhorros.withdraw(20000);

        ctaAhorros.mostrarHistorial();

        System.out.println(ctaAhorros.saldo);

    }
}

class Transaction {
    String tipo;
    long monto;

    public Transaction(long monto, String tipo) {
        this.tipo = tipo;
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Tipo de transacción: " + this.tipo + ", monto: " + this.monto;
    }
}
