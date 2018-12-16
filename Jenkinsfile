pipeline {
    agent any
    triggers { cron('H */4 * * 1-5') }
    stages {
        stage('build') {
            steps {
                bat 'gradle build -x test'
            }
        }
        stage('test') {
            steps {
                bat 'gradle test'
            }
        }
    }
}