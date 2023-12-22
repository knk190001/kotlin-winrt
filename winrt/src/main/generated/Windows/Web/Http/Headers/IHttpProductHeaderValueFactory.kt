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

@ABIMarker(IHttpProductHeaderValueFactory.ABI::class)
@Signature("{611aa4f5-82bc-42fb-977b-dc00536e5e86}")
@Guid("611aa4f582bc42fb977bdc00536e5e86")
@WinRTInterface("611aa4f582bc42fb977bdc00536e5e86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpProductHeaderValueFactory.ByReference::class)
public interface IHttpProductHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromName(productName: String?): HttpProductHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromNameWithVersion(productName: String?, productVersion: String?):
      HttpProductHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpProductHeaderValueFactory> {
    public override fun getValue() = ABI.makeIHttpProductHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpProductHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpProductHeaderValueFactory {
    public val __1833364329_Ptr: Pointer?

    public val _1833364329_VtblPtr: Pointer?
      get() = __1833364329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromName(productName: String?): HttpProductHeaderValue? {
      val fnPtr = _1833364329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpProductHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1833364329_Ptr, marshalToNative(productName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpProductHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNameWithVersion(productName: String?, productVersion: String?):
        HttpProductHeaderValue? {
      val fnPtr = _1833364329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpProductHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1833364329_Ptr, marshalToNative(productName),
          marshalToNative(productVersion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpProductHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpProductHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1833364329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpProductHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("611aa4f582bc42fb977bdc00536e5e86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpProductHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpProductHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpProductHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpProductHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpProductHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1833364329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpProductHeaderValueFactory):
        Array<IHttpProductHeaderValueFactory?> = (elements as
        Array<IHttpProductHeaderValueFactory?>).castToImpl<IHttpProductHeaderValueFactory,IHttpProductHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpProductHeaderValueFactory?> =
        arrayOfNulls<IHttpProductHeaderValueFactory_Impl>(size) as
        Array<IHttpProductHeaderValueFactory?>
  }
}
