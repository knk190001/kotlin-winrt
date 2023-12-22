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

@ABIMarker(SpringVector3NaturalMotionAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.SpringVector3NaturalMotionAnimation;{02d9e1c6-7434-5464-a1f6-d644ce1fc9a6})")
@WinRTByReference(brClass = SpringVector3NaturalMotionAnimation.ByReference::class)
public class SpringVector3NaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : Vector3NaturalMotionAnimation(ptr), ISpringVector3NaturalMotionAnimation.WithDefault,
    IWinRTObject {
  private val __1065330351_Interface: ISpringVector3NaturalMotionAnimation.WithDefault by lazy {
    as_1065330351()
  }


  public override val __1065330351_Ptr: JNAPointer? by lazy {
    __1065330351_Interface.__1065330351_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1065330351_Interface)

  private fun as_1065330351(): ISpringVector3NaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(ISpringVector3NaturalMotionAnimation.ABI.makeISpringVector3NaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpringVector3NaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpringVector3NaturalMotionAnimation.ABI.makeISpringVector3NaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpringVector3NaturalMotionAnimation> {
    public override fun getValue() = SpringVector3NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: SpringVector3NaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpringVector3NaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpringVector3NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return SpringVector3NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: SpringVector3NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
