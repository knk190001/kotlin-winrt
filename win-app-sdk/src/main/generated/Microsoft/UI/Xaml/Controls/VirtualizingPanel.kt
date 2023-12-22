package Microsoft.UI.Xaml.Controls

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

@ABIMarker(VirtualizingPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.VirtualizingPanel;{2b216a2d-5079-51ba-838a-9086903636b4})")
@WinRTByReference(brClass = VirtualizingPanel.ByReference::class)
public open class VirtualizingPanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IVirtualizingPanel.WithDefault, IVirtualizingPanelProtected.WithDefault,
    IVirtualizingPanelOverrides.WithDefault, IWinRTObject {
  private val __797830697_Interface: IVirtualizingPanel.WithDefault by lazy {
    as_797830697()
  }


  private val __315909225_Interface: IVirtualizingPanelProtected.WithDefault by lazy {
    as_315909225()
  }


  private val __457339376_Interface: IVirtualizingPanelOverrides.WithDefault by lazy {
    as_457339376()
  }


  public override val __797830697_Ptr: JNAPointer? by lazy {
    __797830697_Interface.__797830697_Ptr
  }


  public override val __315909225_Ptr: JNAPointer? by lazy {
    __315909225_Interface.__315909225_Ptr
  }


  public override val __457339376_Ptr: JNAPointer? by lazy {
    __457339376_Interface.__457339376_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__797830697_Interface, __315909225_Interface, __457339376_Interface)

  private fun as_797830697(): IVirtualizingPanel.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingPanel.ABI.makeIVirtualizingPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingPanel.ABI.makeIVirtualizingPanel(ref.value))
  }

  private fun as_315909225(): IVirtualizingPanelProtected.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingPanelProtected.ABI.makeIVirtualizingPanelProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingPanelProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingPanelProtected.ABI.makeIVirtualizingPanelProtected(ref.value))
  }

  private fun as_457339376(): IVirtualizingPanelOverrides.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingPanelOverrides.ABI.makeIVirtualizingPanelOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingPanelOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingPanelOverrides.ABI.makeIVirtualizingPanelOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VirtualizingPanel> {
    public override fun getValue() = VirtualizingPanel(pointer.getPointer(0))

    public fun setValue(value: VirtualizingPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VirtualizingPanel, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VirtualizingPanel {
      val address = segment.toRawLongValue()
      return VirtualizingPanel(Pointer(address))
    }

    public override fun toNative(obj: VirtualizingPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
