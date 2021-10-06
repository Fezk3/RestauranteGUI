package Ventana;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class VentanRest extends javax.swing.JFrame {

    private DefaultComboBoxModel comboM = new DefaultComboBoxModel();
    private DefaultComboBoxModel comboS = new DefaultComboBoxModel();
    private DefaultComboBoxModel comboMesas = new DefaultComboBoxModel();
    private DefaultComboBoxModel comboMese = new DefaultComboBoxModel();
    private DefaultTableModel modeloTablaFact = new DefaultTableModel();
    private DefaultTableModel modeloTablaSubM = new DefaultTableModel();
    private DefaultTableModel modeloTablaMesa = new DefaultTableModel();
    public DefaultComboBoxModel ini = new DefaultComboBoxModel();
    public DefaultComboBoxModel des = new DefaultComboBoxModel();
    public static Interfaz interfaz = new Interfaz();
    double totalFact = 0;
    ArrayList<Comida> comidas;
    ArrayList<Comida> pedido = new ArrayList<Comida>();

    public int num = 1;
    Mesa mesa;

    public VentanRest(Interfaz nuevo) {
        agregarModeloTablaFactura();
        agregarModeloTablaMesa();
        initComponents();
        this.setLocationRelativeTo(null);
        llenarComboI();
        llenarModeloComboServicio();
        interfaz.llenaMeseros();
        llenarModeloComboMesero();
        setFechaActual();
        agregarModelo();
        interfaz = nuevo;
        iniciaComboBoxMesas();
        iniciaComboMesasD();

    }

    private void iniciaComboMesasD() {

        for (int i = 1; i <= 12; i++) {

            ini.addElement("" + i);

        }

        for (int i = 1; i <= 12; i++) {

            des.addElement("" + i);

        }

    }

    private void iniciaComboBoxMesas() {

        comboMesas.addElement(1);
        comboMesas.addElement(2);
        comboMesas.addElement(3);
        comboMesas.addElement(4);
        comboMesas.addElement(5);
        comboMesas.addElement(6);
        comboMesas.addElement(7);
        comboMesas.addElement(8);
        comboMesas.addElement(9);
        comboMesas.addElement(10);
        comboMesas.addElement(11);
        comboMesas.addElement(12);

    }

    private void llenarComboI() {
        for (int i = 1; i <= 15; i++) {
            comboM.addElement("" + i);
        }
    }

    private void llenarModeloComboServicio() {

        comboS.addElement("Comer aqui");
        comboS.addElement("Para llevar");
        comboS.addElement("Express");

    }

    private void llenarModeloComboMesero() {

        int top = interfaz.meseros.size();
        Mesero actual;
        for (int i = 0; i < top; i++) {
            actual = interfaz.meseros.get(i);
            comboMese.addElement(actual);
        }

        //comboMese.addElement("");
    }

    private void setFechaActual() {

        Date actual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("MM/dd/Y");
        fechaactual.setText(formato.format(actual));

    }

    private void agregarModeloTablaFactura() {

        modeloTablaFact.addColumn("Producto");
        modeloTablaFact.addColumn("Cantidad");
        modeloTablaFact.addColumn("Tipo");
        modeloTablaFact.addColumn("Precio");

    }

    private void agregarModelo() {
        modeloTablaSubM.addColumn("Nombre");
        modeloTablaSubM.addColumn("Precio");
        modeloTablaSubM.addColumn("Tipo");
    }

    private void llenarTablaSubMenuB() {
        int top = interfaz.menuBebida.bebidas.size();
        Comida actual;
        for (int i = 0; i < top; i++) {
            actual = interfaz.menuBebida.bebidas.get(i);
            modeloTablaSubM.addRow(new Object[]{actual.getNombre(), String.valueOf(actual.getPrecio()), "Bebida"});
        }
    }

    private void llenarTablaSubMenuD() {
        int top = interfaz.menuDesayuno.comidas.size();
        Comida actual;
        for (int i = 0; i < top; i++) {
            actual = interfaz.menuDesayuno.comidas.get(i);
            modeloTablaSubM.addRow(new Object[]{actual.getNombre(), String.valueOf(actual.getPrecio()), actual.getTipo()});
        }
    }

    private void llenarTablaSubMenuA() {
        int top = interfaz.menuAlmuerzo.almuerzos.size();
        Comida actual;
        for (int i = 0; i < top; i++) {
            actual = interfaz.menuAlmuerzo.almuerzos.get(i);
            modeloTablaSubM.addRow(new Object[]{actual.getNombre(), String.valueOf(actual.getPrecio()), actual.getTipo()});
        }
    }

    private void llenarTablaSubMenuC() {
        int top = interfaz.menuCena.cenas.size();
        Comida actual;
        int i = 0;
        while (i < top) {
            actual = interfaz.menuCena.cenas.get(i);
            modeloTablaSubM.addRow(new Object[]{actual.getNombre(), String.valueOf(actual.getPrecio()), actual.getTipo()});
            i++;
        }
    }

    private Icon cambiarIcono(JLabel imagenMesa) {
        Icon me = new ImageIcon("src\\imagenes\\icono mesa - copia.png");
        if (!me.equals(imagenMesa.getIcon())) {

            return me;
        }

        return (new ImageIcon("src\\imagenes\\icono mesa.png"));
    }

    private void agregarModeloTablaMesa() {
        modeloTablaMesa.addColumn("Producto");
        modeloTablaMesa.addColumn("Cantidad");
        modeloTablaMesa.addColumn("Tipo");
        modeloTablaMesa.addColumn("Precio");

    }

    private void llenarTablaMesa() {

        Mesa m;
        Comida c;
        int var = Integer.parseInt(String.valueOf(comboMesa.getSelectedItem()));
        for (int i = 0; i < 12; i++) {
            m = interfaz.mesas.get(i);

            if (m.getNumero_mesa() == var /*&& m.getDisponible()==false*/) {
                infoMesero.setText(m.getMesero_encargado());
                ocupantes.setText(String.valueOf(m.getCantidad()));

                int j = 0;
                while (m.getPedido().size() > j) {
                    c = m.getPedido().get(j);

                    String nombre = String.valueOf(c.getNombre());
                    String cantidad = String.valueOf(c.getCantidad());
                    String tipo = String.valueOf(c.getTipo());
                    String precio = String.valueOf(c.getPrecio());

                    modeloTablaMesa.addRow(new Object[]{nombre, cantidad, tipo, precio});
                    j++;
                }
            }
        }
    }

    private boolean asignarMesa(String num) {
        String path = JOptionPane.showInputDialog("Digite el numero de ocupantes");
        if (Integer.parseInt(path) > 0 && Integer.parseInt(path) <= 4) {
            Mesa m = interfaz.mesas.get(Integer.parseInt(num) - 1);
            m.setDisponible(false);
            m.setCantidad(Integer.parseInt(path));
            return true;
        }

        showMessageDialog(null, "Numero de ocupantes invalido", "Invalido", JOptionPane.ERROR_MESSAGE);
        return false;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        panelMesas = new javax.swing.JPanel();
        etiquetaPanelMesas = new javax.swing.JLabel();
        imagenMesa1 = new javax.swing.JLabel();
        imagenMesa2 = new javax.swing.JLabel();
        imagenMesa3 = new javax.swing.JLabel();
        imagenMesa4 = new javax.swing.JLabel();
        imagenMesa5 = new javax.swing.JLabel();
        imagenMesa6 = new javax.swing.JLabel();
        imagenMesa7 = new javax.swing.JLabel();
        imagenMesa8 = new javax.swing.JLabel();
        imagenMesa9 = new javax.swing.JLabel();
        imagenMesa10 = new javax.swing.JLabel();
        imagenMesa11 = new javax.swing.JLabel();
        imagenMesa12 = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        num2 = new javax.swing.JLabel();
        num3 = new javax.swing.JLabel();
        num4 = new javax.swing.JLabel();
        num5 = new javax.swing.JLabel();
        num6 = new javax.swing.JLabel();
        num7 = new javax.swing.JLabel();
        num8 = new javax.swing.JLabel();
        num9 = new javax.swing.JLabel();
        num10 = new javax.swing.JLabel();
        num11 = new javax.swing.JLabel();
        num12 = new javax.swing.JLabel();
        panelInfoMesas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInfoMesa = new javax.swing.JTable();
        etiquetaInfoMesero = new javax.swing.JLabel();
        infoMesero = new javax.swing.JLabel();
        etiquetaOcupantes = new javax.swing.JLabel();
        ocupantes = new javax.swing.JLabel();
        etiquetaDetallePedido = new javax.swing.JLabel();
        botonRefrescar = new javax.swing.JButton();
        panelFactura = new javax.swing.JPanel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaTituloFact = new javax.swing.JLabel();
        etiquetaServicio = new javax.swing.JLabel();
        comboServicio = new javax.swing.JComboBox<>();
        etiquetaNumFact = new javax.swing.JLabel();
        numFact = new javax.swing.JLabel();
        etiquetaMesero = new javax.swing.JLabel();
        comboMesero = new javax.swing.JComboBox<>();
        etiquetaOrdenes = new javax.swing.JLabel();
        etiquetaFecha = new javax.swing.JLabel();
        fechaactual = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        etiquetaTotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        etiquetaIva = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        etiquetaTotalIva = new javax.swing.JLabel();
        totalIva = new javax.swing.JLabel();
        botonGeneraFact = new javax.swing.JButton();
        etiquetaTel = new javax.swing.JLabel();
        cajaTel = new javax.swing.JTextField();
        etiquetaDirec = new javax.swing.JLabel();
        cajaDirec = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        panelBtns = new javax.swing.JLabel();
        etiquetaAsigMesa = new javax.swing.JLabel();
        comboMesa = new javax.swing.JComboBox<>();
        botonCambioMesa = new javax.swing.JButton();
        BotonDivCuenta = new javax.swing.JButton();
        BotonMostrarMeseros = new javax.swing.JButton();
        BotonSubMenu = new javax.swing.JButton();
        botonMuestraFacts = new javax.swing.JButton();
        botonActualizaCombo = new javax.swing.JButton();
        botonDesocuparMesa = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        panelBanner = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        etiquetaLogo = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        etiquetaBebida = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        etiquetaDesayuno = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        etiquetaAlmuerzo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        etiquetaCena = new javax.swing.JLabel();
        panelSubmenu = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaSubMenu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        comboCantidad = new javax.swing.JComboBox<>();
        etiquetaSubmenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        panelMesas.setBackground(new java.awt.Color(51, 153, 255));

        etiquetaPanelMesas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaPanelMesas.setText("Mesas del Restaurante");

        imagenMesa1.setBackground(new java.awt.Color(255, 0, 51));
        imagenMesa1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        imagenMesa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa1.setText("1");
        imagenMesa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa1MouseClicked(evt);
            }
        });

        imagenMesa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa2.setText("2");
        imagenMesa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa2MouseClicked(evt);
            }
        });

        imagenMesa3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa3.setText("3");
        imagenMesa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa3MouseClicked(evt);
            }
        });

        imagenMesa4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa4.setText("4");
        imagenMesa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa4MouseClicked(evt);
            }
        });

        imagenMesa5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa5.setText("5 ");
        imagenMesa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa5MouseClicked(evt);
            }
        });

        imagenMesa6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa6.setText("6");
        imagenMesa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa6MouseClicked(evt);
            }
        });

        imagenMesa7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa7.setText("7");
        imagenMesa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa7MouseClicked(evt);
            }
        });

        imagenMesa8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa8.setText("8");
        imagenMesa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa8MouseClicked(evt);
            }
        });

        imagenMesa9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa9.setText("9");
        imagenMesa9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa9MouseClicked(evt);
            }
        });

        imagenMesa10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa10.setText("10");
        imagenMesa10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa10MouseClicked(evt);
            }
        });

        imagenMesa11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa11.setText("11");
        imagenMesa11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa11MouseClicked(evt);
            }
        });

        imagenMesa12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono mesa.png"))); // NOI18N
        imagenMesa12.setText("12");
        imagenMesa12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMesa12MouseClicked(evt);
            }
        });

        num1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num1.setText("1");

        num2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num2.setText("2");

        num3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num3.setText("3");

        num4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num4.setText("4");

        num5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num5.setText("5");

        num6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num6.setText("6");

        num7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num7.setText("7");

        num8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num8.setText("8");

        num9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num9.setText("9");

        num10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num10.setText("10");

        num11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num11.setText("11");

        num12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        num12.setText("12");

        javax.swing.GroupLayout panelMesasLayout = new javax.swing.GroupLayout(panelMesas);
        panelMesas.setLayout(panelMesasLayout);
        panelMesasLayout.setHorizontalGroup(
            panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMesasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaPanelMesas)
                .addGap(151, 151, 151))
            .addGroup(panelMesasLayout.createSequentialGroup()
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMesasLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMesasLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(num1)
                        .addGap(162, 162, 162)
                        .addComponent(num2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMesasLayout.createSequentialGroup()
                        .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imagenMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMesasLayout.createSequentialGroup()
                        .addComponent(num3)
                        .addGap(60, 60, 60))))
            .addGroup(panelMesasLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(num4)
                .addGap(164, 164, 164)
                .addComponent(num5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(num6)
                .addGap(62, 62, 62))
            .addGroup(panelMesasLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(num7)
                .addGap(160, 160, 160)
                .addComponent(num8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(num9)
                .addGap(63, 63, 63))
            .addGroup(panelMesasLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(num10)
                .addGap(154, 154, 154)
                .addComponent(num11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(num12)
                .addGap(58, 58, 58))
        );
        panelMesasLayout.setVerticalGroup(
            panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaPanelMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1)
                    .addComponent(num2)
                    .addComponent(num3))
                .addGap(18, 18, 18)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4)
                    .addComponent(num5)
                    .addComponent(num6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenMesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num8)
                    .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num9)
                        .addComponent(num7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenMesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenMesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenMesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(num11)
                    .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num10)
                        .addComponent(num12)))
                .addGap(12, 12, 12)
                .addGroup(panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagenMesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenMesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagenMesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInfoMesas.setBackground(new java.awt.Color(0, 102, 153));

        tablaInfoMesa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tablaInfoMesa.setModel(modeloTablaMesa);
        jScrollPane2.setViewportView(tablaInfoMesa);

        etiquetaInfoMesero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaInfoMesero.setText("Mesero Asignado: ");

        infoMesero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        etiquetaOcupantes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaOcupantes.setText("Numero de Ocupantes:");

        ocupantes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ocupantes.setText("0");

        etiquetaDetallePedido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaDetallePedido.setText("Detalle de los Pedidos");

        botonRefrescar.setText("Refrescar");
        botonRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRefrescarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInfoMesasLayout = new javax.swing.GroupLayout(panelInfoMesas);
        panelInfoMesas.setLayout(panelInfoMesasLayout);
        panelInfoMesasLayout.setHorizontalGroup(
            panelInfoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoMesasLayout.createSequentialGroup()
                .addGroup(panelInfoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoMesasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
                    .addGroup(panelInfoMesasLayout.createSequentialGroup()
                        .addGroup(panelInfoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInfoMesasLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(etiquetaInfoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(etiquetaOcupantes, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ocupantes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelInfoMesasLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(etiquetaDetallePedido)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panelInfoMesasLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(botonRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfoMesasLayout.setVerticalGroup(
            panelInfoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfoMesasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelInfoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaInfoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInfoMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaOcupantes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ocupantes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaDetallePedido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRefrescar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFactura.setBackground(new java.awt.Color(0, 102, 153));

        etiquetaNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaNombre.setText("Nombre:");

        etiquetaTituloFact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaTituloFact.setText("Factura");

        etiquetaServicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaServicio.setText("Servicio:");

        comboServicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboServicio.setModel(comboS);

        etiquetaNumFact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaNumFact.setText("Num Factura:");

        numFact.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        numFact.setText("1");

        etiquetaMesero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaMesero.setText("Mesero:");

        comboMesero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        comboMesero.setModel(comboMese);
        comboMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMeseroActionPerformed(evt);
            }
        });

        etiquetaOrdenes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaOrdenes.setText(" Ordenes");

        etiquetaFecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaFecha.setText("Fecha:");

        fechaactual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        tablaPedidos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tablaPedidos.setModel(modeloTablaFact);
        ListSelectionListener oyenteSeleccion = new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if(e.getValueIsAdjusting()){
                    int fila = tablaPedidos.getSelectedRow();
                    String nombre = String.valueOf(modeloTablaSubM.getValueAt(fila, 0));
                    String cantidad = String.valueOf(comboCantidad.getSelectedItem());
                    String tipo = String.valueOf(modeloTablaSubM.getValueAt(fila, 2));
                    String precio = String.valueOf(modeloTablaSubM.getValueAt(fila, 1));
                    double preciot = Integer.parseInt(cantidad) * Double.parseDouble(precio);
                    pedido.add(new Comida(nombre,Integer.parseInt(cantidad),preciot,tipo));
                }
            }
        };

        tablaPedidos.getSelectionModel().addListSelectionListener(oyenteSeleccion);
        jScrollPane1.setViewportView(tablaPedidos);

        etiquetaTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTotal.setText("Total: ");

        total.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        total.setText("0.0");

        etiquetaIva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaIva.setText(" IVA:");

        iva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        iva.setText("13%");

        etiquetaTotalIva.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        etiquetaTotalIva.setText("Total + IVA:");

        totalIva.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        totalIva.setText("0.0");

        botonGeneraFact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonGeneraFact.setForeground(new java.awt.Color(0, 0, 0));
        botonGeneraFact.setText("Generar");
        botonGeneraFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGeneraFactActionPerformed(evt);
            }
        });

        etiquetaTel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaTel.setText("Telefono:");

        etiquetaDirec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaDirec.setText("Direccion: ");

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addComponent(etiquetaTel)
                        .addGap(18, 18, 18)
                        .addComponent(cajaTel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addComponent(etiquetaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFacturaLayout.createSequentialGroup()
                                .addComponent(etiquetaNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(numFact, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaServicio)
                            .addComponent(etiquetaDirec))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addComponent(comboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(etiquetaMesero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addComponent(cajaDirec)
                                .addContainerGap())))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addComponent(etiquetaNombre)
                        .addGap(24, 24, 24)
                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTotalIva)
                            .addComponent(etiquetaIva, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFacturaLayout.createSequentialGroup()
                                .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonGeneraFact, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53))))
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(etiquetaOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(etiquetaTituloFact, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTituloFact, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNumFact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numFact)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaTel)
                        .addComponent(cajaTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDirec)
                    .addComponent(cajaDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(etiquetaOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaIva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonGeneraFact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTotalIva, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(totalIva))
                .addContainerGap())
        );

        panelBotones.setBackground(new java.awt.Color(51, 153, 255));

        panelBtns.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        panelBtns.setText("Gestion del Restaurante");

        etiquetaAsigMesa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaAsigMesa.setText("Seleccione Mesa");

        comboMesa.setModel(comboMesas);

        botonCambioMesa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonCambioMesa.setText("Cambiar Mesa");
        botonCambioMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCambioMesaActionPerformed(evt);
            }
        });

        BotonDivCuenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonDivCuenta.setText("Div Cuenta");
        BotonDivCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivCuentaActionPerformed(evt);
            }
        });

        BotonMostrarMeseros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BotonMostrarMeseros.setText("Mostrar Meseros");
        BotonMostrarMeseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarMeserosActionPerformed(evt);
            }
        });

        BotonSubMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonSubMenu.setText("Menu Admin");
        BotonSubMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSubMenuActionPerformed(evt);
            }
        });

        botonMuestraFacts.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonMuestraFacts.setText("Mostrar Facts.");
        botonMuestraFacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMuestraFactsActionPerformed(evt);
            }
        });

        botonActualizaCombo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonActualizaCombo.setText("Acualizar Planilla");
        botonActualizaCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizaComboActionPerformed(evt);
            }
        });

        botonDesocuparMesa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonDesocuparMesa.setText("Desocupa Mesa");
        botonDesocuparMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDesocuparMesaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(ini);

        jComboBox2.setModel(des);

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addComponent(etiquetaAsigMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMuestraFacts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonActualizaCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonDesocuparMesa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonMostrarMeseros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonDivCuenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonCambioMesa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBtns)
                .addGap(145, 145, 145))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBtns, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addComponent(BotonSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonDivCuenta)
                            .addComponent(botonMuestraFacts))
                        .addGap(12, 12, 12)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonMostrarMeseros)
                            .addComponent(botonActualizaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(panelBotonesLayout.createSequentialGroup()
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaAsigMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonDesocuparMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonCambioMesa)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))))
        );

        panelBanner.setBackground(new java.awt.Color(255, 255, 255));

        etiquetaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBannerLayout = new javax.swing.GroupLayout(panelBanner);
        panelBanner.setLayout(panelBannerLayout);
        panelBannerLayout.setHorizontalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBannerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBannerLayout.setVerticalGroup(
            panelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panelMenu.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen bebida1.jpg"))); // NOI18N
        etiquetaBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiquetaBebidaMouseClicked(evt);
            }
        });
        jPanel1.add(etiquetaBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaDesayuno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen desayuno1.jpg"))); // NOI18N
        etiquetaDesayuno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiquetaDesayunoMouseClicked(evt);
            }
        });
        jPanel2.add(etiquetaDesayuno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaAlmuerzo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen almuerzo1.jpg"))); // NOI18N
        etiquetaAlmuerzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiquetaAlmuerzoMouseClicked(evt);
            }
        });
        jPanel3.add(etiquetaAlmuerzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaCena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen cena1.jpg"))); // NOI18N
        etiquetaCena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiquetaCenaMouseClicked(evt);
            }
        });
        jPanel4.add(etiquetaCena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelSubmenu.setBackground(new java.awt.Color(0, 102, 153));

        tablaSubMenu.setModel(modeloTablaSubM);
        jScrollPane3.setViewportView(tablaSubMenu);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Cantidad: ");

        botonAgregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        comboCantidad.setModel(comboM);

        etiquetaSubmenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiquetaSubmenu.setText("SubMenus");

        javax.swing.GroupLayout panelSubmenuLayout = new javax.swing.GroupLayout(panelSubmenu);
        panelSubmenu.setLayout(panelSubmenuLayout);
        panelSubmenuLayout.setHorizontalGroup(
            panelSubmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubmenuLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(etiquetaSubmenu)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelSubmenuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelSubmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSubmenuLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSubmenuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregar)
                        .addGap(60, 60, 60))))
        );
        panelSubmenuLayout.setVerticalGroup(
            panelSubmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubmenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(etiquetaSubmenu)
                .addGap(18, 18, 18)
                .addGroup(panelSubmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInfoMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSubmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBanner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelSubmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator4)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelInfoMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGeneraFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGeneraFactActionPerformed
        
        String indexComboMesa;
        numFact.setText("" + num);
        Mesa mesita;

        // creado obj nuevo de factura y aniadiendolo a la lista de facturas
        String nom, tel, dir, serv, mese, fech;
        int nume;
        comidas = new ArrayList<Comida>();

        nom = cajaNombre.getText();
        tel = cajaTel.getText();
        dir = cajaDirec.getText();
        serv = String.valueOf(comboServicio.getSelectedItem());
        fech = String.valueOf(fechaactual.getText());

        if (serv.equals("Comer aqui")) {

            mese = String.valueOf(comboMesero.getSelectedItem());

        } else {

            mese = "  ";

        }

        // Para comida
        String nomb, tip, cant, prec;
        int top = modeloTablaFact.getRowCount();

        for (int i = 0; i < top; i++) {

            nomb = String.valueOf(modeloTablaFact.getValueAt(i, 0));
            cant = String.valueOf(modeloTablaFact.getValueAt(i, 1));
            tip = String.valueOf(modeloTablaFact.getValueAt(i, 2));
            prec = String.valueOf(modeloTablaFact.getValueAt(i, 3));

            System.out.println(nomb);
            System.out.println(cant);
            System.out.println(tip);
            System.out.println(prec);

            comidas.add(new Comida(nomb.trim(), Integer.parseInt(cant), Double.parseDouble(prec), tip.trim()));

        }

        for (int i = 0; i < comidas.size(); i++) {

            System.out.println(comidas.get(i));

        }

        if (serv.equals("Express")) {

            if (nom.equals("")) {
                showMessageDialog(null, "Llene todos los espacios antes de Facturar", "Invalido", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (tel.equals("")) {
                showMessageDialog(null, "Llene todos los espacios antes de Facturar", "Invalido", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (dir.equals("")) {
                showMessageDialog(null, "Llene todos los espacios antes de Facturar", "Invalido", JOptionPane.ERROR_MESSAGE);
                return;
            }

        }
        if (serv.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de Facturar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (mese.equals("")) {
            showMessageDialog(null, "Llene todos los espacios antes de Facturar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (top == 0) {
            showMessageDialog(null, "Aniada un pedido antes de Facturar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (comboServicio.getSelectedItem().equals("Comer aqui")) {

            indexComboMesa = String.valueOf(comboMesa.getSelectedIndex());

            mesita = interfaz.mesas.get(Integer.parseInt(indexComboMesa));

            if (mesita.getDisponible() == true) {
                showMessageDialog(null, "asigne una mesa", "Invalido", JOptionPane.ERROR_MESSAGE);
                return;
            }
            mesita.setPedido(comidas);
            mesita.setMesero_encargado(mese);

        }
        
        nume = Integer.parseInt(numFact.getText());
        // AGREGANDO FACTURA A LA LISTA
        Factura nueva = new Factura(comidas, nume , fech, serv, mese, tel, nom, dir);
        interfaz.facturas.add(nueva);
        num +=1;
        numFact.setText("" + (num));
        double descuento, totalisimo;

        if (comboServicio.getSelectedItem() == "Express") {
            totalisimo = nueva.calcularTotal();
            descuento = totalisimo * 0.05;
            total.setText("Con descuento " + (totalisimo - descuento));
            totalIva.setText("Con descuento " + Math.round((((totalisimo * 1.13) * 100.0) / 100.0) - descuento));
        } else {
            total.setText("" + nueva.calcularTotal());
            totalIva.setText("" + Math.round((nueva.calcularTotal() * 1.13) * 100.0) / 100.0);

        }

        JOptionPane.showMessageDialog(null, "Supedido ha sido aceptado!", "Factura Generada", JOptionPane.INFORMATION_MESSAGE);

        // Vaciando la factura para que quede disponible
        cajaNombre.setText("");
        cajaTel.setText("");
        cajaDirec.setText("");
        //comboServicio.setSelectedIndex(-1);
        //comboMesero.setSelectedIndex(-1);
        total.setText("0.0");
        totalIva.setText("0.0");

        while (top != 0) {

            modeloTablaFact.removeRow(0);
            top -= 1;

        }
    }//GEN-LAST:event_botonGeneraFactActionPerformed

    private void comboMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMeseroActionPerformed

    private void BotonDivCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivCuentaActionPerformed
        
        if (pedido.isEmpty()) {
            showMessageDialog(null, "seleccione el articulo que desee eliminar", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            /*int nf=numFact
            Factura nueva =new Factura(pedido,, fecha, tipoServicio, mesero, telCliente, nomCliente, direcCliente)*/
        }
    }//GEN-LAST:event_BotonDivCuentaActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        int fila = tablaSubMenu.getSelectedRow();
        double descuento, totalisimo;
        if (fila != -1) {
            String nombre = String.valueOf(modeloTablaSubM.getValueAt(fila, 0));
            String cantidad = String.valueOf(comboCantidad.getSelectedItem());
            String tipo = String.valueOf(modeloTablaSubM.getValueAt(fila, 2));
            String precio = String.valueOf(modeloTablaSubM.getValueAt(fila, 1));
            double preciot = Integer.parseInt(cantidad) * Double.parseDouble(precio);
            //Comida nueva =new Comida(nombre,tipo,preciot,Integer.parseInt(cantidad) );

            modeloTablaFact.addRow(new Object[]{nombre, cantidad, tipo, preciot});

        } else {
            showMessageDialog(null, "seleccione un articulo", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void etiquetaBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaBebidaMouseClicked
        int top = modeloTablaSubM.getRowCount();

        while (top != 0) {

            modeloTablaSubM.removeRow(0);
            top -= 1;
        }
        if (top == 0) {
            llenarTablaSubMenuB();
        }
    }//GEN-LAST:event_etiquetaBebidaMouseClicked

    private void etiquetaDesayunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaDesayunoMouseClicked
        int top = modeloTablaSubM.getRowCount();

        while (top != 0) {

            modeloTablaSubM.removeRow(0);
            top -= 1;
        }
        llenarTablaSubMenuD();
    }//GEN-LAST:event_etiquetaDesayunoMouseClicked

    private void etiquetaAlmuerzoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaAlmuerzoMouseClicked
        int top = modeloTablaSubM.getRowCount();

        while (top != 0) {

            modeloTablaSubM.removeRow(0);
            top -= 1;
        }
        llenarTablaSubMenuA();
    }//GEN-LAST:event_etiquetaAlmuerzoMouseClicked

    private void etiquetaCenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiquetaCenaMouseClicked
        int top = modeloTablaSubM.getRowCount();

        while (top != 0) {

            modeloTablaSubM.removeRow(0);
            top -= 1;
        }
        llenarTablaSubMenuC();
    }//GEN-LAST:event_etiquetaCenaMouseClicked

    private void botonMuestraFactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMuestraFactsActionPerformed
        interfaz.OrdenarFacts();
        VentanaFactura facturas = new VentanaFactura(interfaz);
        facturas.setVisible(true);
        facturas.setLocationRelativeTo(null);
        facturas.validate();
    }//GEN-LAST:event_botonMuestraFactsActionPerformed

    private void imagenMesa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa1MouseClicked
        if (asignarMesa(num1.getText())) {
            imagenMesa1.setIcon(cambiarIcono(imagenMesa1));
        }

    }//GEN-LAST:event_imagenMesa1MouseClicked

    private void imagenMesa2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa2MouseClicked

        if (asignarMesa(num2.getText())) {
            imagenMesa2.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa2MouseClicked

    private void imagenMesa3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa3MouseClicked

        if (asignarMesa(num3.getText())) {
            imagenMesa3.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa3MouseClicked

    private void imagenMesa4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa4MouseClicked

        if (asignarMesa(num4.getText())) {
            imagenMesa4.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa4MouseClicked

    private void imagenMesa5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa5MouseClicked

        if (asignarMesa(num5.getText())) {
            imagenMesa5.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa5MouseClicked

    private void imagenMesa6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa6MouseClicked

        if (asignarMesa(num6.getText())) {
            imagenMesa6.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa6MouseClicked

    private void imagenMesa7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa7MouseClicked

        if (asignarMesa(num7.getText())) {
            imagenMesa7.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa7MouseClicked

    private void imagenMesa8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa8MouseClicked

        if (asignarMesa(num8.getText())) {
            imagenMesa8.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa8MouseClicked

    private void imagenMesa9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa9MouseClicked

        if (asignarMesa(num9.getText())) {
            imagenMesa9.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa9MouseClicked

    private void imagenMesa10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa10MouseClicked

        if (asignarMesa(num10.getText())) {
            imagenMesa10.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa10MouseClicked

    private void imagenMesa11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa11MouseClicked

        if (asignarMesa(num11.getText())) {
            imagenMesa11.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa11MouseClicked

    private void imagenMesa12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMesa12MouseClicked

        if (asignarMesa(num12.getText())) {
            imagenMesa12.setIcon(cambiarIcono(imagenMesa1));
        }
    }//GEN-LAST:event_imagenMesa12MouseClicked

    private void BotonSubMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSubMenuActionPerformed
        VentanaAdmin admin = new VentanaAdmin(interfaz);
        admin.setVisible(true);
        admin.setLocationRelativeTo(null);
        admin.validate();
    }//GEN-LAST:event_BotonSubMenuActionPerformed

    private void BotonMostrarMeserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarMeserosActionPerformed
        VentanaMeseros mese = new VentanaMeseros(interfaz);
        mese.setVisible(true);
        mese.setLocationRelativeTo(null);
        mese.validate();
    }//GEN-LAST:event_BotonMostrarMeserosActionPerformed

    private void botonActualizaComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizaComboActionPerformed

        comboMese.removeAllElements();
        llenarModeloComboMesero();

    }//GEN-LAST:event_botonActualizaComboActionPerformed

    private void botonDesocuparMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDesocuparMesaActionPerformed

        String n = String.valueOf(comboMesa.getSelectedItem());
        Icon me = new ImageIcon("src\\imagenes\\icono mesa.png");

        if (interfaz.desocuparMesas(Integer.parseInt(n))) {

            showMessageDialog(null, "Mesa" + n + " desocupada", "Confirmado", JOptionPane.INFORMATION_MESSAGE);

            switch (Integer.parseInt(n)) {

                case 1:
                    imagenMesa1.setIcon(me);
                    break;
                case 2:
                    imagenMesa2.setIcon(me);
                    break;
                case 3:
                    imagenMesa3.setIcon(me);
                    break;
                case 4:
                    imagenMesa4.setIcon(me);
                    break;
                case 5:
                    imagenMesa5.setIcon(me);
                    break;
                case 6:
                    imagenMesa6.setIcon(me);
                    break;
                case 7:
                    imagenMesa7.setIcon(me);
                    break;
                case 8:
                    imagenMesa8.setIcon(me);
                    break;
                case 9:
                    imagenMesa9.setIcon(me);
                    break;
                case 10:
                    imagenMesa10.setIcon(me);
                    break;
                case 11:
                    imagenMesa11.setIcon(me);
                    break;
                case 12:
                    imagenMesa12.setIcon(me);
                    break;

            }

        } else {

            showMessageDialog(null, "La mesa no puede ser desocupada", "Invalido", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_botonDesocuparMesaActionPerformed

    private void botonRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRefrescarActionPerformed

        while (modeloTablaMesa.getRowCount() != 0) {

            modeloTablaMesa.removeRow(0);

        }

        llenarTablaMesa();
    }//GEN-LAST:event_botonRefrescarActionPerformed

    private void botonCambioMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCambioMesaActionPerformed

        int inic = Integer.parseInt(String.valueOf(ini.getSelectedItem()));
        int dest = Integer.parseInt(String.valueOf(des.getSelectedItem()));
        Icon me = new ImageIcon("src\\imagenes\\icono mesa.png");
        Icon mev = new ImageIcon("src\\imagenes\\icono mesa - copia.png");

        inic -= 1;
        dest -= 1;

        if (inic == dest) {
            showMessageDialog(null, "La mesa inicial no puede ser la misma que la de destino", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (interfaz.mesas.get(inic).getDisponible() == true || interfaz.mesas.isEmpty()) {
            showMessageDialog(null, "La mesa inicial no esta ocupada", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (interfaz.mesas.get(dest).getDisponible() == false) {
            showMessageDialog(null, "La mesa de destino esta ocupada", "Invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Mesa vieja = interfaz.mesas.get(inic);
        System.out.println(vieja);
        System.out.println("DESTINO:   " + dest);
        interfaz.mesas.get(dest).setPedido(vieja.pedido);
        interfaz.mesas.get(dest).setMesero_encargado(vieja.getMesero_encargado());
        interfaz.mesas.get(dest).setCantidad(vieja.getCantidad());
        interfaz.mesas.get(dest).setDisponible(false);
        interfaz.mesas.get(inic).desocuparMesa();
        /*
        for (int i = 0; i < interfaz.mesas.size(); i++) {

            if (interfaz.mesas.get(i).getNumero_mesa() == dest) {

                System.out.println(interfaz.mesas.get(i).toString());

            }

        }
         */
        dest++;
        inic++;
        switch (inic) {

            case 1:
                imagenMesa1.setIcon(me);
                break;
            case 2:
                imagenMesa2.setIcon(me);
                break;
            case 3:
                imagenMesa3.setIcon(me);
                break;
            case 4:
                imagenMesa4.setIcon(me);
                break;
            case 5:
                imagenMesa5.setIcon(me);
                break;
            case 6:
                imagenMesa6.setIcon(me);
                break;
            case 7:
                imagenMesa7.setIcon(me);
                break;
            case 8:
                imagenMesa8.setIcon(me);
                break;
            case 9:
                imagenMesa9.setIcon(me);
                break;
            case 10:
                imagenMesa10.setIcon(me);
                break;
            case 11:
                imagenMesa11.setIcon(me);
                break;
            case 12:
                imagenMesa12.setIcon(me);
                break;

        }

        switch (dest) {

            case 1:
                imagenMesa1.setIcon(mev);
                break;
            case 2:
                imagenMesa2.setIcon(mev);
                break;
            case 3:
                imagenMesa3.setIcon(mev);
                break;
            case 4:
                imagenMesa4.setIcon(mev);
                break;
            case 5:
                imagenMesa5.setIcon(mev);
                break;
            case 6:
                imagenMesa6.setIcon(mev);
                break;
            case 7:
                imagenMesa7.setIcon(mev);
                break;
            case 8:
                imagenMesa8.setIcon(mev);
                break;
            case 9:
                imagenMesa9.setIcon(mev);
                break;
            case 10:
                imagenMesa10.setIcon(mev);
                break;
            case 11:
                imagenMesa11.setIcon(mev);
                break;
            case 12:
                imagenMesa12.setIcon(mev);
                break;

        }

    }//GEN-LAST:event_botonCambioMesaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanRest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanRest(interfaz).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDivCuenta;
    private javax.swing.JButton BotonMostrarMeseros;
    private javax.swing.JButton BotonSubMenu;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton botonActualizaCombo;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCambioMesa;
    private javax.swing.JButton botonDesocuparMesa;
    private javax.swing.JButton botonGeneraFact;
    private javax.swing.JButton botonMuestraFacts;
    private javax.swing.JButton botonRefrescar;
    private javax.swing.JTextField cajaDirec;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaTel;
    private javax.swing.JComboBox<String> comboCantidad;
    private javax.swing.JComboBox<String> comboMesa;
    private javax.swing.JComboBox<String> comboMesero;
    private javax.swing.JComboBox<String> comboServicio;
    private javax.swing.JLabel etiquetaAlmuerzo;
    private javax.swing.JLabel etiquetaAsigMesa;
    private javax.swing.JLabel etiquetaBebida;
    private javax.swing.JLabel etiquetaCena;
    private javax.swing.JLabel etiquetaDesayuno;
    private javax.swing.JLabel etiquetaDetallePedido;
    private javax.swing.JLabel etiquetaDirec;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaInfoMesero;
    private javax.swing.JLabel etiquetaIva;
    private javax.swing.JLabel etiquetaLogo;
    private javax.swing.JLabel etiquetaMesero;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaNumFact;
    private javax.swing.JLabel etiquetaOcupantes;
    private javax.swing.JLabel etiquetaOrdenes;
    private javax.swing.JLabel etiquetaPanelMesas;
    private javax.swing.JLabel etiquetaServicio;
    private javax.swing.JLabel etiquetaSubmenu;
    private javax.swing.JLabel etiquetaTel;
    private javax.swing.JLabel etiquetaTituloFact;
    private javax.swing.JLabel etiquetaTotal;
    private javax.swing.JLabel etiquetaTotalIva;
    private javax.swing.JLabel fechaactual;
    private javax.swing.JLabel imagenMesa1;
    private javax.swing.JLabel imagenMesa10;
    private javax.swing.JLabel imagenMesa11;
    private javax.swing.JLabel imagenMesa12;
    private javax.swing.JLabel imagenMesa2;
    private javax.swing.JLabel imagenMesa3;
    private javax.swing.JLabel imagenMesa4;
    private javax.swing.JLabel imagenMesa5;
    private javax.swing.JLabel imagenMesa6;
    private javax.swing.JLabel imagenMesa7;
    private javax.swing.JLabel imagenMesa8;
    private javax.swing.JLabel imagenMesa9;
    private javax.swing.JLabel infoMesero;
    private javax.swing.JLabel iva;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num10;
    private javax.swing.JLabel num11;
    private javax.swing.JLabel num12;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel num5;
    private javax.swing.JLabel num6;
    private javax.swing.JLabel num7;
    private javax.swing.JLabel num8;
    private javax.swing.JLabel num9;
    private javax.swing.JLabel numFact;
    private javax.swing.JLabel ocupantes;
    private javax.swing.JPanel panelBanner;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JLabel panelBtns;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelInfoMesas;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMesas;
    private javax.swing.JPanel panelSubmenu;
    private javax.swing.JTable tablaInfoMesa;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTable tablaSubMenu;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totalIva;
    // End of variables declaration//GEN-END:variables
}
