pipeline {
    agent any
    
    stages {
        stage('Initializing Project') {
            steps {
                script {
                    echo 'Initializing...'
                }
            }
        }
        stage('Cleaning Docker') {
            steps {
                script {
                    echo 'Cleaning Docker...'
                }
            }
        }
        stage('Creating container') {
            steps {
                script {
                    echo 'Container...'
                }
            }
        }
        stage('Creating Images') {
            steps {
                script {
                    echo 'Images...'
                }
            }
        }
        stage('Listing Images') {
            steps {
                script {
                    echo 'Images...'
                }
            }
        }
        stage('Docker build Image') {
            steps {
                script {
                    echo 'Docker up...'
                }
            }
        }
    }
    
    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
