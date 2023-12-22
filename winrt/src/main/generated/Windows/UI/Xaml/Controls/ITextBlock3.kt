package Windows.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextBlock3.ABI::class)
@Signature("{b651dd5a-424b-48c3-9b67-486f4e139899}")
@Guid("b651dd5a424b48c39b67486f4e139899")
@WinRTInterface("b651dd5a424b48c39b67486f4e139899")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBlock3.ByReference::class)
public interface ITextBlock3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsTextScaleFactorEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsTextScaleFactorEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBlock3> {
    public override fun getValue() = ABI.makeITextBlock3(pointer.getPointer(0))

    public fun setValue(value: ITextBlock3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBlock3 {
    public val __164916753_Ptr: Pointer?

    public val _164916753_VtblPtr: Pointer?
      get() = __164916753_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsTextScaleFactorEnabled(): Boolean {
      val fnPtr = _164916753_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__164916753_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsTextScaleFactorEnabled(value: Boolean): Unit {
      val fnPtr = _164916753_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__164916753_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBlock3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __164916753_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBlock3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b651dd5a424b48c39b67486f4e139899")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBlock3(ptr: Pointer?): WithDefault = ITextBlock3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBlock3 {
      val address = segment.toRawLongValue()
      return makeITextBlock3(Pointer(address))
    }

    public override fun toNative(obj: ITextBlock3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__164916753_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBlock3): Array<ITextBlock3?> = (elements as
        Array<ITextBlock3?>).castToImpl<ITextBlock3,ITextBlock3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBlock3?> =
        arrayOfNulls<ITextBlock3_Impl>(size) as Array<ITextBlock3?>
  }
}
