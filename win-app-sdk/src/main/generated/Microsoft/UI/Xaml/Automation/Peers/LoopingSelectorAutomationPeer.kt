package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Provider.IItemContainerProvider
import Microsoft.UI.Xaml.Automation.Provider.IScrollProvider
import Microsoft.UI.Xaml.Automation.Provider.ISelectionProvider
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
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.LoopingSelectorAutomationPeer;{00b612f4-8faf-5c0c-92e4-4396e0f7b8d8})")
@WinRTByReference(brClass = LoopingSelectorAutomationPeer.ByReference::class)
public class LoopingSelectorAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ILoopingSelectorAutomationPeer.WithDefault,
    ISelectionProvider.WithDefault, IItemContainerProvider.WithDefault, IScrollProvider.WithDefault,
    IWinRTObject {
  private val __602706253_Interface: ILoopingSelectorAutomationPeer.WithDefault by lazy {
    as_602706253()
  }


  private val __95200080_Interface: ISelectionProvider.WithDefault by lazy {
    as_95200080()
  }


  private val __1059692114_Interface: IItemContainerProvider.WithDefault by lazy {
    as_1059692114()
  }


  private val __1467697237_Interface: IScrollProvider.WithDefault by lazy {
    as_1467697237()
  }


  public override val __602706253_Ptr: JNAPointer? by lazy {
    __602706253_Interface.__602706253_Ptr
  }


  public override val __95200080_Ptr: JNAPointer? by lazy {
    __95200080_Interface.__95200080_Ptr
  }


  public override val __1059692114_Ptr: JNAPointer? by lazy {
    __1059692114_Interface.__1059692114_Ptr
  }


  public override val __1467697237_Ptr: JNAPointer? by lazy {
    __1467697237_Interface.__1467697237_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__602706253_Interface, __95200080_Interface, __1059692114_Interface,
        __1467697237_Interface)

  private fun as_602706253(): ILoopingSelectorAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ILoopingSelectorAutomationPeer.ABI.makeILoopingSelectorAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoopingSelectorAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoopingSelectorAutomationPeer.ABI.makeILoopingSelectorAutomationPeer(ref.value))
  }

  private fun as_95200080(): ISelectionProvider.WithDefault {
    if(pointer == NULL) {
      return(ISelectionProvider.ABI.makeISelectionProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionProvider.ABI.makeISelectionProvider(ref.value))
  }

  private fun as_1059692114(): IItemContainerProvider.WithDefault {
    if(pointer == NULL) {
      return(IItemContainerProvider.ABI.makeIItemContainerProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemContainerProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemContainerProvider.ABI.makeIItemContainerProvider(ref.value))
  }

  private fun as_1467697237(): IScrollProvider.WithDefault {
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
