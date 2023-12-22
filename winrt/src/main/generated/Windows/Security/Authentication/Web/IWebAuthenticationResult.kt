package Windows.Security.Authentication.Web

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IWebAuthenticationResult.ABI::class)
@Signature("{64002b4b-ede9-470a-a5cd-0323faf6e262}")
@Guid("64002b4bede9470aa5cd0323faf6e262")
@WinRTInterface("64002b4bede9470aa5cd0323faf6e262")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAuthenticationResult.ByReference::class)
public interface IWebAuthenticationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResponseData(): String?

  @InterfaceMethod(1)
  public fun get_ResponseStatus(): WebAuthenticationStatus?

  @InterfaceMethod(2)
  public fun get_ResponseErrorDetail(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAuthenticationResult> {
    public override fun getValue() = ABI.makeIWebAuthenticationResult(pointer.getPointer(0))

    public fun setValue(value: IWebAuthenticationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAuthenticationResult {
    public val __1893429185_Ptr: Pointer?

    public val _1893429185_VtblPtr: Pointer?
      get() = __1893429185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResponseData(): String? {
      val fnPtr = _1893429185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1893429185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ResponseStatus(): WebAuthenticationStatus? {
      val fnPtr = _1893429185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAuthenticationStatus>()
      val hr = fn.invokeHR(arrayOf(__1893429185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAuthenticationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ResponseErrorDetail(): WinDef.UINT {
      val fnPtr = _1893429185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1893429185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IWebAuthenticationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1893429185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAuthenticationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64002b4bede9470aa5cd0323faf6e262")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAuthenticationResult(ptr: Pointer?): WithDefault =
        IWebAuthenticationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAuthenticationResult {
      val address = segment.toRawLongValue()
      return makeIWebAuthenticationResult(Pointer(address))
    }

    public override fun toNative(obj: IWebAuthenticationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1893429185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAuthenticationResult):
        Array<IWebAuthenticationResult?> = (elements as
        Array<IWebAuthenticationResult?>).castToImpl<IWebAuthenticationResult,IWebAuthenticationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAuthenticationResult?> =
        arrayOfNulls<IWebAuthenticationResult_Impl>(size) as Array<IWebAuthenticationResult?>
  }
}
