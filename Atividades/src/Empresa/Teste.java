package Empresa;

public class Teste {
    public static void main(String[] args) {

        Assistente assistente = new AssistenteTecnico( "Mario", 3000.0, "001", 200.0);
        Assistente assistente1 = new AssistenteAdministrativo( "Marcelo", 2500.0, "002", true, 200.0);

        assistente1.exibeDados();

    }
}
