package co.edu.poli.actividad3.vista;

import co.edu.poli.actividad3.model.*;

public class Cliente {



    public static void main(String[] args) {
        Pais pais = new Pais("CO", "Colombia");
        Categoria categoria = new Categoria("ENF001", "18+", "No embarazadas");
        Presentacion pres = new Presentacion("S001", "Vidrio", "Caja", "2026-12", "Jarabe",
                                             "250ml", "LabXYZ", "Mantener en frío");
        Proveedor proveedor = new Proveedor("Bogotá", "MedicamentoX", "Medellín", "P123", pais);

        Medicamento medicamento = new Medicamento(0.5, proveedor, "Oral", false, "M001", "Pequeño",
                                                  10.5, "Activo", null, "Etiqueta1", 2,
                                                  "ClienteX", pais, categoria,
                                                  new Presentacion[]{pres}, 2022);

        MedicamentoInyectado medicamentoInyectado = new MedicamentoInyectado(0.7, proveedor, "Inyectado", false, "M003", "Grande",
                                                                             15.0, "Refrigerado", null, "EtiquetaInyectado", 3,
                                                                             "ClienteZ", pais, categoria,
                                                                             new Presentacion[]{pres}, 2021,
                                                                             "Intramuscular", "Desechable");

        MedicamentoOral medicamentoOral = new MedicamentoOral(0.6, proveedor, "Oral", false, "M004", "Mediano",
                                                              12.0, "Activo", null, "EtiquetaOral", 1,
                                                              "ClienteY", pais, categoria,
                                                              new Presentacion[]{pres}, 2023,
                                                              true, "Blíster");

        System.out.println(medicamento);
        System.out.println("Edad del medicamento: " + medicamento.getEdadActual() + " años");
        System.out.println("\nMEDICAMENTO ESCRITURA");
        System.out.println("Descripción de aplicación (Medicamento): " + medicamento.descripcionAplicacion());

        System.out.println("\nMEDICAMENTO INYECTADO");
        System.out.println(medicamentoInyectado);
        System.out.println("Edad del medicamento inyectado: " + medicamentoInyectado.getEdadActual() + " años");
        System.out.println("\nESCRITURA");
        System.out.println("Descripción de aplicación (Medicamento): " + medicamento.descripcionAplicacion());
        System.out.println("\nSOBRECARGA");
        System.out.println("Descripción de aplicación con detalle (Medicamento): " + medicamento.descripcionAplicacion("Uso Pediatrico"));

        double pesoPaciente = 70.0;

        System.out.println("\n--- Cálculo de dosis ---");
        System.out.println("Dosis de medicamento (oral): " + medicamento.obtenerDosis(pesoPaciente) + " mg");                                                           
        System.out.println("Dosis de medicamento inyectado (double): " + medicamentoInyectado.obtenerDosis(pesoPaciente));
        System.out.println("Dosis de medicamento inyectado (con unidad): " + medicamentoInyectado.obtenerDosisConUnidad(pesoPaciente));
        System.out.println("Dosis de medicamento oral (polimorfismo): " + medicamentoOral.obtenerDosis(pesoPaciente));

        Medicamento[] medicamentos = new Medicamento[5];
        medicamentos[0] = medicamento;
        medicamentos[1] = medicamentoInyectado;
        medicamentos[2] = medicamentoOral;
        medicamentos[3] = null;
        medicamentos[4] = null;

        System.out.println("\n--- Arreglo de medicamentos y sobrescritura ---");
        for (int i = 0; i < medicamentos.length; i++) {
            if (medicamentos[i] != null) {
                System.out.println("Medicamento[" + i + "] (" +
                                   medicamentos[i].getClass().getSimpleName() + ") -> " +
                                   medicamentos[i].obtenerDosis(pesoPaciente));
            } else {
                System.out.println("Medicamento[" + i + "] -> null");
            }
        }


        System.out.println("\nInvocación metodos de Poliformismo");

       
        System.out.println("Medicamento descripcionAplicacion con parámetro:");
        System.out.println(medicamento.descripcionAplicacion("Uso General"));
        System.out.println(medicamentoInyectado.descripcionAplicacion("Uso Intramuscular"));
        System.out.println(medicamentoOral.descripcionAplicacion("Uso Pediátrico"));

 
        System.out.println("\nObteniendo el país de origen de los medicamentos:");
        Pais paisMedicamento = medicamento.getPais();
        Pais paisMedicamentoInyectado = medicamentoInyectado.getPais();
        Pais paisMedicamentoOral = medicamentoOral.getPais();

        System.out.println("Medicamento Pais: " + paisMedicamento.getNombre());
        System.out.println("Medicamento Inyectado Pais: " + paisMedicamentoInyectado.getNombre());
        System.out.println("Medicamento Oral Pais: " + paisMedicamentoOral.getNombre());

         }
      }



