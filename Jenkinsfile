pipeline {
    agent any
    
    stages {
        stage('Clean') {
            steps {
                // Clean the project
                sh 'mvn clean'
            }
        }
        stage('Install') {
            steps {
                // Install project dependencies
                sh 'mvn install -DskipTests=true'
            }
        }
        stage('Compile') {
            steps {
                // Compile the project
                sh 'mvn compile'
            }
        }
        stage('Verify') {
            steps {
                // Run project tests
                sh 'mvn verify'
            }
        }
    }
}

