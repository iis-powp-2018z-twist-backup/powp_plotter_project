package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;


public class AdapterPloterAdapter extends AbstractPlotter {
    private IPlotter iPlotter;


    public AdapterPloterAdapter(IPlotter iPlotter) {
        super(0, 0);
        this.iPlotter = iPlotter;
    }


    @Override
    public void drawTo(int x, int y) {

        this.setPosition(x, y);
        iPlotter.drawTo(x, y);


    }

    @Override
    public String toString() {
        return "Adapter Ploter Simulator";
    }
}
