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

@ABIMarker(BounceVector3NaturalMotionAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.BounceVector3NaturalMotionAnimation;{47dabc31-10d3-4518-86f1-09caf742d113})")
@WinRTByReference(brClass = BounceVector3NaturalMotionAnimation.ByReference::class)
public class BounceVector3NaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : Vector3NaturalMotionAnimation(ptr), IBounceVector3NaturalMotionAnimation.WithDefault,
    IWinRTObject {
  private val __1745291169_Interface: IBounceVector3NaturalMotionAnimation.WithDefault by lazy {
    as_1745291169()
  }


  public override val __1745291169_Ptr: JNAPointer? by lazy {
    __1745291169_Interface.__1745291169_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1745291169_Interface)

  private fun as_1745291169(): IBounceVector3NaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(IBounceVector3NaturalMotionAnimation.ABI.makeIBounceVector3NaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBounceVector3NaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBounceVector3NaturalMotionAnimation.ABI.makeIBounceVector3NaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BounceVector3NaturalMotionAnimation> {
    public override fun getValue() = BounceVector3NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: BounceVector3NaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BounceVector3NaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BounceVector3NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return BounceVector3NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: BounceVector3NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
