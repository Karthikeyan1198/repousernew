package com.management.UserMS.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(Wishlist.class)
@Table(name="Wishlist")
public class Wishlist implements Serializable  {

	@Id
	@Column(name = "BUYERID", nullable = false)
		Integer buyerId;
	@Id
	@Column(name = "PRODID", nullable = false)
		Integer prodId;
	public Integer getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
}