package unit_01;

import java.time.LocalDate;

public abstract class AbsInformacao {
    protected String nome;
    protected LocalDate dataNasc;
    protected char sexo;

    protected AbsInformacao(){
        this.nome = null;
        this.dataNasc = null;
        this.sexo = ' ';
    }
    public AbsInformacao(String _nome,LocalDate _dataNasc, char _sx){
        this.nome = _nome;
        this.dataNasc = _dataNasc;
        this.sexo = _sx;
    }
    protected String getNome(){
        return nome;
    }
    protected LocalDate getDataNasc(){
        return dataNasc;
    }
    protected char getSexo(){
        return sexo;
    }


}
