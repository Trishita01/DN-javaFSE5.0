package com.factorypattern.factory;

import com.factorypattern.documents.Document;
import com.factorypattern.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}