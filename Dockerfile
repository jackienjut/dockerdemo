FROM java:8
MAINTAINER jackie  luhaiming@cathay-ins.com.cn
VOLUME /tmp

ARG JAR_FILE
ADD ${JAR_FILE} app.jar
RUN bash -c 'touch /app.jar'
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
EXPOSE 7882
CMD ["-jar", "/app.jar"]
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Xms256m", "-Xmx512m",  "-XX:PermSize=64m", "-XX:MaxPermSize=128m", "-Xss512k"]


