package AtividadesAdd2;

public class CarroCorridaPri {
    public static void main(String[] args) {
        CarroCorrida carroCorrida1 = new CarroCorrida(645,"Vinicin","FanZeiros",
                200,120,false);
        carroCorrida1.setNumeroCarro(12);
        System.out.println("O piloto numero "+carroCorrida1.getNumeroCarro()+", "+carroCorrida1.getPiloto()+" da equipe "+carroCorrida1.getEquipe()+" se aproxima da" +
                " largada!");
        carroCorrida1.ligar();
        carroCorrida1.acelerar(81);
        carroCorrida1.frear(50);
        carroCorrida1.parar();
        carroCorrida1.desligar();
    }
}
