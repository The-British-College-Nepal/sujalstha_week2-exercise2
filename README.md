# 🔤 SSD Interactive Lab: Java Interfaces & Decoupled Architecture
**Software Systems Development (CRN 12391) · Level 5**  
**The British College (Leeds Beckett University) · Sudan Pudasaini**

```
Progress: [████████████░░░░░░] Step 2 of 3 (In Progress)
```

---

## ✅ Step 1 Complete! Excellent work on `Counter.java`!

You successfully declared the `Counter` interface contract and practiced the Git feature branch workflow.

Now, let's implement the concrete class that fulfills this contract.

---

## 🌿 Step 2 Git Workflow: Create Your Feature Branch

Before writing code for Step 2, create and switch to a fresh feature branch:

```bash
# 1. Ensure you have the latest updates on main
git checkout main
git pull origin main

# 2. Create and switch to your Step 2 feature branch
git checkout -b feature/step2-wordprocessor
```

---

## 📝 Step 2: Implement `WordProcessor.java`

Open [`src/main/java/counter/WordProcessor.java`](src/main/java/counter/WordProcessor.java) in your IDE.

Notice the class header:
```java
public class WordProcessor implements Counter
```
By using the **`implements`** keyword, `WordProcessor` enters into a contract: it promises the Java compiler that it will provide concrete bodies for all methods declared in `Counter`.

### Your Tasks:

1. **Implement `countWords(String sentence)`:**
   * Words are separated by single spaces.
   * Use Java's `String.split(" ")` method:
     ```java
     return sentence.split(" ").length;
     ```
   * Handle the empty string: if `sentence.isEmpty()`, return `0`.

2. **Implement `countLetters(String sentence)`:**
   * Iterate through the sentence character by character:
     ```java
     int letters = 0;
     for (int i = 0; i < sentence.length(); i++) {
         char ch = sentence.charAt(i);
         if (Character.isLetter(ch)) {
             letters++;
         }
     }
     return letters;
     ```
   * Notice that `Character.isLetter()` only increments for alphabetic characters (`a-z`, `A-Z`). Punctuation, symbols, spaces, and numbers (`0-9`) are correctly ignored!

3. **Implement `getLength(String sentence)`:**
   * Return the total character count:
     ```java
     return sentence.length();
     ```
   * Note: The length of a sentence includes spaces and punctuation symbols.

---

## 🧪 How to Verify Step 2 Locally

Run both Step 1 and Step 2 unit tests:

```bash
mvn test -Dtest=Step1CounterTest,Step2WordProcessorTest
```
*(Or right-click `Step2WordProcessorTest.java` in your IDE and click **Run**).*

You should see all **10 tests pass**:
* ✅ `testCounterIsInterface`
* ✅ `testCountWordsDeclaration`
* ✅ `testCountLettersDeclaration`
* ✅ `testGetLengthDeclaration`
* ✅ `testPolymorphicContract`
* ✅ `testImplementsCounter` — Confirms `WordProcessor` implements `Counter`.
* ✅ `testPolymorphicAssignment` — Confirms `Counter wp = new WordProcessor()` compiles and instantiates.
* ✅ `testCountWords` — Tests words count for short, single, and multi-word sentences.
* ✅ `testCountLetters` — Tests filtering of letters vs spaces and digits.
* ✅ `testGetLength` — Tests string length calculations.

---

## 🚀 How to Advance to Step 3

Once your local tests pass:

```bash
# 1. Stage and commit on your feature branch
git add src/main/java/counter/WordProcessor.java
git commit -m "Step 2: Completed WordProcessor sentence analysis implementation"

# 2. Switch back to main and merge your feature branch
git checkout main
git merge feature/step2-wordprocessor

# 3. Push main to trigger the autograder!
git push origin main
```

> [!TIP]
> After pushing, wait ~15 seconds and refresh this page on GitHub (or run `git pull` locally).  
> GitHub Actions will verify your solution and update this `README.md` to unlock **Step 3: Encapsulation & Fallback State**!
