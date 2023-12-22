package Windows.Security.Cryptography.Certificates

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICertificate2.ABI::class)
@Signature("{17b8374c-8a25-4d96-a492-8fc29ac4fda6}")
@Guid("17b8374c8a254d96a4928fc29ac4fda6")
@WinRTInterface("17b8374c8a254d96a4928fc29ac4fda6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificate2.ByReference::class)
public interface ICertificate2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSecurityDeviceBound(): Boolean

  @InterfaceMethod(1)
  public fun get_KeyUsages(): CertificateKeyUsages?

  @InterfaceMethod(2)
  public fun get_KeyAlgorithmName(): String?

  @InterfaceMethod(3)
  public fun get_SignatureAlgorithmName(): String?

  @InterfaceMethod(4)
  public fun get_SignatureHashAlgorithmName(): String?

  @InterfaceMethod(5)
  public fun get_SubjectAlternativeName(): SubjectAlternativeNameInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICertificate2>
      {
    public override fun getValue() = ABI.makeICertificate2(pointer.getPointer(0))

    public fun setValue(value: ICertificate2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificate2 {
    public val __960525929_Ptr: Pointer?

    public val _960525929_VtblPtr: Pointer?
      get() = __960525929_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSecurityDeviceBound(): Boolean {
      val fnPtr = _960525929_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__960525929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_KeyUsages(): CertificateKeyUsages? {
      val fnPtr = _960525929_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CertificateKeyUsages>()
      val hr = fn.invokeHR(arrayOf(__960525929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CertificateKeyUsages>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_KeyAlgorithmName(): String? {
      val fnPtr = _960525929_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960525929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SignatureAlgorithmName(): String? {
      val fnPtr = _960525929_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960525929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SignatureHashAlgorithmName(): String? {
      val fnPtr = _960525929_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__960525929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SubjectAlternativeName(): SubjectAlternativeNameInfo? {
      val fnPtr = _960525929_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SubjectAlternativeNameInfo>()
      val hr = fn.invokeHR(arrayOf(__960525929_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SubjectAlternativeNameInfo>(result.getValue())
      return resultValue
    }
  }

  public class ICertificate2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __960525929_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificate2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17b8374c8a254d96a4928fc29ac4fda6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificate2(ptr: Pointer?): WithDefault = ICertificate2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificate2 {
      val address = segment.toRawLongValue()
      return makeICertificate2(Pointer(address))
    }

    public override fun toNative(obj: ICertificate2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__960525929_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificate2): Array<ICertificate2?> = (elements as
        Array<ICertificate2?>).castToImpl<ICertificate2,ICertificate2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificate2?> =
        arrayOfNulls<ICertificate2_Impl>(size) as Array<ICertificate2?>
  }
}
