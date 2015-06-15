package generated;

import generated.Zoo.Animaux.Ours;

import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {

		try {
			JAXBContext jc = JAXBContext.newInstance("generated") ;
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			
			SchemaFactory schemaFactory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			File file = new File("C:\\Users\\HumanBooster\\workspace\\CreateClasses_byJAXB\\zoo.xsd");
			Schema schema = schemaFactory.newSchema(file);
			unmarshaller.setSchema(schema);

			Zoo zoo = (Zoo) unmarshaller.unmarshal(new File("Representation.xml"));
			
			Zoo.Animaux.Ours ours = zoo.getAnimaux().getOurs();

			for (int i = 0; i < ours.our.size(); i++) {
				Zoo.Animaux.Ours.Our our = (Zoo.Animaux.Ours.Our) ours.our.get(i);
				System.out.println("Our ");
				System.out.println("name    : " + our.getName());
				System.out.println("poids  : " + our.getPoids());
				System.out.println("couleur : " + our.getCouluer());
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
