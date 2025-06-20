package factory;
import documents.document;
import documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    public document createDocument() {
        return new WordDocument();
    }
}