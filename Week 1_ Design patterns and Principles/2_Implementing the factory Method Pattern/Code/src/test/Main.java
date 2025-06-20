package test;

import documents.document;
import factory.DocumentFactory;
import factory.WordDocumentFactory;
import factory.PdfDocumentFactory;
import factory.ExcelDocumentFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        document excel = excelFactory.createDocument();
        excel.open();
    }
}
