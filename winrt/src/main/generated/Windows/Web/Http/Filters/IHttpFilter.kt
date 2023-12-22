package Windows.Web.Http.Filters

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Web.Http.HttpProgress
import Windows.Web.Http.HttpRequestMessage
import Windows.Web.Http.HttpResponseMessage
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpFilter.ABI::class)
@Signature("{a4cb6dd5-0902-439e-bfd7-e12552b165ce}")
@Guid("a4cb6dd50902439ebfd7e12552b165ce")
@WinRTInterface("a4cb6dd50902439ebfd7e12552b165ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpFilter.ByReference::class)
public interface IHttpFilter : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun SendRequestAsync(request: HttpRequestMessage?):
      IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHttpFilter> {
    public override fun getValue() = ABI.makeIHttpFilter(pointer.getPointer(0))

    public fun setValue(value: IHttpFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpFilter, IClosable.WithDefault {
    public val __143311409_Ptr: Pointer?

    public val _143311409_VtblPtr: Pointer?
      get() = __143311409_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendRequestAsync(request: HttpRequestMessage?):
        IAsyncOperationWithProgress<HttpResponseMessage?, HttpProgress?>? {
      val fnPtr = _143311409_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>()
      val hr = fn.invokeHR(arrayOf(__143311409_Ptr, marshalToNative(request), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<HttpResponseMessage?,
          HttpProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class IHttpFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_143311409_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __143311409_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4cb6dd50902439ebfd7e12552b165ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpFilter(ptr: Pointer?): WithDefault = IHttpFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpFilter {
      val address = segment.toRawLongValue()
      return makeIHttpFilter(Pointer(address))
    }

    public override fun toNative(obj: IHttpFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__143311409_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpFilter): Array<IHttpFilter?> = (elements as
        Array<IHttpFilter?>).castToImpl<IHttpFilter,IHttpFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpFilter?> =
        arrayOfNulls<IHttpFilter_Impl>(size) as Array<IHttpFilter?>
  }
}
