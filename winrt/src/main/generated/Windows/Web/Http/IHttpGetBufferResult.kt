package Windows.Web.Http

import Windows.Foundation.HResult
import Windows.Storage.Streams.IBuffer
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpGetBufferResult.ABI::class)
@Signature("{53d08e7c-e209-404e-9a49-742d8236fd3a}")
@Guid("53d08e7ce209404e9a49742d8236fd3a")
@WinRTInterface("53d08e7ce209404e9a49742d8236fd3a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpGetBufferResult.ByReference::class)
public interface IHttpGetBufferResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(1)
  public fun get_RequestMessage(): HttpRequestMessage?

  @InterfaceMethod(2)
  public fun get_ResponseMessage(): HttpResponseMessage?

  @InterfaceMethod(3)
  public fun get_Succeeded(): Boolean

  @InterfaceMethod(4)
  public fun get_Value(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpGetBufferResult> {
    public override fun getValue() = ABI.makeIHttpGetBufferResult(pointer.getPointer(0))

    public fun setValue(value: IHttpGetBufferResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpGetBufferResult {
    public val __1481045007_Ptr: Pointer?

    public val _1481045007_VtblPtr: Pointer?
      get() = __1481045007_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1481045007_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1481045007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestMessage(): HttpRequestMessage? {
      val fnPtr = _1481045007_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestMessage>()
      val hr = fn.invokeHR(arrayOf(__1481045007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ResponseMessage(): HttpResponseMessage? {
      val fnPtr = _1481045007_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__1481045007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _1481045007_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1481045007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Value(): IBuffer? {
      val fnPtr = _1481045007_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1481045007_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IHttpGetBufferResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1481045007_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpGetBufferResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53d08e7ce209404e9a49742d8236fd3a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpGetBufferResult(ptr: Pointer?): WithDefault = IHttpGetBufferResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpGetBufferResult {
      val address = segment.toRawLongValue()
      return makeIHttpGetBufferResult(Pointer(address))
    }

    public override fun toNative(obj: IHttpGetBufferResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1481045007_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpGetBufferResult): Array<IHttpGetBufferResult?> =
        (elements as
        Array<IHttpGetBufferResult?>).castToImpl<IHttpGetBufferResult,IHttpGetBufferResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpGetBufferResult?> =
        arrayOfNulls<IHttpGetBufferResult_Impl>(size) as Array<IHttpGetBufferResult?>
  }
}
