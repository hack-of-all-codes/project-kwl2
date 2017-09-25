package com.kwler.legacy.api.dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customer")
public class Customer {

    public enum Status {
        FULL_ACCESS,
        SUSPENDED,
        TRIAL,
    }

    public enum SubscriptionType {

        /**
         * User Paid Via BrainTree subscription
         */
        PRO,

        /**
         * Multiple users managed in the admin
         */
        ENTERPRISE,

        /**
         * regular user
         */
        FREE,

    }

    @Id
    String id;

    String name;
    String description;
    Long enrollmentDate;
    String country;
    SubscriptionType subscriptionType;
    Status status = Status.FULL_ACCESS;
    Long trialPeriod;
}
