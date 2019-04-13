'use strict';

const express = require('express');
const router = express.Router();

const artAPIController = require('../controllers/art-api');

router.route('/gallery').get(artAPIController.allListings);

router.route('/gallery/abstract').get(artAPIController.abstract);
//
router.route('/gallery/floral').get(artAPIController.floral);
//
router.route('/gallery/animals').get(artAPIController.animals);
//
router.route('/gallery/quotes').get(artAPIController.quotes);
//
router.route('/gallery/description/:artid').get(artAPIController.description);

module.exports = router;
