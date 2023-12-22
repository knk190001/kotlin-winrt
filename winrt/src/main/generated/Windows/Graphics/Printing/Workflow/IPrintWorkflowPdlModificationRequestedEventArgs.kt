package Windows.Graphics.Printing.Workflow

import Windows.Devices.Printers.IppAttributeValue
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Deferral
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintWorkflowPdlModificationRequestedEventArgs.ABI::class)
@Signature("{1a339a61-2e13-5edd-a707-ceec61d7333b}")
@Guid("1a339a612e135edda707ceec61d7333b")
@WinRTInterface("1a339a612e135edda707ceec61d7333b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowPdlModificationRequestedEventArgs.ByReference::class)
public interface IPrintWorkflowPdlModificationRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Configuration(): PrintWorkflowConfiguration?

  @InterfaceMethod(1)
  public fun get_PrinterJob(): PrintWorkflowPrinterJob?

  @InterfaceMethod(2)
  public fun get_SourceContent(): PrintWorkflowPdlSourceContent?

  @InterfaceMethod(3)
  public fun get_UILauncher(): PrintWorkflowUILauncher?

  @InterfaceMethod(4)
  public fun CreateJobOnPrinter(targetContentType: String?): PrintWorkflowPdlTargetStream?

  @InterfaceMethod(5)
  public fun CreateJobOnPrinterWithAttributes(jobAttributes: IIterable<IKeyValuePair<String?,
      IppAttributeValue?>?>?, targetContentType: String?): PrintWorkflowPdlTargetStream?

  @InterfaceMethod(6)
  public fun CreateJobOnPrinterWithAttributesBuffer(jobAttributesBuffer: IBuffer?,
      targetContentType: String?): PrintWorkflowPdlTargetStream?

  @InterfaceMethod(7)
  public fun GetPdlConverter(conversionType: PrintWorkflowPdlConversionType?):
      PrintWorkflowPdlConverter?

  @InterfaceMethod(8)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowPdlModificationRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowPdlModificationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowPdlModificationRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowPdlModificationRequestedEventArgs {
    public val __1788532806_Ptr: Pointer?

    public val _1788532806_VtblPtr: Pointer?
      get() = __1788532806_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Configuration(): PrintWorkflowConfiguration? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrinterJob(): PrintWorkflowPrinterJob? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowPrinterJob>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowPrinterJob>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SourceContent(): PrintWorkflowPdlSourceContent? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowPdlSourceContent>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowPdlSourceContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_UILauncher(): PrintWorkflowUILauncher? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowUILauncher>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowUILauncher>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateJobOnPrinter(targetContentType: String?):
        PrintWorkflowPdlTargetStream? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowPdlTargetStream>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr, marshalToNative(targetContentType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowPdlTargetStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override
        fun CreateJobOnPrinterWithAttributes(jobAttributes: IIterable<IKeyValuePair<String?,
        IppAttributeValue?>?>?, targetContentType: String?): PrintWorkflowPdlTargetStream? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowPdlTargetStream>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr, marshalToNative(jobAttributes),
          marshalToNative(targetContentType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowPdlTargetStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateJobOnPrinterWithAttributesBuffer(jobAttributesBuffer: IBuffer?,
        targetContentType: String?): PrintWorkflowPdlTargetStream? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowPdlTargetStream>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr, marshalToNative(jobAttributesBuffer),
          marshalToNative(targetContentType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowPdlTargetStream>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetPdlConverter(conversionType: PrintWorkflowPdlConversionType?):
        PrintWorkflowPdlConverter? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowPdlConverter>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr, marshalToNative(conversionType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowPdlConverter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1788532806_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1788532806_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowPdlModificationRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1788532806_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowPdlModificationRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a339a612e135edda707ceec61d7333b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowPdlModificationRequestedEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowPdlModificationRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintWorkflowPdlModificationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowPdlModificationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowPdlModificationRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1788532806_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowPdlModificationRequestedEventArgs):
        Array<IPrintWorkflowPdlModificationRequestedEventArgs?> = (elements as
        Array<IPrintWorkflowPdlModificationRequestedEventArgs?>).castToImpl<IPrintWorkflowPdlModificationRequestedEventArgs,IPrintWorkflowPdlModificationRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowPdlModificationRequestedEventArgs?>
        = arrayOfNulls<IPrintWorkflowPdlModificationRequestedEventArgs_Impl>(size) as
        Array<IPrintWorkflowPdlModificationRequestedEventArgs?>
  }
}
