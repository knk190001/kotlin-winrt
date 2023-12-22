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

@ABIMarker(Vector2NaturalMotionAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Vector2NaturalMotionAnimation;{e00e60ce-d1be-5c24-885d-c1d0a749d109})")
@WinRTByReference(brClass = Vector2NaturalMotionAnimation.ByReference::class)
public open class Vector2NaturalMotionAnimation(
  ptr: JNAPointer? = NULL
) : NaturalMotionAnimation(ptr), IVector2NaturalMotionAnimation.WithDefault, IWinRTObject {
  private val __765072965_Interface: IVector2NaturalMotionAnimation.WithDefault by lazy {
    as_765072965()
  }


  public override val __765072965_Ptr: JNAPointer? by lazy {
    __765072965_Interface.__765072965_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__765072965_Interface)

  private fun as_765072965(): IVector2NaturalMotionAnimation.WithDefault {
    if(pointer == NULL) {
      return(IVector2NaturalMotionAnimation.ABI.makeIVector2NaturalMotionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector2NaturalMotionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector2NaturalMotionAnimation.ABI.makeIVector2NaturalMotionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Vector2NaturalMotionAnimation> {
    public override fun getValue() = Vector2NaturalMotionAnimation(pointer.getPointer(0))

    public fun setValue(value: Vector2NaturalMotionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Vector2NaturalMotionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Vector2NaturalMotionAnimation {
      val address = segment.toRawLongValue()
      return Vector2NaturalMotionAnimation(Pointer(address))
    }

    public override fun toNative(obj: Vector2NaturalMotionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
