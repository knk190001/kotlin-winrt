package Windows.Security.Authentication.Web.Core

import Windows.Foundation.Collections.IMap
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

@ABIMarker(IWebProviderError.ABI::class)
@Signature("{db191bb1-50c5-4809-8dca-09c99410245c}")
@Guid("db191bb150c548098dca09c99410245c")
@WinRTInterface("db191bb150c548098dca09c99410245c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebProviderError.ByReference::class)
public interface IWebProviderError : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ErrorCode(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ErrorMessage(): String?

  @InterfaceMethod(2)
  public fun get_Properties(): IMap<String?, String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebProviderError> {
    public override fun getValue() = ABI.makeIWebProviderError(pointer.getPointer(0))

    public fun setValue(value: IWebProviderError_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebProviderError {
    public val __59762976_Ptr: Pointer?

    public val _59762976_VtblPtr: Pointer?
      get() = __59762976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ErrorCode(): WinDef.UINT {
      val fnPtr = _59762976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__59762976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ErrorMessage(): String? {
      val fnPtr = _59762976_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__59762976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Properties(): IMap<String?, String?>? {
      val fnPtr = _59762976_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__59762976_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebProviderError_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __59762976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebProviderError, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db191bb150c548098dca09c99410245c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebProviderError(ptr: Pointer?): WithDefault = IWebProviderError_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebProviderError {
      val address = segment.toRawLongValue()
      return makeIWebProviderError(Pointer(address))
    }

    public override fun toNative(obj: IWebProviderError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__59762976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebProviderError): Array<IWebProviderError?> = (elements
        as Array<IWebProviderError?>).castToImpl<IWebProviderError,IWebProviderError_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebProviderError?> =
        arrayOfNulls<IWebProviderError_Impl>(size) as Array<IWebProviderError?>
  }
}
