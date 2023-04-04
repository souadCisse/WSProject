package ma.enset;

import jakarta.xml.bind.*;
import jakarta.xml.bind.annotation.XmlElement;

import java.io.File;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class SerializationXML {
    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Releve.class);
        Operation op1=new Operation(OperationType.CREDIT,new Date(),2000D,"description1");
        Operation op2=new Operation(OperationType.DEBIT,new Date(),20560D,"description2");
        Operation op3=new Operation(OperationType.CREDIT,new Date(),2000D,"description3");

        Operations operations1= new Operations(new Date(),new Date());
        operations1.operations.add(op1);operations1.operations.add(op2);operations1.operations.add(op3);

        Operations operations2= new Operations(new Date(),new Date());
        operations2.operations.add(op1);operations2.operations.add(op2);operations2.operations.add(op3);

        Operations operations3= new Operations(new Date(),new Date());
        operations3.operations.add(op1);operations3.operations.add(op2);operations3.operations.add(op3);

        Releve releve=new Releve();
        releve.setRIB(1432424573258L);
        releve.setDateReleve(new Date());
        releve.setSolde(50000D);
        List<Operations> operationsList=new ArrayList<>();
        operationsList.add(operations1);operationsList.add(operations2);operationsList.add(operations3);
        releve.setOperationsList(operationsList);
        Marshaller marshaller=jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("releve.xml"));

    }
}
