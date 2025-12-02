pipeline {
    agent any

    triggers {
            // каждые ~5 минут Jenkins проверяет, есть ли новые коммиты
            pollSCM('H/5 * * * *')
        }

    tools {
        maven 'maven-3'   // имя Maven из Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Archive') {        // ← дополнительная стадия для лабы
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}