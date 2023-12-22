package Microsoft.UI.Xaml.Data

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

@ABIMarker(BindingExpression.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Data.BindingExpression;{4c023916-37bc-5b07-bc9d-15c547bd9b26})")
@WinRTByReference(brClass = BindingExpression.ByReference::class)
public class BindingExpression(
  ptr: JNAPointer? = NULL
) : BindingExpressionBase(ptr), IBindingExpression.WithDefault, IWinRTObject {
  private val __196369930_Interface: IBindingExpression.WithDefault by lazy {
    as_196369930()
  }


  public override val __196369930_Ptr: JNAPointer? by lazy {
    __196369930_Interface.__196369930_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__196369930_Interface)

  private fun as_196369930(): IBindingExpression.WithDefault {
    if(pointer == NULL) {
      return(IBindingExpression.ABI.makeIBindingExpression(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBindingExpression>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBindingExpression.ABI.makeIBindingExpression(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BindingExpression> {
    public override fun getValue() = BindingExpression(pointer.getPointer(0))

    public fun setValue(value: BindingExpression): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BindingExpression, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BindingExpression {
      val address = segment.toRawLongValue()
      return BindingExpression(Pointer(address))
    }

    public override fun toNative(obj: BindingExpression): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
