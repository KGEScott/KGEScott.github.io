const comicDungeonImages = [
    'comic_dungeon_image_1.jpg',
    'comic_dungeon_image_2.jpg',
    'comic_dungeon_image_3.jpg',
    'comic_dungeon_image_4.jpg',
    'comic_dungeon_image_5.jpg',
    'comic_dungeon_image_6.jpg'
];

const websiteProjectImages = [
    'website_project_image_1.jpg',
    'website_project_image_2.jpg',
    'website_project_image_3.jpg',
    'website_project_image_4.jpg'
];

document.querySelector('.project:nth-child(1) img').addEventListener('click', () => {
    const currentImage = document.querySelector('.project:nth-child(1) img').getAttribute('src');
    const currentIndex = comicDungeonImages.indexOf(currentImage);
    const nextIndex = (currentIndex + 1) % comicDungeonImages.length;
    document.querySelector('.project:nth-child(1) img').setAttribute('src', comicDungeonImages[nextIndex]);
});

document.querySelector('.project:nth-child(2) img').addEventListener('click', () => {
    const currentImage = document.querySelector('.project:nth-child(2) img').getAttribute('src');
    const currentIndex = websiteProjectImages.indexOf(currentImage);
    const nextIndex = (currentIndex + 1) % websiteProjectImages.length;
    document.querySelector('.project:nth-child(2) img').setAttribute('src', websiteProjectImages[nextIndex]);
});
