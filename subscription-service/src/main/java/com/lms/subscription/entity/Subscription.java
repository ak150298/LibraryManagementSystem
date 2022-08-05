package com.lms.subscription.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Subscription {
	
	@Id
	private String subscriptionId;
	private String subscribedOn;
	private String validTill;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Book book;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscribedOn() {
		return subscribedOn;
	}

	public void setSubscribedOn(String subscribedOn) {
		this.subscribedOn = subscribedOn;
	}

	public String getValidTill() {
		return validTill;
	}

	public void setValidTill(String validTill) {
		this.validTill = validTill;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subscription [subscriptionId=").append(subscriptionId).append(", subscribedOn=")
				.append(subscribedOn).append(", validTill=").append(validTill).append(", user=").append(user)
				.append(", book=").append(book).append("]");
		return builder.toString();
	}
	
	
		
	}
