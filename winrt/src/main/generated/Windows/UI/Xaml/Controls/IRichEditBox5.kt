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

@ABIMarker(IRichEditBox5.ABI::class)
@Signature("{a66d9cea-6391-4f3b-9fd3-1fd01f49f327}")
@Guid("a66d9cea63914f3b9fd31fd01f49f327")
@WinRTInterface("a66d9cea63914f3b9fd31fd01f49f327")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditBox5.ByReference::class)
public interface IRichEditBox5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectionHighlightColorWhenNotFocused(): SolidColorBrush?

  @InterfaceMethod(1)
  public fun put_SelectionHighlightColorWhenNotFocused(value: SolidColorBrush?): Unit

  @InterfaceMethod(2)
  public fun get_MaxLength(): Int

  @InterfaceMethod(3)
  public fun put_MaxLength(value: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRichEditBox5>
      {
    public override fun getValue() = ABI.makeIRichEditBox5(pointer.getPointer(0))

    public fun setValue(value: IRichEditBox5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditBox5 {
    public val __409646068_Ptr: Pointer?

    public val _409646068_VtblPtr: Pointer?
      get() = __409646068_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectionHighlightColorWhenNotFocused(): SolidColorBrush? {
      val fnPtr = _409646068_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SolidColorBrush>()
      val hr = fn.invokeHR(arrayOf(__409646068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SolidColorBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SelectionHighlightColorWhenNotFocused(value: SolidColorBrush?): Unit {
      val fnPtr = _409646068_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646068_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MaxLength(): Int {
      val fnPtr = _409646068_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__409646068_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MaxLength(value: Int): Unit {
      val fnPtr = _409646068_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__409646068_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichEditBox5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __409646068_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditBox5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a66d9cea63914f3b9fd31fd01f49f327")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditBox5(ptr: Pointer?): WithDefault = IRichEditBox5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditBox5 {
      val address = segment.toRawLongValue()
      return makeIRichEditBox5(Pointer(address))
    }

    public override fun toNative(obj: IRichEditBox5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__409646068_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditBox5): Array<IRichEditBox5?> = (elements as
        Array<IRichEditBox5?>).castToImpl<IRichEditBox5,IRichEditBox5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditBox5?> =
        arrayOfNulls<IRichEditBox5_Impl>(size) as Array<IRichEditBox5?>
  }
}
