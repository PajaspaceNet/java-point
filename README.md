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

* `JPA` → databáze pomocí objektů (ORM).
* `EJB` → enterprise logika (transakce, bezpečnost).
* `CDI` → dependency injection (správa závislostí).
* `JMS` → messaging, fronty, asynchronní zpracování.
* `JAX-RS` → REST API.

---

## 1. Java runtime a ekosystém
- **JVM** – spouští bytecode
- **JRE** – JVM + knihovny → běhové prostředí
- **JDK** – JRE + vývojářské nástroje (`javac`, `javadoc`)
- **Build nástroje** – Maven, Gradle

## 2. PODROBNEJI
**JVM** – spouští bytecode<br>
JVM (Java Virtual Machine)<br>

Spouští bytecode (soubor .class), který vzniká překladem .java zdrojového kódu.<br>

Díky JVM je Java platformově nezávislá („Write once, run anywhere“).<br>

Zajišťuje správu paměti (heap, stack, garbage collector).<br>

**JRE (Java Runtime Environment)**

Obsahuje JVM + standardní knihovny.<br>

Stačí, pokud chceš pouze spouštět aplikace v Javě (bez kompilace).<br>

**JDK (Java Development Kit)**

Obsahuje JRE + vývojové nástroje (javac, javadoc, jarsigner atd.).<br>

Potřebuješ ho pro vývoj aplikací<br>.

📌 **Shrnutí:**

**JVM** = běhový stroj

**JRE** = běhové prostředí (JVM + knihovny)

**JDK** = celé vývojářské prostředí (JRE + nástroje)

---

## 2. Enterprise Java
### Servlety

Java třídy, které běží v servletovém kontejneru (Tomcat, Jetty, WildFly).<br>
Zpracovávají HTTP požadavky a odpovědi.<br>
Typicky metoda doGet() a doPost().<br>

```java
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().write("Hello World!");
    }
}
```

### JDBC
API pro práci s databází.<br>
Manuálně se řeší Connection, Statement, ResultSet.<br>

```java
Connection conn = DriverManager.getConnection(url, user, pass);
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM users");
```
### JPA (Hibernate)
ORM (Object-Relational Mapping) – mapuje třídy na tabulky..<br>
Používá anotace: @Entity, @Id, @Column..<br>
```java
@Entity
public class User {
    @Id
    private Long id;
    private String name;
}
```
**Hibernate** je nejpoužívanější implementace JPA.


### Dependency Injection

**Princip:** třída nedělá new, ale dostane závislosti zvenčí (IoC).<br>
Např. pomocí anotace @Inject nebo @Autowired (Spring).<br>
Výhoda: kód je snáze testovatelný, flexibilní, udržovatelný.<br>

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
Aplikační server implementující Jakarta EE (dříve Java EE).<br>
- Deployment: `.war`, `.ear`
- Datasource přes JNDI
- Umožňuje spustit enterprise aplikace s plnou podporou specifikace (JPA, EJB, CDI, JMS, JAX-RS…).
- Rozdíl vs. Spring: aplikační server vs. framework

Deployment<br>

Aplikace se nasazuje jako:<br>
**.war** – webová aplikace.<br>
**.ear** – enterprise aplikace (obsahuje více modulů).<br>

[vice o instalcich a jbossu  ZDE ](https://github.com/PajaspaceNet/jboss-basic-/tree/main)









