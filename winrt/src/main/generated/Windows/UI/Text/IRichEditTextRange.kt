package Windows.UI.Text

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

@ABIMarker(IRichEditTextRange.ABI::class)
@Signature("{374e3515-ba8a-4a6e-8c59-0dde3d0cf5cd}")
@Guid("374e3515ba8a4a6e8c590dde3d0cf5cd")
@WinRTInterface("374e3515ba8a4a6e8c590dde3d0cf5cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRichEditTextRange.ByReference::class)
public interface IRichEditTextRange : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentLinkInfo(): ContentLinkInfo?

  @InterfaceMethod(1)
  public fun put_ContentLinkInfo(value: ContentLinkInfo?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRichEditTextRange> {
    public override fun getValue() = ABI.makeIRichEditTextRange(pointer.getPointer(0))

    public fun setValue(value: IRichEditTextRange_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRichEditTextRange {
    public val __151471811_Ptr: Pointer?

    public val _151471811_VtblPtr: Pointer?
      get() = __151471811_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentLinkInfo(): ContentLinkInfo? {
      val fnPtr = _151471811_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContentLinkInfo>()
      val hr = fn.invokeHR(arrayOf(__151471811_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContentLinkInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContentLinkInfo(value: ContentLinkInfo?): Unit {
      val fnPtr = _151471811_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__151471811_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRichEditTextRange_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __151471811_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRichEditTextRange, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("374e3515ba8a4a6e8c590dde3d0cf5cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRichEditTextRange(ptr: Pointer?): WithDefault = IRichEditTextRange_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRichEditTextRange {
      val address = segment.toRawLongValue()
      return makeIRichEditTextRange(Pointer(address))
    }

    public override fun toNative(obj: IRichEditTextRange): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__151471811_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRichEditTextRange): Array<IRichEditTextRange?> =
        (elements as
        Array<IRichEditTextRange?>).castToImpl<IRichEditTextRange,IRichEditTextRange_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRichEditTextRange?> =
        arrayOfNulls<IRichEditTextRange_Impl>(size) as Array<IRichEditTextRange?>
  }
}
