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

@ABIMarker(IHttpProductInfoHeaderValueFactory.ABI::class)
@Signature("{24220fbe-eabe-4464-b460-ec010b7c41e2}")
@Guid("24220fbeeabe4464b460ec010b7c41e2")
@WinRTInterface("24220fbeeabe4464b460ec010b7c41e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpProductInfoHeaderValueFactory.ByReference::class)
public interface IHttpProductInfoHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromComment(productComment: String?): HttpProductInfoHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromNameWithVersion(productName: String?, productVersion: String?):
      HttpProductInfoHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpProductInfoHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpProductInfoHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpProductInfoHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpProductInfoHeaderValueFactory {
    public val __1934372041_Ptr: Pointer?

    public val _1934372041_VtblPtr: Pointer?
      get() = __1934372041_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromComment(productComment: String?): HttpProductInfoHeaderValue? {
      val fnPtr = _1934372041_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpProductInfoHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1934372041_Ptr, marshalToNative(productComment), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpProductInfoHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNameWithVersion(productName: String?, productVersion: String?):
        HttpProductInfoHeaderValue? {
      val fnPtr = _1934372041_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpProductInfoHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1934372041_Ptr, marshalToNative(productName),
          marshalToNative(productVersion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpProductInfoHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpProductInfoHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1934372041_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpProductInfoHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24220fbeeabe4464b460ec010b7c41e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpProductInfoHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpProductInfoHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpProductInfoHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpProductInfoHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpProductInfoHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1934372041_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpProductInfoHeaderValueFactory):
        Array<IHttpProductInfoHeaderValueFactory?> = (elements as
        Array<IHttpProductInfoHeaderValueFactory?>).castToImpl<IHttpProductInfoHeaderValueFactory,IHttpProductInfoHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpProductInfoHeaderValueFactory?> =
        arrayOfNulls<IHttpProductInfoHeaderValueFactory_Impl>(size) as
        Array<IHttpProductInfoHeaderValueFactory?>
  }
}
