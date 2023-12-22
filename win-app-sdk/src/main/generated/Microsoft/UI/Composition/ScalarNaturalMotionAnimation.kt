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

@ABIMarker(ScalarNaturalMotionAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.ScalarNaturalMotionAnimation;{903224b0-2dbe-56eb-b9ea-33d2e3113181})")
@WinRTByReference(brClass = ScalarNaturalMotionAnimation.ByReference::class)
public open class ScalarNaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : NaturalMotionAnimation(ptr), IScalarNaturalMotionAnimation.WithDefault, IWinRTObject {
  private val __1955341142_Interface: IScalarNaturalMotionAnimation.WithDefault by lazy {
    as_1955341142()
  }


  public override val __1955341142_Ptr: JNAPointer? by lazy {
    __1955341142_Interface.__1955341142_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1955341142_Interface)

  private fun as_1955341142(): IScalarNaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(IScalarNaturalMotionAnimation.ABI.makeIScalarNaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScalarNaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScalarNaturalMotionAnimation.ABI.makeIScalarNaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScalarNaturalMotionAnimation> {
    public override fun getValue() = ScalarNaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: ScalarNaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScalarNaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScalarNaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return ScalarNaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: ScalarNaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
