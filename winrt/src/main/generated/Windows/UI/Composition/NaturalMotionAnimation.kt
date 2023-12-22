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

@ABIMarker(NaturalMotionAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.NaturalMotionAnimation;{438de12d-769b-4821-a949-284a6547e873})")
@WinRTByReference(brClass = NaturalMotionAnimation.ByReference::class)
public open class NaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : CompositionAnimation(ptr), INaturalMotionAnimation.WithDefault, IWinRTObject {
  private val __2014133709_Interface: INaturalMotionAnimation.WithDefault by lazy {
    as_2014133709()
  }


  public override val __2014133709_Ptr: JNAPointer? by lazy {
    __2014133709_Interface.__2014133709_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2014133709_Interface)

  private fun as_2014133709(): INaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(INaturalMotionAnimation.ABI.makeINaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INaturalMotionAnimation.ABI.makeINaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NaturalMotionAnimation> {
    public override fun getValue() = NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: NaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
