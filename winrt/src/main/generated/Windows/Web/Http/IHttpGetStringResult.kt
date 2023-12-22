package Windows.Web.Http

import Windows.Foundation.HResult
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

@ABIMarker(IHttpGetStringResult.ABI::class)
@Signature("{9bac466d-8509-4775-b16d-8953f47a7f5f}")
@Guid("9bac466d85094775b16d8953f47a7f5f")
@WinRTInterface("9bac466d85094775b16d8953f47a7f5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpGetStringResult.ByReference::class)
public interface IHttpGetStringResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(1)
  public fun get_RequestMessage(): HttpRequestMessage?

  @InterfaceMethod(2)
  public fun get_ResponseMessage(): HttpResponseMessage?

  @InterfaceMethod(3)
  public fun get_Succeeded(): Boolean

  @InterfaceMethod(4)
  public fun get_Value(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpGetStringResult> {
    public override fun getValue() = ABI.makeIHttpGetStringResult(pointer.getPointer(0))

    public fun setValue(value: IHttpGetStringResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpGetStringResult {
    public val __680337632_Ptr: Pointer?

    public val _680337632_VtblPtr: Pointer?
      get() = __680337632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _680337632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__680337632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RequestMessage(): HttpRequestMessage? {
      val fnPtr = _680337632_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpRequestMessage>()
      val hr = fn.invokeHR(arrayOf(__680337632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpRequestMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ResponseMessage(): HttpResponseMessage? {
      val fnPtr = _680337632_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpResponseMessage>()
      val hr = fn.invokeHR(arrayOf(__680337632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpResponseMessage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _680337632_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__680337632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Value(): String? {
      val fnPtr = _680337632_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__680337632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHttpGetStringResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __680337632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpGetStringResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9bac466d85094775b16d8953f47a7f5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpGetStringResult(ptr: Pointer?): WithDefault = IHttpGetStringResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpGetStringResult {
      val address = segment.toRawLongValue()
      return makeIHttpGetStringResult(Pointer(address))
    }

    public override fun toNative(obj: IHttpGetStringResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__680337632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpGetStringResult): Array<IHttpGetStringResult?> =
        (elements as
        Array<IHttpGetStringResult?>).castToImpl<IHttpGetStringResult,IHttpGetStringResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpGetStringResult?> =
        arrayOfNulls<IHttpGetStringResult_Impl>(size) as Array<IHttpGetStringResult?>
  }
}
