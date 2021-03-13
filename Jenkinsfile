pipeline{
    agent {
        label 'slaveTest1'
    }
    tools { 
        maven 'maven-3.6.3' 
        jdk 'jdk-1.8' 
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test'
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
