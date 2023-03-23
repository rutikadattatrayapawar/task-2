[
// 1.User collection.

{
  "_id": ObjectId(),
  "username": "RutikaPawar",
  "email": "rutikapawar222@gmail.com",
  "password": "rutikapassword",
},

//2.Project collection.
{
    "_id": ObjectId(),
    "title": "Project Title",
    "description": "Project description",
    "image": "projectimage.jpg",
    "category": "Web Development",
    "skills": ["HTML", "CSS", "JavaScript"],
    "link": "https://projectlink.com",
    "date": ISODate("2023-03-22T00:00:00.000Z"),
    "user_id": ObjectId()
  },

//3.Skill collection.
{
    "_id": ObjectId(),
    "name": "HTML",
    "category": "Web Development",
    "user_id": ObjectId()
  },

  //4.Experince collection
  {
    "_id": ObjectId(),
    "title": "Web Developer",
    "company": "ABC Company",
    "location": "Pune, India",
    "description": "Job description",
    "start_date": ISODate("2022-01-01T00:00:00.000Z"),
    "end_date": ISODate("2022-12-31T00:00:00.000Z"),
    "user_id": ObjectId()
  },

  //5.Education collection
  {
    "_id": ObjectId(),
    "degree": "Master's of Computer Application",
    "field_of_study": "Computer ",
    "institution": "ADYPU University",
    "location": "Lohegaon, pune",
    "start_date": ISODate("2018-01-01T00:00:00.000Z"),
    "end_date": ISODate("2022-12-31T00:00:00.000Z"),
    "user_id": ObjectId()
  }
]
  





  
  
