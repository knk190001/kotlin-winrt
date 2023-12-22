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

@ABIMarker(InteractionTrackerInertiaNaturalMotion.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Interactions.InteractionTrackerInertiaNaturalMotion;{8c7482e0-185d-56b1-b67f-fca4fcd13cd2})")
@WinRTByReference(brClass = InteractionTrackerInertiaNaturalMotion.ByReference::class)
public class InteractionTrackerInertiaNaturalMotion(
  ptr: JNAPointer? = NULL
) : InteractionTrackerInertiaModifier(ptr), IInteractionTrackerInertiaNaturalMotion.WithDefault,
    IWinRTObject {
  private val __1808397387_Interface: IInteractionTrackerInertiaNaturalMotion.WithDefault by lazy {
    as_1808397387()
  }


  public override val __1808397387_Ptr: JNAPointer? by lazy {
    __1808397387_Interface.__1808397387_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1808397387_Interface)

  private fun as_1808397387(): IInteractionTrackerInertiaNaturalMotion.WithDefault {
    if(pointer == NULL) {
      return(IInteractionTrackerInertiaNaturalMotion.ABI.makeIInteractionTrackerInertiaNaturalMotion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInteractionTrackerInertiaNaturalMotion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInteractionTrackerInertiaNaturalMotion.ABI.makeIInteractionTrackerInertiaNaturalMotion(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InteractionTrackerInertiaNaturalMotion> {
    public override fun getValue() = InteractionTrackerInertiaNaturalMotion(pointer.getPointer(0))

    public fun setValue(value: InteractionTrackerInertiaNaturalMotion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InteractionTrackerInertiaNaturalMotion, MemoryAddress> {
    public val IInteractionTrackerInertiaNaturalMotionStatics_Instance:
        IInteractionTrackerInertiaNaturalMotionStatics by lazy {
      createIInteractionTrackerInertiaNaturalMotionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInteractionTrackerInertiaNaturalMotionStatics():
        IInteractionTrackerInertiaNaturalMotionStatics {
      val refiid = Guid.REFIID(IInteractionTrackerInertiaNaturalMotionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.Interactions.InteractionTrackerInertiaNaturalMotion".toHandle(),refiid,interfacePtr)
      val result =
          IInteractionTrackerInertiaNaturalMotionStatics.ABI.makeIInteractionTrackerInertiaNaturalMotionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InteractionTrackerInertiaNaturalMotion {
      val address = segment.toRawLongValue()
      return InteractionTrackerInertiaNaturalMotion(Pointer(address))
    }

    public override fun toNative(obj: InteractionTrackerInertiaNaturalMotion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(compositor: Compositor) =
        ABI.IInteractionTrackerInertiaNaturalMotionStatics_Instance.Create(compositor)
  }
}
