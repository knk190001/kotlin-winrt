package Microsoft.UI.Composition.Interactions

import Microsoft.UI.Composition.Compositor
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(InteractionTrackerInertiaRestingValue.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionTrackerInertiaRestingValue;{1a2b20cd-3371-53ff-a560-f4847b467d73})")
@WinRTByReference(brClass = InteractionTrackerInertiaRestingValue.ByReference::class)
public class InteractionTrackerInertiaRestingValue(
  ptr: JNAPointer? = NULL
) : InteractionTrackerInertiaModifier(ptr), IInteractionTrackerInertiaRestingValue.WithDefault,
    IWinRTObject {
  private val __280363699_Interface: IInteractionTrackerInertiaRestingValue.WithDefault by lazy {
    as_280363699()
  }


  public override val __280363699_Ptr: JNAPointer? by lazy {
    __280363699_Interface.__280363699_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__280363699_Interface)

  private fun as_280363699(): IInteractionTrackerInertiaRestingValue.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInertiaRestingValue.ABI.makeIInteractionTrackerInertiaRestingValue(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInertiaRestingValue>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInertiaRestingValue.ABI.makeIInteractionTrackerInertiaRestingValue(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerInertiaRestingValue> {
    public override fun getValue() = InteractionTrackerInertiaRestingValue(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerInertiaRestingValue): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerInertiaRestingValue, MemoryAddress> {
    public val IInteractionTrackerInertiaRestingValueStatics_Instance:
        IInteractionTrackerInertiaRestingValueStatics by lazy {
      createIInteractionTrackerInertiaRestingValueStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInteractionTrackerInertiaRestingValueStatics():
        IInteractionTrackerInertiaRestingValueStatics {
      val refiid = Guid.REFIID(IInteractionTrackerInertiaRestingValueStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Interactions.InteractionTrackerInertiaRestingValue".toHandle(),refiid,interfacePtr)
      val result =
          IInteractionTrackerInertiaRestingValueStatics.ABI.makeIInteractionTrackerInertiaRestingValueStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InteractionTrackerInertiaRestingValue {
      val address = segment.toRawLongValue()
      return InteractionTrackerInertiaRestingValue(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerInertiaRestingValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.IInteractionTrackerInertiaRestingValueStatics_Instance.Create(compositor)
  }
}
