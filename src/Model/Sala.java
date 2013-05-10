/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author soaressf
 */
public class Sala {
    
    private String codigo;
    private TipoSala tipo;
    private int capacidade;
    
    public Sala(String codigo, TipoSala tipo, int capacidade) {
        setSala(codigo, tipo, 0);
    }
  
    public Sala(String codigo, TipoSala tipo) {
        this(codigo, tipo, 0);
    }
    
    private Sala(){
        this("", TipoSala.SEMTIPO, 0);
    }

    public Sala(Sala sala) {
        codigo = sala.codigo;
        tipo = sala.tipo;
        capacidade = sala.capacidade;        
    }    

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the tipo
     */
    public TipoSala getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoSala tipo) {
        this.tipo = tipo;        
    }

    /**
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    private void setSala(String codigo, TipoSala tipo, int capacidade) {
        setCodigo(codigo);
        setTipo(tipo);
        setCapacidade(capacidade);
    }
}
