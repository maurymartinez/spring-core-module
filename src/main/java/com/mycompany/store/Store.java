/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.store;

/**
 *
 * @author mmartinez
 */
public class Store {

	private Manager manager;

	public Store() {
	}
	
	// Used for Constructor
	public Store(Manager manager) {
		this.manager = manager;
	}

	public Manager getProduct() {
		return manager;
	}
	
	// Used for Setter
	public void setProduct(Manager manager) {
		this.manager = manager;
	}
}
