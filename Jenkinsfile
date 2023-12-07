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
        stage('Cleaning Project') {
            steps {
                script {
                    echo 'Cleaning...'
                }
            }
        }
        stage('Compile Project') {
            steps {
                script {
                    echo 'Compiling...'
                }
            }
        }
        stage('Tests') {
            steps {
                script {
                    echo 'Tests...'
                }
            }
        }
        stage('Build Project') {
            steps {
                script {
                    echo 'Build Project'
                }
            }
        }
        stage('Security check') {
            steps {
                script {
                    echo 'Security check'
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
