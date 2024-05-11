# Microservice ISTIO

A brief description of what the project does:
- Installation of Minikube: Minikube is installed to create a local Kubernetes environment for testing and development purposes. Minikube simplifies the setup process and allows you to run Kubernetes clusters on a single machine.
- Installation of kubectl: kubectl, the Kubernetes command-line tool, is installed to interact with the Kubernetes clusters.
- Installation of Google Cloud SDK: For deployment on Google Cloud Platform (GCP), you need to install the Google Cloud SDK, which provides command-line tools for managing resources on GCP.
- Setup of Google Cloud Project: Create or select a project on Google Cloud Platform for deploying the microservices application.
- Installation of Istio: Istio is installed on the Kubernetes cluster using the istioctl command-line tool. Istio provides features like traffic management, security, and observability for microservices running on Kubernetes.
- Build Docker Images: Docker images for each microservice are built using Maven. These images contain the application code and dependencies needed to run the microservices.
- Run Containers: Once the Docker images are built, they are deployed to the Kubernetes cluster using kubectl commands. Pods containing the microservice containers are created, and Kubernetes services are used to expose these microservices to other parts of the system.
- Accessing the Application: Finally, you can access the deployed microservices application through the Istio gateway endpoint exposed on Google Cloud Platform. This allows you to interact with the microservices via HTTP requests.
