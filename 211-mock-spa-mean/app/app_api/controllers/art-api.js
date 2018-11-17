'use strict';

const mongoose = require('mongoose');
const paintingModel = mongoose.model('painting');


const allListings = function(req, res) {
    paintingModel.find().exec(function(err, docs) {
        if (err) {
            res.status(404).json(err)
        } else {
            res.status(200).json(docs);
        }
    })
};

const abstract = function(req, res) {
    paintingModel.find({category: 'abstract'}).exec(function(err,docs){
        if (err) {
            res.status(404).json(err)
        } else {
            res.status(200).json(docs);
        }
    })
};
//
const floral = function(req, res) {
    paintingModel.find({category: 'floral'}).exec(function(err,docs){
        if (err) {
            res.status(404).json(err)
        } else {
            res.status(200).json(docs);
        }
    })
};
//
const animals = function(req, res) {
    paintingModel.find({category: 'animals'}).exec(function(err,docs){
        if (err) {
            res.status(404).json(err)
        } else {
            res.status(200).json(docs);
        }
    })
};
//
const quotes = function(req, res) {
    paintingModel.find({category: 'quotes'}).exec(function(err,docs){
        if (err) {
            res.status(404).json(err)
        } else {
            res.status(200).json(docs);
        }
    })
};
//
const description = function(req, res) {
    paintingModel.findById(req.params.artid).exec(function(err,docs){
        if (err) {
            res.status(404).json(err)
        } else {
            res.status(200).json(docs);
        }
    })
};

module.exports = {
    allListings,
    abstract,
    floral,
    animals,
    quotes,
    description
};
