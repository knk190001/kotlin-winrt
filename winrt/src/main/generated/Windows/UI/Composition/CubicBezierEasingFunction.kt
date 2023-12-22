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

@ABIMarker(CubicBezierEasingFunction.ABI::class)
@Signature("rc(Windows.UI.Composition.CubicBezierEasingFunction;{32350666-c1e8-44f9-96b8-c98acf0ae698})")
@WinRTByReference(brClass = CubicBezierEasingFunction.ByReference::class)
public class CubicBezierEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), ICubicBezierEasingFunction.WithDefault, IWinRTObject {
  private val __571128158_Interface: ICubicBezierEasingFunction.WithDefault by lazy {
    as_571128158()
  }


  public override val __571128158_Ptr: JNAPointer? by lazy {
    __571128158_Interface.__571128158_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__571128158_Interface)

  private fun as_571128158(): ICubicBezierEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(ICubicBezierEasingFunction.ABI.makeICubicBezierEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICubicBezierEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICubicBezierEasingFunction.ABI.makeICubicBezierEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CubicBezierEasingFunction> {
    public override fun getValue() = CubicBezierEasingFunction(pointer.getPointer(0))

    public fun setValue(value: CubicBezierEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CubicBezierEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CubicBezierEasingFunction {
      val address = segment.toRawLongValue()
      return CubicBezierEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: CubicBezierEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
