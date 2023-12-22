package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.IInsertionPanel
import Windows.UI.Xaml.Controls.VirtualizingPanel
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
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.OrientedVirtualizingPanel;{f077b577-39bd-46ee-bdd7-0826beed71b8})")
@WinRTByReference(brClass = OrientedVirtualizingPanel.ByReference::class)
public open class OrientedVirtualizingPanel(
  ptr: JNAPointer? = NULL
) : VirtualizingPanel(ptr), IOrientedVirtualizingPanel.WithDefault,
    IScrollSnapPointsInfo.WithDefault, IInsertionPanel.WithDefault, IWinRTObject {
  private val __437887518_Interface: IOrientedVirtualizingPanel.WithDefault by lazy {
    as_437887518()
  }


  private val __1877225636_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1877225636()
  }


  private val __1101609905_Interface: IInsertionPanel.WithDefault by lazy {
    as_1101609905()
  }


  public override val __437887518_Ptr: JNAPointer? by lazy {
    __437887518_Interface.__437887518_Ptr
  }


  public override val __1877225636_Ptr: JNAPointer? by lazy {
    __1877225636_Interface.__1877225636_Ptr
  }


  public override val __1101609905_Ptr: JNAPointer? by lazy {
    __1101609905_Interface.__1101609905_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__437887518_Interface, __1877225636_Interface, __1101609905_Interface)

  private fun as_437887518(): IOrientedVirtualizingPanel.WithDefault {
    if(pointer == NULL) {
      return(IOrientedVirtualizingPanel.ABI.makeIOrientedVirtualizingPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOrientedVirtualizingPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOrientedVirtualizingPanel.ABI.makeIOrientedVirtualizingPanel(ref.value))
  }

  private fun as_1877225636(): IScrollSnapPointsInfo.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPointsInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(ref.value))
  }

  private fun as_1101609905(): IInsertionPanel.WithDefault {
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
