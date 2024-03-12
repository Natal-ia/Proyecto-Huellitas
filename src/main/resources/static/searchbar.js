  function searchMascota() {
    var input, filter, mascotas, mascotaContainer, nombre, i, txtValue;
    input = document.getElementById('searchInput');
    filter = input.value.toUpperCase();
    mascotas = document.getElementById("mascotas-table");
    mascotaContainer = mascotas.querySelectorAll('#mascota-container-todas');
    
    for (i = 0; i < mascotaContainer.length; i++) {
      nombre = mascotaContainer[i].getElementsByTagName("h2")[0];
      txtValue = nombre.textContent || nombre.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        mascotaContainer[i].style.display = "";
      } else {
        mascotaContainer[i].style.display = "none";
      }
    }
  }
