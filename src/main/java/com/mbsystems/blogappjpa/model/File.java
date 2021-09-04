package com.mbsystems.blogappjpa.model;

public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @JsonIgnore
    @ManyToMany(cascade = {CascadeType.MERGE,CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(
            name = "post_files",joinColumns = {
            @JoinColumn(name = "file_id", referencedColumnName = "id")},
            inverseJoinColumns={
                    @JoinColumn(name = "post_id", referencedColumnName = "id")})
    private Set<Post> posts;

}
