package Windows.Graphics.Printing.Workflow

import Windows.Devices.Printers.IppPrintDevice
import Windows.Foundation.Deferral
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

@ABIMarker(IPrintWorkflowJobStartingEventArgs.ABI::class)
@Signature("{e3d99ba8-31ad-5e09-b0d7-601b97f161ad}")
@Guid("e3d99ba831ad5e09b0d7601b97f161ad")
@WinRTInterface("e3d99ba831ad5e09b0d7601b97f161ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowJobStartingEventArgs.ByReference::class)
public interface IPrintWorkflowJobStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Configuration(): PrintWorkflowConfiguration?

  @InterfaceMethod(1)
  public fun get_Printer(): IppPrintDevice?

  @InterfaceMethod(2)
  public fun SetSkipSystemRendering(): Unit

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowJobStartingEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowJobStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowJobStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowJobStartingEventArgs {
    public val __554312259_Ptr: Pointer?

    public val _554312259_VtblPtr: Pointer?
      get() = __554312259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Configuration(): PrintWorkflowConfiguration? {
      val fnPtr = _554312259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowConfiguration>()
      val hr = fn.invokeHR(arrayOf(__554312259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Printer(): IppPrintDevice? {
      val fnPtr = _554312259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppPrintDevice>()
      val hr = fn.invokeHR(arrayOf(__554312259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppPrintDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetSkipSystemRendering(): Unit {
      val fnPtr = _554312259_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__554312259_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _554312259_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__554312259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowJobStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __554312259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowJobStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3d99ba831ad5e09b0d7601b97f161ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowJobStartingEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowJobStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowJobStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowJobStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowJobStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__554312259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowJobStartingEventArgs):
        Array<IPrintWorkflowJobStartingEventArgs?> = (elements as
        Array<IPrintWorkflowJobStartingEventArgs?>).castToImpl<IPrintWorkflowJobStartingEventArgs,IPrintWorkflowJobStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowJobStartingEventArgs?> =
        arrayOfNulls<IPrintWorkflowJobStartingEventArgs_Impl>(size) as
        Array<IPrintWorkflowJobStartingEventArgs?>
  }
}
