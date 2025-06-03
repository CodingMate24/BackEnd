pipeline {
    agent any
    stages {
        stage('Prepare'){
            steps {
                git credentialsId : 'github',
                    branch : 'feature/seungho_v2',
                    url : 'https://github.com/CodingMate24/BackEnd.git'
            }
        }
        stage('test') {
            steps {
                echo 'test stage'
            }
        }
        stage('build') {
            steps {
                echo 'build stage'
            }
        }
        stage('docker build') {
            steps {
                echo 'docker build stage'
            }
        }
    }
}