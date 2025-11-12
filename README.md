# 🧱 Java Template

[![Build Status](https://github.com/psteixeira23/java-template/actions/workflows/ci.yml/badge.svg)](https://github.com/psteixeira23/java-template/actions/workflows/ci.yml)
[![Release](https://img.shields.io/github/v/release/psteixeira23/java-template?include_prereleases&style=flat-square)](https://github.com/psteixeira23/java-template/releases)
[![Coverage](https://img.shields.io/badge/coverage-JaCoCo-blueviolet?style=flat-square)](https://github.com/psteixeira23/java-template/actions)
[![License](https://img.shields.io/github/license/psteixeira23/java-template?style=flat-square)](LICENSE)

---

A ready-to-use **Java + Maven** template with:

- ✅ Unit tests and coverage via **JaCoCo**
- 🧹 Code style validation via **Checkstyle**
- 💬 Commit conventions via **Commitizen + Conventional Commits**
- 🚀 CI/CD via **GitHub Actions**
- 🏷️ Automatic releases and changelog generation via **standard-version**

---

## ⚙️ Tech Stack

- Java 17
- Maven
- JUnit 5
- JaCoCo
- Checkstyle
- Commitizen
- GitHub Actions

---

## 🚀 Quick Start

```bash
# Clone this template
git clone https://github.com/psteixeira23/java-template.git

# Install Node deps for commit & release automation
npm install

# Build & test
mvn clean verify

# Commit using Commitizen
npm run commit

# Create release and changelog
npm run release
git push --follow-tags
```
