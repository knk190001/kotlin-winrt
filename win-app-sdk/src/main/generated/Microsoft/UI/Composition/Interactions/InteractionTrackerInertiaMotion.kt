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

@ABIMarker(InteractionTrackerInertiaMotion.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionTrackerInertiaMotion;{91f662c0-3141-5b5e-862f-cfc60bee8cd6})")
@WinRTByReference(brClass = InteractionTrackerInertiaMotion.ByReference::class)
public class InteractionTrackerInertiaMotion(
  ptr: JNAPointer? = NULL
) : InteractionTrackerInertiaModifier(ptr), IInteractionTrackerInertiaMotion.WithDefault,
    IWinRTObject {
  private val __1838034432_Interface: IInteractionTrackerInertiaMotion.WithDefault by lazy {
    as_1838034432()
  }


  public override val __1838034432_Ptr: JNAPointer? by lazy {
    __1838034432_Interface.__1838034432_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1838034432_Interface)

  private fun as_1838034432(): IInteractionTrackerInertiaMotion.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInertiaMotion.ABI.makeIInteractionTrackerInertiaMotion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInertiaMotion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInertiaMotion.ABI.makeIInteractionTrackerInertiaMotion(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerInertiaMotion> {
    public override fun getValue() = InteractionTrackerInertiaMotion(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerInertiaMotion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerInertiaMotion, MemoryAddress> {
    public val IInteractionTrackerInertiaMotionStatics_Instance:
        IInteractionTrackerInertiaMotionStatics by lazy {
      createIInteractionTrackerInertiaMotionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInteractionTrackerInertiaMotionStatics():
        IInteractionTrackerInertiaMotionStatics {
      val refiid = Guid.REFIID(IInteractionTrackerInertiaMotionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Interactions.InteractionTrackerInertiaMotion".toHandle(),refiid,interfacePtr)
      val result =
          IInteractionTrackerInertiaMotionStatics.ABI.makeIInteractionTrackerInertiaMotionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InteractionTrackerInertiaMotion {
      val address = segment.toRawLongValue()
      return InteractionTrackerInertiaMotion(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerInertiaMotion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.IInteractionTrackerInertiaMotionStatics_Instance.Create(compositor)
  }
}
