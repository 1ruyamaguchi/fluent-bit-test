USER_NAME="1ruyamaguchi"
REPOSITORY_NAME="fluent-bit-test"
VERSION=1

# イメージをビルド
docker build -t ${USER_NAME}/${REPOSITORY_NAME}:${VERSION} .