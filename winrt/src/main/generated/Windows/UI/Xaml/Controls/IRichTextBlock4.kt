package Windows.UI.Xaml.Controls

import Windows.UI.Text.TextDecorations
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

@ABIMarker(IRichTextBlock4.ABI::class)
@Signature("{3577c1ea-24fd-4f50-bbe4-3fb654ea58c5}")
@Guid("3577c1ea24fd4f50bbe43fb654ea58c5")
@WinRTInterface("3577c1ea24fd4f50bbe43fb654ea58c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichTextBlock4.ByReference::class)
public interface IRichTextBlock4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextDecorations(): TextDecorations?

  @InterfaceMethod(1)
  public fun put_TextDecorations(value: TextDecorations?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichTextBlock4> {
    public override fun getValue() = ABI.makeIRichTextBlock4(pointer.getPointer(0))

    public fun setValue(value: IRichTextBlock4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichTextBlock4 {
    public val __1376290284_Ptr: Pointer?

    public val _1376290284_VtblPtr: Pointer?
      get() = __1376290284_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextDecorations(): TextDecorations? {
      val fnPtr = _1376290284_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TextDecorations>()
      val hr = fn.invokeHR(arrayOf(__1376290284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TextDecorations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TextDecorations(value: TextDecorations?): Unit {
      val fnPtr = _1376290284_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1376290284_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichTextBlock4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1376290284_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichTextBlock4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3577c1ea24fd4f50bbe43fb654ea58c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichTextBlock4(ptr: Pointer?): WithDefault = IRichTextBlock4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichTextBlock4 {
      val address = segment.toRawLongValue()
      return makeIRichTextBlock4(Pointer(address))
    }

    public override fun toNative(obj: IRichTextBlock4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1376290284_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichTextBlock4): Array<IRichTextBlock4?> = (elements as
        Array<IRichTextBlock4?>).castToImpl<IRichTextBlock4,IRichTextBlock4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichTextBlock4?> =
        arrayOfNulls<IRichTextBlock4_Impl>(size) as Array<IRichTextBlock4?>
  }
}
