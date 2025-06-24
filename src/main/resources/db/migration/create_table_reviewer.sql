CREATE TABLE reviewer (
    user_name VARCHAR(100) PRIMARY KEY, -- Unique identifier
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    date_of_birth DATE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(150) NOT NULL,
    phone_number VARCHAR(20),
    address VARCHAR(255),
    city VARCHAR(100),
    country VARCHAR(100),
    biographie TEXT,
    study_level VARCHAR(100),
    profile_picture VARCHAR(255),
    cv VARCHAR(255)
);
