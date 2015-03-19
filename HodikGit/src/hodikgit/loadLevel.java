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
        d.getDocumentElement().normalize();
        Element rootel=d.getDocumentElement();                                  // корневой элемент документа
//        System.out.println(rootel.getNodeName());
//        System.out.print("Child elements: ");                                   // список имен дочерних элементов
//        NodeList lst= rootel.getChildNodes();
//        for(int i=0;i<lst.getLength();i++)
//        {
//            System.out.println(lst.item(i).getNodeName()+" ");
//        }
//   
//        System.out.print("Child elements: ");                                   // список имен дочерних элементов и их содержимого
//        Node el=rootel.getFirstChild();        
//        do
//        {
//            System.out.println(el.getNodeName()+": "+ el.getTextContent());
//            el=el.getNextSibling();
//        }
//        while(el!=null);
        NodeList levels = d.getElementsByTagName("level");
        for (int i=0;i<levels.getLength();i++)
        {
            Node nNode = levels.item(i);
            System.out.println("\nCurrent Element: " + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) 
            {
                Element eElement = (Element) nNode;
                System.out.println("Level number: " + eElement.getAttribute("number"));
                d=addRobot(d);
                d=addMobs(d);
            }
        }
    }
    
    static private Document addRobot(Document d)
    {
        NodeList robot = d.getElementsByTagName("robot");
        for(int i=0;i<robot.getLength();i++)
        {
            Node nNode = robot.item(i);
            System.out.println("\nCurrent Element: " + nNode.getNodeName());
            if(nNode.getNodeType()==Node.ELEMENT_NODE) 
            {
                Element eElement = (Element) nNode;
                System.out.println("Robot's name: " + eElement.getAttribute("name"));
                d=addCoordinates(d);
            }
        }
        return d;
    }
    
    static private Document addCoordinates(Document d)
    {
        NodeList coordinates = d.getElementsByTagName("coordinates");
        Node nNode = coordinates.item(0);
        System.out.println("\nCurrent Element: " + nNode.getNodeName());
        if(nNode.getNodeType()==Node.ELEMENT_NODE) 
            {
                Element eElement = (Element) nNode;
                System.out.println("Coordinate x: " + eElement.getAttribute("x"));
                System.out.println("Coordinate y: " + eElement.getAttribute("y"));
            }
        return d;
    }
    
    static private Document addMobs(Document d)
    {
        NodeList mob = d.getElementsByTagName("mob");
        for(int i=0;i<mob.getLength();i++)
        {
            Node nNode = mob.item(i);
            System.out.println("\nCurrent Element: " + nNode.getNodeName());
            if(nNode.getNodeType()==Node.ELEMENT_NODE) 
            {
                Element eElement = (Element) nNode;
                System.out.println("Mob's type: " + eElement.getAttribute("type"));
                System.out.println("Mob's type: " + eElement.getAttribute("name"));
                d=addCoordinates(d);
            }
        }
        return d;
    } 
}
