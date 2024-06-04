package Encapsulaa;


public class Despesas {
    //métodos de encapsulamento utilizando get e set com os atributos privados

    private String nome_usuario, mes_despesa, nome_user, mes_user, nome_despesa;       
    private double luz_despesa, agua_despesa, aluguel_prestaçao, supermercado_despesa, valor_despesa, outras_despesas;
    private int id_despesas, id_user;

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    /**
     * @return the mes_despesa
     */
    public String getMes_despesa() {
        return mes_despesa;
    }

    /**
     * @param mes_despesa the mes_despesa to set
     */
    public void setMes_despesa(String mes_despesa) {
        this.mes_despesa = mes_despesa;
    }

    /**
     * @return the nome_user
     */
    public String getNome_user() {
        return nome_user;
    }

    /**
     * @param nome_user the nome_user to set
     */
    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    /**
     * @return the mes_user
     */
    public String getMes_user() {
        return mes_user;
    }

    /**
     * @param mes_user the mes_user to set
     */
    public void setMes_user(String mes_user) {
        this.mes_user = mes_user;
    }

    /**
     * @return the luz_despesa
     */
    public double getLuz_despesa() {
        return luz_despesa;
    }

    /**
     * @param luz_despesa the luz_despesa to set
     */
    public void setLuz_despesa(double luz_despesa) {
        this.luz_despesa = luz_despesa;
    }

    /**
     * @return the agua_despesa
     */
    public double getAgua_despesa() {
        return agua_despesa;
    }

    /**
     * @param agua_despesa the agua_despesa to set
     */
    public void setAgua_despesa(double agua_despesa) {
        this.agua_despesa = agua_despesa;
    }

    /**
     * @return the aluguel_prestaçao
     */
    public double getAluguel_prestaçao() {
        return aluguel_prestaçao;
    }

    /**
     * @param aluguel_prestaçao the aluguel_prestaçao to set
     */
    public void setAluguel_prestaçao(double aluguel_prestaçao) {
        this.aluguel_prestaçao = aluguel_prestaçao;
    }

    /**
     * @return the supermercado_despesa
     */
    public double getSupermercado_despesa() {
        return supermercado_despesa;
    }

    /**
     * @param supermercado_despesa the supermercado_despesa to set
     */
    public void setSupermercado_despesa(double supermercado_despesa) {
        this.supermercado_despesa = supermercado_despesa;
    }

    /**
     * @return the id_despesas
     */
    public int getId_despesas() {
        return id_despesas;
    }

    /**
     * @param id_despesas the id_despesas to set
     */
    public void setId_despesas(int id_despesas) {
        this.id_despesas = id_despesas;
    }

    /**
     * @return the nome_despesa
     */
    public String getNome_despesa() {
        return nome_despesa;
    }

    /**
     * @param nome_despesa the nome_despesa to set
     */
    public void setNome_despesa(String nome_despesa) {
        this.nome_despesa = nome_despesa;
    }

    /**
     * @return the valor_despesa
     */
    public double getValor_despesa() {
        return valor_despesa;
    }

    /**
     * @param valor_despesa the valor_despesa to set
     */
    public void setValor_despesa(double valor_despesa) {
        this.valor_despesa = valor_despesa;
    }

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the outas_despesas
     */
    public double getOutras_despesas() {
        return outras_despesas;
    }

    /**
     * @param outas_despesas the outas_despesas to set
     */
    public void setOutras_despesas(double outas_despesas) {
        this.outras_despesas = outas_despesas;
    }
    
}
