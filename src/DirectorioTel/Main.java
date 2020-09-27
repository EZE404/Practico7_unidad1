package DirectorioTel;

import java.util.Map;

public class Main {

    public static void main(String[] args) {

        DirectorioTel dir = new DirectorioTel();
        
        // AGREGANDO CLIENTES
        dir.agregarCliente("1123917575", new Cliente("Ezequiel", "Albornoz", 36227971,
                "San Luis", "Av. 2 de Abril"));
        dir.agregarCliente("2664202122", new Cliente("Leoncio", "Flandez", 36227991,
                "Merlo", "Av. Mirador"));
        dir.agregarCliente("3658793450", new Cliente("Franco", "Albornoz", 36227921,
                "San Luis", "Av. 2 de Abril"));
        
        
        // BUSCANDO CLIENTE POR TELÉFONO
        System.out.println("Resultado según teléfono: "+dir.buscarCliente("2664202122"));
        
        // BUSCANDO TELÉFONOS POR APELLIDO
        System.out.println("Resultado según apellido: "+dir.buscarTelefono("Albornoz"));
        
        // BUSCANDO CLIENTES POR CIUDAD
        System.out.println("Resultado según ciudad: "+dir.buscarClientes("San Luis"));
        
        // BORRANDO CLIENTE POR DNI
        dir.borrarCliente(36227921);
        
        
        
        // CONSULTANDO DESPUÉS DE HABER BORRADO
        for (Map.Entry<String, Cliente> cliente: dir.getClientes().entrySet()) {
            String tel=cliente.getKey();
            Cliente propietario=cliente.getValue();
            System.out.println("Teléfono: "+tel+", Cliente: "+propietario);
        }
    }

}
