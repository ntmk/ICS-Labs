'use strict;'
//will need to be at the top of each controller file and still need to add functionality for live site
var request = require('request');
var apiOptions = {
    server : "http://localhost:3000"
};

if (process.env.NODE_ENV === 'production') {
    apiOptions.server = "http://creative-caregiver.deploy.cs.camosun.bc.ca";
}
// api functions to retrieve data
const gallery = function(req, res) {
    renderGallery(req, res);
};

const allListings = function(req, res) {
    var requestOptions, path;
    path = '/api/gallery';
    requestOptions = {
        url: apiOptions.server + path,
        json: {}
    };
    request(
        requestOptions,
    function(err, response, body) {
        renderAllListings(req, res, body);
    });
};

const categories = function(req, res) {
    var requestOptions, path;
    path = '/api/gallery/' + req.params.category;
    requestOptions = {
        url: apiOptions.server + path,
        json: {}
    };
    request(
        requestOptions,
        function(err, response, body) {
            renderCategories(req, res, body);
            });
    };

const description = function(req, res) {
    var requestOptions, path;
    path = '/api/gallery/description/' + req.params.artid;
    requestOptions = {
        url: apiOptions.server + path,
        json: {}
    };
    request(
        requestOptions,
        function(err, response, body) {
            renderDescription(req, res, body);
        });
    };

// functions to render data on the page
const renderGallery = function(req,res) {
    res.render('index', { title: 'Expressions of our Minds', categories: [{floral: 'Floral', abstract: 'Abstract', animals: 'Animals', quotes: 'Quotes', all: 'All Listings'}]
    });
}

const renderAllListings = function(req, res, body) {
    let errorMsg = null;
    if (!(body instanceof Array)) {
        errorMsg = 'API lookup error';
        body = [];
    }
    res.render('listings', {
        title: 'Current listings', art: body, errorMsg: errorMsg
    });
}

const renderCategories = function(req, res, body) {
    let errorMsg = null;
    if (!(body instanceof Array)) {
        errorMsg = 'API lookup error';
        body = [];
    }
    res.render('listings', {
        title: 'Current listings', art: body, errorMsg: errorMsg
    });
}

const renderDescription = function(req, res, body) {
    let errorMsg = null;
    if (!(body instanceof Object)) {
        errorMsg = 'API lookup error';
        body = {};
    }
    res.render('description', {
        title: 'Description', art: body
    });
}

const purchase = function(req, res) {
    res.render('purchase', { title: 'Purchase a piece' });
}

module.exports = {
    gallery,
    allListings,
    description,
    purchase,
    categories
};
