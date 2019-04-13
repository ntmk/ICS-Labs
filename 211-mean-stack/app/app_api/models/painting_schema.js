// define schema/collection and export model for use
// crud operations
const mongoose = require('mongoose');

// create new schema / collections
// will need to add validation here
const paintingSchema = new mongoose.Schema({
    name: {
        type: String,
        required: true
    },
    description: {
        type: String,
        required: true
    },
    category: {
        type: String,
        required: true
        // TODO when implemented be sure to add comma
        // enum: ['Collaborations', 'Personal Projects', 'Sold', 'Commisions']
    },
    image: {
        type: String,
        required: true
    }
});

// creates database collection
// adds an s on the end of collection name ie paintings
// module.export makes model accessible to all files
mongoose.model('painting', paintingSchema);
