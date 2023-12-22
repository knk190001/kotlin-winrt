package Windows.Web.Http.Headers

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

@ABIMarker(IHttpNameValueHeaderValue.ABI::class)
@Signature("{d8ba7463-5b9a-4d1b-93f9-aa5b44ecfddf}")
@Guid("d8ba74635b9a4d1b93f9aa5b44ecfddf")
@WinRTInterface("d8ba74635b9a4d1b93f9aa5b44ecfddf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpNameValueHeaderValue.ByReference::class)
public interface IHttpNameValueHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Value(): String?

  @InterfaceMethod(2)
  public fun put_Value(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpNameValueHeaderValue> {
    public override fun getValue() = ABI.makeIHttpNameValueHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpNameValueHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpNameValueHeaderValue {
    public val __16831050_Ptr: Pointer?

    public val _16831050_VtblPtr: Pointer?
      get() = __16831050_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _16831050_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__16831050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _16831050_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__16831050_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Value(value: String?): Unit {
      val fnPtr = _16831050_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__16831050_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpNameValueHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __16831050_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpNameValueHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d8ba74635b9a4d1b93f9aa5b44ecfddf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpNameValueHeaderValue(ptr: Pointer?): WithDefault =
        IHttpNameValueHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpNameValueHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpNameValueHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpNameValueHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__16831050_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpNameValueHeaderValue):
        Array<IHttpNameValueHeaderValue?> = (elements as
        Array<IHttpNameValueHeaderValue?>).castToImpl<IHttpNameValueHeaderValue,IHttpNameValueHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpNameValueHeaderValue?> =
        arrayOfNulls<IHttpNameValueHeaderValue_Impl>(size) as Array<IHttpNameValueHeaderValue?>
  }
}
