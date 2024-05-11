#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "marwa" <<-EOSQL
    CREATE DATABASE dbshipping;
    GRANT ALL PRIVILEGES ON DATABASE dbshipping TO marwa;
    CREATE DATABASE dbinvoicing;
    GRANT ALL PRIVILEGES ON DATABASE dbinvoicing TO marwa;
    CREATE DATABASE dborder;
    GRANT ALL PRIVILEGES ON DATABASE dborder TO marwa;
EOSQL
