package br.edu.cruzeirodosul.exemplomenus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MenuPrincipal {
    public static boolean trataMenu(Context contexto, @NonNull MenuItem item) {
        boolean saida = true;
        switch (item.getItemId()){
            case R.id.menuItemMensagem:
                exibaMensagem(contexto);
                break;
            case R.id.menuItemNavegador:
                exibaNavegador(contexto);
                break;
            case R.id.menuItemSobre:
                exibaSobre(contexto);
                break;
            default:
                saida = false;
        }
        return saida;
    }

    private static void exibaMensagem(Context contexto){
        Toast.makeText(contexto, R.string.mensgem, Toast.LENGTH_SHORT).show();
    }

    private static void exibaNavegador(Context contexto){
        Uri uri = Uri.parse("https://www.cruzeirodosul.edu.br");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        contexto.startActivity(intent);
    }

    private static void exibaSobre(Context contexto){
        Intent intent = new Intent(contexto, SobreActivity.class);
        contexto.startActivity(intent);
    }
}
