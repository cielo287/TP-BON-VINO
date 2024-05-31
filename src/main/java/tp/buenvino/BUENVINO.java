

package tp.buenvino;

import Boundary.PantallaRankingVinos;

public class BUENVINO {

    public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new PantallaRankingVinos().setVisible(true);
        }
    });
}
}
