CREATE TABLE article (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    
    username_author VARCHAR(100),
    username_editor VARCHAR(100),
    
    username_reviewers TEXT,   -- store as JSON or comma-separated string
    
    status VARCHAR(50),
    category VARCHAR(100),
    tags TEXT,                 -- array stored as JSON or comma-separated
    reviews TEXT,
    
    date_of_publication DATE NULL,
    date_of_creation DATE NULL,
    date_of_modification DATE NULL,

    image_cover VARCHAR(255),
    comments TEXT,
    likes TEXT,

    -- Foreign key constraints
    CONSTRAINT fk_author FOREIGN KEY (username_author) REFERENCES author(user_name),
    CONSTRAINT fk_editor FOREIGN KEY (username_editor) REFERENCES editor(user_name)
);