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

@ABIMarker(SineEasingFunction.ABI::class)
@Signature("rc(Microsoft.UI.Composition.SineEasingFunction;{7fccb5f8-cb0e-5a01-a26b-98880ff49dc6})")
@WinRTByReference(brClass = SineEasingFunction.ByReference::class)
public class SineEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), ISineEasingFunction.WithDefault, IWinRTObject {
  private val __1916386793_Interface: ISineEasingFunction.WithDefault by lazy {
    as_1916386793()
  }


  public override val __1916386793_Ptr: JNAPointer? by lazy {
    __1916386793_Interface.__1916386793_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1916386793_Interface)

  private fun as_1916386793(): ISineEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(ISineEasingFunction.ABI.makeISineEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISineEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISineEasingFunction.ABI.makeISineEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SineEasingFunction> {
    public override fun getValue() = SineEasingFunction(pointer.getPointer(0))

    public fun setValue(value: SineEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SineEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SineEasingFunction {
      val address = segment.toRawLongValue()
      return SineEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: SineEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
