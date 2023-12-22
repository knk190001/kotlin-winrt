package Windows.UI.Composition

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

@ABIMarker(BounceScalarNaturalMotionAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.BounceScalarNaturalMotionAnimation;{baa30dcc-a633-4618-9b06-7f7c72c87cff})")
@WinRTByReference(brClass = BounceScalarNaturalMotionAnimation.ByReference::class)
public class BounceScalarNaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : ScalarNaturalMotionAnimation(ptr), IBounceScalarNaturalMotionAnimation.WithDefault, IWinRTObject
    {
  private val __2027114777_Interface: IBounceScalarNaturalMotionAnimation.WithDefault by lazy {
    as_2027114777()
  }


  public override val __2027114777_Ptr: JNAPointer? by lazy {
    __2027114777_Interface.__2027114777_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2027114777_Interface)

  private fun as_2027114777(): IBounceScalarNaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(IBounceScalarNaturalMotionAnimation.ABI.makeIBounceScalarNaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBounceScalarNaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBounceScalarNaturalMotionAnimation.ABI.makeIBounceScalarNaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BounceScalarNaturalMotionAnimation> {
    public override fun getValue() = BounceScalarNaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: BounceScalarNaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BounceScalarNaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BounceScalarNaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return BounceScalarNaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: BounceScalarNaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
