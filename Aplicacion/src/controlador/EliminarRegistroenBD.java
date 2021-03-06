package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador que elimina registros en el la base de datos, tipo candidato o
 * asesor.
 *
 * @author - Quality Developers and Software
 * @version - Segundo Sprint
 * @param - controladorBD atributo que recibe el Driver de la base de datos
 * @param - host atributo que recibe el host
 * @param - puerto atributo que recibe el puerto de conexion
 * @param - baseDatos atributo que recive el nombre de la base de datos
 * @param - url atributo que recibe el host puerto y el nombre de3 la base
 * @param - usuario atributo que recibe el usuario de la base
 * @param - contraseña atributo que recibe la contraseña de la base
 * @param - modelo atributo que recibe el modelo de la tabla
 */
public class EliminarRegistroenBD {

    private String controladorBD;
    private String host;
    private String puerto;
    private String baseDatos;
    private String url;
    private String usuario;
    private String contraseña;
    DefaultTableModel modelo = new DefaultTableModel();

    public EliminarRegistroenBD() {
        controladorBD = "org.postgresql.Driver";
        host = "localhost";
        puerto = "5432";
        baseDatos = "base";/*nombre de la base de datos */

        url = "jdbc:postgresql://" + host + ":" + puerto + "/" + baseDatos;
        usuario = "postgres";
        contraseña = "123";
    }

    public void eliminaAsesor(int asesorSeleccionado, String fila) {
        try {
            //modelo.removeRow(asesorSeleccionado);
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(
                    url, usuario, contraseña);
            java.sql.Statement st = conex.createStatement();
            String sql = "DELETE FROM asesores WHERE correo_electronico='"
                    + fila + "'";
            ResultSet result = st.executeQuery(sql);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(
            //          null, "Selecciona un asesor de la lista", "Error",
            //          JOptionPane.WARNING_MESSAGE);
            //          Mensaje en caso que no se haya seleccionado alguna fila.
        }
    }

    public void eliminaCandidato(int asesorSeleccionado, String fila) {
        try {
            //modelo.removeRow(asesorSeleccionado);
            Class.forName("org.postgresql.Driver");
            Connection conex = DriverManager.getConnection(
                    url, usuario, contraseña);
            java.sql.Statement st = conex.createStatement();
            String sql = "DELETE FROM candidatos WHERE correo_electronico='"
                    + fila + "'";
            ResultSet result = st.executeQuery(sql);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null,
            //          "Selecciona un asesor de la lista",
            //          "Error", JOptionPane.WARNING_MESSAGE);
            //Mensaje en caso que no se haya seleccionado alguna fila.
        }
    }
}
