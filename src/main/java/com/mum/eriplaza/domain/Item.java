
package com.mum.eriplaza.domain;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;
		
@Entity
public class Item implements Serializable{
	private static final long serialVersionUID = 1L;
	    @Id
		private long itemId;	
		private String name;
		private String description;
		private long category;
		private double unitPrice;
		@JsonIgnore
		@Transient
		private MultipartFile  itemImage;
		private long unitsInStock;
//		private String condition; 
		

		public Item() {
			super();
	}
	

		public long getCategory() {
			return category;
		}


		public void setCategory(long category) {
			this.category = category;
		}


		public long getItemId() {
			return itemId;
		}


		public void setItemId(long itemId) {
			this.itemId = itemId;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getUnitPrice() {
			return unitPrice;
		}

		public void setUnitPrice(double unitPrice) {
			this.unitPrice = unitPrice;
		}

		public long getUnitsInStock() {
			return unitsInStock;
		}

		public void setUnitsInStock(long unitsInStock) {
			this.unitsInStock = unitsInStock;
		}

//		public String getCondition() {
//			return condition;
//		}
//
//		public void setCondition(String condition) {
//			this.condition = condition;
//		}
        @XmlTransient
		public MultipartFile getItemImage() {
			return itemImage;
		}

		public void setProductImage(MultipartFile itemImage) {
			this.itemImage = itemImage;
		}


}
