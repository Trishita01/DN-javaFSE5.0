package com.factorypattern.factory;

import com.factorypattern.documents.Document;
import com.factorypattern.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}