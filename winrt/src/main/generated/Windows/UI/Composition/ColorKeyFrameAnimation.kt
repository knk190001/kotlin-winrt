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

@ABIMarker(ColorKeyFrameAnimation.ABI::class)
@Signature("rc(Windows.UI.Composition.ColorKeyFrameAnimation;{93adb5e9-8e05-4593-84a3-dca152781e56})")
@WinRTByReference(brClass = ColorKeyFrameAnimation.ByReference::class)
public class ColorKeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : KeyFrameAnimation(ptr), IColorKeyFrameAnimation.WithDefault, IWinRTObject {
  private val __1305646879_Interface: IColorKeyFrameAnimation.WithDefault by lazy {
    as_1305646879()
  }


  public override val __1305646879_Ptr: JNAPointer? by lazy {
    __1305646879_Interface.__1305646879_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1305646879_Interface)

  private fun as_1305646879(): IColorKeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IColorKeyFrameAnimation.ABI.makeIColorKeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorKeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorKeyFrameAnimation.ABI.makeIColorKeyFrameAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorKeyFrameAnimation> {
    public override fun getValue() = ColorKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: ColorKeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorKeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ColorKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return ColorKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: ColorKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
