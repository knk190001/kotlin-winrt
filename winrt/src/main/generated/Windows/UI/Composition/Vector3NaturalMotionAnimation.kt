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

@ABIMarker(Vector3NaturalMotionAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.Vector3NaturalMotionAnimation;{9c17042c-e2ca-45ad-969e-4e78b7b9ad41})")
@WinRTByReference(brClass = Vector3NaturalMotionAnimation.ByReference::class)
public open class Vector3NaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : NaturalMotionAnimation(ptr), IVector3NaturalMotionAnimation.WithDefault, IWinRTObject {
  private val __132143225_Interface: IVector3NaturalMotionAnimation.WithDefault by lazy {
    as_132143225()
  }


  public override val __132143225_Ptr: JNAPointer? by lazy {
    __132143225_Interface.__132143225_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__132143225_Interface)

  private fun as_132143225(): IVector3NaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(IVector3NaturalMotionAnimation.ABI.makeIVector3NaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector3NaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector3NaturalMotionAnimation.ABI.makeIVector3NaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Vector3NaturalMotionAnimation> {
    public override fun getValue() = Vector3NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: Vector3NaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Vector3NaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Vector3NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return Vector3NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: Vector3NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
