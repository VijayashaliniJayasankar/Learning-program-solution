package factory;

import documents.document;
import documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public document createDocument() {
        return new ExcelDocument();
    }
}