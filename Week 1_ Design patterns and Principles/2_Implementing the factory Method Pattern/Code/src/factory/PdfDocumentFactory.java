package factory;

import documents.document;
import documents.pdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public document createDocument() {
        return new pdfDocument();
    }
}
