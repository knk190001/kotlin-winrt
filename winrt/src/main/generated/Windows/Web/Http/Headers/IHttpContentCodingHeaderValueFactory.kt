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

@ABIMarker(IHttpContentCodingHeaderValueFactory.ABI::class)
@Signature("{c53d2bd7-332b-4350-8510-2e67a2289a5a}")
@Guid("c53d2bd7332b435085102e67a2289a5a")
@WinRTInterface("c53d2bd7332b435085102e67a2289a5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentCodingHeaderValueFactory.ByReference::class)
public interface IHttpContentCodingHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(contentCoding: String?): HttpContentCodingHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentCodingHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpContentCodingHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpContentCodingHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentCodingHeaderValueFactory {
    public val __1673336765_Ptr: Pointer?

    public val _1673336765_VtblPtr: Pointer?
      get() = __1673336765_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(contentCoding: String?): HttpContentCodingHeaderValue? {
      val fnPtr = _1673336765_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpContentCodingHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1673336765_Ptr, marshalToNative(contentCoding), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpContentCodingHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpContentCodingHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1673336765_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentCodingHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c53d2bd7332b435085102e67a2289a5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentCodingHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpContentCodingHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpContentCodingHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpContentCodingHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentCodingHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1673336765_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentCodingHeaderValueFactory):
        Array<IHttpContentCodingHeaderValueFactory?> = (elements as
        Array<IHttpContentCodingHeaderValueFactory?>).castToImpl<IHttpContentCodingHeaderValueFactory,IHttpContentCodingHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpContentCodingHeaderValueFactory?> =
        arrayOfNulls<IHttpContentCodingHeaderValueFactory_Impl>(size) as
        Array<IHttpContentCodingHeaderValueFactory?>
  }
}
