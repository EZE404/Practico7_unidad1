package DirectorioTel;


import java.util.Map;


public class Main {

    public static void main(String[] args) {

        DirectorioTel dir = new DirectorioTel();
        
        // AGREGANDO CLIENTES
        dir.agregarCliente("1123917575", new Cliente("Ezequiel", "Albornoz", 36227971,
                "San Luis", "Av. 2 de Abril"));
        dir.agregarCliente("2664202122", new Cliente("Franco", "Flandez", 36227991,
                "San Luis", "Av. 2 de Abril"));
        dir.agregarCliente("3658793450", new Cliente("Papi", "Albornoz", 36227921,
                "San Luis", "Av. 2 de Abril"));
        
        
        // BUSCANDO CLIENTE POR TELÉFONO
        System.out.println(dir.buscarCliente("2664202122"));
        
        // BUSCANDO TELÉFONO POR APELLIDO
        System.out.println(dir.buscarTelefono("Albornoz"));
        
        // BUSCANDO CLIENTES POR CIUDAD
        System.out.println(dir.buscarClientes("San Luis"));
        
        // BORRANDO CLIENTE POR DNI
        //dir.borrarCliente(36227921);
        
        
        
        
        for (Map.Entry<String, Cliente> cliente: dir.getClientes().entrySet()) {
            String tel=cliente.getKey();
            Cliente propietario=cliente.getValue();
            System.out.println("Teléfono: "+tel+", Cliente: "+propietario);
        }
    }

}
