heroku apps:create moskalevms-market-admin-ui
heroku addons:create heroku-postgresql:hobby-dev --app moskalevms-market-admin-ui
heroku config:set JDBC_DRIVER_CLASS=org.postgresql.Driver HIBERNATE_DIALECT=org.hibernate.dialect.PostgreSQLDialect --app moskalevms-market-admin-ui
