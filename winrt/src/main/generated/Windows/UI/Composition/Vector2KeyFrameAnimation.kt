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

@ABIMarker(Vector2KeyFrameAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.Vector2KeyFrameAnimation;{df414515-4e29-4f11-b55e-bf2a6eb36294})")
@WinRTByReference(brClass = Vector2KeyFrameAnimation.ByReference::class)
public class Vector2KeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : KeyFrameAnimation(ptr), IVector2KeyFrameAnimation.WithDefault, IWinRTObject {
  private val __2066748149_Interface: IVector2KeyFrameAnimation.WithDefault by lazy {
    as_2066748149()
  }


  public override val __2066748149_Ptr: JNAPointer? by lazy {
    __2066748149_Interface.__2066748149_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2066748149_Interface)

  private fun as_2066748149(): IVector2KeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IVector2KeyFrameAnimation.ABI.makeIVector2KeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector2KeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector2KeyFrameAnimation.ABI.makeIVector2KeyFrameAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Vector2KeyFrameAnimation> {
    public override fun getValue() = Vector2KeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: Vector2KeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Vector2KeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Vector2KeyFrameAnimation {
      val address = segment.toRawLongValue()
      return Vector2KeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: Vector2KeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
