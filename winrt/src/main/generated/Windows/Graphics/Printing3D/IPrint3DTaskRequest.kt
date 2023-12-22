package Windows.Graphics.Printing3D

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

@ABIMarker(IPrint3DTaskRequest.ABI::class)
@Signature("{2595c46f-2245-4c5a-8731-0d604dc6bc3c}")
@Guid("2595c46f22454c5a87310d604dc6bc3c")
@WinRTInterface("2595c46f22454c5a87310d604dc6bc3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DTaskRequest.ByReference::class)
public interface IPrint3DTaskRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateTask(
    title: String?,
    printerId: String?,
    handler: Print3DTaskSourceRequestedHandler?
  ): Print3DTask?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DTaskRequest> {
    public override fun getValue() = ABI.makeIPrint3DTaskRequest(pointer.getPointer(0))

    public fun setValue(value: IPrint3DTaskRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DTaskRequest {
    public val __562093705_Ptr: Pointer?

    public val _562093705_VtblPtr: Pointer?
      get() = __562093705_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateTask(
      title: String?,
      printerId: String?,
      handler: Print3DTaskSourceRequestedHandler?
    ): Print3DTask? {
      val fnPtr = _562093705_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Print3DTask>()
      val hr = fn.invokeHR(arrayOf(__562093705_Ptr, marshalToNative(title),
          marshalToNative(printerId), marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Print3DTask>(result.getValue())
      return resultValue
    }
  }

  public class IPrint3DTaskRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __562093705_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DTaskRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2595c46f22454c5a87310d604dc6bc3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DTaskRequest(ptr: Pointer?): WithDefault = IPrint3DTaskRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DTaskRequest {
      val address = segment.toRawLongValue()
      return makeIPrint3DTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__562093705_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DTaskRequest): Array<IPrint3DTaskRequest?> =
        (elements as
        Array<IPrint3DTaskRequest?>).castToImpl<IPrint3DTaskRequest,IPrint3DTaskRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DTaskRequest?> =
        arrayOfNulls<IPrint3DTaskRequest_Impl>(size) as Array<IPrint3DTaskRequest?>
  }
}
