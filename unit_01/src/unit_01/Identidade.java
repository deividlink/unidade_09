package unit_01;

import java.time.LocalDate;

public class Identidade{
    private Informacao informacao;

    public Identidade(){
        this.informacao = null;
    }
    public void cadastrar(String nome,int dia,int mes,int ano, String sexo){
        LocalDate dataNasc = LocalDate.of(ano,mes,dia);

        if(!sexo.isEmpty() && sexo.equalsIgnoreCase("masculino")){
            this.informacao = new Informacao(nome,dataNasc,'M');
            System.out.println("Info: Identidade Cadastrada");
        }
        else if(!sexo.isEmpty() && sexo.equalsIgnoreCase("feminino")){
            this.informacao = new Informacao(nome,dataNasc,'F');
            System.out.println("Info: Identidade Cadastrada");
        }else {
            System.out.println("Info: Nao Foi Possivel Cadastrar!");
        }
    }

    public Informacao getInformacao(){
        return informacao;
    }


}
