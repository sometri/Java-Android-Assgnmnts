# Java-Android-Assgnmnts
Android Assignment Project

This repository contains an Android application with three main activities demonstrating various functionalities like event handling and currency conversion.

Table of Contents

- Introduction
- Features
- Installation
- Usage
- Code Overview
- Screenshots
- License

Introduction

This project is a simple Android application developed as part of an assignment. It consists of three main activities:

1. MainActivity: The main screen of the application.
2. EventHandlerActivity: An activity demonstrating button click event handling.
3. ExchangeRateActivity: An activity for converting currencies.

Features

- MainActivity:
  - Displays two images.
  - Navigates to EventHandlerActivity and ExchangeRateActivity on image click.

- EventHandlerActivity:
  - Displays a button that navigates back to MainActivity when clicked.

- ExchangeRateActivity:
  - Converts KHR to USD and EUR, and vice versa.
  - Uses a spinner to select the currency type.
  - Displays the converted values based on the input amount.

Installation

To run this project, follow these steps:

1. Clone the repository:

    git clone https://github.com/yourusername/your-repo-name.git

2. Open the project in Android Studio.
3. Build the project to install the required dependencies.
4. Run the application on an emulator or a physical device.

Usage

MainActivity

- On launching the app, you will see the main screen with two images.
- Click on the first image to navigate to the EventHandlerActivity.
- Click on the second image to navigate to the ExchangeRateActivity.

EventHandlerActivity

- This screen contains a button.
- Click the button to return to the MainActivity.

ExchangeRateActivity

- This screen allows you to convert currencies.
- Select a currency type from the dropdown menu.
- Enter the amount in KHR and see the equivalent in USD and EUR.

Code Overview

- MainActivity.java
  Handles the main screen with two clickable images that navigate to different activities.
  
  public class MainActivity extends AppCompatActivity {
      // Code for MainActivity
  }

- EventHandlerActivity.java  
  Contains a button that navigates back to the main screen when clicked.
  
  public class EventHandlerActivity extends AppCompatActivity {
      // Code for EventHandlerActivity
  }

- ExchangeRateActivity.java
  Handles currency conversion and displays the results based on user input.
  
  public class ExchangeRateActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
      // Code for ExchangeRateActivity
  }

- Screenshots
  see: img-results folders

License
This project is licensed under the Mr. OENG Sometri's License. See the LICENSE file for details. It is for free.
