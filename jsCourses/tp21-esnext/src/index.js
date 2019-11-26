import {getAllSetAndClasses} from './scripts/get-all.js';
import { HearthstoneApi } from './scripts/api.js';




/** OBTENIR TOUTES LES CARTES */
// getAllSetAndClasses().then((results) => {
//   console.log('all with cards', results);
// }, (reason) => {
//   console.log('Error', reason);
// });

const hearthstoneApi = new HearthstoneApi();


/** Obtenir card avec un set et un nom definis */
function getCards(setName, className) {
  return Promise.all([
    hearthstoneApi.set(setName),
    hearthstoneApi.classes(className),
  ]).then(([setsCards, classesCards]) => {
    console.log("Les valeurs : ", setsCards, classesCards );
  // code ci-dessous en une ligne :
  // setsCards.filter(setCard => classesCards.find((classCard) => compareCard(setCard, classCard)))
    const monTableauFinnal = setsCards.filter(setCard => {
      const found = classesCards.find((classCard) => {
        const compare = compareCard(setCard, classCard);
        return compare;
      });
      return found;
    });
    return monTableauFinnal;
  });
    
}
/**
 * Return true if same cardId
 * @param {Card} card1 
 * @param {Card} card2 
 * @returns {boolean} if same id
 */
function compareCard (card1, card2) {
  return card1.cardId === card2.cardId;
}


getCards('Basic', 'Druid').then(res => console.log(res));
