//CAPTURE HTML ELEMENTS
const htmlName = document.getElementById('nombre');
const htmlCareer = document.getElementById('carrera');
const bodyTable = document.getElementById('tbodyTable');
const qualificationNedeed = document.getElementById('notaMinima');

//USER INFO
const name = prompt('Ingrese su nombre');
const career = prompt('Ingrese su carrera');
htmlName.innerHTML = name;
htmlCareer.innerHTML = career;

//AVERAGE ONE
const courseOne = prompt('Ingrese el ramo numero 1');
const qualificationOneCourseOne = parseFloat(prompt('Ingrese su nota N1'));
const qualificationTwoCourseOne = parseFloat(prompt('Ingrese su nota N2'));
const qualificationThreeCourseOne = parseFloat(prompt('Ingrese su nota N3'));
const averageCourseOne = ( (qualificationOneCourseOne + qualificationTwoCourseOne + qualificationThreeCourseOne) / 3);
bodyTable.innerHTML += `
              <tr>
                <td>${courseOne}</td>
                <td>${qualificationOneCourseOne.toFixed(1)}</td>
                <td>${qualificationTwoCourseOne.toFixed(1)}</td>
                <td>${qualificationThreeCourseOne.toFixed(1)}</td>
                <td>${averageCourseOne.toFixed(1)}</td>
              </tr>
`;

//AVERAGE TWO
const courseTwo= prompt('Ingrese el ramo numero 2');
const qualificationOneCourseTwo = parseFloat(prompt('Ingrese su nota N1'));
const qualificationTwoCourseTwo = parseFloat(prompt('Ingrese su nota N2'));
const qualificationThreeCourseTwo = parseFloat(prompt('Ingrese su nota N3'));
const averageCourseTwo = ( (qualificationOneCourseTwo + qualificationTwoCourseTwo + qualificationThreeCourseTwo) / 3);
bodyTable.innerHTML += `
              <tr>
                <td>${courseTwo}</td>
                <td>${qualificationOneCourseTwo.toFixed(1)}</td>
                <td>${qualificationTwoCourseTwo.toFixed(1)}</td>
                <td>${qualificationThreeCourseTwo.toFixed(1)}</td>
                <td>${averageCourseTwo.toFixed(1)}</td>
              </tr>
`;

//AVERAGE THREE
const courseThree= prompt('Ingrese el ramo numero 3');
const qualificationOneCourseThree = parseFloat(prompt('Ingrese su nota N1'));
const qualificationTwoCourseThree = parseFloat(prompt('Ingrese su nota N2'));
const qualificationThreeCourseThree = parseFloat(prompt('Ingrese su nota N3'));
const averageCourseThree = ( (qualificationOneCourseThree + qualificationTwoCourseThree + qualificationThreeCourseThree) / 3);

bodyTable.innerHTML += `
              <tr>
                <td>${courseThree}</td>
                <td>${qualificationOneCourseThree.toFixed(1)}</td>
                <td>${qualificationTwoCourseThree.toFixed(1)}</td>
                <td>-</td>
                <td>-</td>
              </tr>
`;
