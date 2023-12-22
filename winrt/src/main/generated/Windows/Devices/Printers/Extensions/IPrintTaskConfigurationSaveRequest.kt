package Windows.Devices.Printers.Extensions

import Windows.Foundation.DateTime
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintTaskConfigurationSaveRequest.ABI::class)
@Signature("{eeaf2fcb-621e-4b62-ac77-b281cce08d60}")
@Guid("eeaf2fcb621e4b62ac77b281cce08d60")
@WinRTInterface("eeaf2fcb621e4b62ac77b281cce08d60")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskConfigurationSaveRequest.ByReference::class)
public interface IPrintTaskConfigurationSaveRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Cancel(): Unit

  @InterfaceMethod(1)
  public fun Save(printerExtensionContext: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): PrintTaskConfigurationSaveRequestedDeferral?

  @InterfaceMethod(3)
  public fun get_Deadline(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskConfigurationSaveRequest> {
    public override fun getValue() =
        ABI.makeIPrintTaskConfigurationSaveRequest(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskConfigurationSaveRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskConfigurationSaveRequest {
    public val __533549746_Ptr: Pointer?

    public val _533549746_VtblPtr: Pointer?
      get() = __533549746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Cancel(): Unit {
      val fnPtr = _533549746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__533549746_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Save(printerExtensionContext: IUnknown?): Unit {
      val fnPtr = _533549746_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__533549746_Ptr, marshalToNative(printerExtensionContext),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): PrintTaskConfigurationSaveRequestedDeferral? {
      val fnPtr = _533549746_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTaskConfigurationSaveRequestedDeferral>()
      val hr = fn.invokeHR(arrayOf(__533549746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<PrintTaskConfigurationSaveRequestedDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _533549746_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__533549746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IPrintTaskConfigurationSaveRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __533549746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskConfigurationSaveRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eeaf2fcb621e4b62ac77b281cce08d60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskConfigurationSaveRequest(ptr: Pointer?): WithDefault =
        IPrintTaskConfigurationSaveRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskConfigurationSaveRequest {
      val address = segment.toRawLongValue()
      return makeIPrintTaskConfigurationSaveRequest(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskConfigurationSaveRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__533549746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskConfigurationSaveRequest):
        Array<IPrintTaskConfigurationSaveRequest?> = (elements as
        Array<IPrintTaskConfigurationSaveRequest?>).castToImpl<IPrintTaskConfigurationSaveRequest,IPrintTaskConfigurationSaveRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskConfigurationSaveRequest?> =
        arrayOfNulls<IPrintTaskConfigurationSaveRequest_Impl>(size) as
        Array<IPrintTaskConfigurationSaveRequest?>
  }
}
