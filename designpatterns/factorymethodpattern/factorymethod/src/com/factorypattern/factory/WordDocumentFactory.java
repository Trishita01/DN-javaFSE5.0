package com.factorypattern.factory;

import com.factorypattern.documents.Document;
import com.factorypattern.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}