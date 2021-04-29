# springboot-autodeloyment-aws
#### 1. Follow Deploy Spring App To Amazon EC2
        1. Pull source code from Git
        2. Build source code (Build jar)
        3. Build docker image (--platform linux/arm64)
        4. Push docker image to Docker Hub
        5. Docker login AWS
        6. Pull docker image from Docker Hub
        7. Create Amazon ECR repository
        8. Push docker image to Amazon ECR repository
        9. At Amazon ECS: define Task Definition for docker image at step 8 (Setting port to run app)
        10. At Amazon ECS: create Cluster (auto create new Amazon EC2)
        11. Setting and testing connect EC2 (setting port at Security Groups)
        12. At Cluster: run Task Definition
        13. Access link link EC2 to confirm (Public IPv4 DNS)
