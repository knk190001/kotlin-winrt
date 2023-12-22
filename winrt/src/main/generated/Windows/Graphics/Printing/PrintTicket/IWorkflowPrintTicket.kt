package Windows.Graphics.Printing.PrintTicket

import Windows.Data.Xml.Dom.IXmlNode
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IWorkflowPrintTicket.ABI::class)
@Signature("{41d52285-35e8-448e-a8c5-e4b6a2cf826c}")
@Guid("41d5228535e8448ea8c5e4b6a2cf826c")
@WinRTInterface("41d5228535e8448ea8c5e4b6a2cf826c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWorkflowPrintTicket.ByReference::class)
public interface IWorkflowPrintTicket : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_XmlNamespace(): String?

  @InterfaceMethod(2)
  public fun get_XmlNode(): IXmlNode?

  @InterfaceMethod(3)
  public fun GetCapabilities(): PrintTicketCapabilities?

  @InterfaceMethod(4)
  public fun get_DocumentBindingFeature(): PrintTicketFeature?

  @InterfaceMethod(5)
  public fun get_DocumentCollateFeature(): PrintTicketFeature?

  @InterfaceMethod(6)
  public fun get_DocumentDuplexFeature(): PrintTicketFeature?

  @InterfaceMethod(7)
  public fun get_DocumentHolePunchFeature(): PrintTicketFeature?

  @InterfaceMethod(8)
  public fun get_DocumentInputBinFeature(): PrintTicketFeature?

  @InterfaceMethod(9)
  public fun get_DocumentNUpFeature(): PrintTicketFeature?

  @InterfaceMethod(10)
  public fun get_DocumentStapleFeature(): PrintTicketFeature?

  @InterfaceMethod(11)
  public fun get_JobPasscodeFeature(): PrintTicketFeature?

  @InterfaceMethod(12)
  public fun get_PageBorderlessFeature(): PrintTicketFeature?

  @InterfaceMethod(13)
  public fun get_PageMediaSizeFeature(): PrintTicketFeature?

  @InterfaceMethod(14)
  public fun get_PageMediaTypeFeature(): PrintTicketFeature?

  @InterfaceMethod(15)
  public fun get_PageOrientationFeature(): PrintTicketFeature?

  @InterfaceMethod(16)
  public fun get_PageOutputColorFeature(): PrintTicketFeature?

  @InterfaceMethod(17)
  public fun get_PageOutputQualityFeature(): PrintTicketFeature?

  @InterfaceMethod(18)
  public fun get_PageResolutionFeature(): PrintTicketFeature?

  @InterfaceMethod(19)
  public fun GetFeature(name: String?, xmlNamespace: String?): PrintTicketFeature?

  @InterfaceMethod(20)
  public fun NotifyXmlChangedAsync(): IAsyncAction?

  @InterfaceMethod(21)
  public fun ValidateAsync(): IAsyncOperation<WorkflowPrintTicketValidationResult?>?

  @InterfaceMethod(22)
  public fun GetParameterInitializer(name: String?, xmlNamespace: String?):
      PrintTicketParameterInitializer?

  @InterfaceMethod(23)
  public fun SetParameterInitializerAsInteger(
    name: String?,
    xmlNamespace: String?,
    integerValue: Int
  ): PrintTicketParameterInitializer?

  @InterfaceMethod(24)
  public fun SetParameterInitializerAsString(
    name: String?,
    xmlNamespace: String?,
    stringValue: String?
  ): PrintTicketParameterInitializer?

  @InterfaceMethod(25)
  public fun MergeAndValidateTicket(deltaShemaTicket: WorkflowPrintTicket?): WorkflowPrintTicket?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWorkflowPrintTicket> {
    public override fun getValue() = ABI.makeIWorkflowPrintTicket(pointer.getPointer(0))

    public fun setValue(value: IWorkflowPrintTicket_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWorkflowPrintTicket {
    public val __911599273_Ptr: Pointer?

    public val _911599273_VtblPtr: Pointer?
      get() = __911599273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_XmlNamespace(): String? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_XmlNode(): IXmlNode? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetCapabilities(): PrintTicketCapabilities? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketCapabilities>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DocumentBindingFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DocumentCollateFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DocumentDuplexFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_DocumentHolePunchFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_DocumentInputBinFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_DocumentNUpFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_DocumentStapleFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_JobPasscodeFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_PageBorderlessFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_PageMediaSizeFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_PageMediaTypeFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_PageOrientationFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_PageOutputColorFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_PageOutputQualityFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_PageResolutionFeature(): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetFeature(name: String?, xmlNamespace: String?): PrintTicketFeature? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketFeature>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr, marshalToNative(name),
          marshalToNative(xmlNamespace), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketFeature>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun NotifyXmlChangedAsync(): IAsyncAction? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun ValidateAsync(): IAsyncOperation<WorkflowPrintTicketValidationResult?>? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WorkflowPrintTicketValidationResult?>>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<WorkflowPrintTicketValidationResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(22)
    public override fun GetParameterInitializer(name: String?, xmlNamespace: String?):
        PrintTicketParameterInitializer? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketParameterInitializer>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr, marshalToNative(name),
          marshalToNative(xmlNamespace), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketParameterInitializer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(23)
    public override fun SetParameterInitializerAsInteger(
      name: String?,
      xmlNamespace: String?,
      integerValue: Int
    ): PrintTicketParameterInitializer? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketParameterInitializer>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr, marshalToNative(name),
          marshalToNative(xmlNamespace), integerValue, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketParameterInitializer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(24)
    public override fun SetParameterInitializerAsString(
      name: String?,
      xmlNamespace: String?,
      stringValue: String?
    ): PrintTicketParameterInitializer? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintTicketParameterInitializer>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr, marshalToNative(name),
          marshalToNative(xmlNamespace), marshalToNative(stringValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintTicketParameterInitializer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(25)
    public override fun MergeAndValidateTicket(deltaShemaTicket: WorkflowPrintTicket?):
        WorkflowPrintTicket? {
      val fnPtr = _911599273_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WorkflowPrintTicket>()
      val hr = fn.invokeHR(arrayOf(__911599273_Ptr, marshalToNative(deltaShemaTicket), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WorkflowPrintTicket>(result.getValue())
      return resultValue
    }
  }

  public class IWorkflowPrintTicket_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __911599273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWorkflowPrintTicket, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41d5228535e8448ea8c5e4b6a2cf826c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWorkflowPrintTicket(ptr: Pointer?): WithDefault = IWorkflowPrintTicket_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWorkflowPrintTicket {
      val address = segment.toRawLongValue()
      return makeIWorkflowPrintTicket(Pointer(address))
    }

    public override fun toNative(obj: IWorkflowPrintTicket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__911599273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWorkflowPrintTicket): Array<IWorkflowPrintTicket?> =
        (elements as
        Array<IWorkflowPrintTicket?>).castToImpl<IWorkflowPrintTicket,IWorkflowPrintTicket_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWorkflowPrintTicket?> =
        arrayOfNulls<IWorkflowPrintTicket_Impl>(size) as Array<IWorkflowPrintTicket?>
  }
}
