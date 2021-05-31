package Projeto.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Product implements Serializable{
  
private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String name;
   private Double price;
   @ManyToOne
   @JoinColumn(name = "category_id")
   private Category category;
   
   private Product () {
	   
   }

public Product(Long id, String name, Double price, Category category) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.category = category;
}

/**
 * @return the id
 */
public Long getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the price
 */
public Double getPrice() {
	return price;
}

/**
 * @param price the price to set
 */
public void setPrice(Double price) {
	this.price = price;
}

/**
 * @return the category
 */
public Category getCategory() {
	return category;
}

/**
 * @param category the category to set
 */
public void setCategory(Category category) {
	this.category = category;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}
   
   
   
}
