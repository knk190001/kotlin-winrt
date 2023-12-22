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

@ABIMarker(ExpressionAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Composition.ExpressionAnimation;{7fff5826-1992-56c0-9060-5ade561a4f2d})")
@WinRTByReference(brClass = ExpressionAnimation.ByReference::class)
public class ExpressionAnimation(
  ptr: JNAPointer? = NULL
) : CompositionAnimation(ptr), IExpressionAnimation.WithDefault, IWinRTObject {
  private val __621987053_Interface: IExpressionAnimation.WithDefault by lazy {
    as_621987053()
  }


  public override val __621987053_Ptr: JNAPointer? by lazy {
    __621987053_Interface.__621987053_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__621987053_Interface)

  private fun as_621987053(): IExpressionAnimation.WithDefault {
    if(pointer == NULL) {
      return(IExpressionAnimation.ABI.makeIExpressionAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpressionAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpressionAnimation.ABI.makeIExpressionAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpressionAnimation> {
    public override fun getValue() = ExpressionAnimation(pointer.getPointer(0))

    public fun setValue(value: ExpressionAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpressionAnimation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExpressionAnimation {
      val address = segment.toRawLongValue()
      return ExpressionAnimation(Pointer(address))
    }

    public override fun toNative(obj: ExpressionAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
