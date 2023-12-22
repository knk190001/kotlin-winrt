package Windows.UI.Composition.Interactions

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InteractionTrackerRequestIgnoredArgs.ABI::class)
@Signature("rc(Windows.UI.Composition.Interactions.InteractionTrackerRequestIgnoredArgs;{80dd82f1-ce25-488f-91dd-cb6455ccff2e})")
@WinRTByReference(brClass = InteractionTrackerRequestIgnoredArgs.ByReference::class)
public class InteractionTrackerRequestIgnoredArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInteractionTrackerRequestIgnoredArgs.WithDefault, IWinRTObject {
  private val __1793010395_Interface: IInteractionTrackerRequestIgnoredArgs.WithDefault by lazy {
    as_1793010395()
  }


  public override val __1793010395_Ptr: JNAPointer? by lazy {
    __1793010395_Interface.__1793010395_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1793010395_Interface)

  private fun as_1793010395(): IInteractionTrackerRequestIgnoredArgs.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerRequestIgnoredArgs.ABI.makeIInteractionTrackerRequestIgnoredArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerRequestIgnoredArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerRequestIgnoredArgs.ABI.makeIInteractionTrackerRequestIgnoredArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerRequestIgnoredArgs> {
    public override fun getValue() = InteractionTrackerRequestIgnoredArgs(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerRequestIgnoredArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerRequestIgnoredArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InteractionTrackerRequestIgnoredArgs {
      val address = segment.toRawLongValue()
      return InteractionTrackerRequestIgnoredArgs(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerRequestIgnoredArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
