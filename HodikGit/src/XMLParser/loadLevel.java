/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XMLParser;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
    Info info = new Info();
    List<Info> InfoList = new ArrayList();
    mobInfo mInfo = new mobInfo();
    int k=0;
    int t=0;
    boolean ind=true;
    public void getDocument() throws Exception 
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
    
    private void XMLParser(Document d)
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
            info.levelNumber=Integer.valueOf(el.getAttribute("number"));
            addRobot(level);
            System.out.println("Robot added" + "\n");
            addMobs(level);
            System.out.println("Mobs added" + "\n");
            System.out.println("Level added" + "\n");
            InfoList.add(t,info);
            t++;
        } 
    }
    
    private void addRobot(Node level)
    {
        Node robot=level.getFirstChild();
        do
        {
            robot=robot.getNextSibling();
        } 
        while(robot.getNodeType()!=Node.ELEMENT_NODE);

        Element el = (Element) robot;
        System.out.println("Robot's name: " + el.getAttribute("name"));
        info.robotName=el.getAttribute("name");
        addCoordinates(robot);
    }
    
    private void addCoordinates(Node character)
    {
        Node coordinates=character.getFirstChild();
        do
        {
            coordinates=coordinates.getNextSibling();
        } 
        while(coordinates.getNodeType()!=Node.ELEMENT_NODE);

        Element el = (Element) coordinates;
        System.out.println("Coordinate x: " + el.getAttribute("x"));
        System.out.println("Coordinate y: " + el.getAttribute("y"));
        if("robot".equals(character.getNodeName()))
        {
            info.x=Integer.valueOf(el.getAttribute("x"));
            info.y=Integer.valueOf(el.getAttribute("y"));
            ind=true;
            
        }
        else
        {
            mInfo.x=Integer.valueOf(el.getAttribute("x"));
            mInfo.y=Integer.valueOf(el.getAttribute("y"));
            ind=false;
        }
        addHP(character, ind);
    }
   
    private void addHP(Node character, boolean ind)
    {
        Node hp=character.getFirstChild();
        hp=hp.getNextSibling();
        do
        {
            hp=hp.getNextSibling();
        } 
        while(hp.getNodeType()!=Node.ELEMENT_NODE);

        Element el = (Element) hp;
        System.out.println("HP: " + el.getAttribute("life")); 
        if(ind==true)
        {
            info.HP=Integer.valueOf(el.getAttribute("life"));
        }
        else
            mInfo.hp=Integer.valueOf(el.getAttribute("life")); 
    }
    
    private void addMobs(Node level)
    {
        NodeList mobs=level.getChildNodes();
        for(int i=2;i<mobs.getLength();i++)
        {
            if(mobs.item(i).getNodeType()==Node.ELEMENT_NODE)
            {
                if("mob".equals(mobs.item(i).getNodeName()))
                {
                    Element el = (Element) mobs.item(i);   
                    System.out.println("Mob's type: " + el.getAttribute("type"));
                    mInfo.type="mob";
                    mInfo.name=el.getAttribute("type");
                    addCoordinates(mobs.item(i));
                    System.out.println("Mob added" + "\n");
                }
                if("obstacle".equals(mobs.item(i).getNodeName()))
                {
                    Element el = (Element) mobs.item(i);   
                    System.out.println("Obstacle's type: " + el.getAttribute("type"));
                    mInfo.type="obstacle";
                    mInfo.name=el.getAttribute("type");
                    addCoordinates(mobs.item(i));
                    System.out.println("Obstacle added" + "\n");
                }
                info.mob.add(k, mInfo);
                k++;
                
            }
        }
    }
              
}
