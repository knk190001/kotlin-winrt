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

@ABIMarker(ScalarKeyFrameAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.ScalarKeyFrameAnimation;{ae288fa9-252c-4b95-a725-bf85e38000a1})")
@WinRTByReference(brClass = ScalarKeyFrameAnimation.ByReference::class)
public class ScalarKeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : KeyFrameAnimation(ptr), IScalarKeyFrameAnimation.WithDefault, IWinRTObject {
  private val __406257956_Interface: IScalarKeyFrameAnimation.WithDefault by lazy {
    as_406257956()
  }


  public override val __406257956_Ptr: JNAPointer? by lazy {
    __406257956_Interface.__406257956_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__406257956_Interface)

  private fun as_406257956(): IScalarKeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IScalarKeyFrameAnimation.ABI.makeIScalarKeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScalarKeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScalarKeyFrameAnimation.ABI.makeIScalarKeyFrameAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScalarKeyFrameAnimation> {
    public override fun getValue() = ScalarKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: ScalarKeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScalarKeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ScalarKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return ScalarKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: ScalarKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
