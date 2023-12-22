package Windows.Devices.PointOfService

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPosPrinterCapabilities.ABI::class)
@Signature("{cde95721-4380-4985-adc5-39db30cd93bc}")
@Guid("cde9572143804985adc539db30cd93bc")
@WinRTInterface("cde9572143804985adc539db30cd93bc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinterCapabilities.ByReference::class)
public interface IPosPrinterCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PowerReportingType(): UnifiedPosPowerReportingType?

  @InterfaceMethod(1)
  public fun get_IsStatisticsReportingSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_IsStatisticsUpdatingSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_DefaultCharacterSet(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_HasCoverSensor(): Boolean

  @InterfaceMethod(5)
  public fun get_CanMapCharacterSet(): Boolean

  @InterfaceMethod(6)
  public fun get_IsTransactionSupported(): Boolean

  @InterfaceMethod(7)
  public fun get_Receipt(): ReceiptPrinterCapabilities?

  @InterfaceMethod(8)
  public fun get_Slip(): SlipPrinterCapabilities?

  @InterfaceMethod(9)
  public fun get_Journal(): JournalPrinterCapabilities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPosPrinterCapabilities> {
    public override fun getValue() = ABI.makeIPosPrinterCapabilities(pointer.getPointer(0))

    public fun setValue(value: IPosPrinterCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinterCapabilities {
    public val __1339063259_Ptr: Pointer?

    public val _1339063259_VtblPtr: Pointer?
      get() = __1339063259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PowerReportingType(): UnifiedPosPowerReportingType? {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnifiedPosPowerReportingType>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnifiedPosPowerReportingType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsStatisticsReportingSupported(): Boolean {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_IsStatisticsUpdatingSupported(): Boolean {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DefaultCharacterSet(): WinDef.UINT {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_HasCoverSensor(): Boolean {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_CanMapCharacterSet(): Boolean {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsTransactionSupported(): Boolean {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_Receipt(): ReceiptPrinterCapabilities? {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ReceiptPrinterCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ReceiptPrinterCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_Slip(): SlipPrinterCapabilities? {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SlipPrinterCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SlipPrinterCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Journal(): JournalPrinterCapabilities? {
      val fnPtr = _1339063259_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<JournalPrinterCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1339063259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<JournalPrinterCapabilities>(result.getValue())
      return resultValue
    }
  }

  public class IPosPrinterCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1339063259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinterCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cde9572143804985adc539db30cd93bc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinterCapabilities(ptr: Pointer?): WithDefault =
        IPosPrinterCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinterCapabilities {
      val address = segment.toRawLongValue()
      return makeIPosPrinterCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinterCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1339063259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinterCapabilities): Array<IPosPrinterCapabilities?>
        = (elements as
        Array<IPosPrinterCapabilities?>).castToImpl<IPosPrinterCapabilities,IPosPrinterCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinterCapabilities?> =
        arrayOfNulls<IPosPrinterCapabilities_Impl>(size) as Array<IPosPrinterCapabilities?>
  }
}
