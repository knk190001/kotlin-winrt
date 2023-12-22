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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICertificateRequestProperties.ABI::class)
@Signature("{487e84f6-94e2-4dce-8833-1a700a37a29a}")
@Guid("487e84f694e24dce88331a700a37a29a")
@WinRTInterface("487e84f694e24dce88331a700a37a29a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateRequestProperties.ByReference::class)
public interface ICertificateRequestProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Subject(): String?

  @InterfaceMethod(1)
  public fun put_Subject(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_KeyAlgorithmName(): String?

  @InterfaceMethod(3)
  public fun put_KeyAlgorithmName(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_KeySize(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_KeySize(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(7)
  public fun put_FriendlyName(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_HashAlgorithmName(): String?

  @InterfaceMethod(9)
  public fun put_HashAlgorithmName(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_Exportable(): ExportOption?

  @InterfaceMethod(11)
  public fun put_Exportable(value: ExportOption?): Unit

  @InterfaceMethod(12)
  public fun get_KeyUsages(): EnrollKeyUsages?

  @InterfaceMethod(13)
  public fun put_KeyUsages(value: EnrollKeyUsages?): Unit

  @InterfaceMethod(14)
  public fun get_KeyProtectionLevel(): KeyProtectionLevel?

  @InterfaceMethod(15)
  public fun put_KeyProtectionLevel(value: KeyProtectionLevel?): Unit

  @InterfaceMethod(16)
  public fun get_KeyStorageProviderName(): String?

  @InterfaceMethod(17)
  public fun put_KeyStorageProviderName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateRequestProperties> {
    public override fun getValue() = ABI.makeICertificateRequestProperties(pointer.getPointer(0))

    public fun setValue(value: ICertificateRequestProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateRequestProperties {
    public val __1493114169_Ptr: Pointer?

    public val _1493114169_VtblPtr: Pointer?
      get() = __1493114169_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Subject(): String? {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Subject(value: String?): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyAlgorithmName(): String? {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_KeyAlgorithmName(value: String?): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_KeySize(): WinDef.UINT {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_KeySize(value: WinDef.UINT): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_FriendlyName(value: String?): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_HashAlgorithmName(): String? {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_HashAlgorithmName(value: String?): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Exportable(): ExportOption? {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExportOption>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExportOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Exportable(value: ExportOption?): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_KeyUsages(): EnrollKeyUsages? {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnrollKeyUsages>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnrollKeyUsages>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_KeyUsages(value: EnrollKeyUsages?): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_KeyProtectionLevel(): KeyProtectionLevel? {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_KeyProtectionLevel(value: KeyProtectionLevel?): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_KeyStorageProviderName(): String? {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_KeyStorageProviderName(value: String?): Unit {
      val fnPtr = _1493114169_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493114169_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICertificateRequestProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1493114169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateRequestProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("487e84f694e24dce88331a700a37a29a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateRequestProperties(ptr: Pointer?): WithDefault =
        ICertificateRequestProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateRequestProperties {
      val address = segment.toRawLongValue()
      return makeICertificateRequestProperties(Pointer(address))
    }

    public override fun toNative(obj: ICertificateRequestProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1493114169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateRequestProperties):
        Array<ICertificateRequestProperties?> = (elements as
        Array<ICertificateRequestProperties?>).castToImpl<ICertificateRequestProperties,ICertificateRequestProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateRequestProperties?> =
        arrayOfNulls<ICertificateRequestProperties_Impl>(size) as
        Array<ICertificateRequestProperties?>
  }
}
