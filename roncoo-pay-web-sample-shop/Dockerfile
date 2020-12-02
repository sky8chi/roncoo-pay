FROM openjdk:8-jdk-alpine
MAINTAINER sky8chi
LABEL app=pay_sample-shop
RUN addgroup -S spring && adduser -S spring -G spring
# 图形验证码需要依赖系统组件
RUN apk add --update --no-cache ttf-dejavu fontconfig \
    && rm -rf /var/cache/apk/* \
    && mkdir -p /data/log/opensource/pay/logs \
    && chown spring:spring /data/log/opensource/pay/logs
USER spring:spring
VOLUME /logs
ARG JAR_FILE=target/roncoo-pay-web-sample-shop.war
COPY ${JAR_FILE} app.war
ENTRYPOINT ["java","-jar","/app.war"]