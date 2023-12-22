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

@ABIMarker(InteractionTrackerVector2InertiaModifier.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionTrackerVector2InertiaModifier;{4b8ed310-cb61-5f0a-b99a-940cdd2c42b1})")
@WinRTByReference(brClass = InteractionTrackerVector2InertiaModifier.ByReference::class)
public open class InteractionTrackerVector2InertiaModifier(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IInteractionTrackerVector2InertiaModifier.WithDefault, IWinRTObject {
  private val __465494898_Interface: IInteractionTrackerVector2InertiaModifier.WithDefault by lazy {
    as_465494898()
  }


  public override val __465494898_Ptr: JNAPointer? by lazy {
    __465494898_Interface.__465494898_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__465494898_Interface)

  private fun as_465494898(): IInteractionTrackerVector2InertiaModifier.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerVector2InertiaModifier.ABI.makeIInteractionTrackerVector2InertiaModifier(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerVector2InertiaModifier>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerVector2InertiaModifier.ABI.makeIInteractionTrackerVector2InertiaModifier(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerVector2InertiaModifier> {
    public override fun getValue() = InteractionTrackerVector2InertiaModifier(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerVector2InertiaModifier): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerVector2InertiaModifier, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        InteractionTrackerVector2InertiaModifier {
      val address = segment.toRawLongValue()
      return InteractionTrackerVector2InertiaModifier(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerVector2InertiaModifier): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
