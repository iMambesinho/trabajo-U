/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paradigma.trabajo2;

public class almacen1 {
    public class almacen1 extends JFrame implements ActionListener {

    private JButton btnCrearProducto, btnVerProductos, btnEditarProductos;
    private JPanel panelBotones;
    private JTable tablaProductos;
    private JScrollPane scrollTablaProductos;
    private DefaultTableModel modeloTabla;
    private List<Producto> listaProductos;
    private Connection conexion;

}
public Almacen() {
        super("Almacén");

        // Inicializar botones
        btnCrearProducto = new JButton("Crear producto");
        btnVerProductos = new JButton("Ver productos");
        btnEditarProductos = new JButton("Editar productos");

        // Agregar listener a botones
        btnCrearProducto.addActionListener(this);
        btnVerProductos.addActionListener(this);
        btnEditarProductos.addActionListener(this);

        // Inicializar panel de botones
        panelBotones = new JPanel();
        panelBotones.add(btnCrearProducto);
        panelBotones.add(btnVerProductos);
        panelBotones.add(btnEditarProductos);

        // Inicializar tabla de productos
        tablaProductos = new JTable();
        modeloTabla = new DefaultTableModel(new Object[]{"ID", "Nombre", "Precio", "Cantidad"}, 0);
        tablaProductos.setModel(modeloTabla);
        scrollTablaProductos = new JScrollPane(tablaProductos);

        // Agregar componentes al frame
        add(panelBotones, BorderLayout.NORTH);
        add(scrollTablaProductos, BorderLayout.CENTER);

        // Establecer propiedades del frame
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Conectar a la base de datos
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos");
            System.exit(0);
        }

        // Cargar productos desde la base de datos
        listaProductos = cargarProductos();
        mostrarProductos();
    }

public Almacen() {
        super("Almacén");

        // Inicializar botones
        btnCrearProducto = new JButton("Crear producto");
        btnVerProductos = new JButton("Ver productos");
        btnEditarProductos = new JButton("Editar productos");

        // Agregar listener a botones
        btnCrearProducto.addActionListener(this);
        btnVerProductos.addActionListener(this);
        btnEditarProductos.addActionListener(this);

        // Inicializar panel de botones
        panelBotones = new JPanel();
        panelBotones.add(btnCrearProducto);
        panelBotones.add(btnVerProductos);
        panelBotones.add(btnEditarProductos);

        // Inicializar tabla de productos
        tablaProductos = new JTable();
        modeloTabla = new DefaultTableModel(new Object[]{"ID", "Nombre", "Precio", "Cantidad"}, 0);
        tablaProductos.setModel(modeloTabla);
        scrollTablaProductos = new JScrollPane(tablaProductos);

        // Agregar componentes al frame
        add(panelBotones, BorderLayout.NORTH);
        add(scrollTablaProductos, BorderLayout.CENTER);

        // Establecer propiedades del frame
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Conectar a la base de datos
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos");
            System.exit(0);
        }

        // Cargar productos desde la base de datos
        listaProductos = cargarProductos();
        mostrarProductos();
    }