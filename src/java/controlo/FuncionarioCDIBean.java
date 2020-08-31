/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlo;

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

    @PostConstruct
    public void inicializar() {

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
