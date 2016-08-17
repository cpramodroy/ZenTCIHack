package com.tibco.bw.palette.zendesk.runtime.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.genxdm.io.DocumentHandler;
import org.xml.sax.InputSource;

public class PaletteUtil 

{
	
	public static <N> N parseObjtoN(Class<?> className, Object o, ProcessingContext<N> processingContext) throws JAXBException, IOException {
		ClassLoader startingClassLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(PaletteUtil.class.getClassLoader());
		StringWriter writer;
		N result = null;
		try {
			JAXBContext context = JAXBContext.newInstance(className);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			writer = new StringWriter();
			m.marshal(o, writer);
			ByteArrayInputStream in = new ByteArrayInputStream(writer.toString().getBytes("UTF-8"));
			InputSource inputXml = new InputSource(in);		
			DocumentHandler<N> handler = processingContext.newDocumentHandler();				
			result = handler.parse(inputXml, null);
		} catch (JAXBException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			Thread.currentThread().setContextClassLoader(startingClassLoader);
		}
		Model<N> model = processingContext.getMutableContext().getModel();
		N resultElement = model.getFirstChildElement(result);
		return resultElement;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <N> N parseObjtoN(Class<?> className, Object o, ProcessingContext<N> processingContext, String namespaceURI, String localPart) throws JAXBException, IOException {
		ClassLoader startingClassLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(PaletteUtil.class.getClassLoader());
		StringWriter writer;
		N result = null;
		try {
			JAXBContext context = JAXBContext.newInstance(className);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			writer = new StringWriter();
			m.marshal(new JAXBElement(new QName(namespaceURI, localPart), className, o), writer);
			ByteArrayInputStream in = new ByteArrayInputStream(writer.toString().getBytes("UTF-8"));
			InputSource inputXml = new InputSource(in);		
			DocumentHandler<N> handler = processingContext.newDocumentHandler();				
			result = handler.parse(inputXml, null);
		} catch (JAXBException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			Thread.currentThread().setContextClassLoader(startingClassLoader);
		}
		Model<N> model = processingContext.getMutableContext().getModel();
		N resultElement = model.getFirstChildElement(result);
		return resultElement;
	}
	
	public static <N> N parseObjtoN(Class<?> className, JAXBElement<?> jaxbElement, ProcessingContext<N> processingContext) throws JAXBException, IOException {
		ClassLoader startingClassLoader = Thread.currentThread().getContextClassLoader();
		Thread.currentThread().setContextClassLoader(PaletteUtil.class.getClassLoader());
		StringWriter writer;
		N result = null;
		try {
			
			JAXBContext context = JAXBContext.newInstance(className);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			writer = new StringWriter();
			m.marshal(jaxbElement, writer);
			ByteArrayInputStream in = new ByteArrayInputStream(writer.toString().getBytes("UTF-8"));
			InputSource inputXml = new InputSource(in);		
			DocumentHandler<N> handler = processingContext.newDocumentHandler();				
			result = handler.parse(inputXml, null);
		} catch (JAXBException e) {
			e.printStackTrace();
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			Thread.currentThread().setContextClassLoader(startingClassLoader);
		}
		Model<N> model = processingContext.getMutableContext().getModel();
		N resultElement = model.getFirstChildElement(result);
		return resultElement;
	}
}
