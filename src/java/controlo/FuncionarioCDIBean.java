/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import modelo.Funcionario;

/**
 *
 * @author Celina Sebastião
 */
@Named(value = "funcionarioCDIBean")
@RequestScoped

public class FuncionarioCDIBean {

    /**
     * Creates a new instance of FuncionarioCDIBean
     */
    Funcionario funcionario = new Funcionario();
    Funcionario funcionario1 = new Funcionario("Celina","Sebastião","Informatica",30,150000);
    Funcionario funcionario2 = new Funcionario("Plérido","Paulino","Planeamento",35,150000);
    Funcionario funcionario3 = new Funcionario("Vânia","Sebastião","Manutenção",28,100000);
    
    List <Funcionario> funcionarios = new ArrayList<>();
    
    @PostConstruct
    public void inicializar() {
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    
    
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
   public String guardar(){
    return "resultado";
   } 
   
   

}
