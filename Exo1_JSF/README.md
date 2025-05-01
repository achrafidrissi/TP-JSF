# JSF Training – Exercices Pratiques

Ce projet regroupe deux exercices simples réalisés avec **Jakarta EE / JSF**, dans le cadre d'un TP de prise en main de JavaServer Faces (JSF).

## 📁 Structure du projet

```
TP/
│
├── Exo1_JSF/    # Exercice 1 : Affichage des 5 entiers suivants
│   ├── pom.xml
│   └── src/...
│
├── Exo2_JSF/    # Exercice 2 : Formulaire avec validation personnalisée
│   ├── pom.xml
│   └── src/...
```

---

## 🧪 Exercice 1 – Affichage des nombres suivants

### 🎯 Objectif :
Créer un formulaire JSF permettant la saisie d’un entier, et afficher les 5 entiers suivants dans une autre page.

### 🔧 Fonctionnalités :
- Formulaire avec champ `<h:inputText>` pour entrer un entier
- Redirection vers une page JSF affichant les 5 entiers suivants via `<ui:repeat>`
- Lien de retour vers le formulaire via `<h:commandLink>`

---

## 🧪 Exercice 2 – Formulaire avec validation

### 🎯 Objectif :
Créer un formulaire complet avec validation personnalisée de l’e-mail et vérification du format de la date de naissance.

### 🔧 Fonctionnalités :
- Champs : nom, prénom, email, genre, date de naissance
- Validation JSF personnalisée via méthode `validateEmail(...)`
- Utilisation de `<f:convertDateTime>` pour valider la date
- Gestion des messages d’erreur avec `<h:message>`
  
---

## 🚀 Technologies utilisées

- Java 21
- Jakarta EE / JSF
- Maven
- WildFly / TomEE (ou tout serveur Jakarta EE compatible)
- IntelliJ IDEA

---

## 📦 Lancer un exercice

```bash
cd Exo1_JSF
mvn clean package
```

Puis déployer le `.war` dans votre serveur JSF (WildFly, TomEE, Payara...)

---

## 📚 Références utiles

- [JSF Validation – koor.fr](https://koor.fr/Java/TutorialJEE/jee_jsf_validation.wp)
- [Jakarta EE – Official Website](https://jakarta.ee/)

--
