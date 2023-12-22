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

@ABIMarker(Vector3KeyFrameAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.Vector3KeyFrameAnimation;{d7da980e-2dde-5dd1-a40c-d6868dd2449e})")
@WinRTByReference(brClass = Vector3KeyFrameAnimation.ByReference::class)
public class Vector3KeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : KeyFrameAnimation(ptr), IVector3KeyFrameAnimation.WithDefault, IWinRTObject {
  private val __325974913_Interface: IVector3KeyFrameAnimation.WithDefault by lazy {
    as_325974913()
  }


  public override val __325974913_Ptr: JNAPointer? by lazy {
    __325974913_Interface.__325974913_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__325974913_Interface)

  private fun as_325974913(): IVector3KeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IVector3KeyFrameAnimation.ABI.makeIVector3KeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector3KeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector3KeyFrameAnimation.ABI.makeIVector3KeyFrameAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Vector3KeyFrameAnimation> {
    public override fun getValue() = Vector3KeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: Vector3KeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Vector3KeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Vector3KeyFrameAnimation {
      val address = segment.toRawLongValue()
      return Vector3KeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: Vector3KeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
