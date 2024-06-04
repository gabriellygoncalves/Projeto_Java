package Conexão;
import java.sql.Connection;//import do método Connection
import java.sql.DriverManager;//import usado no try
import java.sql.SQLException;//import usado no catch

import javax.swing.JOptionPane;//import usado no catch

public class Conexao_mys {
       public Connection conectaSql(){//método Connection
        Connection conec = null;//variável Connection e nome conec,
        //todas as vezes que usar a conec vai tá usando a conexão
        
        //try e catch se não conseguir acesssr o url do banco, vai gerar o erro
        try {
            String url = "jdbc:mysql://localhost:3306/bancodespesas?user=root&password=";
            //url de conexão com o banco
            conec = DriverManager.getConnection(url);//se o url do banco estiver]
            //correta a conexão vai ser bem sucedida 
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"Conexao_mysql" + erro.getMessage());
            //erro apresentado caso não consiga acessar o url
        }
        return conec; //retorno da variável conec
    } 
        
    }
