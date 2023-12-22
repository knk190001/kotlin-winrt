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

@ABIMarker(IPrint3DWorkflow2.ABI::class)
@Signature("{a2a6c54f-8ac1-4918-9741-e34f3004239e}")
@Guid("a2a6c54f8ac149189741e34f3004239e")
@WinRTInterface("a2a6c54f8ac149189741e34f3004239e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrint3DWorkflow2.ByReference::class)
public interface IPrint3DWorkflow2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PrinterChanged(eventHandler: TypedEventHandler<Print3DWorkflow?,
      Print3DWorkflowPrinterChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PrinterChanged(eventCookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrint3DWorkflow2> {
    public override fun getValue() = ABI.makeIPrint3DWorkflow2(pointer.getPointer(0))

    public fun setValue(value: IPrint3DWorkflow2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrint3DWorkflow2 {
    public val __1030496337_Ptr: Pointer?

    public val _1030496337_VtblPtr: Pointer?
      get() = __1030496337_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_PrinterChanged(eventHandler: TypedEventHandler<Print3DWorkflow?,
        Print3DWorkflowPrinterChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1030496337_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1030496337_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PrinterChanged(eventCookie: EventRegistrationToken?): Unit {
      val fnPtr = _1030496337_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1030496337_Ptr, marshalToNative(eventCookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrint3DWorkflow2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1030496337_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrint3DWorkflow2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a2a6c54f8ac149189741e34f3004239e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrint3DWorkflow2(ptr: Pointer?): WithDefault = IPrint3DWorkflow2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrint3DWorkflow2 {
      val address = segment.toRawLongValue()
      return makeIPrint3DWorkflow2(Pointer(address))
    }

    public override fun toNative(obj: IPrint3DWorkflow2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1030496337_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrint3DWorkflow2): Array<IPrint3DWorkflow2?> = (elements
        as Array<IPrint3DWorkflow2?>).castToImpl<IPrint3DWorkflow2,IPrint3DWorkflow2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrint3DWorkflow2?> =
        arrayOfNulls<IPrint3DWorkflow2_Impl>(size) as Array<IPrint3DWorkflow2?>
  }
}
