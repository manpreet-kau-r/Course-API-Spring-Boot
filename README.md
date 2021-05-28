# Course-API-Spring-Boot

Building Course APIs using Spring Boot (with and without database) 

GET	    =>	/topics			        =>	Get all topics	
GET	    =>	/topics/{topicId}	  =>	Get a single topic with given topicId
POST	  =>	/topics			        =>	Add a new topic
PUT	    =>	/topics/{topicId}	  =>	Update a topic with given topicId
DELETE	=>	/topics/{topicId}	  =>	Delete a topic with given topicId

GET	    =>	/topics/{topicId}/courses		          =>	Get all courses in a topic with given topicId
GET	    =>	/topics/{topicId}/courses/{courseId}	=>	Get a single course with given courseId in a topic with given topicId
POST	  =>	/topics/{topicId}/courses		          =>	Add a new course to a topic with given topicId
PUT	    =>	/topics/{topicId}/courses/{courseId}	=>	Update a course with given courseId in a topic with given topicId
DELETE	=>	/topics/{topicId}/courses/{courseId}	=>	Delete a course with given courseId in a topic with given topicId


