/*
 * Copyright 2015 cesar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.utpl.swsoa.ws.client;

import edu.utpl.swsoa.ws.Persona;
import edu.utpl.swsoa.ws.SecurityWS;
import edu.utpl.swsoa.ws.ServicioSoa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Result;
import org.xml.sax.ContentHandler;

/**
 *
 * @author Miguel Tenezaca
 */
@Named
@ViewScoped
public class ClientServiceHome implements Serializable{
 
    String identificacion;
    //Persona result;
    String result;
    
    public void test1() {

        try {
            //URL wsdlURL = new URL("http://localhost:8080/servicioSoa/securityWS?wsdl");
            //ServicioSoa c = new ServicioSoa(wsdlURL);
            
            ServicioSoa c = new ServicioSoa();
            SecurityWS client = c.getPort(SecurityWS.class);
            Persona p = client.buscarPersonaPorIdentificacion(identificacion);
            
            JAXBContext jc = JAXBContext.newInstance(Persona.class);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);           
            System.out.println("paso 1");
            File file = new File("output1.xml");
            marshaller.marshal(p, file);
            System.out.println("paso 2");
            result = readFile(file);
            System.out.println("paso 3");
            
        } catch (JAXBException ex) {
            Logger.getLogger(ClientServiceHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientServiceHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String readFile(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }

        return stringBuilder.toString();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
}
