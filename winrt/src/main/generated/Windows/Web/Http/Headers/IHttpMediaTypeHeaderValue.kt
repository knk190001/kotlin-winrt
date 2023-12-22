package Windows.Web.Http.Headers

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

@ABIMarker(IHttpMediaTypeHeaderValue.ABI::class)
@Signature("{16b28533-e728-4fcb-bdb0-08a431a14844}")
@Guid("16b28533e7284fcbbdb008a431a14844")
@WinRTInterface("16b28533e7284fcbbdb008a431a14844")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMediaTypeHeaderValue.ByReference::class)
public interface IHttpMediaTypeHeaderValue : NativeMapped, IWinRTInterface {
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMediaTypeHeaderValue> {
    public override fun getValue() = ABI.makeIHttpMediaTypeHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpMediaTypeHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMediaTypeHeaderValue {
    public val __1704769614_Ptr: Pointer?

    public val _1704769614_VtblPtr: Pointer?
      get() = __1704769614_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CharSet(): String? {
      val fnPtr = _1704769614_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1704769614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CharSet(value: String?): Unit {
      val fnPtr = _1704769614_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1704769614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MediaType(): String? {
      val fnPtr = _1704769614_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1704769614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_MediaType(value: String?): Unit {
      val fnPtr = _1704769614_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1704769614_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Parameters(): IVector<HttpNameValueHeaderValue?>? {
      val fnPtr = _1704769614_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HttpNameValueHeaderValue?>>()
      val hr = fn.invokeHR(arrayOf(__1704769614_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HttpNameValueHeaderValue?>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpMediaTypeHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1704769614_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMediaTypeHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16b28533e7284fcbbdb008a431a14844")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMediaTypeHeaderValue(ptr: Pointer?): WithDefault =
        IHttpMediaTypeHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMediaTypeHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpMediaTypeHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpMediaTypeHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1704769614_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMediaTypeHeaderValue):
        Array<IHttpMediaTypeHeaderValue?> = (elements as
        Array<IHttpMediaTypeHeaderValue?>).castToImpl<IHttpMediaTypeHeaderValue,IHttpMediaTypeHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMediaTypeHeaderValue?> =
        arrayOfNulls<IHttpMediaTypeHeaderValue_Impl>(size) as Array<IHttpMediaTypeHeaderValue?>
  }
}
