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

@ABIMarker(IHttpNameValueHeaderValueFactory.ABI::class)
@Signature("{770e2267-cbf8-4736-a925-93fbe10c7ca8}")
@Guid("770e2267cbf84736a92593fbe10c7ca8")
@WinRTInterface("770e2267cbf84736a92593fbe10c7ca8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpNameValueHeaderValueFactory.ByReference::class)
public interface IHttpNameValueHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromName(name: String?): HttpNameValueHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromNameWithValue(name: String?, value: String?): HttpNameValueHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpNameValueHeaderValueFactory> {
    public override fun getValue() = ABI.makeIHttpNameValueHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpNameValueHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpNameValueHeaderValueFactory {
    public val __1089884320_Ptr: Pointer?

    public val _1089884320_VtblPtr: Pointer?
      get() = __1089884320_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromName(name: String?): HttpNameValueHeaderValue? {
      val fnPtr = _1089884320_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpNameValueHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1089884320_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpNameValueHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNameWithValue(name: String?, value: String?):
        HttpNameValueHeaderValue? {
      val fnPtr = _1089884320_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpNameValueHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1089884320_Ptr, marshalToNative(name), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpNameValueHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpNameValueHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1089884320_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpNameValueHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("770e2267cbf84736a92593fbe10c7ca8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpNameValueHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpNameValueHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpNameValueHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpNameValueHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpNameValueHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1089884320_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpNameValueHeaderValueFactory):
        Array<IHttpNameValueHeaderValueFactory?> = (elements as
        Array<IHttpNameValueHeaderValueFactory?>).castToImpl<IHttpNameValueHeaderValueFactory,IHttpNameValueHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpNameValueHeaderValueFactory?> =
        arrayOfNulls<IHttpNameValueHeaderValueFactory_Impl>(size) as
        Array<IHttpNameValueHeaderValueFactory?>
  }
}
