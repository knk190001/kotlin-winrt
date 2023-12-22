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

@ABIMarker(IUserCertificateEnrollmentManager2.ABI::class)
@Signature("{0dad9cb1-65de-492a-b86d-fc5c482c3747}")
@Guid("0dad9cb165de492ab86dfc5c482c3747")
@WinRTInterface("0dad9cb165de492ab86dfc5c482c3747")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserCertificateEnrollmentManager2.ByReference::class)
public interface IUserCertificateEnrollmentManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ImportPfxDataAsync(
    pfxData: String?,
    password: String?,
    pfxImportParameters: PfxImportParameters?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserCertificateEnrollmentManager2> {
    public override fun getValue() =
        ABI.makeIUserCertificateEnrollmentManager2(pointer.getPointer(0))

    public fun setValue(value: IUserCertificateEnrollmentManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserCertificateEnrollmentManager2 {
    public val __2030880519_Ptr: Pointer?

    public val _2030880519_VtblPtr: Pointer?
      get() = __2030880519_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ImportPfxDataAsync(
      pfxData: String?,
      password: String?,
      pfxImportParameters: PfxImportParameters?
    ): IAsyncAction? {
      val fnPtr = _2030880519_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2030880519_Ptr, marshalToNative(pfxData),
          marshalToNative(password), marshalToNative(pfxImportParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IUserCertificateEnrollmentManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2030880519_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserCertificateEnrollmentManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0dad9cb165de492ab86dfc5c482c3747")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserCertificateEnrollmentManager2(ptr: Pointer?): WithDefault =
        IUserCertificateEnrollmentManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserCertificateEnrollmentManager2 {
      val address = segment.toRawLongValue()
      return makeIUserCertificateEnrollmentManager2(Pointer(address))
    }

    public override fun toNative(obj: IUserCertificateEnrollmentManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2030880519_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserCertificateEnrollmentManager2):
        Array<IUserCertificateEnrollmentManager2?> = (elements as
        Array<IUserCertificateEnrollmentManager2?>).castToImpl<IUserCertificateEnrollmentManager2,IUserCertificateEnrollmentManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserCertificateEnrollmentManager2?> =
        arrayOfNulls<IUserCertificateEnrollmentManager2_Impl>(size) as
        Array<IUserCertificateEnrollmentManager2?>
  }
}
