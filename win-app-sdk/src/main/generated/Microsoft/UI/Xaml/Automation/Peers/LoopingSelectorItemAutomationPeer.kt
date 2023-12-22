package Microsoft.UI.Xaml.Automation.Peers

import Microsoft.UI.Xaml.Automation.Provider.IScrollItemProvider
import Microsoft.UI.Xaml.Automation.Provider.ISelectionItemProvider
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

@ABIMarker(LoopingSelectorItemAutomationPeer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.Peers.LoopingSelectorItemAutomationPeer;{9c108861-895f-5e92-84c1-ff12072e7ec0})")
@WinRTByReference(brClass = LoopingSelectorItemAutomationPeer.ByReference::class)
public class LoopingSelectorItemAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), ILoopingSelectorItemAutomationPeer.WithDefault,
    IScrollItemProvider.WithDefault, ISelectionItemProvider.WithDefault, IWinRTObject {
  private val __120063066_Interface: ILoopingSelectorItemAutomationPeer.WithDefault by lazy {
    as_120063066()
  }


  private val __428448034_Interface: IScrollItemProvider.WithDefault by lazy {
    as_428448034()
  }


  private val __1229913757_Interface: ISelectionItemProvider.WithDefault by lazy {
    as_1229913757()
  }


  public override val __120063066_Ptr: JNAPointer? by lazy {
    __120063066_Interface.__120063066_Ptr
  }


  public override val __428448034_Ptr: JNAPointer? by lazy {
    __428448034_Interface.__428448034_Ptr
  }


  public override val __1229913757_Ptr: JNAPointer? by lazy {
    __1229913757_Interface.__1229913757_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__120063066_Interface, __428448034_Interface, __1229913757_Interface)

  private fun as_120063066(): ILoopingSelectorItemAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(ILoopingSelectorItemAutomationPeer.ABI.makeILoopingSelectorItemAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoopingSelectorItemAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoopingSelectorItemAutomationPeer.ABI.makeILoopingSelectorItemAutomationPeer(ref.value))
  }

  private fun as_428448034(): IScrollItemProvider.WithDefault {
    if(pointer == NULL) {
      return(IScrollItemProvider.ABI.makeIScrollItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollItemProvider.ABI.makeIScrollItemProvider(ref.value))
  }

  private fun as_1229913757(): ISelectionItemProvider.WithDefault {
    if(pointer == NULL) {
      return(ISelectionItemProvider.ABI.makeISelectionItemProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionItemProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionItemProvider.ABI.makeISelectionItemProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoopingSelectorItemAutomationPeer> {
    public override fun getValue() = LoopingSelectorItemAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: LoopingSelectorItemAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoopingSelectorItemAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LoopingSelectorItemAutomationPeer {
      val address = segment.toRawLongValue()
      return LoopingSelectorItemAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: LoopingSelectorItemAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
