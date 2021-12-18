package clases;

import clases.ArrayinfoTareas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Image;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class crear_reporte_completados {

    String nombreArchivo;
    String Fecha;

    ArrayList<infoTareas> Arraytareas;

    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;

    public crear_reporte_completados(String Fecha, ArrayList<infoTareas> Arraytareas) {
        nombreArchivo = "Tareas completadas";
        this.Fecha = Fecha;
        this.Arraytareas = Arraytareas;
        documento = new Document();
        titulo = new Paragraph("Tareas completadas ");
    }

    public void CrearReporte_comple() {
        try {
            archivo = new FileOutputStream(nombreArchivo + ".pdf");

            PdfWriter.getInstance(documento, archivo);

            documento.open();
            titulo.setAlignment(1);
            documento.add(titulo);

            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph(""));
            documento.add(Chunk.NEWLINE);
            documento.add(Chunk.NEWLINE);

            PdfPTable table = new PdfPTable(4);

            documento.add(Chunk.NEWLINE);

            table.setWidthPercentage(100);
            PdfPCell nombre_tarea = new PdfPCell(new Phrase("Nombre de tarea"));
            nombre_tarea.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell encargado = new PdfPCell(new Phrase("Encargado"));
            encargado.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell descrip = new PdfPCell(new Phrase("Descripción"));
            descrip.setBackgroundColor(BaseColor.LIGHT_GRAY);

            PdfPCell fecha = new PdfPCell(new Phrase("Fecha"));
            fecha.setBackgroundColor(BaseColor.LIGHT_GRAY);

            table.addCell(nombre_tarea);
            table.addCell(encargado);
            table.addCell(descrip);
            table.addCell(fecha);

            for (infoTareas p : ArrayinfoTareas.Arraytareas) {
                table.addCell(p.getNombre_tarea());
                table.addCell(p.getEncargado());
                table.addCell(p.getDescrip());
                table.addCell(p.getFecha());
            }
            documento.add(table);

            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + Fecha));

            documento.close();

            JOptionPane.showMessageDialog(null, "Reporte creado ");

        } catch (Exception e) {
        }
    }
}
