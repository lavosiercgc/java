package testes;

public class TesteComThreads {

    public int variavelCompartilhada = 0;

    public static void main(String [] args) {

        new TesteComThreads().executar();

    }

    public void executar() {
        Thread segundoThread = new ThreadQueDecrementaValorDaVariavel(this);
        segundoThread.start();

        while(true) {
            variavelCompartilhada++;
            System.out.println("Vari�vel vale: " + variavelCompartilhada);
            dormir(1500);
        }

    }

    public void dormir(int milissegundos) {
        try {
            // System.out.println(Thread.currentThread().getName() + " ir� dormir por " + milissegundos + " milissegundos.");
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            // N�o precisa fazer nada
        }
    }
}

class ThreadQueDecrementaValorDaVariavel extends Thread {

    private TesteComThreads teste;

    public ThreadQueDecrementaValorDaVariavel(TesteComThreads teste) {
        this.teste = teste;
    }

    @Override
    public void run() {
        while(true) {
            teste.variavelCompartilhada--;
            System.out.println("Vari�vel vale: " + teste.variavelCompartilhada);
            teste.dormir(1000);
        }
    }
}
