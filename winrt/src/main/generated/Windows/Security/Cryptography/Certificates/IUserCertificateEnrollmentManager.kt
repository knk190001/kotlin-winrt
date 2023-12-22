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

@ABIMarker(IUserCertificateEnrollmentManager.ABI::class)
@Signature("{96313718-22e1-4819-b20b-ab46a6eca06e}")
@Guid("9631371822e14819b20bab46a6eca06e")
@WinRTInterface("9631371822e14819b20bab46a6eca06e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserCertificateEnrollmentManager.ByReference::class)
public interface IUserCertificateEnrollmentManager : NativeMapped, IWinRTInterface {
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

  @InterfaceMethod(3)
  public fun ImportPfxDataAsync(
    pfxData: String?,
    password: String?,
    exportable: ExportOption?,
    keyProtectionLevel: KeyProtectionLevel?,
    installOption: InstallOptions?,
    friendlyName: String?,
    keyStorageProvider: String?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserCertificateEnrollmentManager> {
    public override fun getValue() =
        ABI.makeIUserCertificateEnrollmentManager(pointer.getPointer(0))

    public fun setValue(value: IUserCertificateEnrollmentManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserCertificateEnrollmentManager {
    public val __2005174923_Ptr: Pointer?

    public val _2005174923_VtblPtr: Pointer?
      get() = __2005174923_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateRequestAsync(request: CertificateRequestProperties?):
        IAsyncOperation<String?>? {
      val fnPtr = _2005174923_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__2005174923_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun InstallCertificateAsync(certificate: String?,
        installOption: InstallOptions?): IAsyncAction? {
      val fnPtr = _2005174923_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2005174923_Ptr, marshalToNative(certificate),
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
      val fnPtr = _2005174923_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2005174923_Ptr, marshalToNative(pfxData),
          marshalToNative(password), marshalToNative(exportable),
          marshalToNative(keyProtectionLevel), marshalToNative(installOption),
          marshalToNative(friendlyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ImportPfxDataAsync(
      pfxData: String?,
      password: String?,
      exportable: ExportOption?,
      keyProtectionLevel: KeyProtectionLevel?,
      installOption: InstallOptions?,
      friendlyName: String?,
      keyStorageProvider: String?
    ): IAsyncAction? {
      val fnPtr = _2005174923_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2005174923_Ptr, marshalToNative(pfxData),
          marshalToNative(password), marshalToNative(exportable),
          marshalToNative(keyProtectionLevel), marshalToNative(installOption),
          marshalToNative(friendlyName), marshalToNative(keyStorageProvider), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserCertificateEnrollmentManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2005174923_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserCertificateEnrollmentManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9631371822e14819b20bab46a6eca06e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserCertificateEnrollmentManager(ptr: Pointer?): WithDefault =
        IUserCertificateEnrollmentManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserCertificateEnrollmentManager {
      val address = segment.toRawLongValue()
      return makeIUserCertificateEnrollmentManager(Pointer(address))
    }

    public override fun toNative(obj: IUserCertificateEnrollmentManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2005174923_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserCertificateEnrollmentManager):
        Array<IUserCertificateEnrollmentManager?> = (elements as
        Array<IUserCertificateEnrollmentManager?>).castToImpl<IUserCertificateEnrollmentManager,IUserCertificateEnrollmentManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserCertificateEnrollmentManager?> =
        arrayOfNulls<IUserCertificateEnrollmentManager_Impl>(size) as
        Array<IUserCertificateEnrollmentManager?>
  }
}
