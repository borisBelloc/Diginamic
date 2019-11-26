import { HearthstoneApi } from "./scripts/api.js";

import { SetType } from "./scripts/class/settype.js";
import { ClassType } from "./scripts/class/classtype.js";

const hearthstoneApi = new HearthstoneApi();

/**
 * Avant fonction générique de get-all.js
 * TP du 25/11/2019
 */

// console.log(SetType);
let type1 = new SetType("Basic");
console.log("BASIC HERE :", type1);

// console.log(ClassType);
let class1 = new ClassType("Druid");
console.log("DRUID HERE :", class1);

let myTabSet = [];

hearthstoneApi.info().then(allInfo => {
  // w/ forEach
  allInfo.sets.forEach(element => {
    myTabSet.push(new SetType(element));
  });
  console.log("MY TAB SET : ", myTabSet);

  // w/ map
  let myTabClasses = allInfo.classes.map(e => new ClassType(e));
  console.log("MY TAB CLASS : ", myTabClasses);

  // Promesses obtenir toutes les cartes
  const allPromiseSet = allInfo.sets
    .map(n => new SetType(n))
    .map(SetType => {
      return hearthstoneApi.set(SetType.name).then(cards => {
        if (Array.isArray(cards)) {
          SetType.cards = cards;
        }
        return SetType;
      });
    });
  const allPromiseClasses = allInfo.classes
    .map(n => new ClassType(n))
    .map(classType => {
      return hearthstoneApi.classes(classType.name).then(cards => {
        if (Array.isArray(cards)) {
          classType.cards = cards;
        }
        console.log(classType);
        return classType;
      });
    });

    Promise.all([
      Promise.all(allPromiseClasses),
      Promise.all(allPromiseSet)
    ]).then((results) => {
      console.log("all with cards ", results);
      })
    

});
