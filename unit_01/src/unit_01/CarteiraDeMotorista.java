package unit_01;

public class CarteiraDeMotorista {
    int idCNH;
    public CarteiraDeMotorista(){
        this.idCNH = 0;
    }
    public CarteiraDeMotorista(Identidade identidade){
       if(identidade.getInformacao().getIdade() > 18){
           this.idCNH = 12345678;
       }else {
           this.idCNH = 0;
       }
    }

    public String getIdCNH(){
        if(idCNH != 0){
            return "Carteira de Motorista: " + Integer.toString(idCNH);
        }else {
            return "Voce É Menor de Idade Nao Pode Ter Carteira de Motorista";
        }

    }

}
