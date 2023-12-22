package Windows.Graphics.Printing.Workflow

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

@ABIMarker(IPrintWorkflowJobNotificationEventArgs.ABI::class)
@Signature("{0ae16fba-5398-5eba-b472-978650186a9a}")
@Guid("0ae16fba53985ebab472978650186a9a")
@WinRTInterface("0ae16fba53985ebab472978650186a9a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowJobNotificationEventArgs.ByReference::class)
public interface IPrintWorkflowJobNotificationEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Configuration(): PrintWorkflowConfiguration?

  @InterfaceMethod(1)
  public fun get_PrinterJob(): PrintWorkflowPrinterJob?

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowJobNotificationEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowJobNotificationEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowJobNotificationEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowJobNotificationEventArgs {
    public val __1913557618_Ptr: Pointer?

    public val _1913557618_VtblPtr: Pointer?
      get() = __1913557618_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Configuration(): PrintWorkflowConfiguration? {
      val fnPtr = _1913557618_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1913557618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrinterJob(): PrintWorkflowPrinterJob? {
      val fnPtr = _1913557618_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowPrinterJob>()
      val hr = fn.invokeHR(arrayOf(__1913557618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowPrinterJob>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1913557618_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1913557618_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowJobNotificationEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1913557618_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowJobNotificationEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ae16fba53985ebab472978650186a9a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowJobNotificationEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowJobNotificationEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowJobNotificationEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowJobNotificationEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowJobNotificationEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1913557618_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowJobNotificationEventArgs):
        Array<IPrintWorkflowJobNotificationEventArgs?> = (elements as
        Array<IPrintWorkflowJobNotificationEventArgs?>).castToImpl<IPrintWorkflowJobNotificationEventArgs,IPrintWorkflowJobNotificationEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowJobNotificationEventArgs?> =
        arrayOfNulls<IPrintWorkflowJobNotificationEventArgs_Impl>(size) as
        Array<IPrintWorkflowJobNotificationEventArgs?>
  }
}
