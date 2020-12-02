FROM openjdk:8-jdk-alpine
MAINTAINER sky8chi
LABEL app=pay_gateway
RUN addgroup -S spring && adduser -S spring -G spring
RUN mkdir -p /data/log/opensource/pay/logs && chown spring:spring /data/log/opensource/pay/logs
RUN echo "Asia/Shanghai" > /etc/timezone
USER spring:spring
VOLUME /logs
ARG JAR_FILE=target/roncoo-pay-web-gateway.war
COPY ${JAR_FILE} app.war
ENTRYPOINT ["java","-jar","/app.war"]