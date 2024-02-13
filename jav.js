
// Obtener referencias
const slidesContainer = document.getElementById("slides-container");
const slides = document.querySelectorAll(".slide");
const prevButton = document.getElementById("slide-arrow-prev");
const nextButton = document.getElementById("slide-arrow-next");
let currentSlideIndex = 0; // Variable para mantener el índice de la diapositiva actual

// Evento de clic para el botón de siguiente
nextButton.addEventListener("click", () => {
    const slideWidth = slides[0].clientWidth; // Usamos el ancho del primer slide para la consistencia
    currentSlideIndex++; // Incrementamos el índice de la diapositiva actual
    if (currentSlideIndex >= slides.length) {
        // Si el índice de la diapositiva actual excede la cantidad de diapositivas
        currentSlideIndex = 0; // Volvemos al primer slide
    }
    slidesContainer.scrollLeft = currentSlideIndex * slideWidth; // Movemos el contenedor de slides
});

// Evento de clic para el botón de anterior (no es necesario cambiar)
prevButton.addEventListener("click", () => {
    const slideWidth = slides[0].clientWidth;
    currentSlideIndex--;
    if (currentSlideIndex < 0) {
        currentSlideIndex = slides.length - 1; // Si estamos en el primer slide, vamos al último
    }
    slidesContainer.scrollLeft = currentSlideIndex * slideWidth;
});


