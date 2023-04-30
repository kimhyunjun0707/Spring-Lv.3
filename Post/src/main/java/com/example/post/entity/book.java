//@Entity
//public class book {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String author;
//    private String name;
//    private int price;
//    private Long quantity;
//    //private long quantity = 0;
//    @ManyToOne
//    @JoinColumn(name = ""bookstore_id"")
//    private BookStore bookStore;
//    //Long long =차이점;
//
//}
//// /com/exmple/jpa_relation_test/entity/BookStore
//@Entity
//public class BookStore {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String location;
//    private String name;
//    @OneToMany(mappedBy = ""bookStore"",fetch = FetchType.EAGER)
//    private List<Book> books;   //Arraylist
//}
////////////////////
//// /com/exmple/jpa_relation_test/entity/BookStore
//@Entity
//public class BookStore {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String location;
//    private String name;
//    @OneToMany(mappedBy = ""bookStore"")
//    private List<Book> books;
//    @OneToMany(mappedBy = ""bookStore"")
//    private List<Member> members;
//}
////
//// /com/exmple/jpa_relation_test/entity/Member
//
//
//@Entity
//public class Member {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String address;
//    private String email;
//    private String nickname;
//    private String password;
//    private String phoneNumber;
//}"
