pipeline {
    agent any
    triggers { cron('H */4 * * 1-5') }
    stages {
        stage('build') {
            steps {
                bat 'mvn --version'
            }
        }
        stage('test') {
            steps {
                bat 'gradle -v'
            }
        }
    }
}