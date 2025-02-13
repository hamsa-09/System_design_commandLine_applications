package DocumentReader;


abstract class DocumentReader{
    public abstract void read();
}
class PdfReader extends DocumentReader{
    public void read(){
        System.out.println("Pdf Reader is reading the document");
    }
}
class WordReader extends DocumentReader{
    public void read(){
        System.out.println("WordReader is reading the document");
    }
}
class TextReader extends DocumentReader{
    public void read(){
        System.out.println("TextReader is reading the document");
    }
}
interface DocumentReaderFactory{
     DocumentReader createRead();
}
class PdfReaderFactory implements DocumentReaderFactory{
    public DocumentReader createRead(){
        return new PdfReader();
    }
}
class WordReaderReaderFactory implements DocumentReaderFactory{
    public DocumentReader createRead(){
        return new WordReader();
    }
}
class TextReaderFactory implements DocumentReaderFactory{
    public DocumentReader createRead(){
        return new TextReader();
    }
}

class DocumentReaderApp{
    private DocumentReader app;
    public DocumentReaderApp(DocumentReaderFactory factory){
        app=factory.createRead();
    }
    public DocumentReader getReader(){
        return app;
    }
}
public class DocumentReaderMainClass {
    public static void main(String[] args) {
        DocumentReaderFactory pdfreader=new PdfReaderFactory();
        DocumentReaderApp docapp=new DocumentReaderApp(pdfreader);
        DocumentReader reader=docapp.getReader();
        reader.read();
    }
}
