//package com.mbsystems.blogappjpa.model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
//import lombok.ToString;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.io.Serializable;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString(exclude = {"posts"})
//@EqualsAndHashCode(exclude = {"posts"})
//@Entity
//public class Blog implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    /*
//    'guid' is useful to hide incremental 'id' from all external communications for security reasons.
//    'id' would be faster to index and query while doing pagination, filtering etc.
//     */
//    @org.hibernate.annotations.Type(type = "pg-uuid")
//    UUID guid;
//
//    private String name;
//
//    private String about;
//
//    private LocalDateTime publishedAt;
//
//    @JsonIgnore
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL,
//            orphanRemoval = true, mappedBy = "blog")
//    private Set<Post> posts;
//
//    @JsonIgnore
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name = "blogId")
//    private Set<User> users;
//}
