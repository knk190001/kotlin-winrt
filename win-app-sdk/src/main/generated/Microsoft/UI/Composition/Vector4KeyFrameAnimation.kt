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

@ABIMarker(Vector4KeyFrameAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Vector4KeyFrameAnimation;{16cea3b9-c5e3-5f6f-b5c7-da29a31ccfc7})")
@WinRTByReference(brClass = Vector4KeyFrameAnimation.ByReference::class)
public class Vector4KeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : KeyFrameAnimation(ptr), IVector4KeyFrameAnimation.WithDefault, IWinRTObject {
  private val __1323047266_Interface: IVector4KeyFrameAnimation.WithDefault by lazy {
    as_1323047266()
  }


  public override val __1323047266_Ptr: JNAPointer? by lazy {
    __1323047266_Interface.__1323047266_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1323047266_Interface)

  private fun as_1323047266(): IVector4KeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IVector4KeyFrameAnimation.ABI.makeIVector4KeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector4KeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector4KeyFrameAnimation.ABI.makeIVector4KeyFrameAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Vector4KeyFrameAnimation> {
    public override fun getValue() = Vector4KeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: Vector4KeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Vector4KeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Vector4KeyFrameAnimation {
      val address = segment.toRawLongValue()
      return Vector4KeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: Vector4KeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
