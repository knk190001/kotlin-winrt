package Microsoft.Web.WebView2.Core

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2FrameInfo.ABI::class)
@Signature("{f9b82e06-73f3-513b-bc2c-445ddedba976}")
@Guid("f9b82e0673f3513bbc2c445ddedba976")
@WinRTInterface("f9b82e0673f3513bbc2c445ddedba976")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2FrameInfo.ByReference::class)
public interface ICoreWebView2FrameInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Source(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2FrameInfo> {
    public override fun getValue() = ABI.makeICoreWebView2FrameInfo(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2FrameInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2FrameInfo {
    public val __13329100_Ptr: Pointer?

    public val _13329100_VtblPtr: Pointer?
      get() = __13329100_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _13329100_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__13329100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Source(): String? {
      val fnPtr = _13329100_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__13329100_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2FrameInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __13329100_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2FrameInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9b82e0673f3513bbc2c445ddedba976")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2FrameInfo(ptr: Pointer?): WithDefault =
        ICoreWebView2FrameInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2FrameInfo {
      val address = segment.toRawLongValue()
      return makeICoreWebView2FrameInfo(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2FrameInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__13329100_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2FrameInfo): Array<ICoreWebView2FrameInfo?> =
        (elements as
        Array<ICoreWebView2FrameInfo?>).castToImpl<ICoreWebView2FrameInfo,ICoreWebView2FrameInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2FrameInfo?> =
        arrayOfNulls<ICoreWebView2FrameInfo_Impl>(size) as Array<ICoreWebView2FrameInfo?>
  }
}
