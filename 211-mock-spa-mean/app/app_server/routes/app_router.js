'use strict';

const express = require('express');
const router = express.Router();
const artController = require('../controllers/art');
const othersController = require('../controllers/others');

/* -- Art Pages -- */
/* GET home page. */
router.get('/', artController.gallery);
/* GET the art list page */
router.get('/gallery', artController.allListings);
//
router.get('/gallery/:category', artController.categories);
/* GET the art details page */
router.get('/gallery/description/:artid', artController.description);
/* GET the purchase page */
router.get('/gallery/description/purchase', artController.purchase);

/* -- Other Pages -- */
/* GET about page */
router.get('/about', othersController.about);
/* GET commission page */
router.get('/about/commission', othersController.commission);
/* GET contact page */
router.get('/about/contact', othersController.contact);

module.exports = router;
