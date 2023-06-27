package unit_01;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Identidade identidade = new Identidade();
        identidade.cadastrar("Aleatorio",1,1,1995,"masculino");
        System.out.println(identidade.getInformacao().getInfo());
        CarteiraDeMotorista carteiraDeMotorista = new CarteiraDeMotorista(identidade);
        System.out.println(carteiraDeMotorista.getIdCNH());
    }
}
