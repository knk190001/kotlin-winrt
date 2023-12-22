package Windows.Security.Cryptography.Certificates

import Windows.Foundation.IAsyncAction
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

@ABIMarker(ICertificateEnrollmentManagerStatics2.ABI::class)
@Signature("{dc5b1c33-6429-4014-999c-5d9735802d1d}")
@Guid("dc5b1c3364294014999c5d9735802d1d")
@WinRTInterface("dc5b1c3364294014999c5d9735802d1d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateEnrollmentManagerStatics2.ByReference::class)
public interface ICertificateEnrollmentManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserCertificateEnrollmentManager(): UserCertificateEnrollmentManager?

  @InterfaceMethod(1)
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
      IByReference<ICertificateEnrollmentManagerStatics2> {
    public override fun getValue() =
        ABI.makeICertificateEnrollmentManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: ICertificateEnrollmentManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateEnrollmentManagerStatics2 {
    public val __375995725_Ptr: Pointer?

    public val _375995725_VtblPtr: Pointer?
      get() = __375995725_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserCertificateEnrollmentManager(): UserCertificateEnrollmentManager? {
      val fnPtr = _375995725_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserCertificateEnrollmentManager>()
      val hr = fn.invokeHR(arrayOf(__375995725_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserCertificateEnrollmentManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ImportPfxDataAsync(
      pfxData: String?,
      password: String?,
      exportable: ExportOption?,
      keyProtectionLevel: KeyProtectionLevel?,
      installOption: InstallOptions?,
      friendlyName: String?,
      keyStorageProvider: String?
    ): IAsyncAction? {
      val fnPtr = _375995725_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__375995725_Ptr, marshalToNative(pfxData),
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

  public class ICertificateEnrollmentManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __375995725_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateEnrollmentManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dc5b1c3364294014999c5d9735802d1d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateEnrollmentManagerStatics2(ptr: Pointer?): WithDefault =
        ICertificateEnrollmentManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateEnrollmentManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeICertificateEnrollmentManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: ICertificateEnrollmentManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__375995725_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateEnrollmentManagerStatics2):
        Array<ICertificateEnrollmentManagerStatics2?> = (elements as
        Array<ICertificateEnrollmentManagerStatics2?>).castToImpl<ICertificateEnrollmentManagerStatics2,ICertificateEnrollmentManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateEnrollmentManagerStatics2?> =
        arrayOfNulls<ICertificateEnrollmentManagerStatics2_Impl>(size) as
        Array<ICertificateEnrollmentManagerStatics2?>
  }
}
