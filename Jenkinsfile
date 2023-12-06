pipeline {

    agent any
 
    stages {

        stage('Checkout') {

            steps {

                // Checkout your code from the repository

                git 'https://github.com/devops-realestate/Real-Estate-Listing-Application.git'

            }

        }
 
        stage('Build Docker Image') {

            steps {

                // Run docker-compose build command to build the image

                script {

                    def dockerCmd = "docker-compose -f docker-compose.yml build"

                    sh(script: dockerCmd, returnStatus: true)

                }

            }

        }

    }

}
