pipeline {
    agent any
    stages {
        stage('Prepare'){
            steps {
                checkout(
                            [$class: 'GitSCM',
                            branches: [[name: 'feature/seungho_v2']],
                            extensions:
                            [[$class: 'SubmoduleOption',
                                disableSubmodules: false,
                                parentCredentials: true,
                                recursiveSubmodules: false,
                                reference: '',
                                trackingSubmodules: true]],
                            userRemoteConfigs:
                                [[credentialsId: 'github',
                                    url: 'https://github.com/CodingMate24/BackEnd.git']]
                            ]
                        )
            }
        }
        stage('test') {
            steps {
                echo 'test stage!'
            }
        }
        stage('build') {
            steps{
                sh'''
                    echo build start
                '''
            }
        }
        stage('docker build') {
            steps {
                echo 'docker build stage'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy stage'
            }
        }
    }
}