package Windows.Web.Http

import Windows.Foundation.HResult
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IHttpGetInputStreamResult.ABI::class)
@Signature("{d5d63463-13aa-4ee0-be95-a0c39fe91203}")
@Guid("d5d6346313aa4ee0be95a0c39fe91203")
@WinRTInterface("d5d6346313aa4ee0be95a0c39fe91203")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpGetInputStreamResult.ByReference::class)
public interface IHttpGetInputStreamResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(1)
  public fun get_RequestMessage(): HttpRequestMessage?

  @InterfaceMethod(2)
  public fun get_ResponseMessage(): HttpResponseMessage?

  @InterfaceMethod(3)
  public fun get_Succeeded(): Boolean

  @InterfaceMethod(4)
  public fun get_Value(): IInputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpGetInputStreamResult> {
    public override fun getValue() = ABI.makeIHttpGetInputStreamResult(pointer.getPointer(0))

    public fun setValue(value: IHttpGetInputStreamResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpGetInputStreamResult {
    public val __609828949_Ptr: Pointer?

    public val _609828949_VtblPtr: Pointer?
      get() = __609828949_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _609828949_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__609828949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestMessage(): HttpRequestMessage? {
      val fnPtr = _609828949_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestMessage>()
      val hr = fn.invokeHR(arrayOf(__609828949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ResponseMessage(): HttpResponseMessage? {
      val fnPtr = _609828949_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__609828949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _609828949_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__609828949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Value(): IInputStream? {
      val fnPtr = _609828949_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IInputStream>()
      val hr = fn.invokeHR(arrayOf(__609828949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IInputStream>(result.getValue())
      return resultValue
    }
  }

  public class IHttpGetInputStreamResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __609828949_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpGetInputStreamResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5d6346313aa4ee0be95a0c39fe91203")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpGetInputStreamResult(ptr: Pointer?): WithDefault =
        IHttpGetInputStreamResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpGetInputStreamResult {
      val address = segment.toRawLongValue()
      return makeIHttpGetInputStreamResult(Pointer(address))
    }

    public override fun toNative(obj: IHttpGetInputStreamResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__609828949_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpGetInputStreamResult):
        Array<IHttpGetInputStreamResult?> = (elements as
        Array<IHttpGetInputStreamResult?>).castToImpl<IHttpGetInputStreamResult,IHttpGetInputStreamResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpGetInputStreamResult?> =
        arrayOfNulls<IHttpGetInputStreamResult_Impl>(size) as Array<IHttpGetInputStreamResult?>
  }
}
