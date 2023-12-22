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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpProductHeaderValueStatics.ABI::class)
@Signature("{90c33e29-befc-4337-be62-49f097975f53}")
@Guid("90c33e29befc4337be6249f097975f53")
@WinRTInterface("90c33e29befc4337be6249f097975f53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpProductHeaderValueStatics.ByReference::class)
public interface IHttpProductHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpProductHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      productHeaderValue: Windows.Web.Http.Headers.HttpProductHeaderValue.ByReference?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpProductHeaderValueStatics> {
    public override fun getValue() = ABI.makeIHttpProductHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpProductHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpProductHeaderValueStatics {
    public val __1028110884_Ptr: Pointer?

    public val _1028110884_VtblPtr: Pointer?
      get() = __1028110884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpProductHeaderValue? {
      val fnPtr = _1028110884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpProductHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1028110884_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpProductHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        productHeaderValue: Windows.Web.Http.Headers.HttpProductHeaderValue.ByReference?): Boolean {
      val fnPtr = _1028110884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1028110884_Ptr, marshalToNative(input),
          marshalToNative(productHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpProductHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1028110884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpProductHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90c33e29befc4337be6249f097975f53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpProductHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpProductHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpProductHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpProductHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpProductHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1028110884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpProductHeaderValueStatics):
        Array<IHttpProductHeaderValueStatics?> = (elements as
        Array<IHttpProductHeaderValueStatics?>).castToImpl<IHttpProductHeaderValueStatics,IHttpProductHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpProductHeaderValueStatics?> =
        arrayOfNulls<IHttpProductHeaderValueStatics_Impl>(size) as
        Array<IHttpProductHeaderValueStatics?>
  }
}
