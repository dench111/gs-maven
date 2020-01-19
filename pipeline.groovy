pipeline {
   agent {
    node {
      label " "
    }
   }
    stages {
        stage('build') {
            steps {
               script {
                def workspace = "/var/lib/jenkins/workspace/JavaProject_Pipeline/initial"
                sh "chmod ugo+rwx $workspace/*"
                sh "export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-i386/bin/java"
                sh "export JRE_HOME=/usr/lib/jvm/java-8-openjdk-i386/jre/bin/java"
               }
                sh 'mvn compile -f /var/lib/jenkins/workspace/JavaProject_Pipeline/initial'
            }
        }
    }
}
