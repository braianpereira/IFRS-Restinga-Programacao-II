// student class

import java.util.List;
import java.util.ArrayList;

class Aluno
{
    String nome;
    int id ;
    String dept;

    Aluno(String nome, int id, String nivel)
    {
        this.nome = nome;
        this.id = id;
        this.dept = nivel;
    }
}

class Nivel
{
    String nome;
    private List<Aluno> alunos;

    Nivel(String nome, List<Aluno> alunos)
    {
        this.nome = nome;
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos()
    {
        return alunos;
    }
}
class Escola
{
    String nome;
    private List<Nivel> nivels;

    Escola(String nome, List<Nivel> nivels)
    {
        this.nome = nome;
        this.nivels = nivels;
    }

    public int totalAlunosNaEscola()
    {
        int noOfStudents = 0;
        List<Aluno> alunos;
        for(Nivel dept : nivels)
        {
            alunos = dept.getAlunos();
            for(Aluno s : alunos)
            {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }

}

class Main
{
    public static void main (String[] args)
    {
        Aluno s1 = new Aluno("Jose", 1, "Superior");
        Aluno s2 = new Aluno("Ana", 2, "Superior");
        Aluno s3 = new Aluno("Carlos", 1, "Médio");
        Aluno s4 = new Aluno("Ramones", 2, "Médio");

        List <Aluno> alunos_superior = new ArrayList<Aluno>();
        alunos_superior.add(s1);
        alunos_superior.add(s2);

        List <Aluno> alunos_medio = new ArrayList<Aluno>();
        alunos_medio.add(s3);
        alunos_medio.add(s4);

        Nivel superior = new Nivel("Superior", alunos_superior);
        Nivel medio = new Nivel("Médio", alunos_medio);

        List <Nivel> nivels = new ArrayList<Nivel>();
        nivels.add(superior);
        nivels.add(medio);

        Escola escola = new Escola("IFRS", nivels);

        System.out.print("Existe um total de : ");
        System.out.print(escola.totalAlunosNaEscola());
        System.out.print(" na escola");
    }
}