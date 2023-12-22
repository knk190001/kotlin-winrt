package Microsoft.UI.Composition

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

@ABIMarker(AnimationController.ABI::class)
@Signature("rc(Microsoft.UI.Composition.AnimationController;{bd0f88a8-a415-5322-8c3d-1a6d9192754f})")
@WinRTByReference(brClass = AnimationController.ByReference::class)
public class AnimationController(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), IAnimationController.WithDefault, IWinRTObject {
  private val __130936199_Interface: IAnimationController.WithDefault by lazy {
    as_130936199()
  }


  public override val __130936199_Ptr: JNAPointer? by lazy {
    __130936199_Interface.__130936199_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__130936199_Interface)

  private fun as_130936199(): IAnimationController.WithDefault {
    if(pointer == NULL) {
      return(IAnimationController.ABI.makeIAnimationController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimationController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimationController.ABI.makeIAnimationController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnimationController> {
    public override fun getValue() = AnimationController(pointer.getPointer(0))

    public fun setValue(value: AnimationController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnimationController, MemoryAddress> {
    public val IAnimationControllerStatics_Instance: IAnimationControllerStatics by lazy {
      createIAnimationControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnimationControllerStatics(): IAnimationControllerStatics {
      val refiid = Guid.REFIID(IAnimationControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Composition.AnimationController".toHandle(),refiid,interfacePtr)
      val result =
          IAnimationControllerStatics.ABI.makeIAnimationControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AnimationController {
      val address = segment.toRawLongValue()
      return AnimationController(Pointer(address))
    }

    public override fun toNative(obj: AnimationController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MaxPlaybackRate() =
        ABI.IAnimationControllerStatics_Instance.get_MaxPlaybackRate()

    public fun get_MinPlaybackRate() =
        ABI.IAnimationControllerStatics_Instance.get_MinPlaybackRate()
  }
}
