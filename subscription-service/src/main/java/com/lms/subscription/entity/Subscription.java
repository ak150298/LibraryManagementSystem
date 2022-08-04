package com.lms.subscription.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.lms.book.entity.Book;
import com.lms.user.entity.User;

@Entity
public class Subscription {
	
	@Id
	private String subscriptionId;
	private String subscribedOn;
	private String validTill;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subscription [subscriptionId=").append(subscriptionId).append(", subscribedOn=")
				.append(subscribedOn).append(", validTill=").append(validTill).append("]");
		return builder.toString();
	}
	
	
	
	}
