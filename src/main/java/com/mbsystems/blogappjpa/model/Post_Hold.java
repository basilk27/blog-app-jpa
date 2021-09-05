//package com.mbsystems.blogappjpa.model;
//
//public class Post_Hold {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String title;
//    private String content;
//
//    @Type(type = "com.example.blog_app.constants.PgArrayType")
//    private String[] tags;
//
//    @Column(name = "post_status")
//    @Type(type = "com.example.blog_app.constants.PgEnumType",
//            parameters = {@org.hibernate.annotations.Parameter(name = "enumClassName",
//                    value = "com.example.blog_app.model.jpa.PostStatus")})
//    PostStatus postStatus;
//
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "blog_id")
//    private Blog blog;
//
//    @JsonIgnore
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "author_id")
//    private User user;
//
//    @JsonIgnore
//    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.REFRESH}, fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "post_files",joinColumns = {
//            @JoinColumn(name = "post_id", referencedColumnName = "id")},
//            inverseJoinColumns={
//                    @JoinColumn(name = "file_id", referencedColumnName = "id")})
//    private Set<File> files;
//
//}
