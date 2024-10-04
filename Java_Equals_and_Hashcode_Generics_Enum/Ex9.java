package Java_Equals_and_Hashcode_Generics_Enum;

import static jdk.internal.org.jline.utils.InfoCmp.Capability.newline;

public class Ex9 {

    public static void main(String[] args) {

        ObjectForJSON object = new ObjectForJSON(99, "MergTare");
        System.out.println(object.toString());

    }

}

class ObjectForJSON {

    private int id;
    private String content;

    public ObjectForJSON(int id, String content) {

        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {

        return "{\n" +
                "\"id\":" + this.id + ",\n" +
                "\"data\":\"" + this.content + "\"\n" +
                "}";

    }

}