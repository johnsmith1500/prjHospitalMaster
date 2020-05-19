package model;

import view.CadHospital;
import view.CadProntoSocorro;
import view.EditarHospital;
import view.TelaPrincipal;

/**
 *
 * @author Aluno01
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Funcionario a = new Funcionario();
        a.setFuncionario("Mario Rodrigues", "55.302.233-6", "57.918.023-34", 62, 1343592, "3503fjsl43");
        a.setValorHora(20.0);
        System.out.println("Nome: "+a.getNome());
        System.out.println("Idade: "+a.getIdade());
        System.out.println("RG: "+a.getRg());
        System.out.println("CPF: "+a.getCpf());
        System.out.println("Salário: "+a.CalcSalario());
        System.out.println("Bônus: "+a.gerarBonus());
        System.out.println("Matrícula: "+a.getMatricula());
        System.out.println("Senha: "+a.getSenha());
        System.out.println("--------------------");
        System.out.println(" ");

        
        Paciente b = new Paciente(231287, "Carlos Eduardo", "92.243.082-2", "750.274.550-42", 37, "4795ljfs4535");
        System.out.println("Código: "+b.getCodPaciente());
        System.out.println("Nome: "+b.getNome());
        System.out.println("RG: "+b.getRg());
        System.out.println("CPF: "+b.getCpf());
        System.out.println("Idade: "+b.getIdade());
        System.out.println("Senha: "+b.getSenha());
        System.out.println("--------------------");
        System.out.println(" ");
        
        Enfermeiro c = new Enfermeiro();
        c.setValorHora(18.5);
        c.setFuncionario("CRM-9358", "Jeferson Almeida", "39.924.124-2", "234.466.124-31", 29, 29364, "456dsd65476");
        System.out.println("COREN: "+c.getCOREM());
        System.out.println("Nome: "+c.getNome());
        System.out.println("RG: "+c.getRg());
        System.out.println("CPF: "+c.getCpf());
        System.out.println("Idade: "+c.getIdade());
        System.out.println("Salário: "+c.CalcSalario(20));
        System.out.println("Bônus: "+c.gerarBonus());
        System.out.println("Matrícula: "+c.getMatricula());
        System.out.println("Senha: "+c.getSenha());
        System.out.println("--------------------");
        System.out.println(" ");
        
        Medico d = new Medico();
        d.setMedico("CRM-4234", "Ginecologista");
        d.setFuncionario("Mariana Soares", "46.354.535-3", "756.545.526-94", 43, 256452, "34777sgsh546");
        d.setValorHora(30.0);
        System.out.println("CRM: "+d.getCRM());
        System.out.println("Nome: "+d.getNome());
        System.out.println("Especialidade: "+d.getEspecialidade());
        System.out.println("RG: "+d.getRg());
        System.out.println("CPF: "+d.getCpf());
        System.out.println("Idade: "+d.getIdade());
        System.out.println("Salário"+d.CalcSalario());
        System.out.println("Bônus: "+d.gerarBonus());
        System.out.println("Matrícula: "+d.getMatricula());
        System.out.println("Senha: "+d.getSenha());
        
        Medico d1 = new Medico();
        d1.setMedico("CRM-6344", "Clínico Geral");
        d1.setFuncionario("Ana Paula", "56.284.365-8", "739.953.224-34", 34, 634646, "657657sesfg6456");
        d1.setValorHora(35.0);
        System.out.println("--------------------");
        System.out.println(" ");
        
        Hospital h = new Hospital("HospItal Municipal de Peruíbe");
        h.setIdHospital(234);
        h.setEndereco("Avenida Pe. Anchiete, 5624 - Centro");
        System.out.println("Código: "+h.getIdHospital());
        System.out.println("Nome: "+h.getNome());
        System.out.println("Endereço: "+h.getEndereco());
        
        h.addFuncionario(d1);
        h.addFuncionario(a);
        h.addFuncionario(c);
        System.out.println("--------------------");
        System.out.println(" ");
        System.out.println("Funcionários:");
        h.listarTodosFuncionarios();
        System.out.println("--------------------");
        System.out.println(" ");
        System.out.println("Médicos:");
        h.listarTodosMedicos();
        System.out.println("--------------------");
        System.out.println(" ");
        System.out.println("Enfermeiros:");
        h.listarTodosEnfermeiros();
        System.out.println("--------------------");
        System.out.println(" ");
        
        ProntoSocorro f = new ProntoSocorro(h, 53, "Avenida Pe. Manoel da Nobrega, 2344 - Caraminguava");
        System.out.println(f.getEndereco());
        System.out.println(f.getIdFilial());
        System.out.println(f.getMatriz().getNome());
*/
        //TelaPrincipal tp = new TelaPrincipal();
        //tp.show();
        
        EditarHospital ed = new EditarHospital();
        ed.show();
    }

}
