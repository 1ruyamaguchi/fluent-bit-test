FROM openjdk:17

# イメージビルド用の環境変数
ARG jarFile="fluentbittest-0.0.1-SNAPSHOT.jar"
ARG jarFilePath="/nob/server/jar"

# コンテナ内で使う環境変数
ENV JAR_FILE=${jarFile}
ENV JAR_FILE_PATH=${jarFilePath}

RUN mkdir -p ${jarFilePath}

COPY ./jar/${jarFile} ${jarFilePath}

CMD java -jar ${JAR_FILE_PATH}/${JAR_FILE}