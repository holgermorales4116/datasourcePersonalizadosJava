/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportedatasourceclase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author root
 */
public class Prueba {

    public static Collection getLibreta() {
        Collection collection = new Vector();
        Collection collection1 = new ArrayList();

        LibretaReporte libretaReporte = new LibretaReporte();
        libretaReporte.setCedula("050317090-4");
        libretaReporte.setTitular("HOLGER MORALES");
        libretaReporte.setNumeroCuenta("1");
        libretaReporte.setNumeroSocio("1");

        for (int i = 0; i < 5; i++) {
            RegistrosLibreta registrosLibreta = new RegistrosLibreta();
            registrosLibreta = null;
            collection1.add(registrosLibreta);
        }

        RegistrosLibreta registrosLibretaLast = new RegistrosLibreta();
        registrosLibretaLast.setFechaRegistro(new Date("01/02/2014"));
        registrosLibretaLast.setRetiros(990.0);
        registrosLibretaLast.setSaldo(100);
        registrosLibretaLast.setCodigo("RET-EFE");
        collection1.add(registrosLibretaLast);

        RegistrosLibreta registrosLibretaLast1 = new RegistrosLibreta();
        registrosLibretaLast1.setFechaRegistro(new Date("01/02/2014"));
        registrosLibretaLast1.setDeposito(5000.10);
        registrosLibretaLast1.setSaldo(20000.00);
        registrosLibretaLast1.setCodigo("DEP-EFE");
        collection1.add(registrosLibretaLast1);

        libretaReporte.setListaRegistrosLibreta(collection1);
        collection.add(libretaReporte);

        return collection;
    }
}
