package Windows.UI.Xaml.Controls

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
@Signature("rc(Windows.UI.Xaml.Controls.VirtualizingPanel;{38aad50c-12cf-4d1e-a884-c9df85f07cd9})")
@WinRTByReference(brClass = VirtualizingPanel.ByReference::class)
public open class VirtualizingPanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IVirtualizingPanel.WithDefault, IVirtualizingPanelProtected.WithDefault,
    IVirtualizingPanelOverrides.WithDefault, IWinRTObject {
  private val __1730586590_Interface: IVirtualizingPanel.WithDefault by lazy {
    as_1730586590()
  }


  private val __1326922156_Interface: IVirtualizingPanelProtected.WithDefault by lazy {
    as_1326922156()
  }


  private val __1185492005_Interface: IVirtualizingPanelOverrides.WithDefault by lazy {
    as_1185492005()
  }


  public override val __1730586590_Ptr: JNAPointer? by lazy {
    __1730586590_Interface.__1730586590_Ptr
  }


  public override val __1326922156_Ptr: JNAPointer? by lazy {
    __1326922156_Interface.__1326922156_Ptr
  }


  public override val __1185492005_Ptr: JNAPointer? by lazy {
    __1185492005_Interface.__1185492005_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1730586590_Interface, __1326922156_Interface, __1185492005_Interface)

  private fun as_1730586590(): IVirtualizingPanel.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingPanel.ABI.makeIVirtualizingPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingPanel.ABI.makeIVirtualizingPanel(ref.value))
  }

  private fun as_1326922156(): IVirtualizingPanelProtected.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizingPanelProtected.ABI.makeIVirtualizingPanelProtected(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizingPanelProtected>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizingPanelProtected.ABI.makeIVirtualizingPanelProtected(ref.value))
  }

  private fun as_1185492005(): IVirtualizingPanelOverrides.WithDefault {
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
