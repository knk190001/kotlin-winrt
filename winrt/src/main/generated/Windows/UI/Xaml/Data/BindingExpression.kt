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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BindingExpression.ABI::class)
@Signature("rc(Windows.UI.Xaml.Data.BindingExpression;{516a19a5-c2fd-4a9e-9fd3-9aa42f995a3c})")
@WinRTByReference(brClass = BindingExpression.ByReference::class)
public class BindingExpression(
  ptr: JNAPointer? = NULL
) : BindingExpressionBase(ptr), IBindingExpression.WithDefault, IWinRTObject {
  private val __2109243861_Interface: IBindingExpression.WithDefault by lazy {
    as_2109243861()
  }


  public override val __2109243861_Ptr: JNAPointer? by lazy {
    __2109243861_Interface.__2109243861_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2109243861_Interface)

  private fun as_2109243861(): IBindingExpression.WithDefault {
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
