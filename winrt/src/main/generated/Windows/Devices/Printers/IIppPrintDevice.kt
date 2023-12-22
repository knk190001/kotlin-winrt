package Windows.Devices.Printers

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.Foundation.Uri
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

@ABIMarker(IIppPrintDevice.ABI::class)
@Signature("{d748ac56-76f3-5dc6-afd4-c2a8686b9359}")
@Guid("d748ac5676f35dc6afd4c2a8686b9359")
@WinRTInterface("d748ac5676f35dc6afd4c2a8686b9359")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIppPrintDevice.ByReference::class)
public interface IIppPrintDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrinterName(): String?

  @InterfaceMethod(1)
  public fun get_PrinterUri(): Uri?

  @InterfaceMethod(2)
  public fun GetPrinterAttributesAsBuffer(attributeNames: IIterable<String?>?): IBuffer?

  @InterfaceMethod(3)
  public fun GetPrinterAttributes(attributeNames: IIterable<String?>?): IMap<String?,
      IppAttributeValue?>?

  @InterfaceMethod(4)
  public fun SetPrinterAttributesFromBuffer(printerAttributesBuffer: IBuffer?):
      IppSetAttributesResult?

  @InterfaceMethod(5)
  public fun SetPrinterAttributes(printerAttributes: IIterable<IKeyValuePair<String?,
      IppAttributeValue?>?>?): IppSetAttributesResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIppPrintDevice> {
    public override fun getValue() = ABI.makeIIppPrintDevice(pointer.getPointer(0))

    public fun setValue(value: IIppPrintDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIppPrintDevice {
    public val __86898062_Ptr: Pointer?

    public val _86898062_VtblPtr: Pointer?
      get() = __86898062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrinterName(): String? {
      val fnPtr = _86898062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__86898062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PrinterUri(): Uri? {
      val fnPtr = _86898062_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__86898062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetPrinterAttributesAsBuffer(attributeNames: IIterable<String?>?):
        IBuffer? {
      val fnPtr = _86898062_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__86898062_Ptr, marshalToNative(attributeNames), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetPrinterAttributes(attributeNames: IIterable<String?>?): IMap<String?,
        IppAttributeValue?>? {
      val fnPtr = _86898062_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, IppAttributeValue?>>()
      val hr = fn.invokeHR(arrayOf(__86898062_Ptr, marshalToNative(attributeNames), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, IppAttributeValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetPrinterAttributesFromBuffer(printerAttributesBuffer: IBuffer?):
        IppSetAttributesResult? {
      val fnPtr = _86898062_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppSetAttributesResult>()
      val hr = fn.invokeHR(arrayOf(__86898062_Ptr, marshalToNative(printerAttributesBuffer),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppSetAttributesResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetPrinterAttributes(printerAttributes: IIterable<IKeyValuePair<String?,
        IppAttributeValue?>?>?): IppSetAttributesResult? {
      val fnPtr = _86898062_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppSetAttributesResult>()
      val hr = fn.invokeHR(arrayOf(__86898062_Ptr, marshalToNative(printerAttributes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppSetAttributesResult>(result.getValue())
      return resultValue
    }
  }

  public class IIppPrintDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __86898062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIppPrintDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d748ac5676f35dc6afd4c2a8686b9359")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIppPrintDevice(ptr: Pointer?): WithDefault = IIppPrintDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIppPrintDevice {
      val address = segment.toRawLongValue()
      return makeIIppPrintDevice(Pointer(address))
    }

    public override fun toNative(obj: IIppPrintDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__86898062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIppPrintDevice): Array<IIppPrintDevice?> = (elements as
        Array<IIppPrintDevice?>).castToImpl<IIppPrintDevice,IIppPrintDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIppPrintDevice?> =
        arrayOfNulls<IIppPrintDevice_Impl>(size) as Array<IIppPrintDevice?>
  }
}
