function filterImplants() {

    const searchInput =
        document.getElementById("searchInput");

    const brandFilter =
        document.getElementById("brandFilter");

    const typeFilter =
        document.getElementById("typeFilter");

    const materialFilter =
        document.getElementById("materialFilter");

    const cards =
        document.querySelectorAll(".implant-card");


    const search =
        searchInput.value.toLowerCase();

    const brand =
        brandFilter.value.toLowerCase();

    const type =
        typeFilter.value.toLowerCase();

    const material =
        materialFilter.value.toLowerCase();


    cards.forEach(function(card) {

        const name =
            card.dataset.name.toLowerCase();

        const cardBrand =
            card.dataset.brand.toLowerCase();

        const cardType =
            card.dataset.type.toLowerCase();

        const cardMaterial =
            card.dataset.material.toLowerCase();


        const matchesSearch =
            name.includes(search);

        const matchesBrand =
            brand === "" ||
            cardBrand === brand;

        const matchesType =
            type === "" ||
            cardType === type;

        const matchesMaterial =
            material === "" ||
            cardMaterial === material;


        if (
            matchesSearch &&
            matchesBrand &&
            matchesType &&
            matchesMaterial
        ) {

            card.style.display = "block";

        } else {

            card.style.display = "none";

        }

    });
}


function confirmDelete() {

    return confirm(
        "Are you sure you want to delete this implant model?"
    );

}