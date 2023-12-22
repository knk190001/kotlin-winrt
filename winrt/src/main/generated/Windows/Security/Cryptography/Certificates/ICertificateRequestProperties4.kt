package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IVector
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

@ABIMarker(ICertificateRequestProperties4.ABI::class)
@Signature("{4e429ad2-1c61-4fea-b8fe-135fb19cdce4}")
@Guid("4e429ad21c614feab8fe135fb19cdce4")
@WinRTInterface("4e429ad21c614feab8fe135fb19cdce4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateRequestProperties4.ByReference::class)
public interface ICertificateRequestProperties4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SuppressedDefaults(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_SubjectAlternativeName(): SubjectAlternativeNameInfo?

  @InterfaceMethod(2)
  public fun get_Extensions(): IVector<CertificateExtension?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateRequestProperties4> {
    public override fun getValue() = ABI.makeICertificateRequestProperties4(pointer.getPointer(0))

    public fun setValue(value: ICertificateRequestProperties4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateRequestProperties4 {
    public val __958100965_Ptr: Pointer?

    public val _958100965_VtblPtr: Pointer?
      get() = __958100965_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SuppressedDefaults(): IVector<String?>? {
      val fnPtr = _958100965_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__958100965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SubjectAlternativeName(): SubjectAlternativeNameInfo? {
      val fnPtr = _958100965_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SubjectAlternativeNameInfo>()
      val hr = fn.invokeHR(arrayOf(__958100965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SubjectAlternativeNameInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Extensions(): IVector<CertificateExtension?>? {
      val fnPtr = _958100965_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<CertificateExtension?>>()
      val hr = fn.invokeHR(arrayOf(__958100965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<CertificateExtension?>>(result.getValue())
      return resultValue
    }
  }

  public class ICertificateRequestProperties4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __958100965_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateRequestProperties4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e429ad21c614feab8fe135fb19cdce4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateRequestProperties4(ptr: Pointer?): WithDefault =
        ICertificateRequestProperties4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateRequestProperties4 {
      val address = segment.toRawLongValue()
      return makeICertificateRequestProperties4(Pointer(address))
    }

    public override fun toNative(obj: ICertificateRequestProperties4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__958100965_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateRequestProperties4):
        Array<ICertificateRequestProperties4?> = (elements as
        Array<ICertificateRequestProperties4?>).castToImpl<ICertificateRequestProperties4,ICertificateRequestProperties4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateRequestProperties4?> =
        arrayOfNulls<ICertificateRequestProperties4_Impl>(size) as
        Array<ICertificateRequestProperties4?>
  }
}
