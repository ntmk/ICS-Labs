'use strict;'

const about = function(req, res) {
  res.render('about', { title: 'About Expressions of our Minds', bioName: 'Kaylee Percival',
  bioText1: 'I am an artist who has always had a passion and an eye for colour. Since I was a young child I loved to express to people through any forms of creative arts. Whether it be through my love for movement, music or creating artistic pieces with my hands, I have always loved to express how I feel in any moment . Art was and will forever be, the best way I connect with people.  I took art classes back in my early school years and chose to put my paintings on hold when I went into grade 10. I carried on expressing through musical theatre until graduation. After high school, I spent years painting, singing and dancing only once in a while. I chose to become a childcare provider and continued art through crafts.',
  bioText2:'Within the past few years my love for painting started filling up my mind more and more prominently. So I began to start creating again while my partner mixed his music. We now, together, spend hours creating and expressing to one another through our music and art. Art is my therapy, my heart and soul. It drives me to be greater each and every day. I’ve now created a life where my art is first...',
  bioText3: 'And I am so grateful to be able to share it with the world.' });
};

const commission = function(req, res) {
  res.render('commission', { title: 'Your idea/vision put on canvas', commissionText: 'If you would like to request a commission please fill in the form below and be sure to include as much detail as you possibly can. These are general requirements in order to give the best possibly estimate. Individual cost will be determined on a piece by piece basis as agreed upon with each client.' });
};

const contact = function(req, res) {
  res.render('contact', { title: 'Get in touch with Expressions of our Minds', contactText: 'If you have any questions or comments please feel free to contact me.' });
};

module.exports = {
    about,
    commission,
    contact
};
