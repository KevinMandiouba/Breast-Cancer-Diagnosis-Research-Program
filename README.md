# 🩺 Breast Cancer Diagnosis Research Program

## 📝 Project Overview
The **Breast Cancer Diagnosis Research Program** leverages machine learning to improve the diagnosis of breast cancer using the k-Nearest Neighbors (k-NN) algorithm, optimized with advanced data structures like k-D Trees and Ball Trees. The program aims to classify breast cancer as either **Malignant (M)** or **Benign (B)** based on patient data, providing high accuracy and computational efficiency.

## ✨ Features
- **Data Processing:** Reads and processes a CSV dataset containing patient records and diagnostic attributes.
- **Machine Learning Algorithms:**
  - **k-D Tree:** Efficient nearest-neighbor search in multi-dimensional space.
  - **Ball Tree:** Scalable data partitioning for large datasets.
- **Performance Metrics:** Measures accuracy and runtime for different configurations of k-NN.

## 📁 Folder Structure
- **`data.csv`**: Dataset used for training and testing
- **`Ass3.java`**: Main program execution and results display
- **`Reader.java`**: Utility for reading and processing CSV data
- **`Patient.java`**: Class representation of patient data
- **`KdTree.java`**: Implementation of k-D Tree data structure
- **`BallTree.java`**: Implementation of Ball Tree data structure
- **`Breast Cancer Diagnosis Research Project (COEN 352).pdf`**: Detailed project report

## ✅ Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8 or later**
- An IDE or text editor (e.g., IntelliJ, Eclipse)
- Basic understanding of machine learning concepts, particularly k-Nearest Neighbors.

### Setup
1. Clone this repository.
2. Place the `data.csv` file in the root directory.
3. Open the project in your preferred IDE.
4. Compile and run `Ass3.java`.

### ▶️ Running the Program
The program executes the following workflow:
1. Reads the dataset using `Reader.java`.
2. Constructs the training and testing datasets.
3. Builds the k-D Tree and Ball Tree for the training set.
4. Executes k-NN for various configurations of k (e.g., k=1, k=5, k=7).
5. Outputs accuracy and runtime for each configuration.

## 🛠️ How It Works

### Data Structures
- **k-D Tree:** Organizes data points in k-dimensional space for fast search operations.
- **Ball Tree:** Groups data into hierarchically nested hyperspheres, improving scalability.

### Algorithms
- **k-Nearest Neighbors (k-NN):** Classifies a test point based on the majority vote of its nearest neighbors.

### Dataset
The dataset includes 569 patient records with:
- Diagnostic results (Malignant or Benign).
- Ten attributes related to cell nuclei characteristics.

## 📊 Results
- **Accuracy:** Increases with training sample size.
- **Runtime:** Varies depending on tree type and k-value.
- Detailed results are available in the [Project Report](./Breast Cancer Diagnosis Research Project (COEN 352).pdf).

## 🔗 References
- UCI Machine Learning Repository: [Breast Cancer Wisconsin (Diagnostic) Data Set](https://www.kaggle.com/datasets/uciml/breast-cancer-wisconsin-data)
- Rosetta Code: [k-D Tree](https://rosettacode.org/wiki/K-d_tree)
- Wikipedia: [Ball Tree](https://en.wikipedia.org/wiki/Ball_tree)

## 👥 Authors
- **Joyal Biju Kulangara** (40237314)
- **Kevin Mandiouba** (40243497)

## ⚖️ License
This project is licensed under the MIT License. See the LICENSE file for details.
