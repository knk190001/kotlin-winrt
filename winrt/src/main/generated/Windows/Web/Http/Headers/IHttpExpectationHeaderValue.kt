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

@ABIMarker(IHttpExpectationHeaderValue.ABI::class)
@Signature("{4ce585cd-3a99-43af-a2e6-ec232fea9658}")
@Guid("4ce585cd3a9943afa2e6ec232fea9658")
@WinRTInterface("4ce585cd3a9943afa2e6ec232fea9658")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpExpectationHeaderValue.ByReference::class)
public interface IHttpExpectationHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Value(): String?

  @InterfaceMethod(2)
  public fun put_Value(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Parameters(): IVector<HttpNameValueHeaderValue?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpExpectationHeaderValue> {
    public override fun getValue() = ABI.makeIHttpExpectationHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpExpectationHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpExpectationHeaderValue {
    public val __1855449868_Ptr: Pointer?

    public val _1855449868_VtblPtr: Pointer?
      get() = __1855449868_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1855449868_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1855449868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _1855449868_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1855449868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Value(value: String?): Unit {
      val fnPtr = _1855449868_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1855449868_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Parameters(): IVector<HttpNameValueHeaderValue?>? {
      val fnPtr = _1855449868_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HttpNameValueHeaderValue?>>()
      val hr = fn.invokeHR(arrayOf(__1855449868_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HttpNameValueHeaderValue?>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpExpectationHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1855449868_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpExpectationHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ce585cd3a9943afa2e6ec232fea9658")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpExpectationHeaderValue(ptr: Pointer?): WithDefault =
        IHttpExpectationHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpExpectationHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpExpectationHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpExpectationHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1855449868_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpExpectationHeaderValue):
        Array<IHttpExpectationHeaderValue?> = (elements as
        Array<IHttpExpectationHeaderValue?>).castToImpl<IHttpExpectationHeaderValue,IHttpExpectationHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpExpectationHeaderValue?> =
        arrayOfNulls<IHttpExpectationHeaderValue_Impl>(size) as Array<IHttpExpectationHeaderValue?>
  }
}
