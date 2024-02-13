package oo.composicao;

import java.util.ArrayList;

public class Aluno {
   final String nome;
   final ArrayList<Curso> cursos = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    void adcionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    Curso obterCursoPornome(String nome){
        for (Curso curso: this.cursos){
            if (curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return nome;
    }
}
