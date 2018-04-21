package com.amazonservices.mws.products.model;

import java.io.StringWriter;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.amazonservices.mws.client.MwsUtl;

import org.w3c.dom.Node;

public class ProductsUtil {

    public static String formatXml(Node node) {
        try {
            Transformer transformer = MwsUtl.getTF().newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            StringWriter sw = new StringWriter();
            StreamResult result = new StreamResult(sw);
            DOMSource source = new DOMSource(node);
            transformer.transform(source, result);
            return sw.toString();
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }

}
