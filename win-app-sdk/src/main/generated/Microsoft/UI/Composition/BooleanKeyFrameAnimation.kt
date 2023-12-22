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

@ABIMarker(BooleanKeyFrameAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.BooleanKeyFrameAnimation;{7fe485e9-e874-5ff3-8ddc-826c3818bfc3})")
@WinRTByReference(brClass = BooleanKeyFrameAnimation.ByReference::class)
public class BooleanKeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : KeyFrameAnimation(ptr), IBooleanKeyFrameAnimation.WithDefault, IWinRTObject {
  private val __1529075033_Interface: IBooleanKeyFrameAnimation.WithDefault by lazy {
    as_1529075033()
  }


  public override val __1529075033_Ptr: JNAPointer? by lazy {
    __1529075033_Interface.__1529075033_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1529075033_Interface)

  private fun as_1529075033(): IBooleanKeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IBooleanKeyFrameAnimation.ABI.makeIBooleanKeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBooleanKeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBooleanKeyFrameAnimation.ABI.makeIBooleanKeyFrameAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BooleanKeyFrameAnimation> {
    public override fun getValue() = BooleanKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: BooleanKeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BooleanKeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BooleanKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return BooleanKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: BooleanKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
