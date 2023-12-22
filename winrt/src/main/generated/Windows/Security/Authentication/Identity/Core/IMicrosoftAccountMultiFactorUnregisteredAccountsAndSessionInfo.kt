package Windows.Security.Authentication.Identity.Core

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.ABI::class)
@Signature("{aa7ec5fb-da3f-4088-a20d-5618afadb2e5}")
@Guid("aa7ec5fbda3f4088a20d5618afadb2e5")
@WinRTInterface("aa7ec5fbda3f4088a20d5618afadb2e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo.ByReference::class)
public interface IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Sessions(): IVectorView<MicrosoftAccountMultiFactorSessionInfo?>?

  @InterfaceMethod(1)
  public fun get_UnregisteredAccounts(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_ServiceResponse(): MicrosoftAccountMultiFactorServiceResponse?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo> {
    public override fun getValue() =
        ABI.makeIMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo(pointer.getPointer(0))

    public fun setValue(value: IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo {
    public val __95509482_Ptr: Pointer?

    public val _95509482_VtblPtr: Pointer?
      get() = __95509482_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Sessions(): IVectorView<MicrosoftAccountMultiFactorSessionInfo?>? {
      val fnPtr = _95509482_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MicrosoftAccountMultiFactorSessionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__95509482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<MicrosoftAccountMultiFactorSessionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UnregisteredAccounts(): IVectorView<String?>? {
      val fnPtr = _95509482_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__95509482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ServiceResponse(): MicrosoftAccountMultiFactorServiceResponse? {
      val fnPtr = _95509482_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MicrosoftAccountMultiFactorServiceResponse>()
      val hr = fn.invokeHR(arrayOf(__95509482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MicrosoftAccountMultiFactorServiceResponse>(result.getValue())
      return resultValue
    }
  }

  public class IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __95509482_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa7ec5fbda3f4088a20d5618afadb2e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo(ptr: Pointer?):
        WithDefault = IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo {
      val address = segment.toRawLongValue()
      return makeIMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo(Pointer(address))
    }

    public override
        fun toNative(obj: IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__95509482_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo):
        Array<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo?> = (elements as
        Array<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo?>).castToImpl<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo,IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo?> =
        arrayOfNulls<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo_Impl>(size) as
        Array<IMicrosoftAccountMultiFactorUnregisteredAccountsAndSessionInfo?>
  }
}
