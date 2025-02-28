def push_Docker_Image(String DockerHubUserName, String DockerHubPass, Sringe ImageName, String ImageTag){
  echo "start pushing Image on Docker Hub"
  sh "docker login -u ${DockerHubUserName} -p {DockerhubPass}"
  sh "docker tag ${ImageName}:${ImageTag} ${DockerHubUserName}/${ImageName}:${ImageTag}"
  sh "docker push ${DockerHubUserName}/${ImageName}:${ImageTag}"
  echo "Docker Image pushed on Dockerhub successfully"
}
