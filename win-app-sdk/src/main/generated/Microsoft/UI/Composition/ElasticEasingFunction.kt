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

@ABIMarker(ElasticEasingFunction.ABI::class)
@Signature("rc(Microsoft.UI.Composition.ElasticEasingFunction;{b952e12f-4a50-51a9-a11a-23855f4aae07})")
@WinRTByReference(brClass = ElasticEasingFunction.ByReference::class)
public class ElasticEasingFunction(
  ptr: JNAPointer? = NULL
) : CompositionEasingFunction(ptr), IElasticEasingFunction.WithDefault, IWinRTObject {
  private val __1266314785_Interface: IElasticEasingFunction.WithDefault by lazy {
    as_1266314785()
  }


  public override val __1266314785_Ptr: JNAPointer? by lazy {
    __1266314785_Interface.__1266314785_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1266314785_Interface)

  private fun as_1266314785(): IElasticEasingFunction.WithDefault {
    if(pointer == NULL) {
      return(IElasticEasingFunction.ABI.makeIElasticEasingFunction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IElasticEasingFunction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IElasticEasingFunction.ABI.makeIElasticEasingFunction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ElasticEasingFunction> {
    public override fun getValue() = ElasticEasingFunction(pointer.getPointer(0))

    public fun setValue(value: ElasticEasingFunction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ElasticEasingFunction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ElasticEasingFunction {
      val address = segment.toRawLongValue()
      return ElasticEasingFunction(Pointer(address))
    }

    public override fun toNative(obj: ElasticEasingFunction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
