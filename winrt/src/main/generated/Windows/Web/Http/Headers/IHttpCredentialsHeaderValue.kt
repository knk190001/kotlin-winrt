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

@ABIMarker(IHttpCredentialsHeaderValue.ABI::class)
@Signature("{c34cc3cb-542e-4177-a6c7-b674ce193fbf}")
@Guid("c34cc3cb542e4177a6c7b674ce193fbf")
@WinRTInterface("c34cc3cb542e4177a6c7b674ce193fbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCredentialsHeaderValue.ByReference::class)
public interface IHttpCredentialsHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Parameters(): IVector<HttpNameValueHeaderValue?>?

  @InterfaceMethod(1)
  public fun get_Scheme(): String?

  @InterfaceMethod(2)
  public fun get_Token(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCredentialsHeaderValue> {
    public override fun getValue() = ABI.makeIHttpCredentialsHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpCredentialsHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCredentialsHeaderValue {
    public val __1236768820_Ptr: Pointer?

    public val _1236768820_VtblPtr: Pointer?
      get() = __1236768820_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Parameters(): IVector<HttpNameValueHeaderValue?>? {
      val fnPtr = _1236768820_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HttpNameValueHeaderValue?>>()
      val hr = fn.invokeHR(arrayOf(__1236768820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HttpNameValueHeaderValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Scheme(): String? {
      val fnPtr = _1236768820_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1236768820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Token(): String? {
      val fnPtr = _1236768820_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1236768820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHttpCredentialsHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1236768820_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCredentialsHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c34cc3cb542e4177a6c7b674ce193fbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCredentialsHeaderValue(ptr: Pointer?): WithDefault =
        IHttpCredentialsHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpCredentialsHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpCredentialsHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpCredentialsHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1236768820_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCredentialsHeaderValue):
        Array<IHttpCredentialsHeaderValue?> = (elements as
        Array<IHttpCredentialsHeaderValue?>).castToImpl<IHttpCredentialsHeaderValue,IHttpCredentialsHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCredentialsHeaderValue?> =
        arrayOfNulls<IHttpCredentialsHeaderValue_Impl>(size) as Array<IHttpCredentialsHeaderValue?>
  }
}
