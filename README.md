## Tech Stack & Dependencies

- Java 17  
- Spring Boot  
- Spring Web (REST APIs)  
- Spring Data JPA (Persistence layer)  
- Hibernate (ORM)  
- MapStruct (DTO to Entity mapping)  
- Spring Boot Actuator (Health and monitoring)  
- Swagger / Springdoc OpenAPI (API documentation)  
- Jakarta Validation (Input validation)  
- Lombok (Boilerplate reduction)  
- MySQL or H2 (Relational database)  
- Maven (Build tool)

---

## Application Flow

1. Client sends a request through REST API  
2. Controller receives and validates the request  
3. Request DTO is converted to Entity using MapStruct  
4. Service layer processes business logic  
5. Repository performs database operations  
6. Entity is converted to Response DTO  
7. Age is calculated dynamically from Date of Birth  
8. Response is returned to the client  

---

## Dynamic Age Calculation

- Age is not stored in the database  
- Calculated at runtime using Date of Birth  
- Implemented in the Mapper layer  
- Ensures data consistency and accuracy  

---

## Swagger API Documentation

- Provides interactive API documentation  
- Allows API testing through the browser  
- Improves collaboration between backend and frontend  

---

## Actuator Monitoring

- Exposes application health and information endpoints  
- Used for monitoring application status  
- Helpful in production environments  

---

## Key Design Highlights

- Clean separation of concerns  
- DTO-driven API design  
- No redundant or derived data stored  
- Easy to extend with additional features  
