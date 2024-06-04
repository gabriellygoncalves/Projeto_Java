package Conexão;

import java.sql.ResultSet;
import Encapsulaa.Despesas;//import do despesasPessoais
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Conexao_sql {
    
    Connection conec;//variável Connection conec
    PreparedStatement conectar;//variável Statement conectar
    ResultSet cone;//variável ResultSet cone
    ArrayList<Despesas> lista = new ArrayList<>();
           
    
    
    public void despesasPessoais (Despesas objConexaosql){//recebimento de obj da classe Despesas
        //
        String sql = "insert into despesas_mensais (nome_user, mes_user, luz_despesa, agua_despesa, aluguel_prestaçao,supermercado_despesa,outras_despesas) values (?,?,?,?,?,?,?)";
        
        conec = new Conexao_mys().conectaSql();//conec acessa o método de conexão e método que conecta a base de dados
        
        //try e catch caso a tabela do banco e a string não estiver certa, apresentara um erro
        
        try {
            
            conectar = conec.prepareStatement(sql);//metodo de conexão com a string 
            conectar.setString(1, objConexaosql.getNome_user());
            conectar.setString(2, objConexaosql.getMes_user());
            conectar.setDouble(3, objConexaosql.getLuz_despesa());
            conectar.setDouble(4, objConexaosql.getAgua_despesa());
            conectar.setDouble(5, objConexaosql.getAluguel_prestaçao());
            conectar.setDouble(6, objConexaosql.getSupermercado_despesa());
            conectar.setDouble(7, objConexaosql.getOutras_despesas());
            
            conectar.execute();
            conectar.close();
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Conexao_sqlDespesas" + erro);
            
        }
    
    
    }
    
    public void despesasMensais (Despesas objConexaosql){
        String sql = "insert into despesas_pessoal (nome_usuario, mes_despesa, nome_despesa, valor_despesa) values(?,?,?,?)";
        
        conec = new Conexao_mys().conectaSql();
        
        try {
            
            conectar = conec.prepareStatement(sql);
            
            conectar.setString(1, objConexaosql.getNome_usuario());
            conectar.setString(2, objConexaosql.getMes_despesa());
            conectar.setString(3, objConexaosql.getNome_despesa());
            conectar.setDouble(4, objConexaosql.getValor_despesa());
            
            conectar.execute();
            conectar.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "conexão sql" + erro);
        }
    }
    
    public ArrayList<Despesas> tbMensal(){
        
        String sql = "select * from despesas_mensais";
        conec = new Conexao_mys().conectaSql();
        
        try {
            conectar = conec.prepareStatement(sql);
            cone = conectar.executeQuery();
            
            while(cone.next()){
                Despesas objdespesas = new Despesas();
                objdespesas.setId_user(cone.getInt("id_user"));
                objdespesas.setNome_user(cone.getString("nome_user"));
                objdespesas.setMes_user(cone.getString("mes_user"));
                objdespesas.setAgua_despesa(cone.getDouble("agua_despesa"));
                objdespesas.setLuz_despesa(cone.getDouble("luz_despesa"));
                objdespesas.setAluguel_prestaçao(cone.getDouble("aluguel_prestaçao"));
                objdespesas.setSupermercado_despesa(cone.getDouble("supermercado_despesa"));
                objdespesas.setOutras_despesas(cone.getDouble("outras_despesas"));
                
                
                lista.add(objdespesas);
                
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Conexao_sql pesquisar: " + erro);
        }
        return lista;
    }
    
    public ArrayList<Despesas> tbPessoal(){
        
        String sql = "select * from despesas_pessoal";
        conec = new Conexao_mys().conectaSql();
        
        try {
            conectar = conec.prepareStatement(sql);
            cone = conectar.executeQuery();
            
            while(cone.next()){
                Despesas objdespesas = new Despesas();
                objdespesas.setId_despesas(cone.getInt("id_despesa"));
                objdespesas.setNome_usuario(cone.getString("nome_usuario"));
                objdespesas.setMes_despesa(cone.getString("mes_despesa"));
                objdespesas.setNome_despesa(cone.getString("nome_despesa"));
                objdespesas.setValor_despesa(cone.getDouble("valor_despesa"));
                
                
                lista.add(objdespesas);
                
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"Conexao_sql pesquisar: " + erro);
        }
        return lista;
    }
     
}
