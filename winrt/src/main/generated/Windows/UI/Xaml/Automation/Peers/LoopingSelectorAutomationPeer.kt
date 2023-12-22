package Windows.UI.Xaml.Automation.Peers

import Windows.UI.Xaml.Automation.Provider.IExpandCollapseProvider
import Windows.UI.Xaml.Automation.Provider.IItemContainerProvider
import Windows.UI.Xaml.Automation.Provider.IScrollProvider
import Windows.UI.Xaml.Automation.Provider.ISelectionProvider
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

@ABIMarker(LoopingSelectorAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.LoopingSelectorAutomationPeer;{50b406ca-bae9-4816-8a3a-0cb4f96478a2})")
@WinRTByReference(brClass = LoopingSelectorAutomationPeer.ByReference::class)
public class LoopingSelectorAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ILoopingSelectorAutomationPeer.WithDefault,
    ISelectionProvider.WithDefault, IItemContainerProvider.WithDefault,
    IExpandCollapseProvider.WithDefault, IScrollProvider.WithDefault, IWinRTObject {
  private val __286547586_Interface: ILoopingSelectorAutomationPeer.WithDefault by lazy {
    as_286547586()
  }


  private val __1882207867_Interface: ISelectionProvider.WithDefault by lazy {
    as_1882207867()
  }


  private val __1270245209_Interface: IItemContainerProvider.WithDefault by lazy {
    as_1270245209()
  }


  private val __1930365296_Interface: IExpandCollapseProvider.WithDefault by lazy {
    as_1930365296()
  }


  private val __1079149302_Interface: IScrollProvider.WithDefault by lazy {
    as_1079149302()
  }


  public override val __286547586_Ptr: JNAPointer? by lazy {
    __286547586_Interface.__286547586_Ptr
  }


  public override val __1882207867_Ptr: JNAPointer? by lazy {
    __1882207867_Interface.__1882207867_Ptr
  }


  public override val __1270245209_Ptr: JNAPointer? by lazy {
    __1270245209_Interface.__1270245209_Ptr
  }


  public override val __1930365296_Ptr: JNAPointer? by lazy {
    __1930365296_Interface.__1930365296_Ptr
  }


  public override val __1079149302_Ptr: JNAPointer? by lazy {
    __1079149302_Interface.__1079149302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__286547586_Interface, __1882207867_Interface, __1270245209_Interface,
        __1930365296_Interface, __1079149302_Interface)

  private fun as_286547586(): ILoopingSelectorAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ILoopingSelectorAutomationPeer.ABI.makeILoopingSelectorAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoopingSelectorAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoopingSelectorAutomationPeer.ABI.makeILoopingSelectorAutomationPeer(ref.value))
  }

  private fun as_1882207867(): ISelectionProvider.WithDefault {
    if(pointer == NULL) {
      return(ISelectionProvider.ABI.makeISelectionProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionProvider.ABI.makeISelectionProvider(ref.value))
  }

  private fun as_1270245209(): IItemContainerProvider.WithDefault {
    if(pointer == NULL) {
      return(IItemContainerProvider.ABI.makeIItemContainerProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemContainerProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemContainerProvider.ABI.makeIItemContainerProvider(ref.value))
  }

  private fun as_1930365296(): IExpandCollapseProvider.WithDefault {
    if(pointer == NULL) {
      return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpandCollapseProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpandCollapseProvider.ABI.makeIExpandCollapseProvider(ref.value))
  }

  private fun as_1079149302(): IScrollProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollProvider.ABI.makeIScrollProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollProvider.ABI.makeIScrollProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoopingSelectorAutomationPeer> {
    public override fun getValue() = LoopingSelectorAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: LoopingSelectorAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoopingSelectorAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LoopingSelectorAutomationPeer {
      val address = segment.toRawLongValue()
      return LoopingSelectorAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: LoopingSelectorAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
