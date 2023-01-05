const $ = document.querySelector.bind(document);

const app = $("#app");

async function start() {
  const f = await (await fetch("http://localhost:8080/api")).json();

  f.forEach((e, i) => {
    const div = document.createElement("div");

    div.innerHTML = `${e.id}: ${e.nome} ${e.cognome} ${e.eta}`;

    if (i % 2 == 0) div.classList.add("bg-gray-1");
    else div.classList.add("bg-gray-2");

    app.append(div);
  });
}

start();
