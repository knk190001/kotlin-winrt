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

@ABIMarker(IHttpTransferCodingHeaderValueFactory.ABI::class)
@Signature("{bb62dffc-e361-4f08-8e4f-c9e723de703b}")
@Guid("bb62dffce3614f088e4fc9e723de703b")
@WinRTInterface("bb62dffce3614f088e4fc9e723de703b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpTransferCodingHeaderValueFactory.ByReference::class)
public interface IHttpTransferCodingHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(input: String?): HttpTransferCodingHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpTransferCodingHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpTransferCodingHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpTransferCodingHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpTransferCodingHeaderValueFactory {
    public val __1324517241_Ptr: Pointer?

    public val _1324517241_VtblPtr: Pointer?
      get() = __1324517241_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(input: String?): HttpTransferCodingHeaderValue? {
      val fnPtr = _1324517241_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpTransferCodingHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1324517241_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpTransferCodingHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpTransferCodingHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1324517241_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpTransferCodingHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb62dffce3614f088e4fc9e723de703b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpTransferCodingHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpTransferCodingHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpTransferCodingHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpTransferCodingHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpTransferCodingHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1324517241_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpTransferCodingHeaderValueFactory):
        Array<IHttpTransferCodingHeaderValueFactory?> = (elements as
        Array<IHttpTransferCodingHeaderValueFactory?>).castToImpl<IHttpTransferCodingHeaderValueFactory,IHttpTransferCodingHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpTransferCodingHeaderValueFactory?> =
        arrayOfNulls<IHttpTransferCodingHeaderValueFactory_Impl>(size) as
        Array<IHttpTransferCodingHeaderValueFactory?>
  }
}
