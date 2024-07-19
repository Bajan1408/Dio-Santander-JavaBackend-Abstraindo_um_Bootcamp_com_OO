import java.time.LocalDate;


import com.br.dio.desafio.dominio.Conteudo;
import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Mentoria;


public class Main {
    public static void main(String[] args) throws Exception {
        Conteudo curso = new Curso("javascript", "javascript orientaçao a objetos", 35);
        Conteudo mentoria = new Mentoria("Mentoria java", "Mentoria de java", LocalDate.of(2024, 7, 24));
        
        System.out.println(curso);
        System.out.println(mentoria);
    }
}
