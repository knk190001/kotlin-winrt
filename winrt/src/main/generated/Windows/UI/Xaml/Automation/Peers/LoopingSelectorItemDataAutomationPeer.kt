package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Provider.IVirtualizedItemProvider
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

@ABIMarker(LoopingSelectorItemDataAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.LoopingSelectorItemDataAutomationPeer;{ef567e32-7cd2-4d32-9590-1f588d5ef38d})")
@WinRTByReference(brClass = LoopingSelectorItemDataAutomationPeer.ByReference::class)
public class LoopingSelectorItemDataAutomationPeer(
  ptr: JNAPointer? = NULL
) : AutomationPeer(ptr), ILoopingSelectorItemDataAutomationPeer.WithDefault,
    IVirtualizedItemProvider.WithDefault, IWinRTObject {
  private val __1368445125_Interface: ILoopingSelectorItemDataAutomationPeer.WithDefault by lazy {
    as_1368445125()
  }


  private val __550239033_Interface: IVirtualizedItemProvider.WithDefault by lazy {
    as_550239033()
  }


  public override val __1368445125_Ptr: JNAPointer? by lazy {
    __1368445125_Interface.__1368445125_Ptr
  }


  public override val __550239033_Ptr: JNAPointer? by lazy {
    __550239033_Interface.__550239033_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1368445125_Interface, __550239033_Interface)

  private fun as_1368445125(): ILoopingSelectorItemDataAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ILoopingSelectorItemDataAutomationPeer.ABI.makeILoopingSelectorItemDataAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoopingSelectorItemDataAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoopingSelectorItemDataAutomationPeer.ABI.makeILoopingSelectorItemDataAutomationPeer(ref.value))
  }

  private fun as_550239033(): IVirtualizedItemProvider.WithDefault {
    if(pointer == NULL) {
      return(IVirtualizedItemProvider.ABI.makeIVirtualizedItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVirtualizedItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVirtualizedItemProvider.ABI.makeIVirtualizedItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoopingSelectorItemDataAutomationPeer> {
    public override fun getValue() = LoopingSelectorItemDataAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: LoopingSelectorItemDataAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoopingSelectorItemDataAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LoopingSelectorItemDataAutomationPeer {
      val address = segment.toRawLongValue()
      return LoopingSelectorItemDataAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: LoopingSelectorItemDataAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
