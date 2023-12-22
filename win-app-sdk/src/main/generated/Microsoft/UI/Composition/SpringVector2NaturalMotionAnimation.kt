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

@ABIMarker(SpringVector2NaturalMotionAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.SpringVector2NaturalMotionAnimation;{5b4580a4-2594-521e-b288-eaf2c2a16a66})")
@WinRTByReference(brClass = SpringVector2NaturalMotionAnimation.ByReference::class)
public class SpringVector2NaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : Vector2NaturalMotionAnimation(ptr), ISpringVector2NaturalMotionAnimation.WithDefault,
    IWinRTObject {
  private val __179434130_Interface: ISpringVector2NaturalMotionAnimation.WithDefault by lazy {
    as_179434130()
  }


  public override val __179434130_Ptr: JNAPointer? by lazy {
    __179434130_Interface.__179434130_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__179434130_Interface)

  private fun as_179434130(): ISpringVector2NaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(ISpringVector2NaturalMotionAnimation.ABI.makeISpringVector2NaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpringVector2NaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpringVector2NaturalMotionAnimation.ABI.makeISpringVector2NaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpringVector2NaturalMotionAnimation> {
    public override fun getValue() = SpringVector2NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: SpringVector2NaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpringVector2NaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpringVector2NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return SpringVector2NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: SpringVector2NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
