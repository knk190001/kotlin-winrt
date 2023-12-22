package Microsoft.UI.Composition

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

@ABIMarker(SpringScalarNaturalMotionAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.SpringScalarNaturalMotionAnimation;{6f720afd-d3d0-5e78-9c2e-83092f6ea45e})")
@WinRTByReference(brClass = SpringScalarNaturalMotionAnimation.ByReference::class)
public class SpringScalarNaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : ScalarNaturalMotionAnimation(ptr), ISpringScalarNaturalMotionAnimation.WithDefault, IWinRTObject
    {
  private val __135334249_Interface: ISpringScalarNaturalMotionAnimation.WithDefault by lazy {
    as_135334249()
  }


  public override val __135334249_Ptr: JNAPointer? by lazy {
    __135334249_Interface.__135334249_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__135334249_Interface)

  private fun as_135334249(): ISpringScalarNaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(ISpringScalarNaturalMotionAnimation.ABI.makeISpringScalarNaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpringScalarNaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpringScalarNaturalMotionAnimation.ABI.makeISpringScalarNaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpringScalarNaturalMotionAnimation> {
    public override fun getValue() = SpringScalarNaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: SpringScalarNaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpringScalarNaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpringScalarNaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return SpringScalarNaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: SpringScalarNaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
