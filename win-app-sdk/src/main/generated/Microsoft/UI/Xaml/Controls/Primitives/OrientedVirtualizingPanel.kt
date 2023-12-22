package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.IInsertionPanel
import Microsoft.UI.Xaml.Controls.VirtualizingPanel
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(OrientedVirtualizingPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.OrientedVirtualizingPanel;{450d2984-1e70-53d8-8269-a27564daa69f})")
@WinRTByReference(brClass = OrientedVirtualizingPanel.ByReference::class)
public open class OrientedVirtualizingPanel(
  ptr: JNAPointer? = NULL
) : VirtualizingPanel(ptr), IOrientedVirtualizingPanel.WithDefault,
    IScrollSnapPointsInfo.WithDefault, IInsertionPanel.WithDefault, IWinRTObject {
  private val __2066163127_Interface: IOrientedVirtualizingPanel.WithDefault by lazy {
    as_2066163127()
  }


  private val __1788393063_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1788393063()
  }


  private val __1932060188_Interface: IInsertionPanel.WithDefault by lazy {
    as_1932060188()
  }


  public override val __2066163127_Ptr: JNAPointer? by lazy {
    __2066163127_Interface.__2066163127_Ptr
  }


  public override val __1788393063_Ptr: JNAPointer? by lazy {
    __1788393063_Interface.__1788393063_Ptr
  }


  public override val __1932060188_Ptr: JNAPointer? by lazy {
    __1932060188_Interface.__1932060188_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2066163127_Interface, __1788393063_Interface, __1932060188_Interface)

  private fun as_2066163127(): IOrientedVirtualizingPanel.WithDefault {
    if(pointer == NULL) {
      return(IOrientedVirtualizingPanel.ABI.makeIOrientedVirtualizingPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientedVirtualizingPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientedVirtualizingPanel.ABI.makeIOrientedVirtualizingPanel(ref.value))
  }

  private fun as_1788393063(): IScrollSnapPointsInfo.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPointsInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(ref.value))
  }

  private fun as_1932060188(): IInsertionPanel.WithDefault {
    if(pointer == NULL) {
      return(IInsertionPanel.ABI.makeIInsertionPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInsertionPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInsertionPanel.ABI.makeIInsertionPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OrientedVirtualizingPanel> {
    public override fun getValue() = OrientedVirtualizingPanel(pointer.getPointer(0))

    public fun setValue(value: OrientedVirtualizingPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OrientedVirtualizingPanel, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): OrientedVirtualizingPanel {
      val address = segment.toRawLongValue()
      return OrientedVirtualizingPanel(Pointer(address))
    }

    public override fun toNative(obj: OrientedVirtualizingPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
