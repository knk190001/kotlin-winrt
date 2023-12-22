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

@ABIMarker(BounceVector2NaturalMotionAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.BounceVector2NaturalMotionAnimation;{da344196-2154-4b3c-88aa-47361204eccd})")
@WinRTByReference(brClass = BounceVector2NaturalMotionAnimation.ByReference::class)
public class BounceVector2NaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : Vector2NaturalMotionAnimation(ptr), IBounceVector2NaturalMotionAnimation.WithDefault,
    IWinRTObject {
  private val __1304911646_Interface: IBounceVector2NaturalMotionAnimation.WithDefault by lazy {
    as_1304911646()
  }


  public override val __1304911646_Ptr: JNAPointer? by lazy {
    __1304911646_Interface.__1304911646_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1304911646_Interface)

  private fun as_1304911646(): IBounceVector2NaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(IBounceVector2NaturalMotionAnimation.ABI.makeIBounceVector2NaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBounceVector2NaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBounceVector2NaturalMotionAnimation.ABI.makeIBounceVector2NaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BounceVector2NaturalMotionAnimation> {
    public override fun getValue() = BounceVector2NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: BounceVector2NaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BounceVector2NaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BounceVector2NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return BounceVector2NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: BounceVector2NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
