// Recupere le module lodash
const myModulLodash = require("lodash");

const myTab = myModulLodash.chunk(['a', 'b', 'c', 'd'], 3);

// Export la varibale
exports.myTab = myTab;
