package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="materials")
public class Child {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="material")

	private String material;
	@Column(name="brand")

	private String brand;
	@Column(name="stock")

	private int stock;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Child(int id, String material, String brand, int stock) {
		super();
		this.id = id;
		this.material = material;
		this.brand = brand;
		this.stock = stock;
	}
	public Child()
	{
		
	}
	public String toString()
	{
	return "id= "+id+"material"+material+"brand"+brand+"stock"+stock;
	}
}
