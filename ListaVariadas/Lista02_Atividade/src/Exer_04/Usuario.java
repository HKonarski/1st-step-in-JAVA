package Exer_04;

public class Usuario
{
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha)
    {
        this.nome = nome;
        setEmail(email);
        setSenha(senha);
    }
    public void exibirImformações()
    {
        System.out.println("Nome do usuário: " + nome);
        System.out.println("E-mail do usuário: " + email);
        System.out.println("senha do usuário: " + getSenha());
    }

    public String getNome()
    {
        return nome;
    }
    public String getEmail()
    {
        return email;
    }
    public String getSenha()
    {
        return "******";
    }

    public void setEmail(String email)
    {
        if (email.contains("@"))
        {
            this.email = email;
        }
        else
        {
            System.out.println("E-mail informado incorreto!! deve conter '@', no e-mail.");
            if (this.email == null)
            {
                this.email = "e-mail invalido";
            }
        }
    }
    public void setSenha(String senha)
    {
        if (senha.length()>=6)
        {
            this.senha = senha;
        }
        else
        {
            System.out.println("Senha invalida. Senha deve conter pelo menos 6 caracteres.");
        }
    }
}
