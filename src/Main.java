import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import classe.*;

public class Main {
    static int op = -1;
    static int id = 0;
    static ArrayList listaPessoa = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao Gerenciador!!!\nSelecione uma das operações abaixo!");
        while (op != 0) {
            // Não fecha esse scan, tipo nunca, senão o programa MORRE
            Scanner scan = new Scanner(System.in);
            System.out.println(
                    "0.Sair\n1.cadastrar\n2.listagem do array\n3.listagem do arquivo físico\n4.persistir dados (salvar no arquivo físico os dados do array e limpar o array)\n5.excluir item do array (excluir pelo ID)\n6.limpar arquivo físico");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println(
                            "O que deseja cadastrar?\n0.Voltar\n1.Pessoa\n2.Funcionário\n3.Psicólogo\n4.Nutricionista\n5.Administrativo\n6.Zelador\n7.Consulta");

                    int op1 = scan.nextInt();

                    switch (op1) {

                        case 0: {
                            break;
                        }

                        case 1: {
                            scan = new Scanner(System.in);
                            // Recebendo Nome
                            pessoa fulano = new pessoa();
                            System.out.println("Digite as informações da pessoa:");
                            System.out.print("Nome:");
                            fulano.SetNome(scan.nextLine());
                            fulano.SetTipo(1);
                            System.out.print("CPF:");
                            fulano.SetCPF(scan.nextLine());

                            System.out.print("RG:");
                            fulano.SetRG(scan.nextLine());

                            System.out.print("Email:");
                            fulano.SetEmail(scan.nextLine());

                            System.out.print("Telefone:");
                            fulano.SetTel(scan.nextLine());

                            System.out.print("Rua:");
                            fulano.SetRua(scan.nextLine());

                            System.out.print("Bairro:");
                            fulano.SetBairro(scan.nextLine());

                            System.out.print("Cidade:");
                            fulano.SetCidade(scan.nextLine());

                            System.out.print("Estado:");
                            fulano.SetEstado(scan.nextLine());
                            fulano.SetId(id + 1);

                            listaPessoa.add(fulano);

                            break;
                        }
                        case 2: {
                            scan = new Scanner(System.in);

                            funcionario funcionario = new funcionario();
                            System.out.print("Digite as informações da funcionário:\nNome:");
                            funcionario.SetNome(scan.nextLine());
                            funcionario.SetTipo(2);
                            System.out.print("CPF:");
                            funcionario.SetCPF(scan.nextLine());

                            System.out.print("RG:");
                            funcionario.SetRG(scan.nextLine());
                            System.out.print("Email:");
                            funcionario.SetEmail(scan.nextLine());

                            System.out.print("Telefone:");
                            funcionario.SetTel(scan.nextLine());

                            System.out.print("Rua:");
                            funcionario.SetRua(scan.nextLine());

                            System.out.print("Bairro:");
                            funcionario.SetBairro(scan.nextLine());

                            System.out.print("Cidade:");
                            funcionario.SetCidade(scan.nextLine());

                            System.out.print("Estado:");
                            funcionario.SetEstado(scan.nextLine());

                            System.out.print("Salário:");
                            funcionario.SetSalario(scan.nextFloat());

                            System.out.print("ID: ");
                            funcionario.SetIdFuncionario(scan.nextInt());
                            funcionario.SetId(id + 1);

                            listaPessoa.add(funcionario);
                            break;
                        }
                        case 3: {
                            scan = new Scanner(System.in);

                            psicologo psicologo = new psicologo();
                            psicologo.SetTipo(3);
                            System.out.print("Digite as informações da psicólogo\nNome:");
                            psicologo.SetNome(scan.nextLine());

                            System.out.print("CPF:");
                            psicologo.SetCPF(scan.nextLine());

                            System.out.print("RG:");
                            psicologo.SetRG(scan.nextLine());
                            System.out.print("Email:");
                            psicologo.SetEmail(scan.nextLine());

                            System.out.print("Telefone:");
                            psicologo.SetTel(scan.nextLine());

                            System.out.print("Rua:");
                            psicologo.SetRua(scan.nextLine());

                            System.out.print("Bairro:");
                            psicologo.SetBairro(scan.nextLine());

                            System.out.print("Cidade:");
                            psicologo.SetCidade(scan.nextLine());

                            System.out.print("Estado:");
                            psicologo.SetEstado(scan.nextLine());

                            System.out.print("Salário:");
                            psicologo.SetSalario(scan.nextFloat());

                            System.out.print("CRP: ");
                            psicologo.SetCRP(scan.nextLine());

                            psicologo.SetId(id + 1);

                            listaPessoa.add(psicologo);
                            break;
                        }
                        case 4: {
                            scan = new Scanner(System.in);

                            nutricionista nutricionista = new nutricionista();
                            System.out.print("Digite as informações da nutricionista\nNome:");
                            nutricionista.SetNome(scan.nextLine());
                            nutricionista.SetTipo(4);
                            System.out.print("CPF:");
                            nutricionista.SetCPF(scan.nextLine());

                            System.out.print("RG:");
                            nutricionista.SetRG(scan.nextLine());
                            System.out.print("Email:");
                            nutricionista.SetEmail(scan.nextLine());

                            System.out.print("Telefone:");
                            nutricionista.SetTel(scan.nextLine());

                            System.out.print("Rua:");
                            nutricionista.SetRua(scan.nextLine());

                            System.out.print("Bairro:");
                            nutricionista.SetBairro(scan.nextLine());

                            System.out.print("Cidade:");
                            nutricionista.SetCidade(scan.nextLine());

                            System.out.print("Estado:");
                            nutricionista.SetEstado(scan.nextLine());

                            System.out.print("Salário:");
                            nutricionista.SetSalario(scan.nextFloat());

                            System.out.print("CRN:");
                            nutricionista.SetCRN(scan.nextLine());

                            nutricionista.SetId(id + 1);

                            listaPessoa.add(nutricionista);
                            break;
                        }
                        case 5: {

                            scan = new Scanner(System.in);

                            administrativo administrativo = new administrativo();
                            System.out.print("Digite as informações da administrativo\nNome:");
                            administrativo.SetNome(scan.nextLine());
                            administrativo.SetTipo(5);
                            System.out.print("CPF:");
                            administrativo.SetCPF(scan.nextLine());

                            System.out.print("RG:");
                            administrativo.SetRG(scan.nextLine());
                            System.out.print("Email:");
                            administrativo.SetEmail(scan.nextLine());

                            System.out.print("Telefone:");
                            administrativo.SetTel(scan.nextLine());

                            System.out.print("Rua:");
                            administrativo.SetRua(scan.nextLine());

                            System.out.print("Bairro:");
                            administrativo.SetBairro(scan.nextLine());

                            System.out.print("Cidade:");
                            administrativo.SetCidade(scan.nextLine());

                            System.out.print("Estado:");
                            administrativo.SetEstado(scan.nextLine());

                            System.out.print("Salário:");
                            administrativo.SetSalario(scan.nextFloat());

                            administrativo.SetId(id + 1);

                            listaPessoa.add(administrativo);
                            break;
                        }
                        case 6: {
                            scan = new Scanner(System.in);

                            zelador zelador = new zelador();
                            System.out.print("Digite as informações da zelador\nNome:");
                            zelador.SetNome(scan.nextLine());

                            zelador.SetTipo(6);

                            System.out.print("CPF:");
                            zelador.SetCPF(scan.nextLine());

                            System.out.print("RG:");
                            zelador.SetRG(scan.nextLine());

                            System.out.print("Email:");
                            zelador.SetEmail(scan.nextLine());

                            System.out.print("Telefone:");
                            zelador.SetTel(scan.nextLine());

                            System.out.print("Rua:");
                            zelador.SetRua(scan.nextLine());

                            System.out.print("Bairro:");
                            zelador.SetBairro(scan.nextLine());

                            System.out.print("Cidade:");
                            zelador.SetCidade(scan.nextLine());

                            System.out.print("Estado:");
                            zelador.SetEstado(scan.nextLine());

                            System.out.print("Salário:");
                            zelador.SetSalario(scan.nextFloat());

                            zelador.SetId(id + 1);

                            listaPessoa.add(zelador);
                            break;
                        }
                        case 7: {
                            scan = new Scanner(System.in);

                            consulta consulta = new consulta();
                            System.out.print("Digite as informações da consulta\nProfissional: ");
                            consulta.SetProfissional(scan.nextInt());
                            consulta.SetTipo(7);
                            System.out.print("Paciente:");
                            consulta.SetPaciente(scan.nextInt());
                            scan.nextLine();

                            System.out.print("Data e hora:");
                            consulta.SetDataHora(scan.nextLine());

                            System.out.print("Local:");
                            consulta.SetLocal(scan.nextLine());

                            System.out.print("Descrição:");
                            consulta.SetDescricao(scan.nextLine());

                            consulta.SetId(id + 1);

                            listaPessoa.add(consulta);
                            break;
                        }
                        case 8: {
                            scan = new Scanner(System.in);

                            paciente paciente = new paciente();
                            System.out.print("Digite as informações do paciente\nPaciente: ");
                            paciente.SetNome(scan.nextLine());

                            paciente.SetTipo(8);

                            System.out.print("CPF:");
                            paciente.SetCPF(scan.nextLine());

                            System.out.print("RG:");
                            paciente.SetRG(scan.nextLine());

                            System.out.print("Email:");
                            paciente.SetEmail(scan.nextLine());

                            System.out.print("Telefone:");
                            paciente.SetTel(scan.nextLine());

                            System.out.print("Rua:");
                            paciente.SetRua(scan.nextLine());

                            System.out.print("Bairro:");
                            paciente.SetBairro(scan.nextLine());

                            System.out.print("Cidade:");
                            paciente.SetCidade(scan.nextLine());

                            System.out.print("Estado:");
                            paciente.SetEstado(scan.nextLine());

                            System.out.print("Numero da Carteira:");
                            paciente.SetNumCarteira(scan.nextLine());

                            System.out.print("Historico:");
                            paciente.SetHistorico(scan.nextLine());

                            paciente.SetId(id + 1);

                            listaPessoa.add(paciente);
                            break;
                        }
                    }

                    break;

                case 2: {
                    for (int i = 0; i < listaPessoa.size(); i++) {
                        System.out.println("NOME | CPF | RG | EMAIL | TELEFONE | RUA | BAIRRO | CIDADE | ESTADO");

                        if (((pessoa) listaPessoa.get(i)).GetTipo() == 1) {
                            System.out.print(((pessoa) listaPessoa.get(i)).GetNome() + " | ");
                            System.out.print(((pessoa) listaPessoa.get(i)).GetCPF() + " | ");
                            System.out.print(((pessoa) listaPessoa.get(i)).GetRG() + " | ");
                            System.out.print(((pessoa) listaPessoa.get(i)).GetEmail() + " | ");
                            System.out.print(((pessoa) listaPessoa.get(i)).GetTel() + " | ");
                            System.out.print(((pessoa) listaPessoa.get(i)).GetRua() + " | ");
                            System.out.print(((pessoa) listaPessoa.get(i)).GetBairro() + " | ");
                            System.out.print(((pessoa) listaPessoa.get(i)).GetCidade() + " | ");
                            System.out.print(((pessoa) listaPessoa.get(i)).GetEstado());
                        }
                        // Funcionario
                        else if (((pessoa) listaPessoa.get(i)).GetTipo() == 2) {
                            System.out.print(((funcionario) listaPessoa.get(i)).GetNome() + " | ");
                            System.out.print(((funcionario) listaPessoa.get(i)).GetCPF() + " | ");
                            System.out.print(((funcionario) listaPessoa.get(i)).GetRG() + " | ");
                            System.out.print(((funcionario) listaPessoa.get(i)).GetEmail() + " | ");
                            System.out.print(((funcionario) listaPessoa.get(i)).GetTel() + " | ");
                            System.out.print(((funcionario) listaPessoa.get(i)).GetRua() + " | ");
                            System.out.print(((funcionario) listaPessoa.get(i)).GetBairro() + " | ");
                            System.out.print(((funcionario) listaPessoa.get(i)).GetCidade() + " | ");
                            System.out.print(((funcionario) listaPessoa.get(i)).GetEstado());
                            System.out.print(((funcionario) listaPessoa.get(i)).GetSalario());
                        }
                        // Psicologo
                        else if (((pessoa) listaPessoa.get(i)).GetTipo() == 3) {
                            System.out.print(((psicologo) listaPessoa.get(i)).GetNome() + " | ");
                            System.out.print(((psicologo) listaPessoa.get(i)).GetCPF() + " | ");
                            System.out.print(((psicologo) listaPessoa.get(i)).GetRG() + " | ");
                            System.out.print(((psicologo) listaPessoa.get(i)).GetEmail() + " | ");
                            System.out.print(((psicologo) listaPessoa.get(i)).GetTel() + " | ");
                            System.out.print(((psicologo) listaPessoa.get(i)).GetRua() + " | ");
                            System.out.print(((psicologo) listaPessoa.get(i)).GetBairro() + " | ");
                            System.out.print(((psicologo) listaPessoa.get(i)).GetCidade() + " | ");
                            System.out.print(((psicologo) listaPessoa.get(i)).GetEstado());
                            System.out.print(((psicologo) listaPessoa.get(i)).GetCRP());
                        }
                        // Nutricionista
                        else if (((pessoa) listaPessoa.get(i)).GetTipo() == 4) {
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetCRN());
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetNome() + " | ");
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetCPF() + " | ");
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetRG() + " | ");
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetEmail() + " | ");
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetTel() + " | ");
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetRua() + " | ");
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetBairro() + " | ");
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetCidade() + " | ");
                            System.out.print(((nutricionista) listaPessoa.get(i)).GetEstado());
                        }
                        // Administrativo
                        else if (((pessoa) listaPessoa.get(i)).GetTipo() == 5) {
                            System.out.print(((administrativo) listaPessoa.get(i)).GetNome() + " | ");
                            System.out.print(((administrativo) listaPessoa.get(i)).GetCPF() + " | ");
                            System.out.print(((administrativo) listaPessoa.get(i)).GetRG() + " | ");
                            System.out.print(((administrativo) listaPessoa.get(i)).GetEmail() + " | ");
                            System.out.print(((administrativo) listaPessoa.get(i)).GetTel() + " | ");
                            System.out.print(((administrativo) listaPessoa.get(i)).GetRua() + " | ");
                            System.out.print(((administrativo) listaPessoa.get(i)).GetBairro() + " | ");
                            System.out.print(((administrativo) listaPessoa.get(i)).GetCidade() + " | ");
                            System.out.print(((administrativo) listaPessoa.get(i)).GetEstado());
                            System.out.println(((administrativo) listaPessoa.get(i)).GetIdFuncionario() + " | ");
                            System.out.println(((administrativo) listaPessoa.get(i)).GetFuncao());
                        }
                        // Zelador
                        else if (((pessoa) listaPessoa.get(i)).GetTipo() == 6) {
                            System.out.print(((zelador) listaPessoa.get(i)).GetNome() + " | ");
                            System.out.print(((zelador) listaPessoa.get(i)).GetCPF() + " | ");
                            System.out.print(((zelador) listaPessoa.get(i)).GetRG() + " | ");
                            System.out.print(((zelador) listaPessoa.get(i)).GetEmail() + " | ");
                            System.out.print(((zelador) listaPessoa.get(i)).GetTel() + " | ");
                            System.out.print(((zelador) listaPessoa.get(i)).GetRua() + " | ");
                            System.out.print(((zelador) listaPessoa.get(i)).GetBairro() + " | ");
                            System.out.print(((zelador) listaPessoa.get(i)).GetCidade() + " | ");
                            System.out.print(((zelador) listaPessoa.get(i)).GetEstado());
                            System.out.println(((zelador) listaPessoa.get(i)).GetIdFuncionario() + " | ");
                            System.out.println(((zelador) listaPessoa.get(i)).GetSetor());
                        }

                        // consulta
                        else if (((consulta) listaPessoa.get(i)).GetTipo() == 7) {
                            System.out.print(((consulta) listaPessoa.get(i)).GetProfissional() + " | ");
                            System.out.print(((consulta) listaPessoa.get(i)).GetPaciente() + " | ");
                            System.out.print(((consulta) listaPessoa.get(i)).GetDataHora() + " | ");
                            System.out.print(((consulta) listaPessoa.get(i)).GetLocal() + " | ");
                            System.out.print(((consulta) listaPessoa.get(i)).GetDescricao() + " | ");
                            System.out.print(((consulta) listaPessoa.get(i)).GetId() + " | ");
                        }
                        // paciente
                        else if (((pessoa) listaPessoa.get(i)).GetTipo() == 8) {
                            System.out.print(((paciente) listaPessoa.get(i)).GetNumCarteira() + " | ");
                            System.out.print(((paciente) listaPessoa.get(i)).GetHistorico() + " | ");
                        }
                    }

                    break;
                }
                // Listagem do Arquivo
                case 3: {

                    try {
                        FileReader fr;
                        fr = new FileReader("arq.txt");
                        BufferedReader bf = new BufferedReader(fr);
                        String linha = bf.readLine();
                        while (linha != null) {
                            linha = bf.readLine();
                        }
                        bf.close();
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                }
                // persistir dados (salvar no arquivo físico os dados do array e limpar o array)
                case 4: {
                    // Se for a primeira vez que criamos o arquivo

                    File file = new File("arq.txt");
                    boolean veri = file.exists();

                    try {
                        FileWriter fw;
                        // FileWrite(nomeArquivo,append(sim ou nao(reseta)))
                        fw = new FileWriter("arq.txt", veri);
                        for (int i = 0; i < listaPessoa.size(); i++) {
                            String linha = "";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetNome() + " ";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetCPF() + " ";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetRG() + " ";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetEmail() + " ";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetTel() + " ";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetRua() + " ";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetBairro() + " ";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetCidade() + " ";
                            linha = linha + ((pessoa) listaPessoa.get(i)).GetEstado() + " ";

                            // Funcionario
                            if (((pessoa) listaPessoa.get(i)).GetTipo() == 2) {
                                linha = linha + ((funcionario) listaPessoa.get(i)).GetSalario() + " ";
                            } else if (((pessoa) listaPessoa.get(i)).GetTipo() == 3) {
                                linha = linha + ((psicologo) listaPessoa.get(i)).GetCRP() + " ";
                            } else if (((pessoa) listaPessoa.get(i)).GetTipo() == 4) {
                                linha = linha + ((nutricionista) listaPessoa.get(i)).GetCRN() + " ";
                            } else if (((pessoa) listaPessoa.get(i)).GetTipo() == 5) {
                                linha = linha + ((administrativo) listaPessoa.get(i)).GetIdFuncionario() + " ";
                                linha = linha + ((administrativo) listaPessoa.get(i)).GetFuncao() + " ";
                            }

                            fw.write(linha + "\n");

                        }
                        fw.close();
                        listaPessoa.clear();
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                // excluir item do array (excluir pelo ID)
                case 5: {
                    System.out.print("Digite o ID da pessoa que deseja BANIR: ");
                    int idToRemove = scan.nextInt();
                    boolean encontrado = false;

                    for (int i = 0; i < listaPessoa.size(); i++) {
                        if (listaPessoa.get(i) instanceof pessoa) {
                            pessoa tempFunc = (pessoa) listaPessoa.get(i);
                            if (tempFunc.GetId() == idToRemove) {
                                listaPessoa.remove(i);
                                System.out.println("Pessoa removida com sucesso!");
                                encontrado = true;
                                break;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Pessoa com ID " + idToRemove + " não encontrada.");
                    }
                    break;
                }
                // limpar arquivo físico
                case 6:
                    FileWriter fw = new FileWriter("arq.txt");
                    fw.close();
                    break;

                default:
                    break;
            }
        }

    }

    public void Salario() {
        System.out.println("O seu salario é");
    }
}