import java.util.Objects;

public class Aluno {
    static int totalAlunos;

    private String matricula;
    private String nome;
    private String curso;

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;

    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        else if (o == null) {
            return false;
        }

        Aluno other = (Aluno) o;
        return Objects.equals(matricula, other.matricula);

    }



    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    private void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString(){
        return "Nome: "
                + nome
                + "Curso: "
                + curso
                + "Matricula: "
                + matricula;
    }

}
