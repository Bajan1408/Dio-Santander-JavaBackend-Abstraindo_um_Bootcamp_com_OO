import java.time.LocalDate;

import com.br.dio.desafio.dominio.Bootcamp;
import com.br.dio.desafio.dominio.Conteudo;
import com.br.dio.desafio.dominio.Curso;
import com.br.dio.desafio.dominio.Dev;
import com.br.dio.desafio.dominio.Mentoria;


public class Main {
    public static void main(String[] args) throws Exception {
        Conteudo curso = new Curso("java basico", "java basico", 35);
        Conteudo mentoria = new Mentoria("Mentoria desafios de código em java", "Mentoria desafios de código em java", LocalDate.of(2024, 7, 24));
        
        Dev devGian = new Dev();
        Dev devCamila = new Dev();
        devGian.setNome("Gian");
        devCamila.setNome("Camila");

       
        
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Bootcamp java developer 2024");
        bootcampJava.setCursosEmentorias(new Curso("Curso Javascript básico", "Introdução à linguagem Javascript", 3));
        bootcampJava.setCursosEmentorias(curso);
        bootcampJava.setCursosEmentorias(mentoria);

        devCamila.inscreverBootcamp(bootcampJava);
        System.out.println("Camila se inscreveu nos seguintes conteúdos: " + devCamila.getCursosInscritos());
        devCamila.progredir();
        System.out.println("Camila concluiu os seguintes conteúdos: " + devCamila.getCursosConcluidos());

        devGian.inscreverBootcamp(bootcampJava);
        System.out.println("Gian se inscreveu nos seguintes conteúdos: " + devGian.getCursosInscritos());
        devGian.progredir();
        System.out.println("Gian concluiu os seguintes conteúdos: " + devGian.getCursosConcluidos());
        System.out.println("Gian se inscreveu nos seguintes conteúdos: " + devGian.getCursosInscritos());
        devGian.progredir();
        devGian.progredir();
        devGian.progredir();

        System.out.println("Exibindo xp dev Gian: " + devGian.calcularTotalXp());
        System.out.println("Exibindo xp dev Camila: " + devCamila.calcularTotalXp());
        
    }
}
