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

@ABIMarker(ICertificateEnrollmentManagerStatics3.ABI::class)
@Signature("{fdec82be-617c-425a-b72d-398b26ac7264}")
@Guid("fdec82be617c425ab72d398b26ac7264")
@WinRTInterface("fdec82be617c425ab72d398b26ac7264")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateEnrollmentManagerStatics3.ByReference::class)
public interface ICertificateEnrollmentManagerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ImportPfxDataAsync(
    pfxData: String?,
    password: String?,
    pfxImportParameters: PfxImportParameters?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateEnrollmentManagerStatics3> {
    public override fun getValue() =
        ABI.makeICertificateEnrollmentManagerStatics3(pointer.getPointer(0))

    public fun setValue(value: ICertificateEnrollmentManagerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateEnrollmentManagerStatics3 {
    public val __375995726_Ptr: Pointer?

    public val _375995726_VtblPtr: Pointer?
      get() = __375995726_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ImportPfxDataAsync(
      pfxData: String?,
      password: String?,
      pfxImportParameters: PfxImportParameters?
    ): IAsyncAction? {
      val fnPtr = _375995726_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__375995726_Ptr, marshalToNative(pfxData),
          marshalToNative(password), marshalToNative(pfxImportParameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class ICertificateEnrollmentManagerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __375995726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateEnrollmentManagerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdec82be617c425ab72d398b26ac7264")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateEnrollmentManagerStatics3(ptr: Pointer?): WithDefault =
        ICertificateEnrollmentManagerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateEnrollmentManagerStatics3 {
      val address = segment.toRawLongValue()
      return makeICertificateEnrollmentManagerStatics3(Pointer(address))
    }

    public override fun toNative(obj: ICertificateEnrollmentManagerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__375995726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateEnrollmentManagerStatics3):
        Array<ICertificateEnrollmentManagerStatics3?> = (elements as
        Array<ICertificateEnrollmentManagerStatics3?>).castToImpl<ICertificateEnrollmentManagerStatics3,ICertificateEnrollmentManagerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateEnrollmentManagerStatics3?> =
        arrayOfNulls<ICertificateEnrollmentManagerStatics3_Impl>(size) as
        Array<ICertificateEnrollmentManagerStatics3?>
  }
}
