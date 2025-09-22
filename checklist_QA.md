# ✅ Java Support Checklist (Q&A)

Krátký přehled základů Javy a enterprise prostředí, co se hodí znát pro aplikační support.

---

## 1. Java základy
- ❓ `==` vs `.equals()`  
  ✅ `==` porovnává reference (adresy v paměti), `.equals()` obsah (hodnotu).
- ❓ Kolekce v Javě  
  ✅ `List` = seznam s pořadím, `Set` = unikátní prvky, `Map` = klíč → hodnota.
- ❓ String vs StringBuilder  
  ✅ `String` je neměnný, `StringBuilder` je měnitelný a rychlejší pro úpravy textu.
- ❓ Výjimky  
  ✅ `try-catch-finally`, `throw` hází výjimku, `throws` deklaruje, že ji metoda může vyhodit.

---

## 2. JVM a runtime
- ❓ Rozdíl JVM, JRE, JDK  
  ✅ JVM = virtuální stroj, JRE = JVM + knihovny, JDK = JRE + nástroje (pro vývoj).
- ❓ Heap vs Stack  
  ✅ Heap = objekty, Stack = volání metod a lokální proměnné.
- ❓ Garbage Collector  
  ✅ Automaticky uvolňuje paměť nepoužívaných objektů.
- ❓ Typické chyby  
  ✅ `NullPointerException` = přístup k null,  
  ✅ `OutOfMemoryError` = došla paměť,  
  ✅ `ClassNotFoundException` = chybí třída v classpath.

---

## 3. Logy & debugging
- ❓ Co je stack trace?  
  ✅ Výpis volání metod při chybě, ukazuje místo, kde se aplikace „rozbila“.
- ❓ Log4j, SLF4J?  
  ✅ Frameworky pro logování, nastavují, kam a jak se chyby zapisují.

---

## 4. Web aplikace
- ❓ Co je servlet?  
  ✅ Java třída, která zpracovává HTTP požadavky (`doGet`, `doPost`).
- ❓ Co je WAR?  
  ✅ Archiv webové aplikace pro nasazení na server.
- ❓ Co je context path?  
  ✅ Cesta aplikace v URL, např. `/eshop` v `http://server/eshop/...`.

---

## 5. Databáze
- ❓ Základní SQL příkazy  
  ✅ `SELECT`, `INSERT`, `UPDATE`, `DELETE`.
- ❓ Co je JDBC?  
  ✅ API pro připojení k databázi (`Connection`, `Statement`, `ResultSet`).
- ❓ Co je JPA?  
  ✅ ORM – mapuje Java objekty na databázové tabulky, např. Hibernate.

---

## 6. JBoss / WildFly
- ❓ Jak se nasazuje aplikace?  
  ✅ Jako `.war` nebo `.ear` soubor do `deployments`.
- ❓ Co je datasource?  
  ✅ Konfigurace připojení k DB, aplikace si ji bere přes JNDI.
- ❓ Kde hledat logy?  
  ✅ `server.log`.
- ❓ Redeploy vs restart?  
  ✅ Redeploy = přenačtení aplikace, restart = restart celého serveru.

---

## 7. Enterprise služby
- ❓ Co je JPA?  
  ✅ ORM vrstva pro práci s databází pomocí objektů.
- ❓ Co je EJB?  
  ✅ Komponenty s business logikou, spravované serverem.
- ❓ Co je CDI?  
  ✅ Dependency Injection – server dodává objektům jejich závislosti.
- ❓ Co je JMS?  
  ✅ Messaging – posílání zpráv mezi aplikacemi přes fronty.
- ❓ Co je JAX-RS?  
  ✅ API pro tvorbu REST služeb (HTTP endpointů).

---

## 8. Build & deployment
- ❓ Co je Maven?  
  ✅ Build nástroj, konfigurace v `pom.xml`.
- ❓ Co je Gradle?  
  ✅ Modernější build tool, konfigurace v Groovy/Kotlin DSL.
- ❓ Co je CI/CD?  
  ✅ Automatizace build → test → nasazení.
