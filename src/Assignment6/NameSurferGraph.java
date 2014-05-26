/*
 * File: NameSurferGraph.java
 * ---------------------------
 * This class represents the canvas on which the graph of
 * names is drawn. This class is responsible for updating
 * (redrawing) the graphs whenever the list of entries changes or the window is resized.
 */

import acm.graphics.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class NameSurferGraph extends GCanvas implements NameSurferConstants, ComponentListener {
    /**
    * Creates a new NameSurferGraph object that displays the data.
    */
    public NameSurferGraph() {
        addComponentListener(this);
        update();
    }

    /**
    * Clears the list of name surfer entries stored inside this class.
    */
    public void clear() {
        entries.clear();
        update();
    }

    /* Method: addEntry(entry) */
    /**
    * Adds a new NameSurferEntry to the list of entries on the display.
    * Note that this method does not actually draw the graph, but
    * simply stores the entry; the graph is drawn by calling update.
    */
    public void addEntry(NameSurferEntry entry) {
        entries.add(entry);
        update();
    }

    /**
    * Updates the display image by deleting all the graphical objects
    * from the canvas and then reassembling the display according to
    * the list of entries. Your application must call update after
    * calling either clear or addEntry; update is also called whenever
    * the size of the canvas changes.
    */
    public void update() {
        removeAll();
        drawBackgroundGrid();
        drawMargins();
        drawDecadeLabels();
        drawEntries();
    }

    private void drawEntries() {
        for (int i = 0; i < entries.size(); i++) {
            drawEntry(entries.get(i));
        }
    }

    private void drawEntry(NameSurferEntry entry) {
        int columnWidth = getWidth() / NDECADES;
        int x = 0;
        int decade = 0;
        while (x < getWidth() && decade < (NDECADES - 1)) {
            GLine lineSegment = new GLine(x, plotRank(entry.getRank(decade)),
                                          x + columnWidth, plotRank(entry.getRank(decade + 1)));
            lineSegment.setColor(Color.BLACK);
            add(lineSegment);
            String labelText = entry.getName() + " " + (entry.getRank(decade) > 0 ? entry.getRank(decade) : "*");
            add(new GLabel(labelText, x + 6, plotRank(entry.getRank(decade)) - 4));
            x += columnWidth;
            decade++;
        }
    }

    private int plotRank(int rank) {
        if (rank == 0) {
            return getHeight() - GRAPH_MARGIN_SIZE;
        } else {
            return (int) (rank * ((getHeight() - (2 * GRAPH_MARGIN_SIZE)) / (double) MAX_RANK)) + GRAPH_MARGIN_SIZE;
        }
    }

    private void drawBackgroundGrid() {
        int columnWidth = getWidth() / NDECADES;
        int x = 0;
        while (x < getWidth()) {
            add(new GLine(x, 0, x, getHeight()));
            x += columnWidth;
        }
    }

    private void drawMargins() {
        add(new GLine(0, GRAPH_MARGIN_SIZE, getWidth(), GRAPH_MARGIN_SIZE));
        add(new GLine(0, getHeight() - GRAPH_MARGIN_SIZE, getWidth(), getHeight() - GRAPH_MARGIN_SIZE));
    }

    private void drawDecadeLabels() {
        int columnWidth = getWidth() / NDECADES;
        int x = 6;
        int y = getHeight() - 4;
        int decade = START_DECADE;
        for (int i = 0; i < NDECADES; i++) {
            add(new GLabel(Integer.toString(decade), x, y));
            x += columnWidth;
            decade += 10;
        }
    }

    private ArrayList<NameSurferEntry> entries = new ArrayList<NameSurferEntry>();

    /* Implementation of the ComponentListener interface */
    public void componentHidden(ComponentEvent e) { }
    public void componentMoved(ComponentEvent e) { }
    public void componentResized(ComponentEvent e) { update(); }
    public void componentShown(ComponentEvent e) { }
}
