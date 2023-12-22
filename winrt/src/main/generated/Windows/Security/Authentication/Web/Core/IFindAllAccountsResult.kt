package Windows.Security.Authentication.Web.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IFindAllAccountsResult.ABI::class)
@Signature("{a5812b5d-b72e-420c-86ab-aac0d7b7261f}")
@Guid("a5812b5db72e420c86abaac0d7b7261f")
@WinRTInterface("a5812b5db72e420c86abaac0d7b7261f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFindAllAccountsResult.ByReference::class)
public interface IFindAllAccountsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Accounts(): IVectorView<WebAccount?>?

  @InterfaceMethod(1)
  public fun get_Status(): FindAllWebAccountsStatus?

  @InterfaceMethod(2)
  public fun get_ProviderError(): WebProviderError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFindAllAccountsResult> {
    public override fun getValue() = ABI.makeIFindAllAccountsResult(pointer.getPointer(0))

    public fun setValue(value: IFindAllAccountsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFindAllAccountsResult {
    public val __980948082_Ptr: Pointer?

    public val _980948082_VtblPtr: Pointer?
      get() = __980948082_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Accounts(): IVectorView<WebAccount?>? {
      val fnPtr = _980948082_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WebAccount?>>()
      val hr = fn.invokeHR(arrayOf(__980948082_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WebAccount?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): FindAllWebAccountsStatus? {
      val fnPtr = _980948082_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FindAllWebAccountsStatus>()
      val hr = fn.invokeHR(arrayOf(__980948082_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FindAllWebAccountsStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ProviderError(): WebProviderError? {
      val fnPtr = _980948082_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebProviderError>()
      val hr = fn.invokeHR(arrayOf(__980948082_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebProviderError>(result.getValue())
      return resultValue
    }
  }

  public class IFindAllAccountsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __980948082_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFindAllAccountsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a5812b5db72e420c86abaac0d7b7261f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFindAllAccountsResult(ptr: Pointer?): WithDefault =
        IFindAllAccountsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFindAllAccountsResult {
      val address = segment.toRawLongValue()
      return makeIFindAllAccountsResult(Pointer(address))
    }

    public override fun toNative(obj: IFindAllAccountsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__980948082_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFindAllAccountsResult): Array<IFindAllAccountsResult?> =
        (elements as
        Array<IFindAllAccountsResult?>).castToImpl<IFindAllAccountsResult,IFindAllAccountsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFindAllAccountsResult?> =
        arrayOfNulls<IFindAllAccountsResult_Impl>(size) as Array<IFindAllAccountsResult?>
  }
}
