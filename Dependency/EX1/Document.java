package Dependency.EX1;

public class Document {
    private String content;
    public Document(String content) {
        this.content = content;}
    public void document_details(){
        System.out.println("Content of the Document : " + this.content);
    }
}
