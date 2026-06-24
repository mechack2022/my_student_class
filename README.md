# 🌱 Java From Scratch — A Tutor-Led, Real-World Workflow Repository

> A structured learning repository where I teach Java and Spring Boot to a complete beginner — using the same Git workflow professional development teams use every day.

This isn't a repo of solved tutorial exercises. Every task here is assigned, reviewed, and merged the way it would be on a real engineering team: **Issue → Branch → Pull Request → Code Review → Merge.** If you're a tutor, mentor, or self-taught developer looking for a structured way to teach (or learn) real-world Git workflow alongside the language itself, feel free to use this as a template.

---

## 📌 What This Repository Is

I'm a **tutor** mentoring a student who is learning Java from **zero prior coding experience**. Rather than just reviewing code over email or a call, I run this repo as a live simulation of a real software team:

- I assign tasks as GitHub **Issues**, broken down into clear, achievable steps
- My student writes the code on their own **branch**
- They open a **Pull Request** when they believe the task is complete
- I **review** the code, leave feedback, and either request changes or approve
- Once approved, it gets merged into `main`

No direct pushes to `main` for anyone — every change goes through review, exactly like a real production codebase.

## 🛠️ Tech Stack

| Area | Tools |
|---|---|
| Language | Java |
| Framework | Spring Boot |
| Build Tool | Maven |
| Version Control | Git & GitHub |
| Workflow | Issues, Branch Protection, Pull Requests, Code Review |

## 🎯 Why I Teach This Way

Most beginners learn syntax in isolation, then get thrown into a job where Git workflow, code review, and collaboration matter just as much as the language itself. I structure my tutoring so my student learns **both at once** — by the time they're job-ready, reading a task, branching, committing, and responding to review feedback is already second nature, not a separate skill they have to pick up later.

If you're another tutor, a mentor, or someone designing a self-taught curriculum, feel free to fork this structure, star the repo, or reach out with suggestions.

---

## 📋 How Tasks Work (Issues)

Every task starts as an **Issue** in the [Issues tab](../../issues). Each one I write includes:

- The objective (what to build or fix)
- A checklist of sub-steps
- Difficulty level (beginner / intermediate / advanced)
- Due date
- Helpful resources or hints

The student is assigned to the Issue before they begin any work on it.

---

## 🔀 How My Student Makes a Pull Request (Step-by-Step)

This is the exact process my student follows for every assigned task:

### 1. Pick up the assigned Issue
Find the Issue assigned to them in the **Issues** tab and read the requirements carefully before writing any code.

### 2. Update local `main` branch
Before starting anything new, pull the latest changes:
```bash
git checkout main
git pull origin main
```

### 3. Create a new branch for the task
Never work directly on `main`. Create a branch using this naming pattern:
```
studentname/issue-##-short-description
```
Example:
```bash
git checkout -b sarah/issue-12-login-validation
```

### 4. Write the code
Complete the task based on the Issue requirements, committing along the way with clear messages:
```bash
git add .
git commit -m "Add email format validation to login form"
```

### 5. Push the branch to GitHub
```bash
git push origin sarah/issue-12-login-validation
```

### 6. Open a Pull Request
On GitHub, open a PR from the task branch into `main`. The repo's **PR template** automatically loads and prompts for:
- Which Issue it closes (`Closes #12`)
- What was done
- How it was tested
- A pre-merge checklist (branch up to date, code runs, no leftover debug statements, etc.)

### 7. Request review from the tutor
Tag me as the reviewer. **Students cannot merge their own PRs** — the repo is protected so every change needs at least one approval first.

### 8. Respond to feedback
I review the code and either:
- ✅ Approve it → it merges into `main`, and the linked Issue closes automatically
- 🔁 Request changes → the student updates the same branch and pushes again; the PR updates automatically, no need to open a new one

### 9. Branch cleanup
Once merged, the branch is deleted (GitHub usually prompts this), and the student pulls a fresh `main` before starting the next task.

---

## 🔒 Why `main` Is Protected

This repository uses **branch protection rules**, meaning:
- No one can push directly to `main`, including the student
- Every change must go through a Pull Request
- At least one review/approval is required before merging

This mirrors how real production codebases are protected at most companies, so the student is learning the actual habits of a professional developer, not just the syntax of a language.

---

## 📈 Progress Tracking

All tasks are tracked on the repository's [Project board](../../projects), organized by status (`To Do`, `In Progress`, `In Review`, `Done`) — giving a clear, real-time view of what the student is actively working on and what's been completed.

---

## 🤝 Following Along / Using This Template

This repo is primarily a structured teaching log, but if you're a tutor, mentor, or self-taught learner:
- Feel free to ⭐ star it for inspiration on structuring a teaching or learning repo
- Open a Discussion if you have suggestions or feedback on the workflow
- Fork it if you want to set up the same Issue/PR teaching structure for your own students

---

*This repository is a living record of teaching Java from absolute zero through real engineering workflow — every merged PR represents a task genuinely understood and reviewed, not just completed.*
