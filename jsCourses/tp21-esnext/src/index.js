import { HearthstoneApi } from './scripts/api.js';
import {getAllSetAndClasses} from './scripts/get-all.js';
import {getCards} from './scripts/get-collection.js';




/** OBTENIR TOUTES LES CARTES */
// getAllSetAndClasses().then((results) => {
//   console.log('all with cards', results);
// }, (reason) => {
//   console.log('Error', reason);
// });


// Toutes les carte Basic ET Druid
getCards('Basic', 'Druid').then(results => console.log(results));
