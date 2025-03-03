def call(String ImageName, String ImageTag){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred',passwordVariable: 'dockerHubPass',usernameVariable: 'dockerHubUser')]){
      echo "start pushing Image on Docker Hub"
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
      sh "docker tag ${ImageName}:${ImageTag} ${dockerHubUser}/${ImageName}:${ImageTag}"
      sh "docker push ${dockerHubUser}/${ImageName}:${ImageTag}"
      echo "Docker Image pushed on Dockerhub successfully"
    }
}
