package com.lms.subscription.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.subscription.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, String>{

}
