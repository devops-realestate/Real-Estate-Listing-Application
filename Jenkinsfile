pipeline {

    agent any

    stages {

        // Checking if pipeline works

        stage('BEGIN') {

            steps {

                sh 'echo "PIPELINE BEGINS"'

            }

        }
 
        // Clean docker container

        stage('Stopping container') {

            steps{

                script {

                    sh 'docker stop project-www'

                    sh 'docker rm project-www'

                    sh 'docker container ls'

                }

            }

        }
 
        // Clean docker images

        stage('Cleaning old images'){

            steps{

                script{

                    sh 'docker rmi project-www'

                    sh 'docker image ls'

                }

            }

        }
 
        // Building a docker image

        stage('Building image') {

            steps{

                script {

                    sh 'docker build --tag project-www:latest .'

                }

            }

        }
 
        // Listing docker images

        stage('Listing Images'){

            steps{

                script{

                    sh 'docker image ls'

                }

            }

        }
 
        // Running our image

        stage('Deploy image'){

            steps{

                script{

                    sh 'docker run --name project-www -d -p 8000:8000 project-www:latest'

                }

            }

        }

    }

}