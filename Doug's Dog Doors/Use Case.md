# 🐶 Todd and Gina’s Dog Door (Version 2.0)

## 🎯 Use Case: What the Door Does

| Step | Action | Requirement |
|------|--------|-------------|
| 1 | Fido barks to be let out | N/A |
| 2 | Todd or Gina hears Fido barking | N/A |
| 3 | Todd or Gina presses the remote control button | 2 |
| 4 | The dog door opens | 2 |
| 5 | Fido goes outside | 1 |
| 6 | Fido does his business | N/A |
| 6.1 | The door shuts automatically | 3 |
| 6.2 | Fido barks to be let back inside | N/A |
| 6.3 | Todd or Gina hears Fido barking (again) | N/A |
| 6.4 | Todd or Gina presses the remote button again | 2 |
| 6.5 | The dog door opens (again) | 2 |
| 7 | Fido goes back inside | 1 |
| 8 | The door shuts automatically | 3 |

---

## 💡 What is a Use Case?

A **use case** describes what a system does to achieve a **specific customer goal**.

It helps us:
- Understand system behavior  
- Identify missing requirements  
- Prepare for things going wrong  

---

## 🤔 Edge Cases & Questions

These questions help uncover potential issues:

- **Step 1:**  
  What if Fido scratches instead of barking?

- **Step 2:**  
  What if Todd and Gina aren’t home?  
  What if they don’t hear Fido?

- **Step 3:**  
  What if Fido barks for another reason (hungry, excited)?

- **Step 4:**  
  What happens if the door jams?  
  Is this a hardware issue?

- **Step 5:**  
  What if Fido doesn’t go outside?

- **Step 6:**  
  What if the door closes before Fido returns?

---

## 📌 Key Characteristics of a Use Case

1. **Provides Value**  
   - Must help the customer achieve a goal  

2. **Has Clear Start & End**  
   - A defined beginning and completion condition  

3. **Has an External Initiator**  
   - Triggered by something outside the system  
   - (Person, animal, or external event)

---

## 🧪 Requirement Mapping Task

- Each step in the use case is mapped to a requirement number  
- If no requirement applies → use **N/A**  
- This ensures **all system behavior is covered**

✅ Our requirements cover all necessary actions  
➡️ We are now ready to implement the code

---

## 🚀 Next Step
> **Now read the code diff**