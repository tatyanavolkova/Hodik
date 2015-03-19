/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author yunna_u
 */
public class loadLevel 
{
    loadLevel() throws Exception
    {
        getDocument();
    }
    
    private static void getDocument() throws Exception 
    {
        try 
        {
            DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();    // получаем xml парсер с настройками по умолчанию
            f.setValidating(false);
            DocumentBuilder builder = f.newDocumentBuilder();
            XMLParser(builder.parse(new File("levels.xml")));
        } 
        catch (Exception exception) 
        {
            String message = "XML parsing error!";
            throw new Exception(message);
        }
    }
    
    public static void XMLParser(Document d)
    {
        Element rootel=d.getDocumentElement();                                  // корневой элемент документа
        System.out.println(rootel.getNodeName());
        System.out.println("Child elements: ");                                 // список имен дочерних элементов
        NodeList lst= rootel.getChildNodes();
        for(int i=0;i<lst.getLength();i++)
        {
            System.out.println(lst.item(i).getNodeName()+" ");
        }
   
        System.out.println("Child elements: ");                                 // список имен дочерних элементов и их содержимого
        Node el=rootel.getFirstChild();        
        do
        {
            System.out.println(el.getNodeName()+": "+ el.getTextContent());
            el=el.getNextSibling();
        }
        while(el!=null);
    }
    
    
}
