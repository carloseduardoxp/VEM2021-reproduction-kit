Readability and Understandability Scores for Snippet Assessment: an Exploratory Study
=========================================================================================

```
Readability and Understandability Scores for Snippet Assessment: an Exploratory Study
Carlos Eduardo C. Dantas; Marcelo A. Maia
```

[![DOI](https://zenodo.org/badge/138428994.svg)](https://zenodo.org/10.5281/zenodo.5224346)

Prerequisites
-----------------------------------------------------------

Note: all the experiments were conducted over a server equipped with 86 GB RAM, 3.1 GHz on 12 cores and 64-bit Linux Mint Cinnamon operating system. We strongly recommend a similar or better hardware environment. The operating system however could be changed.

Softwares:

```
1. Java 1.8+
2. Eclipse IDE for Java EE developers or Spring Tool Suite
3. RStudio
```

Step 1 - Select Queries
-----------------------------------------------------------

Location: 1-Select Queries

Files: 
   - queries.csv:  with the processed queries (removing stop words and punctuation) and the count of used as input in [CROKAGE tool](http://isel.ufu.br:9000/)
   
Step 2 - Extracting Code Snippets
-----------------------------------------------------------

Location: 2-Extract Code Snippets

Folders: 
   - snippets: the extracted code snippets for 30 selected queries using CROKAGE and GOOGLE as code search engines. This is a manual process.
Files
   - SnippetsMap.xlsx : information about the extracted code snippets, as ranking on code search engines, the web site with each code snippet, the readability and understandability scores values.
  
Step 3 - Collect Metrics
-----------------------------------------------------------

Location: 3-Collect Metrics
Folders: 
   - readability: you can run the tool rsm.jar. The readability scores will be generated in readability.txt file.

```
java -jar rsm.jar %YOUR_PATH%/VEM_2021_Replication_Package/'2-Extract Code Snippets'/snippets/**/*.java > %YOUR_PATH%/VEM_2021_Replication_Package/'3-Collect Metrics'/readability.txt
```
   
   - understandability: you can import the Understandability-Sonar Eclipse Project as Maven Project and run the main class org.Understandability.java. In this main class, change the path variable
   
```
String path = "%YOUR_PATH%/VEM_2021_Replication_Package/2-Extract Code Snippets/snippets";
```

The console will output the metric values for all java classes inside this directory. The output can be shown at understandability.txt file.

PS: in this Eclipse project we're using the same implementations of AST and SONAR Cognitive Complexity. We just adapted our source code to sum the Cognitive Complexity of each visited method, as you can see on org.CheckUnderstandability class.

Step 4 - Developers Evaluation
-----------------------------------------------------------


Location: 4-Developers Evaluation

In this step, we created the survey. You can see the questions and even answer (if you want) on the followed link: https://docs.google.com/forms/d/e/1FAIpQLScgznWH5BAQERB08SWuNgOElsWMaHWJo5vw46cdvfGZsauUYw/viewform

To create the survey, we splitted the 30 questions as you can see on the General sheet in the file SnippetsMap.xlsx

For example: 
    - Query 6 has the understandability criteria and the best snippet is in the right side. 
    
    - Query 7 has the readability criteria and the best snippet is in the left side.
    
The five developers answers can be accessed on developersGoogleDocsEvaluation.csv file.





