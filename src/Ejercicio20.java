import java.util.ArrayList;
import java.util.List;

class CuentaBancaria20 {
    private String numeroCuenta;
    private double saldo;
    private List<String> historial;

    public CuentaBancaria20(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean transferir(CuentaBancaria20 cuentaDestino, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            cuentaDestino.saldo += monto;
            registrarTransaccion("Transferencia a " + cuentaDestino.getNumeroCuenta() + ": $" + monto);
            cuentaDestino.registrarTransaccion("Transferencia de " + numeroCuenta + ": $" + monto);
            return true;
        } else {
            System.out.println("Transferencia fallida: saldo insuficiente o monto no válido.");
            return false;
        }
    }

    public List<String> getHistorial() {
        return historial;
    }

    private void registrarTransaccion(String detalle) {
        historial.add(detalle);
    }
}

class Banco {
    private List<CuentaBancaria20> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria20 cuenta) {
        cuentas.add(cuenta);
    }

    public CuentaBancaria20 buscarCuenta(String numeroCuenta) {
        for (CuentaBancaria20 cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }

    public void mostrarHistorial(String numeroCuenta) {
        CuentaBancaria20 cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            System.out.println("Historial de transacciones de la cuenta " + numeroCuenta + ":");
            for (String transaccion : cuenta.getHistorial()) {
                System.out.println(transaccion);
            }
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }
}

public class Ejercicio20 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        CuentaBancaria20 cuenta1 = new CuentaBancaria20("001", 5000);
        CuentaBancaria20 cuenta2 = new CuentaBancaria20("002", 3000);

        banco.agregarCuenta(cuenta1);
        banco.agregarCuenta(cuenta2);

        cuenta1.transferir(cuenta2, 1500);

        banco.mostrarHistorial("001");
        banco.mostrarHistorial("002");
    }
}

