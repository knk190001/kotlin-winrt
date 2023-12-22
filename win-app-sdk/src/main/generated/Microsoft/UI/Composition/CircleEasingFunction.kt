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

@ABIMarker(CircleEasingFunction.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CircleEasingFunction;{414b172c-bf27-5ead-93e0-35915322db2c})")
@WinRTByReference(brClass = CircleEasingFunction.ByReference::class)
public class CircleEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), ICircleEasingFunction.WithDefault, IWinRTObject {
  private val __1320900780_Interface: ICircleEasingFunction.WithDefault by lazy {
    as_1320900780()
  }


  public override val __1320900780_Ptr: JNAPointer? by lazy {
    __1320900780_Interface.__1320900780_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1320900780_Interface)

  private fun as_1320900780(): ICircleEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(ICircleEasingFunction.ABI.makeICircleEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICircleEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICircleEasingFunction.ABI.makeICircleEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CircleEasingFunction> {
    public override fun getValue() = CircleEasingFunction(pointer.getPointer(0))

    public fun setValue(value: CircleEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CircleEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CircleEasingFunction {
      val address = segment.toRawLongValue()
      return CircleEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: CircleEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
