package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Media.SolidColorBrush
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

@ABIMarker(ITextBox5.ABI::class)
@Signature("{35f9cfc1-4176-44f4-b756-e9ccc4399805}")
@Guid("35f9cfc1417644f4b756e9ccc4399805")
@WinRTInterface("35f9cfc1417644f4b756e9ccc4399805")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBox5.ByReference::class)
public interface ITextBox5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionHighlightColorWhenNotFocused(): SolidColorBrush?

  @InterfaceMethod(1)
  public fun put_SelectionHighlightColorWhenNotFocused(value: SolidColorBrush?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBox5> {
    public override fun getValue() = ABI.makeITextBox5(pointer.getPointer(0))

    public fun setValue(value: ITextBox5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBox5 {
    public val __1492904269_Ptr: Pointer?

    public val _1492904269_VtblPtr: Pointer?
      get() = __1492904269_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionHighlightColorWhenNotFocused(): SolidColorBrush? {
      val fnPtr = _1492904269_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__1492904269_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectionHighlightColorWhenNotFocused(value: SolidColorBrush?): Unit {
      val fnPtr = _1492904269_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904269_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBox5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1492904269_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBox5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("35f9cfc1417644f4b756e9ccc4399805")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBox5(ptr: Pointer?): WithDefault = ITextBox5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBox5 {
      val address = segment.toRawLongValue()
      return makeITextBox5(Pointer(address))
    }

    public override fun toNative(obj: ITextBox5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1492904269_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBox5): Array<ITextBox5?> = (elements as
        Array<ITextBox5?>).castToImpl<ITextBox5,ITextBox5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBox5?> = arrayOfNulls<ITextBox5_Impl>(size)
        as Array<ITextBox5?>
  }
}
