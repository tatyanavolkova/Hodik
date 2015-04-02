/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hodikgit;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author yunna_u
 */
public class loadLevel 
{
    Info info;
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
        catch (ParserConfigurationException | SAXException | IOException exception) 
        {
            String message = "XML parsing error!";
            throw new Exception(message);
        }
    }
    
    public static void XMLParser(Document d)
    {
        d.getDocumentElement().normalize();
        Element root=d.getDocumentElement();                                    // корневой элемент документа
        NodeList levels=root.getChildNodes();
        Node level=root.getFirstChild();
        for(int i=0;i<levels.getLength();i++)
        {
            do
            {
                level=level.getNextSibling();
            } 
            while(level.getNodeType()!=Node.ELEMENT_NODE);

            Element el = (Element) level;
            System.out.println("Level number: " + el.getAttribute("number") + "\n");
            addRobot(level);
            System.out.println("Robot added");
            addMobs(level);
            System.out.println("Mobs added");
        } 
    }
    
    static private void addRobot(Node level)
    {
        Node robot=level.getFirstChild();
        do
        {
            robot=robot.getNextSibling();
        } 
        while(robot.getNodeType()!=Node.ELEMENT_NODE);

        Element el = (Element) robot;
        System.out.println("Robot's name: " + el.getAttribute("name"));
        addCoordinates(robot);
    }
    
    static private void addCoordinates(Node character)
    {
        Node coordinates=character.getFirstChild();
        do
        {
            coordinates=coordinates.getNextSibling();
        } 
        while(coordinates.getNodeType()!=Node.ELEMENT_NODE);

        Element el = (Element) coordinates;
        System.out.println("Coordinate x: " + el.getAttribute("x"));
        System.out.println("Coordinate y: " + el.getAttribute("y") + "\n");
    }
    
    static private void addMobs(Node level)
    {
        NodeList mobs=level.getChildNodes();
        for(int i=2;i<mobs.getLength();i++)
        {
            if(mobs.item(i).getNodeType()==Node.ELEMENT_NODE)
            {
                Element el = (Element) mobs.item(i);   
                System.out.println("Mob's type: " + el.getAttribute("type"));
                System.out.println("Mob's name: " + el.getAttribute("name"));
                addCoordinates(mobs.item(i));
                System.out.println("Mob added");
            }
        }
    }
              
}
