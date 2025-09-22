#JAVA-POINT - server pro fandy Javy

<pre>
java-point/
│── README.md              # shrnutí (JVM, JRE, JDK, build nástroje, Enterprise Java, JBoss)
│── basics/
│   └── HelloWorld.java
│── web/
│   └── HelloServlet.java
│── db/
│   ├── JdbcExample.java
│   └── JpaEntityExample.java
│── di/
│   └── DiExample.java
│── rest/
│   └── RestExample.java   # ukázka JAX-RS endpointu
</pre>


---

## 1. Java runtime a ekosystém
- **JVM** – spouští bytecode
- **JRE** – JVM + knihovny → běhové prostředí
- **JDK** – JRE + vývojářské nástroje (`javac`, `javadoc`)
- **Build nástroje** – Maven, Gradle

---

## 2. Enterprise Java
### Servlety
```java
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("Hello World!");
    }
}
```

### JDBC
```java
Connection conn = DriverManager.getConnection(url, user, pass);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM users");
```
### JPA (Hibernate)
```java
@Entity
public class User {
    @Id
    private Long id;
    private String name;
}
```

### Dependency Injection
```java
public class Service {
    private final Repository repo;

    @Inject
    public Service(Repository repo) {
        this.repo = repo;
    }
}
```

---

## 3. JBoss / WildFly
- Deployment: `.war`, `.ear`
- Datasource přes JNDI
- Služby: **EJB**, **CDI**, **JMS**, **JAX-RS**
- Rozdíl vs. Spring: aplikační server vs. framework

