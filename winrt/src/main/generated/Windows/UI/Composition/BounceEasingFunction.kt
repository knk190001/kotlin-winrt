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

@ABIMarker(BounceEasingFunction.ABI::class)
@Signature("rc(Windows.UI.Composition.BounceEasingFunction;{e7fdb44b-aad5-5174-9421-eef8b75a6a43})")
@WinRTByReference(brClass = BounceEasingFunction.ByReference::class)
public class BounceEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), IBounceEasingFunction.WithDefault, IWinRTObject {
  private val __1417327481_Interface: IBounceEasingFunction.WithDefault by lazy {
    as_1417327481()
  }


  public override val __1417327481_Ptr: JNAPointer? by lazy {
    __1417327481_Interface.__1417327481_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1417327481_Interface)

  private fun as_1417327481(): IBounceEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(IBounceEasingFunction.ABI.makeIBounceEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBounceEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBounceEasingFunction.ABI.makeIBounceEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BounceEasingFunction> {
    public override fun getValue() = BounceEasingFunction(pointer.getPointer(0))

    public fun setValue(value: BounceEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BounceEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BounceEasingFunction {
      val address = segment.toRawLongValue()
      return BounceEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: BounceEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
