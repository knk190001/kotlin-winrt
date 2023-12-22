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

@ABIMarker(ExponentialEasingFunction.ABI::class)
@Signature("rc(Windows.UI.Composition.ExponentialEasingFunction;{6f7d1a51-98d2-5638-a34a-00486554c750})")
@WinRTByReference(brClass = ExponentialEasingFunction.ByReference::class)
public class ExponentialEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), IExponentialEasingFunction.WithDefault, IWinRTObject {
  private val __2011051302_Interface: IExponentialEasingFunction.WithDefault by lazy {
    as_2011051302()
  }


  public override val __2011051302_Ptr: JNAPointer? by lazy {
    __2011051302_Interface.__2011051302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2011051302_Interface)

  private fun as_2011051302(): IExponentialEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(IExponentialEasingFunction.ABI.makeIExponentialEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExponentialEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExponentialEasingFunction.ABI.makeIExponentialEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExponentialEasingFunction> {
    public override fun getValue() = ExponentialEasingFunction(pointer.getPointer(0))

    public fun setValue(value: ExponentialEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExponentialEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExponentialEasingFunction {
      val address = segment.toRawLongValue()
      return ExponentialEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: ExponentialEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
