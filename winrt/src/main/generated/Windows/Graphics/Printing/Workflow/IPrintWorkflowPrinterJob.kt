package Windows.Graphics.Printing.Workflow

import Windows.Devices.Printers.IppAttributeValue
import Windows.Devices.Printers.IppPrintDevice
import Windows.Devices.Printers.IppSetAttributesResult
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.Graphics.Printing.PrintTicket.WorkflowPrintTicket
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

@ABIMarker(IPrintWorkflowPrinterJob.ABI::class)
@Signature("{12009f94-0d14-5443-bc09-250311ce570b}")
@Guid("12009f940d145443bc09250311ce570b")
@WinRTInterface("12009f940d145443bc09250311ce570b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowPrinterJob.ByReference::class)
public interface IPrintWorkflowPrinterJob : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_JobId(): Int

  @InterfaceMethod(1)
  public fun get_Printer(): IppPrintDevice?

  @InterfaceMethod(2)
  public fun GetJobStatus(): PrintWorkflowPrinterJobStatus?

  @InterfaceMethod(3)
  public fun GetJobPrintTicket(): WorkflowPrintTicket?

  @InterfaceMethod(4)
  public fun GetJobAttributesAsBuffer(attributeNames: IIterable<String?>?): IBuffer?

  @InterfaceMethod(5)
  public fun GetJobAttributes(attributeNames: IIterable<String?>?): IMap<String?,
      IppAttributeValue?>?

  @InterfaceMethod(6)
  public fun SetJobAttributesFromBuffer(jobAttributesBuffer: IBuffer?): IppSetAttributesResult?

  @InterfaceMethod(7)
  public fun SetJobAttributes(jobAttributes: IIterable<IKeyValuePair<String?,
      IppAttributeValue?>?>?): IppSetAttributesResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowPrinterJob> {
    public override fun getValue() = ABI.makeIPrintWorkflowPrinterJob(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowPrinterJob_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowPrinterJob {
    public val __803177786_Ptr: Pointer?

    public val _803177786_VtblPtr: Pointer?
      get() = __803177786_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_JobId(): Int {
      val fnPtr = _803177786_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__803177786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Printer(): IppPrintDevice? {
      val fnPtr = _803177786_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppPrintDevice>()
      val hr = fn.invokeHR(arrayOf(__803177786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppPrintDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetJobStatus(): PrintWorkflowPrinterJobStatus? {
      val fnPtr = _803177786_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowPrinterJobStatus>()
      val hr = fn.invokeHR(arrayOf(__803177786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowPrinterJobStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetJobPrintTicket(): WorkflowPrintTicket? {
      val fnPtr = _803177786_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WorkflowPrintTicket>()
      val hr = fn.invokeHR(arrayOf(__803177786_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WorkflowPrintTicket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetJobAttributesAsBuffer(attributeNames: IIterable<String?>?): IBuffer? {
      val fnPtr = _803177786_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__803177786_Ptr, marshalToNative(attributeNames), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetJobAttributes(attributeNames: IIterable<String?>?): IMap<String?,
        IppAttributeValue?>? {
      val fnPtr = _803177786_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, IppAttributeValue?>>()
      val hr = fn.invokeHR(arrayOf(__803177786_Ptr, marshalToNative(attributeNames), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, IppAttributeValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SetJobAttributesFromBuffer(jobAttributesBuffer: IBuffer?):
        IppSetAttributesResult? {
      val fnPtr = _803177786_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppSetAttributesResult>()
      val hr = fn.invokeHR(arrayOf(__803177786_Ptr, marshalToNative(jobAttributesBuffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppSetAttributesResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun SetJobAttributes(jobAttributes: IIterable<IKeyValuePair<String?,
        IppAttributeValue?>?>?): IppSetAttributesResult? {
      val fnPtr = _803177786_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppSetAttributesResult>()
      val hr = fn.invokeHR(arrayOf(__803177786_Ptr, marshalToNative(jobAttributes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppSetAttributesResult>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowPrinterJob_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __803177786_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowPrinterJob, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12009f940d145443bc09250311ce570b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowPrinterJob(ptr: Pointer?): WithDefault =
        IPrintWorkflowPrinterJob_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowPrinterJob {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowPrinterJob(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowPrinterJob): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__803177786_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowPrinterJob):
        Array<IPrintWorkflowPrinterJob?> = (elements as
        Array<IPrintWorkflowPrinterJob?>).castToImpl<IPrintWorkflowPrinterJob,IPrintWorkflowPrinterJob_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowPrinterJob?> =
        arrayOfNulls<IPrintWorkflowPrinterJob_Impl>(size) as Array<IPrintWorkflowPrinterJob?>
  }
}
