# springboot-autodeloyment-aws
    1. Deploy spring app to EC2
    2. Build CI/CD jenkins deploy spring app to EC2
#### 1. Follow Deploy Spring App To Amazon EC2
     * Steps by steps:
        1. Pull source code from Git
        2. Build source code (Build jar)
        3. Build docker image (--platform linux/arm64)
        4. Push docker image to Docker Hub and remove docker image at step 3
        5. Docker login AWS
        6. Pull docker image from Docker Hub
        7. Create Amazon ECR repository
        8. Push docker image (at step 6) to Amazon ECR repository
        9. At Amazon ECS: define Task Definition for docker image at step 8 (Setting port 8005 to run app)
        10. At Amazon ECS: create Cluster (auto create new Amazon EC2)
        11. Setting and testing connect EC2 (setting port at Security Groups open port 22, 8005)
        12. At Cluster: run Task Definition
        13. Access link link EC2 to confirm (Public IPv4 DNS)
     * Issue:
        1. Docker image build at local (chip apple M1) can't run on EC2 (Linux/Unix).
           => Push docker image to Docker Hub.
              Then, pull dock image from Docker Hub and push to Amazon Elastic Registry(ECR)
           (Build Multi-Architecture Docker Images with BuildX | Deploy containers to x86 and ARM!)
     * Note:
        1. Git
        2. Docker
        3. Amazon Web Service
           - Amazon Elastic Registry (ECR)
           - Amazon Elastic Service (ECS)
             + Task definition
             + Cluster
             + EC2
#### 2. Build CI/CD jenkins deploy spring app to EC2
     * Refer link:
        https://medium.com/@KTree_Blog/auto-deployment-of-spring-boot-applications-to-aws-ecs-with-jenkins-3ef5245f5e7e
        
   
