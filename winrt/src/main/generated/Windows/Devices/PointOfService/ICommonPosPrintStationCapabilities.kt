package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ICommonPosPrintStationCapabilities.ABI::class)
@Signature("{de5b52ca-e02e-40e9-9e5e-1b488e6aacfc}")
@Guid("de5b52cae02e40e99e5e1b488e6aacfc")
@WinRTInterface("de5b52cae02e40e99e5e1b488e6aacfc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommonPosPrintStationCapabilities.ByReference::class)
public interface ICommonPosPrintStationCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsPrinterPresent(): Boolean

  @InterfaceMethod(1)
  public fun get_IsDualColorSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_ColorCartridgeCapabilities(): PosPrinterColorCapabilities?

  @InterfaceMethod(3)
  public fun get_CartridgeSensors(): PosPrinterCartridgeSensors?

  @InterfaceMethod(4)
  public fun get_IsBoldSupported(): Boolean

  @InterfaceMethod(5)
  public fun get_IsItalicSupported(): Boolean

  @InterfaceMethod(6)
  public fun get_IsUnderlineSupported(): Boolean

  @InterfaceMethod(7)
  public fun get_IsDoubleHighPrintSupported(): Boolean

  @InterfaceMethod(8)
  public fun get_IsDoubleWidePrintSupported(): Boolean

  @InterfaceMethod(9)
  public fun get_IsDoubleHighDoubleWidePrintSupported(): Boolean

  @InterfaceMethod(10)
  public fun get_IsPaperEmptySensorSupported(): Boolean

  @InterfaceMethod(11)
  public fun get_IsPaperNearEndSensorSupported(): Boolean

  @InterfaceMethod(12)
  public fun get_SupportedCharactersPerLine(): IVectorView<WinDef.UINT>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommonPosPrintStationCapabilities> {
    public override fun getValue() =
        ABI.makeICommonPosPrintStationCapabilities(pointer.getPointer(0))

    public fun setValue(value: ICommonPosPrintStationCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommonPosPrintStationCapabilities {
    public val __1582834329_Ptr: Pointer?

    public val _1582834329_VtblPtr: Pointer?
      get() = __1582834329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsPrinterPresent(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsDualColorSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ColorCartridgeCapabilities(): PosPrinterColorCapabilities? {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterColorCapabilities>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterColorCapabilities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CartridgeSensors(): PosPrinterCartridgeSensors? {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterCartridgeSensors>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterCartridgeSensors>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsBoldSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_IsItalicSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_IsUnderlineSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsDoubleHighPrintSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_IsDoubleWidePrintSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsDoubleHighDoubleWidePrintSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_IsPaperEmptySensorSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_IsPaperNearEndSensorSupported(): Boolean {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_SupportedCharactersPerLine(): IVectorView<WinDef.UINT>? {
      val fnPtr = _1582834329_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1582834329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }
  }

  public class ICommonPosPrintStationCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1582834329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommonPosPrintStationCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de5b52cae02e40e99e5e1b488e6aacfc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommonPosPrintStationCapabilities(ptr: Pointer?): WithDefault =
        ICommonPosPrintStationCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommonPosPrintStationCapabilities {
      val address = segment.toRawLongValue()
      return makeICommonPosPrintStationCapabilities(Pointer(address))
    }

    public override fun toNative(obj: ICommonPosPrintStationCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1582834329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommonPosPrintStationCapabilities):
        Array<ICommonPosPrintStationCapabilities?> = (elements as
        Array<ICommonPosPrintStationCapabilities?>).castToImpl<ICommonPosPrintStationCapabilities,ICommonPosPrintStationCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommonPosPrintStationCapabilities?> =
        arrayOfNulls<ICommonPosPrintStationCapabilities_Impl>(size) as
        Array<ICommonPosPrintStationCapabilities?>
  }
}
