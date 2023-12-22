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

@ABIMarker(InteractionTrackerVector2InertiaNaturalMotion.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionTrackerVector2InertiaNaturalMotion;{097ba1a6-e077-52d1-86d3-38e3f6619ddf})")
@WinRTByReference(brClass = InteractionTrackerVector2InertiaNaturalMotion.ByReference::class)
public class InteractionTrackerVector2InertiaNaturalMotion(
  ptr: JNAPointer? = NULL
) : InteractionTrackerVector2InertiaModifier(ptr),
    IInteractionTrackerVector2InertiaNaturalMotion.WithDefault, IWinRTObject {
  private val __607221372_Interface: IInteractionTrackerVector2InertiaNaturalMotion.WithDefault by
      lazy {
    as_607221372()
  }


  public override val __607221372_Ptr: JNAPointer? by lazy {
    __607221372_Interface.__607221372_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__607221372_Interface)

  private fun as_607221372(): IInteractionTrackerVector2InertiaNaturalMotion.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerVector2InertiaNaturalMotion.ABI.makeIInteractionTrackerVector2InertiaNaturalMotion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerVector2InertiaNaturalMotion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerVector2InertiaNaturalMotion.ABI.makeIInteractionTrackerVector2InertiaNaturalMotion(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerVector2InertiaNaturalMotion> {
    public override fun getValue() =
        InteractionTrackerVector2InertiaNaturalMotion(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerVector2InertiaNaturalMotion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerVector2InertiaNaturalMotion, MemoryAddress> {
    public val IInteractionTrackerVector2InertiaNaturalMotionStatics_Instance:
        IInteractionTrackerVector2InertiaNaturalMotionStatics by lazy {
      createIInteractionTrackerVector2InertiaNaturalMotionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInteractionTrackerVector2InertiaNaturalMotionStatics():
        IInteractionTrackerVector2InertiaNaturalMotionStatics {
      val refiid = Guid.REFIID(IInteractionTrackerVector2InertiaNaturalMotionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Interactions.InteractionTrackerVector2InertiaNaturalMotion".toHandle(),refiid,interfacePtr)
      val result =
          IInteractionTrackerVector2InertiaNaturalMotionStatics.ABI.makeIInteractionTrackerVector2InertiaNaturalMotionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress):
        InteractionTrackerVector2InertiaNaturalMotion {
      val address = segment.toRawLongValue()
      return InteractionTrackerVector2InertiaNaturalMotion(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerVector2InertiaNaturalMotion): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.IInteractionTrackerVector2InertiaNaturalMotionStatics_Instance.Create(compositor)
  }
}
