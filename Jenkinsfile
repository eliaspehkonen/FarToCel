pipeline {
    agent any

    environment {
        PATH = "${env.PATH}:/usr/local/bin" // Update the PATH to include the directory of cmd.exe
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/eliaspehkonen/FarToCel.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }

            post {
                success {
                    // Publish JUnit test results
                    junit '**/target/surefire-reports/TEST-*.xml'

                    // Generate JaCoCo code coverage report
                    jacoco(execPattern: '**/target/jacoco.exec')
                }
            }
        }
    }
}
