package Windows.Graphics.Printing

import Windows.Foundation.DateTime
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

@ABIMarker(IPrintTaskRequest.ABI::class)
@Signature("{6ff61e2e-2722-4240-a67c-f364849a17f3}")
@Guid("6ff61e2e27224240a67cf364849a17f3")
@WinRTInterface("6ff61e2e27224240a67cf364849a17f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskRequest.ByReference::class)
public interface IPrintTaskRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Deadline(): DateTime?

  @InterfaceMethod(1)
  public fun CreatePrintTask(title: String?, handler: PrintTaskSourceRequestedHandler?): PrintTask?

  @InterfaceMethod(2)
  public fun GetDeferral(): PrintTaskRequestedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskRequest> {
    public override fun getValue() = ABI.makeIPrintTaskRequest(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskRequest {
    public val __2091607833_Ptr: Pointer?

    public val _2091607833_VtblPtr: Pointer?
      get() = __2091607833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _2091607833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2091607833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreatePrintTask(title: String?, handler: PrintTaskSourceRequestedHandler?):
        PrintTask? {
      val fnPtr = _2091607833_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTask>()
      val hr = fn.invokeHR(arrayOf(__2091607833_Ptr, marshalToNative(title),
          marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTask>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): PrintTaskRequestedDeferral? {
      val fnPtr = _2091607833_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskRequestedDeferral>()
      val hr = fn.invokeHR(arrayOf(__2091607833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTaskRequestedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2091607833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6ff61e2e27224240a67cf364849a17f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskRequest(ptr: Pointer?): WithDefault = IPrintTaskRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskRequest {
      val address = segment.toRawLongValue()
      return makeIPrintTaskRequest(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2091607833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskRequest): Array<IPrintTaskRequest?> = (elements
        as Array<IPrintTaskRequest?>).castToImpl<IPrintTaskRequest,IPrintTaskRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskRequest?> =
        arrayOfNulls<IPrintTaskRequest_Impl>(size) as Array<IPrintTaskRequest?>
  }
}
