package com.factorypattern.factory;

import com.factorypattern.documents.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}