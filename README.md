# 📱 Implement Menus and WebView in an Android Application

## 📌 Project Title

**Menus and WebView Android Application**

---

## 🎯 Aim

To develop an Android application that demonstrates the use of **Menus and WebView** using Kotlin and XML.

---

## 🎯 Objectives

The objectives of this experiment are:

* To understand Android Options Menu.
* To create menu items using XML.
* To handle menu item click events.
* To understand the use of `WebView`.
* To load websites inside an Android application.
* To implement basic WebView navigation.
* To provide a simple and user-friendly interface.

---

## 🛠️ Technologies Used

* **Android Studio**
* **Kotlin**
* **XML**
* **Android SDK**
* **WebView**
* **Options Menu**
* **Internet Permission**

---

# 📖 Concept / Technology

## 📋 Android Menu

An Android Menu provides a set of actions or options that users can select.

In this application, an **Options Menu** is created with three options:

* **Home**
* **Open Website**
* **Exit**

The menu is defined in an XML file called:

```text
main_menu.xml
```

The menu actions are handled inside:

```text
MainActivity.kt
```

using:

```kotlin
onCreateOptionsMenu()
```

and:

```kotlin
onOptionsItemSelected()
```

---

## 🌐 WebView

`WebView` is an Android UI component that allows web pages to be displayed inside an Android application.

This application uses WebView to load websites without opening a separate browser application.

The application initially loads:

```text
https://www.google.com
```

When **Open Website** is selected from the menu, it loads:

```text
https://www.android.com
```

---

## 🔐 Internet Permission

Since the application loads web content, Internet permission is required.

The following permission is added to `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

---

# 💡 Scenario

The application demonstrates a simple **Web Browsing Application**.

The user can:

1. Open the application.
2. View a website inside WebView.
3. Open the Options Menu.
4. Select Home.
5. Open the Android website.
6. Exit the application.
7. Navigate back through previously visited WebView pages using the device Back button.

---

# ✨ Features

* Options Menu.
* WebView integration.
* Website loading.
* Home menu option.
* Open Website menu option.
* Exit menu option.
* WebView back navigation.
* Internet permission.
* Toast messages for menu actions.
* Student name and USN displayed on the screen.

---

# 👩‍🎓 Student Details

**Name:**Devraath Joshi
**USN:** 25MCAR0091

---

# 📂 Project Folder Structure

```text
MenuWebViewDemo/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── example/
│           │           └── menuwebviewdemo/
│           │               └── MainActivity.kt
│           │
│           ├── res/
│           │   ├── layout/
│           │   │   └── activity_main.xml
│           │   │
│           │   ├── menu/
│           │   │   └── main_menu.xml
│           │   │
│           │   └── values/
│           │
│           └── AndroidManifest.xml
│
├── screenshots/
│   ├── testcase1.png
│   ├── testcase2.png
│   └── testcase3.png
│
└── README.md
```

---

# 📄 Important Files

## 1. `MainActivity.kt`

This is the main Kotlin file.

It is responsible for:

* Initializing WebView.
* Loading websites.
* Creating the Options Menu.
* Handling menu selections.
* Navigating backward through WebView history.
* Closing the application using the Exit option.

---

## 2. `activity_main.xml`

This file defines the main user interface.

It contains:

* Application title.
* Student name.
* Student USN.
* WebView.

---

## 3. `main_menu.xml`

This XML file defines the Options Menu.

The menu contains:

```text
Home
Open Website
Exit
```

---

## 4. `AndroidManifest.xml`

The Internet permission is declared in the manifest:

```xml
<uses-permission android:name="android.permission.INTERNET" />
```

This allows the WebView to access online websites.

---

# ▶️ How to Run the Application

1. Open **Android Studio**.
2. Open the `MenuWebViewDemo` project.
3. Wait for Gradle synchronization to finish.
4. Start an Android Emulator or connect an Android device.
5. Make sure the device has Internet access.
6. Click **Run ▶**.
7. The application will open.
8. The initial website will be displayed inside the WebView.
9. Open the Options Menu.
10. Select different menu options and verify their functionality.

---

# 📱 Application Output

The initial screen displays:

```text
----------------------------------

        Menus and WebView

        Name: Devraath Joshi
        USN: 25MCAR0091

       [ Website Content ]

----------------------------------
```

The Options Menu contains:

```text
⋮

Home
Open Website
Exit
```

---

# 🧪 Test Cases

## Test Case 1 – Launch Application

| Field           | Details                                                   |
| --------------- | --------------------------------------------------------- |
| Test Case ID    | TC01                                                      |
| Test            | Launch the application                                    |
| Input           | Open the application                                      |
| Expected Result | Application opens and website is displayed inside WebView |
| Status          | Pass                                                      |

### Screenshot

Save the screenshot as:

```text
screenshots/testcase1.png
```

---

## Test Case 2 – Open Website

| Field           | Details                              |
| --------------- | ------------------------------------ |
| Test Case ID    | TC02                                 |
| Test            | Open Website menu                    |
| Input           | Open menu → Select Open Website      |
| Expected Result | Android website loads inside WebView |
| Status          | Pass                                 |

The WebView should load:

```text
https://www.android.com
```

### Screenshot


<img width="1842" height="997" alt="image" src="https://github.com/user-attachments/assets/7119c534-4500-428a-a52e-461b6268ef13" />

## Test Case 3 – Home Menu

| Field           | Details                                                          |
| --------------- | ---------------------------------------------------------------- |
| Test Case ID    | TC03                                                             |
| Test            | Select Home                                                      |
| Input           | Open menu → Select Home                                          |
| Expected Result | Google homepage loads inside WebView and a Toast message appears |
| Status          | Pass                                                             |

The WebView should load:

```text
https://www.google.com
```


# 🎓 Learning Outcomes

After completing this experiment, the following concepts were understood:

* Creating an Android Options Menu.
* Defining menu items using XML.
* Handling menu item selections in Kotlin.
* Using WebView in Android.
* Loading web pages inside an application.
* Adding Internet permission.
* Handling WebView navigation.
* Using Toast messages.
* Understanding the interaction between XML and Kotlin.

---

# ⚙️ Requirements

### Software Requirements

* Android Studio
* Kotlin
* Android SDK
* Gradle

### Hardware Requirements

* Laptop or Desktop
* Android Emulator or Android Smartphone
* Internet connection

---

# ✅ Conclusion

The **Menus and WebView Android Application** was successfully developed using **Kotlin and XML in Android Studio**.

The application demonstrates how to create an Options Menu and use WebView to display web content inside an Android application. The menu provides options for navigating to the home page, opening another website, and exiting the application.

This experiment provides a basic understanding of **Android Menus, WebView, menu event handling, Internet permissions, and WebView navigation**.

---

# 📚 References

* Android Developer Documentation
* Android Studio Documentation
* Kotlin Documentation
