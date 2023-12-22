package Windows.Devices.HumanInterfaceDevice

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IHidDevice.ABI::class)
@Signature("{5f8a14e7-2200-432e-95da-d09b87d574a8}")
@Guid("5f8a14e72200432e95dad09b87d574a8")
@WinRTInterface("5f8a14e72200432e95dad09b87d574a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidDevice.ByReference::class)
public interface IHidDevice : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun get_VendorId(): WinDef.USHORT

  @InterfaceMethod(1)
  public fun get_ProductId(): WinDef.USHORT

  @InterfaceMethod(2)
  public fun get_Version(): WinDef.USHORT

  @InterfaceMethod(3)
  public fun get_UsagePage(): WinDef.USHORT

  @InterfaceMethod(4)
  public fun get_UsageId(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun GetInputReportAsync(): IAsyncOperation<HidInputReport?>?

  @InterfaceMethod(6)
  public fun GetInputReportAsync(reportId: WinDef.USHORT): IAsyncOperation<HidInputReport?>?

  @InterfaceMethod(7)
  public fun GetFeatureReportAsync(): IAsyncOperation<HidFeatureReport?>?

  @InterfaceMethod(8)
  public fun GetFeatureReportAsync(reportId: WinDef.USHORT): IAsyncOperation<HidFeatureReport?>?

  @InterfaceMethod(9)
  public fun CreateOutputReport(): HidOutputReport?

  @InterfaceMethod(10)
  public fun CreateOutputReport(reportId: WinDef.USHORT): HidOutputReport?

  @InterfaceMethod(11)
  public fun CreateFeatureReport(): HidFeatureReport?

  @InterfaceMethod(12)
  public fun CreateFeatureReport(reportId: WinDef.USHORT): HidFeatureReport?

  @InterfaceMethod(13)
  public fun SendOutputReportAsync(outputReport: HidOutputReport?): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(14)
  public fun SendFeatureReportAsync(featureReport: HidFeatureReport?): IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(15)
  public fun GetBooleanControlDescriptions(
    reportType: HidReportType?,
    usagePage: WinDef.USHORT,
    usageId: WinDef.USHORT
  ): IVectorView<HidBooleanControlDescription?>?

  @InterfaceMethod(16)
  public fun GetNumericControlDescriptions(
    reportType: HidReportType?,
    usagePage: WinDef.USHORT,
    usageId: WinDef.USHORT
  ): IVectorView<HidNumericControlDescription?>?

  @InterfaceMethod(17)
  public fun add_InputReportReceived(reportHandler: TypedEventHandler<HidDevice?,
      HidInputReportReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(18)
  public fun remove_InputReportReceived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHidDevice> {
    public override fun getValue() = ABI.makeIHidDevice(pointer.getPointer(0))

    public fun setValue(value: IHidDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidDevice, IClosable.WithDefault {
    public val __977888178_Ptr: Pointer?

    public val _977888178_VtblPtr: Pointer?
      get() = __977888178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_VendorId(): WinDef.USHORT {
      val fnPtr = _977888178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ProductId(): WinDef.USHORT {
      val fnPtr = _977888178_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Version(): WinDef.USHORT {
      val fnPtr = _977888178_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_UsagePage(): WinDef.USHORT {
      val fnPtr = _977888178_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_UsageId(): WinDef.USHORT {
      val fnPtr = _977888178_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetInputReportAsync(): IAsyncOperation<HidInputReport?>? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HidInputReport?>>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HidInputReport?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetInputReportAsync(reportId: WinDef.USHORT):
        IAsyncOperation<HidInputReport?>? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HidInputReport?>>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, reportId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HidInputReport?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetFeatureReportAsync(): IAsyncOperation<HidFeatureReport?>? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HidFeatureReport?>>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HidFeatureReport?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetFeatureReportAsync(reportId: WinDef.USHORT):
        IAsyncOperation<HidFeatureReport?>? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HidFeatureReport?>>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, reportId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HidFeatureReport?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateOutputReport(): HidOutputReport? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidOutputReport>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidOutputReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun CreateOutputReport(reportId: WinDef.USHORT): HidOutputReport? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidOutputReport>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, reportId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidOutputReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun CreateFeatureReport(): HidFeatureReport? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidFeatureReport>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidFeatureReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun CreateFeatureReport(reportId: WinDef.USHORT): HidFeatureReport? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidFeatureReport>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, reportId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidFeatureReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun SendOutputReportAsync(outputReport: HidOutputReport?):
        IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, marshalToNative(outputReport), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun SendFeatureReportAsync(featureReport: HidFeatureReport?):
        IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, marshalToNative(featureReport), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetBooleanControlDescriptions(
      reportType: HidReportType?,
      usagePage: WinDef.USHORT,
      usageId: WinDef.USHORT
    ): IVectorView<HidBooleanControlDescription?>? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HidBooleanControlDescription?>>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, marshalToNative(reportType), usagePage, usageId,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<HidBooleanControlDescription?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun GetNumericControlDescriptions(
      reportType: HidReportType?,
      usagePage: WinDef.USHORT,
      usageId: WinDef.USHORT
    ): IVectorView<HidNumericControlDescription?>? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<HidNumericControlDescription?>>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, marshalToNative(reportType), usagePage, usageId,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<HidNumericControlDescription?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun add_InputReportReceived(reportHandler: TypedEventHandler<HidDevice?,
        HidInputReportReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _977888178_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, marshalToNative(reportHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun remove_InputReportReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _977888178_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__977888178_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHidDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_977888178_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __977888178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f8a14e72200432e95dad09b87d574a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidDevice(ptr: Pointer?): WithDefault = IHidDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidDevice {
      val address = segment.toRawLongValue()
      return makeIHidDevice(Pointer(address))
    }

    public override fun toNative(obj: IHidDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__977888178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidDevice): Array<IHidDevice?> = (elements as
        Array<IHidDevice?>).castToImpl<IHidDevice,IHidDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidDevice?> = arrayOfNulls<IHidDevice_Impl>(size)
        as Array<IHidDevice?>
  }
}
