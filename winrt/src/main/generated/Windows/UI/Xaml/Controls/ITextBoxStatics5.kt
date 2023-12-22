package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyProperty
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextBoxStatics5.ABI::class)
@Signature("{07d04b45-1b2f-4627-82fd-683f197e5a75}")
@Guid("07d04b451b2f462782fd683f197e5a75")
@WinRTInterface("07d04b451b2f462782fd683f197e5a75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxStatics5.ByReference::class)
public interface ITextBoxStatics5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionHighlightColorWhenNotFocusedProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxStatics5> {
    public override fun getValue() = ABI.makeITextBoxStatics5(pointer.getPointer(0))

    public fun setValue(value: ITextBoxStatics5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxStatics5 {
    public val __107373326_Ptr: Pointer?

    public val _107373326_VtblPtr: Pointer?
      get() = __107373326_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionHighlightColorWhenNotFocusedProperty(): DependencyProperty? {
      val fnPtr = _107373326_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__107373326_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextBoxStatics5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __107373326_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxStatics5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("07d04b451b2f462782fd683f197e5a75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxStatics5(ptr: Pointer?): WithDefault = ITextBoxStatics5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxStatics5 {
      val address = segment.toRawLongValue()
      return makeITextBoxStatics5(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxStatics5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__107373326_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxStatics5): Array<ITextBoxStatics5?> = (elements as
        Array<ITextBoxStatics5?>).castToImpl<ITextBoxStatics5,ITextBoxStatics5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxStatics5?> =
        arrayOfNulls<ITextBoxStatics5_Impl>(size) as Array<ITextBoxStatics5?>
  }
}
