package principal;
//herança para diferença. aluno tem tudo que pessoa tem e mais coisa
public class Aluno extends Pessoa { //public final class Aluno extends Pessoa se colocar o final. essa classe nao gera herança
    private int matricula;
    private String curso;
    
    public void  pagarMensalidade(){//public final void - isso indica que esse metodo nao pode ter override
        System.out.println("Pagando mensalidade de aluno "+this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
