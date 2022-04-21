
package escola;


public class Escola {

    
    public static void main(String[] args) {
        
        Monitor monitor = new Monitor(12345, "Jorge", "publico");
        
        
        
        
        
        int matricula = 12345;
        String nome = "Jhow";
        double adicional = 60;
        double horas = 5;
        
        
        //Funcionario func = new Funcionario(matricula, nome);  CLASSSE ABSTRATA
        Professor prof = new Professor(matricula, nome, adicional);
        ProfIntegral profinteg = new ProfIntegral(matricula, nome, adicional, horas);
        
        
        /*Professor prof = new Professor();
        
        prof.setNome("Alcinho");
        prof.setMatricula(12345);
        prof.setTitulacao("Doutorado");
        prof.setSalario(5000.0);
        prof.setAdicional(10);*/
        
        /*
        System.out.println("Nome do professor: " + prof.getNome());
        System.out.println("Matricula do professor: " + prof.getMatricula());
        System.out.println("Titulo do professor: " + prof.getTitulacao());
        System.out.println("Salario do professor: " + prof.getSalario());
        System.out.println("Adicional do professor: " + prof.getAdicional());
        */
        
        System.out.println("");
        System.out.println(prof);
        
        
        
    }
    
}
