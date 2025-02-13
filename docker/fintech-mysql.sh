docker run -d \
--name fintech-mysql \
-e MYSQL_ROOT_PASSWORD="1234" \
-e MYSQL_USER="root" \
-e MYSQL_PASSWORD="fintech" \
-e MYSQL_DATABASE="fintech" \
-p 3306:3306 \
mysql:latestdo