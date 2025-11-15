# ☕ Java Template

Base Maven template with **JaCoCo**, **Checkstyle**, and **SonarCloud CI integration**.  
Designed for professional Java projects following clean code and CI/CD best practices.

---

## 🧩 Stack

- **Java 17 (Temurin)**
- **Maven 3+**
- **JUnit 5**
- **JaCoCo** — test coverage
- **Checkstyle** — code style validation
- **SonarCloud** — static analysis and quality gates
- **GitHub Actions** — CI pipeline

---

## 🚀 Continuous Integration

[![Java CI with Maven + SonarCloud](https://github.com/psteixeira23/java-template/actions/workflows/maven.yml/badge.svg)](https://github.com/psteixeira23/java-template/actions/workflows/maven.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=psteixeira23_java-template&metric=alert_status&token=32946beb29af37856301d9c18b4631f07b674a97)](https://sonarcloud.io/summary/new_code?id=psteixeira23_java-template)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=psteixeira23_java-template&metric=coverage&token=32946beb29af37856301d9c18b4631f07b674a97)](https://sonarcloud.io/summary/new_code?id=psteixeira23_java-template)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=psteixeira23_java-template&metric=code_smells&token=32946beb29af37856301d9c18b4631f07b674a97)](https://sonarcloud.io/summary/new_code?id=psteixeira23_java-template)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=psteixeira23_java-template&metric=bugs&token=32946beb29af37856301d9c18b4631f07b674a97)](https://sonarcloud.io/summary/new_code?id=psteixeira23_java-template)

---

## 🧱 Structure

```
java-template/
├── .github/workflows/maven.yml       # CI pipeline
├── config/checkstyle/google_checks.xml
├── src/
│   ├── main/java/com/patrick/App.java
│   └── test/java/com/patrick/AppTest.java
├── pom.xml
└── sonar-project.properties
```

---

## 🧪 Run Locally

```bash
# Compile & test
mvn clean verify

# Run Checkstyle
mvn checkstyle:check

# Generate JaCoCo report
mvn jacoco:report
```

Reports will be available at:

```
target/site/jacoco/index.html
```

---

## ☁️ SonarCloud

Project dashboard:  
👉 [https://sonarcloud.io/project/overview?id=psteixeira23_java-template](https://sonarcloud.io/project/overview?id=psteixeira23_java-template)

---

## 🧾 License

Licensed under the [MIT License](LICENSE).

---

## 🤝 Contributing

1. Fork this repository
2. Create a new branch (`git checkout -b feature/my-feature`)
3. Commit your changes using [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/)
4. Push to your branch and open a Pull Request

💡 Every PR triggers:

- Unit tests (JaCoCo 80% minimum coverage)
- Code style validation (Checkstyle)
- Static analysis (SonarCloud)
- Quality Gate review before merge

---

## ✨ Commit Convention

This template follows [Conventional Commits](https://www.conventionalcommits.org/):

- `feat:` – new feature
- `fix:` – bug fix
- `chore:` – maintenance or CI updates
- `docs:` – documentation changes
- `test:` – adding or refactoring tests

Example:

```
feat(api): add fruit creation endpoint
fix(ci): correct Maven cache key on GitHub Actions
```

---

## 🧠 About

Created and maintained by **Patrick Teixeira** 🇧🇷  
Backend Engineer | Java • Go • AWS • Clean Architecture • CI/CD

> “Quality is never an accident; it is always the result of intelligent effort.” – John Ruskin
