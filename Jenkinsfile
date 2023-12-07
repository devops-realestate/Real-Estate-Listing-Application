pipeline {
    agent any

    environment {
      PATH = "C:/Program Files/Apache Maven/apache-maven-3.8.2-bin/apache-maven-3.8.2/bin"
    }
 
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/devops-realestate/Real-Estate-Listing-Application.git'
            }
        }
 
        stage('Clean project') {
            steps {
                dir('backend') {
                    script {
                        echo "Cleaning Project..."
                        sh 'mvn clean'
                    }
                }
            }
        }
 
        stage('Compile code') {
            steps {
                dir('backend') {
                    script {
                        echo "Compile project..."
                        sh 'mvn compile'
                    }
                }
            }
        }
 
        stage('Build') {
            steps {
                dir('backend') {
                    script {
                        echo "Building..."
                        sh 'mvn clean install'
                    }
                }
            }
        }
    }
 
    post {
        success {
            echo 'Pipeline successful!'
            // Add any post-success actions or notifications here
        }
        failure {
            echo 'Pipeline failed!'
            // Add any post-failure actions or notifications here
        }
    }
}
