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

        RegistrosLibreta registrosLibreta = new RegistrosLibreta();

        for (int i = 0; i < 5; i++) {
            registrosLibreta.setFechaRegistro(new Date("01/02/2014"));
            registrosLibreta.setDeposito(255.25);
            registrosLibreta.setRetiros(255.25);
            registrosLibreta.setSaldo(100);
            registrosLibreta.setCodigo("DEP-EFE");
        }

        RegistrosLibreta registrosLibreta1 = new RegistrosLibreta();
        registrosLibreta1.setFechaRegistro(new Date("01/02/2014"));
        registrosLibreta1.setDeposito(0.0);
        registrosLibreta1.setRetiros(255.25);
        registrosLibreta1.setSaldo(100);
        registrosLibreta1.setCodigo("DEP-EFE");

        collection1.add(registrosLibreta);
        collection1.add(registrosLibreta1);
        libretaReporte.setListaRegistrosLibreta(collection1);
        collection.add(libretaReporte);

        return collection;
    }
}
