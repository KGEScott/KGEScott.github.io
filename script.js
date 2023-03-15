const projectsImages = [
    [
        "images/login.png",
        "images/searchpublishers.png",
        "images/viewserieswithinpub.png",
        "images/viewcomicwithinseries.png",
        "images/mycollection.png",
        "images/viewcoverart.png",
        "images/exportcollection.png"
    ],
    [
        "images/elginvapeshop.png",
        "images/bestselling.png",
        "images/disposable.png",
        "images/disposable2.png",
        "images/adminpage.png",
        "images/addproduct.png",
        "images/delproduct.png",
        "images/updateproduct.png"
    ],
    [
        "images/repository.png"
    ]
];

function openModal(projectIndex, imageIndex) {
    const modal = document.getElementById("image-modal");
    const modalImage = document.getElementById("modal-image");
    modal.style.display = "block";
    modalImage.src = projectsImages[projectIndex][imageIndex];
    modalImage.dataset.projectIndex = projectIndex;
    modalImage.dataset.imageIndex = imageIndex;
}

function closeModal() {
    const modal = document.getElementById("image-modal");
    modal.style.display = "none";
}

function changeImage(direction) {
    const modalImage = document.getElementById("modal-image");
    const projectIndex = parseInt(modalImage.dataset.projectIndex);
    const currentImageIndex = parseInt(modalImage.dataset.imageIndex);
    const images = projectsImages[projectIndex];
    let newIndex = currentImageIndex + direction;

    if (newIndex < 0) {
        newIndex = images.length - 1;
    } else if (newIndex >= images.length) {
        newIndex = 0;
    }

    modalImage.src = images[newIndex];
    modalImage.dataset.imageIndex = newIndex;
}

document.addEventListener("DOMContentLoaded", () => {
    document.querySelectorAll('.project').forEach((project, projectIndex) => {
        project.querySelector("img").addEventListener("click", () => {
            openModal(projectIndex, 0);
        });
    });

    document.getElementById("image-modal").addEventListener("click", (event) => {
        if (event.target.tagName !== "IMG") {
            closeModal();
        }
    });

    document.getElementById("prev-button").addEventListener("click", (event) => {
        event.stopPropagation();
        changeImage(-1);
    });
    document.getElementById("next-button").addEventListener("click", (event) => {
        event.stopPropagation();
        changeImage(1);
    });
});
