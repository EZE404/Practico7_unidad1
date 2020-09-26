package DirectorioTel;


import java.util.*;

public class DirectorioTel {

    private Map<String, Cliente> clientes = new HashMap<>();

    public void agregarCliente(String tel, Cliente cliente) {
        clientes.put(tel, cliente);
    }

    public Cliente buscarCliente(String telefono) {
        return clientes.get(telefono);
    }

    public ArrayList<String> buscarTelefono(String apellido) {
        ArrayList<String> salida = new ArrayList<>();
        for (Map.Entry<String, Cliente> entrada : clientes.entrySet()) {
            if (entrada.getValue().getApellido().compareTo(apellido) == 0) {
                salida.add(entrada.getKey());
            }
        }
        return salida;
    }

    public ArrayList<Cliente> buscarClientes(String ciudad) {
        ArrayList<Cliente> salida = new ArrayList<>();
        for (Map.Entry<String, Cliente> entrada : clientes.entrySet()) {
            if (entrada.getValue().getCiudad().compareTo(ciudad) == 0) {
                salida.add(entrada.getValue());
            }
        }
        return salida;
    }

    public void borrarCliente(long dni) {
        for (Map.Entry<String, Cliente> entrada: clientes.entrySet()) {
            if (entrada.getValue().getDni()==dni) {
                clientes.remove(entrada.getKey());
            }
        }
    }

    
    public Map<String, Cliente> getClientes() {
        return clientes;
    }
}
