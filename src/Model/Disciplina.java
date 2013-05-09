/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author soaressf
 */
public class Disciplina {
    
    private String sigla;
    private String designacao;
    private int horasteoricas;  
    private int horaspraticas;
    //TODO
    // adicionar lista de professores
    
    public Disciplina(String sigla, String designacao, int horasteoricas, int horaspraticas) {
        setDisciplina(sigla, designacao, horasteoricas, horaspraticas);
    }
    
    protected Disciplina(){
        this("sem sigla", "sem designação", 0, 0);
    }

    public Disciplina(Disciplina disciplina) {
        sigla = disciplina.sigla;
        designacao = disciplina.designacao;
        horasteoricas = disciplina.horasteoricas;
        horaspraticas = disciplina.horasteoricas;
    }
   
    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the designacao
     */
    public String getDesignacao() {
        return designacao;
    }

    /**
     * @param designacao the designacao to set
     */
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    /**
     * @return the horasteoricas
     */
    public int getHorasteoricas() {
        return horasteoricas;
    }

    /**
     * @param horasteoricas the horasteoricas to set
     */
    public void setHorasteoricas(int horasteoricas) {
        this.horasteoricas = horasteoricas;
    }

    /**
     * @return the horaspraticas
     */
    public int getHoraspraticas() {
        return horaspraticas;
    }

    /**
     * @param horaspraticas the horaspraticas to set
     */
    public void setHoraspraticas(int horaspraticas) {
        this.horaspraticas = horaspraticas;
    }
    
    public void setDisciplina(String sigla, String designacao, int horasteoricas, int horaspraticas) {
        setSigla(sigla);
        setDesignacao(designacao);
        setHorasteoricas(horasteoricas);
        setHoraspraticas(horaspraticas);
    }
    
    @Override
    public String toString() {
        return null;
    }
    
    @Override
    public Disciplina clone() {
        return new Disciplina(this);
    }
}