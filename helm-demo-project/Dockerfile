FROM public.ecr.aws/docker/library/openjdk:11.0.16
ARG JAR_FILE=target/helm-demo-project*.jar 
COPY ${JAR_FILE} app.jar 
ENTRYPOINT ["java","-jar","/app.jar"] 
EXPOSE 80 
CMD ["echo" "Helm Demo Project appplication executed successfully!"] 