INSERT INTO areas_atuacoes(descricao) VALUES ('NUTRICAO');
INSERT INTO areas_atuacoes(descricao) VALUES ('FISIOTERAPIA');
INSERT INTO areas_atuacoes(descricao) VALUES ('EDUCACAO FISICA');
INSERT INTO areas_atuacoes(descricao) VALUES ('ENDOCRINOLOGIA');
INSERT INTO areas_atuacoes(descricao) VALUES ('PSICOLOGIA');

INSERT INTO profissionais(nome, email, sexo, preco_consulta, grau_formacao) VALUES ('Roberto Faria', 'robertofaria@gmail.com', 'M', 275, 'Mestrado');
INSERT INTO profissionais(nome, email, sexo, preco_consulta, grau_formacao) VALUES ('Felipe Jones', 'felipejones@gmail.com', 'M', 200, 'Graduacao');
INSERT INTO profissionais(nome, email, sexo, preco_consulta, grau_formacao) VALUES ('Vanessa Cloven', 'vanessacloven@gmail.com', 'F', 265, 'Mestrado');
INSERT INTO profissionais(nome, email, sexo, preco_consulta, grau_formacao) VALUES ('Yuri Sanin', 'yurisanin@gmail.com', 'M', 350, 'Doutorado');
INSERT INTO profissionais(nome, email, sexo, preco_consulta, grau_formacao) VALUES ('Ana Leticia', 'analeticia@gmail.com', 'F', 230, 'Pos-Graduacao');
INSERT INTO profissionais(nome, email, sexo, preco_consulta, grau_formacao) VALUES ('Fernanda Tita', 'fernandatita@gmail.com', 'F', 310, 'Doutorado');

INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (1, 3);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (2, 2);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (3, 5);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (4, 1);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (4, 3);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (4, 2);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (5, 3);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (6, 5);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (6, 4);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (6, 1);
INSERT INTO profissional_area_atuacao(profissional_id, area_atuacao_id) VALUES (1, 4);

INSERT INTO pacientes(nome, email, sexo) VALUES ('Gabriel', 'gabriel@gmail.com', 'M');
INSERT INTO pacientes(nome, email, sexo) VALUES ('Rafael', 'rafael@gmail.com', 'M');
INSERT INTO pacientes(nome, email, sexo) VALUES ('Roberto', 'roberto@gmail.com', 'M');
INSERT INTO pacientes(nome, email, sexo) VALUES ('Ana', 'ana@gmail.com', 'F');
INSERT INTO pacientes(nome, email, sexo) VALUES ('Patrick', 'patrick@gmail.com', 'M');
INSERT INTO pacientes(nome, email, sexo) VALUES ('Rodrigo', 'rodrigo@gmail.com', 'M');
INSERT INTO pacientes(nome, email, sexo) VALUES ('Aline', 'aline@gmail.com', 'F');
INSERT INTO pacientes(nome, email, sexo) VALUES ('Paula', 'paula@gmail.com', 'F');
INSERT INTO pacientes(nome, email, sexo) VALUES ('Maria', 'maria@gmail.com', 'F');

INSERT INTO tipo_pagamentos(descricao) VALUES ('PIX');
INSERT INTO tipo_pagamentos(descricao) VALUES ('DINHEIRO');
INSERT INTO tipo_pagamentos(descricao) VALUES ('CARTAO DE DEBITO');
INSERT INTO tipo_pagamentos(descricao) VALUES ('CARTAO DE CREDITO');

INSERT INTO consultas(paciente_id, profissional_id, tipo_pagamento_id, preco_total_consulta, data_consulta) VALUES (1, 5, 1, 230 * 1.1, '28/05/2023');
INSERT INTO consultas(paciente_id, profissional_id, tipo_pagamento_id, preco_total_consulta, data_consulta) VALUES (3, 4, 3, 350 * 1.1, '30/05/2023');
INSERT INTO consultas(paciente_id, profissional_id, tipo_pagamento_id, preco_total_consulta, data_consulta) VALUES (2, 4, 4, 350 * 1.1, '01/06/2023');
INSERT INTO consultas(paciente_id, profissional_id, tipo_pagamento_id, preco_total_consulta, data_consulta) VALUES (6, 2, 4, 200 * 1.1, '04/06/2023');
INSERT INTO consultas(paciente_id, profissional_id, tipo_pagamento_id, preco_total_consulta, data_consulta) VALUES (1, 3, 2, 265 * 1.1, '07/06/2023');
INSERT INTO consultas(paciente_id, profissional_id, tipo_pagamento_id, preco_total_consulta, data_consulta) VALUES (6, 6, 3, 310 * 1.1, '12/06/2023');

