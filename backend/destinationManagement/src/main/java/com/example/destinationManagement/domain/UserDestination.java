package com.example.destinationManagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDestination {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer userDestinationId;

    Integer userId;
    Integer destinationId;
    Integer stayDates;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    @JsonIgnore
    Destination destination;

    public UserDestination(Integer userId, Integer destinationId, Integer stayDates) {
        this.userId = userId;
        this.destinationId = destinationId;
        this.stayDates = stayDates;
    }
}
