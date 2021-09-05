//package com.mbsystems.blogappjpa.model;
//
//import lombok.Builder;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//import org.hibernate.Hibernate;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import java.util.Objects;
//
//@NoArgsConstructor
//@Builder
//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
//@Entity
//public class Address {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String address;
//
//    @OneToOne(mappedBy = "address")
//    private User user;
//
//    @Override
//    public boolean equals( Object o ) {
//        if ( this == o ) return true;
//        if ( o == null || Hibernate.getClass( this ) != Hibernate.getClass( o ) ) return false;
//        Address address = ( Address ) o;
//
//        return Objects.equals( id, address.id );
//    }
//
//    @Override
//    public int hashCode() {
//        return 1395783287;
//    }
//}
