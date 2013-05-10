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
    private Tempo horasteoricassemanais;  
    private Tempo horaspraticassemanais;
    //TODO
    // adicionar lista de professores
    
    public Disciplina(String sigla, String designacao, Tempo horasteoricas, Tempo horaspraticas) {
        setDisciplina(sigla, designacao, horasteoricas, horaspraticas);
    }
    
    public Disciplina(String sigla, String descricao){
        this(sigla, descricao, new Tempo(), new Tempo());
    }
    
    public Disciplina(){
        this("", "");
    }

    public Disciplina(Disciplina disciplina) {
        sigla = disciplina.sigla;
        designacao = disciplina.designacao;
        horasteoricassemanais = disciplina.horasteoricassemanais;
        horaspraticassemanais = disciplina.horasteoricassemanais;
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
        this.sigla = sigla.isEmpty() ? "sem sigla" : sigla;
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
        this.designacao = designacao.isEmpty() ? "sem designação" : designacao;
    }

    /**
     * @return the horasteoricassemanais
     */
    public Tempo getHorasteoricas() {
        return horasteoricassemanais;
    }

    /**
     * @param horasteoricassemanais the horasteoricassemanais to set
     */
    public void setHorasteoricas(Tempo horasteoricas) {
        this.horasteoricassemanais = horasteoricas;
    }

    /**
     * @return the horaspraticassemanais
     */
    public Tempo getHoraspraticas() {
        return horaspraticassemanais;
    }

    /**
     * @param horaspraticassemanais the horaspraticassemanais to set
     */
    public void setHoraspraticas(Tempo horaspraticas) {
        this.horaspraticassemanais = horaspraticas;
    }
    
    public void setDisciplina(String sigla, String designacao, Tempo horasteoricas, Tempo horaspraticas) {
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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;        
        Disciplina d = (Disciplina) obj;
        return sigla.equalsIgnoreCase(d.sigla) && sigla.equalsIgnoreCase(d.sigla);
    }
}