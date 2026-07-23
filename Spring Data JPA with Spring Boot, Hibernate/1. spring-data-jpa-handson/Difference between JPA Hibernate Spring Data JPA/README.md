# Difference between JPA, Hibernate and Spring Data JPA


## JPA

Java Persistence API (JPA) is a specification for ORM.

It defines rules and interfaces for storing Java objects into relational databases.

JPA does not provide any implementation.

Examples:

- @Entity
- @Table
- @Id
- @Column


## Hibernate

Hibernate is an ORM framework.

It is an implementation of JPA.

Hibernate provides:

- Object Relational Mapping
- Session management
- Transaction management
- Database independent queries


Example:

```java
Session session = factory.openSession();

Transaction tx = session.beginTransaction();

session.save(employee);

tx.commit();

session.close();