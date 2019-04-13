const mongoose = require('mongoose');
let dbURI = 'mongodb://mongo/creative-caregiver';

if (process.env.NODE_ENV === 'production'){
    dbURI = process.env.MONGO_URL;
}

mongoose.connect(dbURI, {useMongoClient: true});
//
mongoose.connection.on('connected', function () {
    console.log('Mongoose Connected to ' + dbURI);
});
//
mongoose.connection.on('error', function (err) {
    console.log('Mongoose Connection error', err);
});
//
mongoose.connection.on('disconnected', function () {
    console.log('Mongoose Disconnected');
});
//
require('./painting_schema');
