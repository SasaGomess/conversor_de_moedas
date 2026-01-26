# 🪙💸 Conversor de Moedas
Este é um Conversor de Moedas em Java que utiliza a ExchangeRate API para obter cotações em tempo real.

## 💱 Sobre o Projeto


A aplicação recebe um valor informado pelo usuário e converte para outra moeda com base na taxa atual fornecida pela API.

Tudo acontece diretamente no console, com um menu interativo e navegação simples! 🚀

### ⚙️ Tecnologias Utilizadas

☕ Java 23

📦 Maven

📘 Gson (para manipulação de JSON)

📡 ExchangeRate API

🧪 Postman (para testes de requisições)

### 🧠 Funcionalidades

- 🔌 Consumo da API ExchangeRate, requisição base utilizada foi -> ``GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT``

- 🔄 Conversão JSON → JsonObject, usando ``JsonElement (Gson)``

- 🧮 Cálculo da conversão, captura do campo ``"conversion_result"`` do JSON e conversão para double

- 🎛️ Menu interativo no console, que permite escolher moedas, inserir valores e visualizar resultados

- 🧩 Organização em camadas, claridade e separação entre lógica, serviços e modelo

- 🏷️ Uso de record para representar a classe Currency


### 🚀 Como executar

**Clone o repositório:**
- git clone https://github.com/SasaGomess/conversor_de_moedas

**Acesse o diretório:**
- cd conversor_de_moedas

**Entre no link: [ExchangeRate API](https://www.exchangerate-api.com/):*
- Para criar sua API KEY

**Crie um nova variável de ambiente com nome: ``EXCHANGERATE_API_KEY`` e com valor da sua API KEY**
- Variáveis de ambiente -> Variáveis de ambiente -> Novo

***Execute o projeto e agora é só aproveitar :)***

### 🔮 Melhorias Futuras

- Histórico de conversões

- Suporte a mais APIs

- Configuração de logs com Log4j

### 🤝Como contribuir

Faça um fork do repositório faça a sua feature abra um PR e aguarde a minha resposta!
