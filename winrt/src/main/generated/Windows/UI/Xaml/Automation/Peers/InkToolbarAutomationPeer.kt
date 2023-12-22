package Windows.UI.Xaml.Automation.Peers

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

@ABIMarker(InkToolbarAutomationPeer.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.Peers.InkToolbarAutomationPeer;{123baaa4-f2e8-4bcb-9382-5dfdd11fe45f})")
@WinRTByReference(brClass = InkToolbarAutomationPeer.ByReference::class)
public class InkToolbarAutomationPeer(
  ptr: JNAPointer? = NULL
) : FrameworkElementAutomationPeer(ptr), IInkToolbarAutomationPeer.WithDefault, IWinRTObject {
  private val __940474906_Interface: IInkToolbarAutomationPeer.WithDefault by lazy {
    as_940474906()
  }


  public override val __940474906_Ptr: JNAPointer? by lazy {
    __940474906_Interface.__940474906_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__940474906_Interface)

  private fun as_940474906(): IInkToolbarAutomationPeer.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarAutomationPeer.ABI.makeIInkToolbarAutomationPeer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarAutomationPeer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarAutomationPeer.ABI.makeIInkToolbarAutomationPeer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarAutomationPeer> {
    public override fun getValue() = InkToolbarAutomationPeer(pointer.getPointer(0))

    public fun setValue(value: InkToolbarAutomationPeer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarAutomationPeer, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkToolbarAutomationPeer {
      val address = segment.toRawLongValue()
      return InkToolbarAutomationPeer(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarAutomationPeer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
