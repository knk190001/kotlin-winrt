package Windows.Security.Cryptography.Certificates

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ICertificateEnrollmentManagerStatics.ABI::class)
@Signature("{8846ef3f-a986-48fb-9fd7-9aec06935bf1}")
@Guid("8846ef3fa98648fb9fd79aec06935bf1")
@WinRTInterface("8846ef3fa98648fb9fd79aec06935bf1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateEnrollmentManagerStatics.ByReference::class)
public interface ICertificateEnrollmentManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateRequestAsync(request: CertificateRequestProperties?): IAsyncOperation<String?>?

  @InterfaceMethod(1)
  public fun InstallCertificateAsync(certificate: String?, installOption: InstallOptions?):
      IAsyncAction?

  @InterfaceMethod(2)
  public fun ImportPfxDataAsync(
    pfxData: String?,
    password: String?,
    exportable: ExportOption?,
    keyProtectionLevel: KeyProtectionLevel?,
    installOption: InstallOptions?,
    friendlyName: String?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateEnrollmentManagerStatics> {
    public override fun getValue() =
        ABI.makeICertificateEnrollmentManagerStatics(pointer.getPointer(0))

    public fun setValue(value: ICertificateEnrollmentManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateEnrollmentManagerStatics {
    public val __289223557_Ptr: Pointer?

    public val _289223557_VtblPtr: Pointer?
      get() = __289223557_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateRequestAsync(request: CertificateRequestProperties?):
        IAsyncOperation<String?>? {
      val fnPtr = _289223557_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__289223557_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun InstallCertificateAsync(certificate: String?,
        installOption: InstallOptions?): IAsyncAction? {
      val fnPtr = _289223557_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__289223557_Ptr, marshalToNative(certificate),
          marshalToNative(installOption), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ImportPfxDataAsync(
      pfxData: String?,
      password: String?,
      exportable: ExportOption?,
      keyProtectionLevel: KeyProtectionLevel?,
      installOption: InstallOptions?,
      friendlyName: String?
    ): IAsyncAction? {
      val fnPtr = _289223557_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__289223557_Ptr, marshalToNative(pfxData),
          marshalToNative(password), marshalToNative(exportable),
          marshalToNative(keyProtectionLevel), marshalToNative(installOption),
          marshalToNative(friendlyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICertificateEnrollmentManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __289223557_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateEnrollmentManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8846ef3fa98648fb9fd79aec06935bf1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateEnrollmentManagerStatics(ptr: Pointer?): WithDefault =
        ICertificateEnrollmentManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateEnrollmentManagerStatics {
      val address = segment.toRawLongValue()
      return makeICertificateEnrollmentManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: ICertificateEnrollmentManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__289223557_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateEnrollmentManagerStatics):
        Array<ICertificateEnrollmentManagerStatics?> = (elements as
        Array<ICertificateEnrollmentManagerStatics?>).castToImpl<ICertificateEnrollmentManagerStatics,ICertificateEnrollmentManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateEnrollmentManagerStatics?> =
        arrayOfNulls<ICertificateEnrollmentManagerStatics_Impl>(size) as
        Array<ICertificateEnrollmentManagerStatics?>
  }
}
