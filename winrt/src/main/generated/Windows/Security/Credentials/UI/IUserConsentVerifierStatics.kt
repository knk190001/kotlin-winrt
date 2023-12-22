package Windows.Security.Credentials.UI

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IUserConsentVerifierStatics.ABI::class)
@Signature("{af4f3f91-564c-4ddc-b8b5-973447627c65}")
@Guid("af4f3f91564c4ddcb8b5973447627c65")
@WinRTInterface("af4f3f91564c4ddcb8b5973447627c65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserConsentVerifierStatics.ByReference::class)
public interface IUserConsentVerifierStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CheckAvailabilityAsync(): IAsyncOperation<UserConsentVerifierAvailability?>?

  @InterfaceMethod(1)
  public fun RequestVerificationAsync(message: String?):
      IAsyncOperation<UserConsentVerificationResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserConsentVerifierStatics> {
    public override fun getValue() = ABI.makeIUserConsentVerifierStatics(pointer.getPointer(0))

    public fun setValue(value: IUserConsentVerifierStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserConsentVerifierStatics {
    public val __249630944_Ptr: Pointer?

    public val _249630944_VtblPtr: Pointer?
      get() = __249630944_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CheckAvailabilityAsync():
        IAsyncOperation<UserConsentVerifierAvailability?>? {
      val fnPtr = _249630944_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserConsentVerifierAvailability?>>()
      val hr = fn.invokeHR(arrayOf(__249630944_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<UserConsentVerifierAvailability?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestVerificationAsync(message: String?):
        IAsyncOperation<UserConsentVerificationResult?>? {
      val fnPtr = _249630944_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserConsentVerificationResult?>>()
      val hr = fn.invokeHR(arrayOf(__249630944_Ptr, marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<UserConsentVerificationResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IUserConsentVerifierStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __249630944_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserConsentVerifierStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af4f3f91564c4ddcb8b5973447627c65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserConsentVerifierStatics(ptr: Pointer?): WithDefault =
        IUserConsentVerifierStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserConsentVerifierStatics {
      val address = segment.toRawLongValue()
      return makeIUserConsentVerifierStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserConsentVerifierStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__249630944_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserConsentVerifierStatics):
        Array<IUserConsentVerifierStatics?> = (elements as
        Array<IUserConsentVerifierStatics?>).castToImpl<IUserConsentVerifierStatics,IUserConsentVerifierStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserConsentVerifierStatics?> =
        arrayOfNulls<IUserConsentVerifierStatics_Impl>(size) as Array<IUserConsentVerifierStatics?>
  }
}
