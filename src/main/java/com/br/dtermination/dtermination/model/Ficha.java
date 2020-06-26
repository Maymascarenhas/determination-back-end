package com.br.dtermination.dtermination.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ficha  {

 public Ficha() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

 @JsonProperty
 @OneToOne
 @JoinColumn(name = "id_usuario")
  private Usuario usuario;

    @JsonProperty
    private String nome;
    @JsonProperty
    private int forca;
    @JsonProperty
    private int habilidade;
    @JsonProperty
    private int resistencia;
    @JsonProperty
    private int armadura;
    @JsonProperty
    private int poderFogo;
    @JsonProperty
    private int pontosVida;
    @JsonProperty
    private int pontoMagia;
    @JsonProperty
    private int pontoExperiencia;
    @JsonProperty
    private String historia;
    @JsonProperty
    private String vantagens;
    @JsonProperty
    private String desvantagens;
    @JsonProperty
    private String tipoDano;
    @JsonProperty
    private String magiasConhecidas;
    @JsonProperty
    private String dinheiroItens;
    @JsonProperty
    private int pontosTotais;


    public int getForca(){
        return forca;
    }

     public void setForca( int forca){
         this.forca = forca;
        }

      public int getHabilidade(){
        return habilidade;
      }

      public void setHabilidade(int habilidade){
        this.habilidade = habilidade;
      }

      public int getResistencia(){
        return resistencia;
      }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getPoderFogo() {
        return poderFogo;
    }

    public void setPoderFogo(int poderFogo) {
        this.poderFogo = poderFogo;
    }

    public int getPontoMagia() {
        return pontoMagia;
    }

    public void setPontoMagia(int pontoMagia) {
        this.pontoMagia = pontoMagia;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public int getPontoExperiencia() {
        return pontoExperiencia;
    }

    public void setPontoExperiencia(int pontoExperiencia) {
        this.pontoExperiencia = pontoExperiencia;
    }

    String getVantagens(){
        return this.vantagens;
    }
    public void setVantagens(String vantagens) {
        this.vantagens = vantagens;
    }
    String getDesvantagens(){
        return this.desvantagens;
    }
    public void setDesvantagens(String desvantagens) {
        this.desvantagens = desvantagens;
    }
    String getTipoDano(){
        return this.tipoDano;
    }
    public void setTipoDano(String tipoDano) {
        this.tipoDano = tipoDano;
    }
    String getMagiasConhecidas(){
        return this.magiasConhecidas;
    }
    public void setMagiasConhecidas(String magiasConhecidas) {
        this.magiasConhecidas = magiasConhecidas;
    }
    String getDinheiroItens(){
        return this.dinheiroItens;
    }
    public void setDinheiroItens(String dinheiroItens){
        this.dinheiroItens = dinheiroItens;
    }

    public Ficha(int forca, int habilidade, int resistencia, int armadura, int poderFogo, int pontosVida, int pontoMagia, int pontoExperiencia, String historia,String vantagens,String desvantagens,String tipoDano,String magiasConhecidas,String dinheiroItens) {
        this.forca = forca;
        this.habilidade = habilidade;
        this.resistencia = resistencia;
        this.armadura = armadura;
        this.poderFogo = poderFogo;
        this.pontosVida = pontosVida;
        this.pontoMagia = pontoMagia;
        this.pontoExperiencia = pontoExperiencia;
        this.historia = historia;
        this.vantagens = vantagens;
        this.desvantagens = desvantagens;
        this.tipoDano = tipoDano;
        this.magiasConhecidas = magiasConhecidas;
        this.dinheiroItens = dinheiroItens;
    }
}



