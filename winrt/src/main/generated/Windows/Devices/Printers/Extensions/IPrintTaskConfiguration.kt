package Windows.Devices.Printers.Extensions

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IPrintTaskConfiguration.ABI::class)
@Signature("{e3c22451-3aa4-4885-9240-311f5f8fbe9d}")
@Guid("e3c224513aa448859240311f5f8fbe9d")
@WinRTInterface("e3c224513aa448859240311f5f8fbe9d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintTaskConfiguration.ByReference::class)
public interface IPrintTaskConfiguration : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrinterExtensionContext(): IUnknown?

  @InterfaceMethod(1)
  public fun add_SaveRequested(eventHandler: TypedEventHandler<PrintTaskConfiguration?,
      PrintTaskConfigurationSaveRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_SaveRequested(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintTaskConfiguration> {
    public override fun getValue() = ABI.makeIPrintTaskConfiguration(pointer.getPointer(0))

    public fun setValue(value: IPrintTaskConfiguration_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintTaskConfiguration {
    public val __728774528_Ptr: Pointer?

    public val _728774528_VtblPtr: Pointer?
      get() = __728774528_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrinterExtensionContext(): IUnknown? {
      val fnPtr = _728774528_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__728774528_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_SaveRequested(eventHandler: TypedEventHandler<PrintTaskConfiguration?,
        PrintTaskConfigurationSaveRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _728774528_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__728774528_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_SaveRequested(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _728774528_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__728774528_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintTaskConfiguration_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __728774528_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintTaskConfiguration, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3c224513aa448859240311f5f8fbe9d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintTaskConfiguration(ptr: Pointer?): WithDefault =
        IPrintTaskConfiguration_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintTaskConfiguration {
      val address = segment.toRawLongValue()
      return makeIPrintTaskConfiguration(Pointer(address))
    }

    public override fun toNative(obj: IPrintTaskConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__728774528_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintTaskConfiguration): Array<IPrintTaskConfiguration?>
        = (elements as
        Array<IPrintTaskConfiguration?>).castToImpl<IPrintTaskConfiguration,IPrintTaskConfiguration_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintTaskConfiguration?> =
        arrayOfNulls<IPrintTaskConfiguration_Impl>(size) as Array<IPrintTaskConfiguration?>
  }
}
