/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import com.mycompany.store.Store;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mmartinez
 */
public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("App-Context.xml");
		
		//Setter
		Store storeSetter = (Store) context.getBean("storeSetter");
		System.out.println(storeSetter.getProduct().getName());
		
		//Setter
		Store storeConstructor = (Store) context.getBean("storeConstructor");
		System.out.println(storeConstructor.getProduct().getName());
	}
	
}
