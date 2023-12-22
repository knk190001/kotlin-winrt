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

@ABIMarker(QuaternionKeyFrameAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.QuaternionKeyFrameAnimation;{e72d1026-da3b-5d56-858b-3a9aa3c57d70})")
@WinRTByReference(brClass = QuaternionKeyFrameAnimation.ByReference::class)
public class QuaternionKeyFrameAnimation(
  ptr: JNAPointer? = NULL
) : KeyFrameAnimation(ptr), IQuaternionKeyFrameAnimation.WithDefault, IWinRTObject {
  private val __31472031_Interface: IQuaternionKeyFrameAnimation.WithDefault by lazy {
    as_31472031()
  }


  public override val __31472031_Ptr: JNAPointer? by lazy {
    __31472031_Interface.__31472031_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__31472031_Interface)

  private fun as_31472031(): IQuaternionKeyFrameAnimation.WithDefault {
    if(pointer == NULL) {
      return(IQuaternionKeyFrameAnimation.ABI.makeIQuaternionKeyFrameAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IQuaternionKeyFrameAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IQuaternionKeyFrameAnimation.ABI.makeIQuaternionKeyFrameAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<QuaternionKeyFrameAnimation> {
    public override fun getValue() = QuaternionKeyFrameAnimation(pointer.getPointer(0))

    public fun setValue(value: QuaternionKeyFrameAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<QuaternionKeyFrameAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): QuaternionKeyFrameAnimation {
      val address = segment.toRawLongValue()
      return QuaternionKeyFrameAnimation(Pointer(address))
    }

    public override fun toNative(obj: QuaternionKeyFrameAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
