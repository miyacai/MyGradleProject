package org.gradle.xpath;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * ClassName: Test Function: TODO
 *
 * @Author: Miya Cai
 * @Date: May 19, 2016 9:26:13 PM
 */
public class Test {
	public static void main(String[] args) throws Exception {

		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document document = builder.parse(new File("bin/outer-tool-link.xml"));
		// 生成XPath对象
		XPath xpath = XPathFactory.newInstance().newXPath();
		// 获取节点值

		NodeList books = (NodeList) xpath.evaluate("/mobileresponse/map/map-item[@linktype='Bb-wiki'] | /mobileresponse/map/map-item[@linktype='blogs']", document, XPathConstants.NODESET);
		for (int i = 0; i < books.getLength(); i++) {
			Node book = books.item(i);
			System.out.println(xpath.evaluate("@name", book, XPathConstants.STRING));
		}
		System.out.println("===========================================================");
				  
		
	}

}
