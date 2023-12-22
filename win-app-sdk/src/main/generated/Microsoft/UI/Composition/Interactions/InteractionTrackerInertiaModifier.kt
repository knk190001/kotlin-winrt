package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.CompositionObject
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

@ABIMarker(InteractionTrackerInertiaModifier.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionTrackerInertiaModifier;{4d3a0c6b-c508-5029-a47a-cbf64636f010})")
@WinRTByReference(brClass = InteractionTrackerInertiaModifier.ByReference::class)
public open class InteractionTrackerInertiaModifier(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IInteractionTrackerInertiaModifier.WithDefault, IWinRTObject {
  private val __661194401_Interface: IInteractionTrackerInertiaModifier.WithDefault by lazy {
    as_661194401()
  }


  public override val __661194401_Ptr: JNAPointer? by lazy {
    __661194401_Interface.__661194401_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__661194401_Interface)

  private fun as_661194401(): IInteractionTrackerInertiaModifier.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInertiaModifier.ABI.makeIInteractionTrackerInertiaModifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInertiaModifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInertiaModifier.ABI.makeIInteractionTrackerInertiaModifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerInertiaModifier> {
    public override fun getValue() = InteractionTrackerInertiaModifier(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerInertiaModifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerInertiaModifier, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InteractionTrackerInertiaModifier {
      val address = segment.toRawLongValue()
      return InteractionTrackerInertiaModifier(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerInertiaModifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
