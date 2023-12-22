package Windows.Web.Http.Headers

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IReference
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpMediaTypeWithQualityHeaderValue.ABI::class)
@Signature("{188d5e32-76be-44a0-b1cd-2074bded2dde}")
@Guid("188d5e3276be44a0b1cd2074bded2dde")
@WinRTInterface("188d5e3276be44a0b1cd2074bded2dde")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMediaTypeWithQualityHeaderValue.ByReference::class)
public interface IHttpMediaTypeWithQualityHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CharSet(): String?

  @InterfaceMethod(1)
  public fun put_CharSet(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_MediaType(): String?

  @InterfaceMethod(3)
  public fun put_MediaType(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Parameters(): IVector<HttpNameValueHeaderValue?>?

  @InterfaceMethod(5)
  public fun get_Quality(): IReference<Double>?

  @InterfaceMethod(6)
  public fun put_Quality(value: IReference<Double>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMediaTypeWithQualityHeaderValue> {
    public override fun getValue() =
        ABI.makeIHttpMediaTypeWithQualityHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpMediaTypeWithQualityHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMediaTypeWithQualityHeaderValue {
    public val __126554685_Ptr: Pointer?

    public val _126554685_VtblPtr: Pointer?
      get() = __126554685_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CharSet(): String? {
      val fnPtr = _126554685_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__126554685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CharSet(value: String?): Unit {
      val fnPtr = _126554685_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126554685_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MediaType(): String? {
      val fnPtr = _126554685_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__126554685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MediaType(value: String?): Unit {
      val fnPtr = _126554685_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126554685_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Parameters(): IVector<HttpNameValueHeaderValue?>? {
      val fnPtr = _126554685_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HttpNameValueHeaderValue?>>()
      val hr = fn.invokeHR(arrayOf(__126554685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HttpNameValueHeaderValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Quality(): IReference<Double>? {
      val fnPtr = _126554685_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__126554685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_Quality(value: IReference<Double>?): Unit {
      val fnPtr = _126554685_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__126554685_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpMediaTypeWithQualityHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __126554685_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMediaTypeWithQualityHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("188d5e3276be44a0b1cd2074bded2dde")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMediaTypeWithQualityHeaderValue(ptr: Pointer?): WithDefault =
        IHttpMediaTypeWithQualityHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMediaTypeWithQualityHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpMediaTypeWithQualityHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpMediaTypeWithQualityHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__126554685_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMediaTypeWithQualityHeaderValue):
        Array<IHttpMediaTypeWithQualityHeaderValue?> = (elements as
        Array<IHttpMediaTypeWithQualityHeaderValue?>).castToImpl<IHttpMediaTypeWithQualityHeaderValue,IHttpMediaTypeWithQualityHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMediaTypeWithQualityHeaderValue?> =
        arrayOfNulls<IHttpMediaTypeWithQualityHeaderValue_Impl>(size) as
        Array<IHttpMediaTypeWithQualityHeaderValue?>
  }
}
