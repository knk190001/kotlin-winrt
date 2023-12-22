package Windows.Security.Cryptography.Certificates

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICertificate.ABI::class)
@Signature("{333f740c-04d8-43b3-b278-8c5fcc9be5a0}")
@Guid("333f740c04d843b3b2788c5fcc9be5a0")
@WinRTInterface("333f740c04d843b3b2788c5fcc9be5a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificate.ByReference::class)
public interface ICertificate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun BuildChainAsync(certificates: IIterable<Certificate?>?):
      IAsyncOperation<CertificateChain?>?

  @InterfaceMethod(1)
  public fun BuildChainAsync(certificates: IIterable<Certificate?>?,
      parameters: ChainBuildingParameters?): IAsyncOperation<CertificateChain?>?

  @InterfaceMethod(2)
  public fun get_SerialNumber(): Array<Byte>?

  @InterfaceMethod(3)
  public fun GetHashValue(): Array<Byte>?

  @InterfaceMethod(4)
  public fun GetHashValue(hashAlgorithmName: String?): Array<Byte>?

  @InterfaceMethod(5)
  public fun GetCertificateBlob(): IBuffer?

  @InterfaceMethod(6)
  public fun get_Subject(): String?

  @InterfaceMethod(7)
  public fun get_Issuer(): String?

  @InterfaceMethod(8)
  public fun get_HasPrivateKey(): Boolean

  @InterfaceMethod(9)
  public fun get_IsStronglyProtected(): Boolean

  @InterfaceMethod(10)
  public fun get_ValidFrom(): DateTime?

  @InterfaceMethod(11)
  public fun get_ValidTo(): DateTime?

  @InterfaceMethod(12)
  public fun get_EnhancedKeyUsages(): IVectorView<String?>?

  @InterfaceMethod(13)
  public fun put_FriendlyName(value: String?): Unit

  @InterfaceMethod(14)
  public fun get_FriendlyName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICertificate> {
    public override fun getValue() = ABI.makeICertificate(pointer.getPointer(0))

    public fun setValue(value: ICertificate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificate {
    public val __800299287_Ptr: Pointer?

    public val _800299287_VtblPtr: Pointer?
      get() = __800299287_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun BuildChainAsync(certificates: IIterable<Certificate?>?):
        IAsyncOperation<CertificateChain?>? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CertificateChain?>>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr, marshalToNative(certificates), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<CertificateChain?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun BuildChainAsync(certificates: IIterable<Certificate?>?,
        parameters: ChainBuildingParameters?): IAsyncOperation<CertificateChain?>? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CertificateChain?>>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr, marshalToNative(certificates),
          marshalToNative(parameters), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<CertificateChain?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SerialNumber(): Array<Byte>? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetHashValue(): Array<Byte>? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetHashValue(hashAlgorithmName: String?): Array<Byte>? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr, marshalToNative(hashAlgorithmName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetCertificateBlob(): IBuffer? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Subject(): String? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Issuer(): String? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_HasPrivateKey(): Boolean {
      val fnPtr = _800299287_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsStronglyProtected(): Boolean {
      val fnPtr = _800299287_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_ValidFrom(): DateTime? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_ValidTo(): DateTime? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_EnhancedKeyUsages(): IVectorView<String?>? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_FriendlyName(value: String?): Unit {
      val fnPtr = _800299287_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _800299287_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__800299287_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICertificate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __800299287_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("333f740c04d843b3b2788c5fcc9be5a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificate(ptr: Pointer?): WithDefault = ICertificate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificate {
      val address = segment.toRawLongValue()
      return makeICertificate(Pointer(address))
    }

    public override fun toNative(obj: ICertificate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__800299287_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificate): Array<ICertificate?> = (elements as
        Array<ICertificate?>).castToImpl<ICertificate,ICertificate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificate?> =
        arrayOfNulls<ICertificate_Impl>(size) as Array<ICertificate?>
  }
}
