package Windows.UI.Xaml.Data

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BindingExpressionBase.ABI::class)
@Signature("rc(Windows.UI.Xaml.Data.BindingExpressionBase;{fded3154-e954-4f67-8fb6-6ed79b3a1cb3})")
@WinRTByReference(brClass = BindingExpressionBase.ByReference::class)
public open class BindingExpressionBase(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBindingExpressionBase.WithDefault, IWinRTObject {
  private val __124324422_Interface: IBindingExpressionBase.WithDefault by lazy {
    as_124324422()
  }


  public override val __124324422_Ptr: JNAPointer? by lazy {
    __124324422_Interface.__124324422_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__124324422_Interface)

  private fun as_124324422(): IBindingExpressionBase.WithDefault {
    if(pointer == NULL) {
      return(IBindingExpressionBase.ABI.makeIBindingExpressionBase(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBindingExpressionBase>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBindingExpressionBase.ABI.makeIBindingExpressionBase(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BindingExpressionBase> {
    public override fun getValue() = BindingExpressionBase(pointer.getPointer(0))

    public fun setValue(value: BindingExpressionBase): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BindingExpressionBase, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BindingExpressionBase {
      val address = segment.toRawLongValue()
      return BindingExpressionBase(Pointer(address))
    }

    public override fun toNative(obj: BindingExpressionBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
