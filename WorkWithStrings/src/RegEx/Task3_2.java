package RegEx;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

// Дана строка, содержащая  текст (xml-документ):
/*<notes>
 <note id = "1">
 <to>Вася</to>
 <from>Света</from>
 <heading>Напоминание</heading>
 <body>Позвони мне завтра!</body>
 </note>
 <note id = "2">
 <to>Петя</to>
 <from>Маша</from>
 <heading>Важное напоминание</heading>
 <body/>
 </note>
</notes>*/
//Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//тег, закрывающий тег, содержимое тега, тег без тела)
public class Task3_2 {


    public void task3_2() throws ParserConfigurationException, IOException, SAXException {
        File file = new File("Document.xxml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        Element element = document.getDocumentElement();





        // printElement(element.getChildNodes());

    }

    static void printElement(NodeList nodeList) {

        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element) {
                String value = "";
                if (!nodeList.item(i).getTextContent().trim().isEmpty()) ;
                {

                    value += " - " + nodeList.item(i).getTextContent();
                }
                System.out.println(((Element) nodeList.item(i)).getTagName() + value);
            }
            if (nodeList.item(i).hasChildNodes()) {
                printElement(nodeList.item(i).getChildNodes());
            }
        }
    }
}

