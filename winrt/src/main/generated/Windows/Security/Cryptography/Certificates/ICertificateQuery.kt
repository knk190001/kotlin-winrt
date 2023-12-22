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
import kotlin.Boolean
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICertificateQuery.ABI::class)
@Signature("{5b082a31-a728-4916-b5ee-ffcb8acf2417}")
@Guid("5b082a31a7284916b5eeffcb8acf2417")
@WinRTInterface("5b082a31a7284916b5eeffcb8acf2417")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateQuery.ByReference::class)
public interface ICertificateQuery : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnhancedKeyUsages(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_IssuerName(): String?

  @InterfaceMethod(2)
  public fun put_IssuerName(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(4)
  public fun put_FriendlyName(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_Thumbprint(): Array<Byte>?

  @InterfaceMethod(6)
  public fun put_Thumbprint(value: Array<Byte>): Unit

  @InterfaceMethod(7)
  public fun get_HardwareOnly(): Boolean

  @InterfaceMethod(8)
  public fun put_HardwareOnly(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateQuery> {
    public override fun getValue() = ABI.makeICertificateQuery(pointer.getPointer(0))

    public fun setValue(value: ICertificateQuery_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateQuery {
    public val __533244767_Ptr: Pointer?

    public val _533244767_VtblPtr: Pointer?
      get() = __533244767_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnhancedKeyUsages(): IVector<String?>? {
      val fnPtr = _533244767_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IssuerName(): String? {
      val fnPtr = _533244767_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_IssuerName(value: String?): Unit {
      val fnPtr = _533244767_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _533244767_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_FriendlyName(value: String?): Unit {
      val fnPtr = _533244767_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Thumbprint(): Array<Byte>? {
      val fnPtr = _533244767_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Thumbprint(value: Array<Byte>): Unit {
      val fnPtr = _533244767_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr, value.size,marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_HardwareOnly(): Boolean {
      val fnPtr = _533244767_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_HardwareOnly(value: Boolean): Unit {
      val fnPtr = _533244767_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__533244767_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICertificateQuery_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __533244767_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateQuery, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b082a31a7284916b5eeffcb8acf2417")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateQuery(ptr: Pointer?): WithDefault = ICertificateQuery_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateQuery {
      val address = segment.toRawLongValue()
      return makeICertificateQuery(Pointer(address))
    }

    public override fun toNative(obj: ICertificateQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__533244767_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateQuery): Array<ICertificateQuery?> = (elements
        as Array<ICertificateQuery?>).castToImpl<ICertificateQuery,ICertificateQuery_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateQuery?> =
        arrayOfNulls<ICertificateQuery_Impl>(size) as Array<ICertificateQuery?>
  }
}
