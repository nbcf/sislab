
package sislab.proteomica.engine;


//import br.com.bueno.vo.ContaCorrente;
//import br.com.bueno.vo.Empresa;
//import br.com.bueno.vo.Usuario;
import java.util.Hashtable;
import sislab.proteomica.Segurança.PcsCadastrados;
import sislab.proteomica.beans.CadLaboratorio;
import sislab.proteomica.beans.CadLocalizacao;
import sislab.proteomica.beans.CadUsuario;
import sislab.proteomica.beans.ConexaoORM;




public class Container {

private static final Hashtable container = new Hashtable();
private static CadLaboratorio cadLaboratorio;
private static CadLocalizacao cadLocalizacao;
private static CadUsuario cadUsuario;
private static PcsCadastrados pcsCadastrados;

private static ConexaoORM conexaoORm;


    public static CadLaboratorio getCadLaboratorio() {
        return cadLaboratorio;
    }

    public static void setCadLaboratorio(CadLaboratorio cadLaboratorio) {
       Container.cadLaboratorio = cadLaboratorio;
    }

    public static Hashtable getContainer(){
        return container;
    }

    public static void setContainer(CadUsuario cadUsuario){
        container.put("cadUsuario", cadUsuario);
   }

    public static CadUsuario getCadUsuario() {
        return cadUsuario;
    }

    public static void setCadUsuario(CadUsuario cadUsuario) {
        Container.cadUsuario = cadUsuario;
    }


    public static CadLocalizacao getCadLocalizacao() {
        return cadLocalizacao;
    }

    public static void setCadLocalizacao(CadLocalizacao cadLocalizacao) {
        Container.cadLocalizacao = cadLocalizacao;
    }
    
    public static PcsCadastrados getPcsCadastrados() {
    return pcsCadastrados;
    }

    public static void setPcsCadastrados(PcsCadastrados pcsCadastrados) {
    Container.pcsCadastrados = pcsCadastrados;
    }  

 

    /**
     * @return the conexaoORm
     */
    public static ConexaoORM getConexaoORm() {
        return conexaoORm;
    }

    /**
     * @param aConexaoORm the conexaoORm to set
     */
    public static void setConexaoORm(ConexaoORM aConexaoORm) {
        Container.conexaoORm = aConexaoORm;
    }
  
}