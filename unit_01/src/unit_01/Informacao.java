package unit_01;

import javax.print.attribute.standard.Fidelity;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Informacao extends AbsInformacao{
    private int idade;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");

    public Informacao(String _nome, LocalDate _dateNasc, char _sx){
        super(_nome,_dateNasc,_sx);
        if(LocalDate.now().getMonthValue() < super.getDataNasc().getMonthValue()) {
            this.idade = (LocalDate.now().getYear() - super.getDataNasc().getYear()) - 1;
        }else {
            this.idade = (LocalDate.now().getYear() - super.getDataNasc().getYear());
        }
    }

    public String getInfo(){
        return "Nome: " + super.getNome() + " - Sexo: " + super.getSexo() + " - DataNasc: " + super.getDataNasc().format(formatter) + " - Idade: " + idade ;
    }

    public int getIdade(){
        return idade;
    }

}
