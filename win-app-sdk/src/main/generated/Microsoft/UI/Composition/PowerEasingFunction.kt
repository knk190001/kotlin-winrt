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

@ABIMarker(PowerEasingFunction.ABI::class)
@Signature("rc(Microsoft.UI.Composition.PowerEasingFunction;{0268a272-ea06-5fb0-8def-49726bcee39b})")
@WinRTByReference(brClass = PowerEasingFunction.ByReference::class)
public class PowerEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), IPowerEasingFunction.WithDefault, IWinRTObject {
  private val __795309617_Interface: IPowerEasingFunction.WithDefault by lazy {
    as_795309617()
  }


  public override val __795309617_Ptr: JNAPointer? by lazy {
    __795309617_Interface.__795309617_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__795309617_Interface)

  private fun as_795309617(): IPowerEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(IPowerEasingFunction.ABI.makeIPowerEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPowerEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPowerEasingFunction.ABI.makeIPowerEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PowerEasingFunction> {
    public override fun getValue() = PowerEasingFunction(pointer.getPointer(0))

    public fun setValue(value: PowerEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PowerEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PowerEasingFunction {
      val address = segment.toRawLongValue()
      return PowerEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: PowerEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
