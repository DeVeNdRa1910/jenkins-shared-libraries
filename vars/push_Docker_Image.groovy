def call(String ImageName, String ImageTag){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred',passwordVariable: 'dockerHubPass',usernameVariable: 'dockerHubUser')]){
      echo "start pushing Image on Docker Hub"
      sh "docker login -u ${env.usernameVariable} -p ${env.passwordVariable}"
      sh "docker tag ${ImageName}:${ImageTag} ${env.usernameVariable}/${ImageName}:${ImageTag}"
      sh "docker push ${env.usernameVariable}/${ImageName}:${ImageTag}"
      echo "Docker Image pushed on Dockerhub successfully"
    }
}
