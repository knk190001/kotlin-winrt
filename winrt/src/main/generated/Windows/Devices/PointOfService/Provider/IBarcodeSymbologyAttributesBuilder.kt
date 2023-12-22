package Windows.Devices.PointOfService.Provider

import Windows.Devices.PointOfService.BarcodeSymbologyAttributes
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBarcodeSymbologyAttributesBuilder.ABI::class)
@Signature("{c57b0cbf-e4f5-40b9-84cf-e63fbaea42b4}")
@Guid("c57b0cbfe4f540b984cfe63fbaea42b4")
@WinRTInterface("c57b0cbfe4f540b984cfe63fbaea42b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeSymbologyAttributesBuilder.ByReference::class)
public interface IBarcodeSymbologyAttributesBuilder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCheckDigitValidationSupported(): Boolean

  @InterfaceMethod(1)
  public fun put_IsCheckDigitValidationSupported(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsCheckDigitTransmissionSupported(): Boolean

  @InterfaceMethod(3)
  public fun put_IsCheckDigitTransmissionSupported(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_IsDecodeLengthSupported(): Boolean

  @InterfaceMethod(5)
  public fun put_IsDecodeLengthSupported(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun CreateAttributes(): BarcodeSymbologyAttributes?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeSymbologyAttributesBuilder> {
    public override fun getValue() =
        ABI.makeIBarcodeSymbologyAttributesBuilder(pointer.getPointer(0))

    public fun setValue(value: IBarcodeSymbologyAttributesBuilder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeSymbologyAttributesBuilder {
    public val __1485496647_Ptr: Pointer?

    public val _1485496647_VtblPtr: Pointer?
      get() = __1485496647_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCheckDigitValidationSupported(): Boolean {
      val fnPtr = _1485496647_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1485496647_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsCheckDigitValidationSupported(value: Boolean): Unit {
      val fnPtr = _1485496647_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1485496647_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCheckDigitTransmissionSupported(): Boolean {
      val fnPtr = _1485496647_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1485496647_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsCheckDigitTransmissionSupported(value: Boolean): Unit {
      val fnPtr = _1485496647_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1485496647_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsDecodeLengthSupported(): Boolean {
      val fnPtr = _1485496647_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1485496647_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsDecodeLengthSupported(value: Boolean): Unit {
      val fnPtr = _1485496647_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1485496647_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun CreateAttributes(): BarcodeSymbologyAttributes? {
      val fnPtr = _1485496647_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeSymbologyAttributes>()
      val hr = fn.invokeHR(arrayOf(__1485496647_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeSymbologyAttributes>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeSymbologyAttributesBuilder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1485496647_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeSymbologyAttributesBuilder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c57b0cbfe4f540b984cfe63fbaea42b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeSymbologyAttributesBuilder(ptr: Pointer?): WithDefault =
        IBarcodeSymbologyAttributesBuilder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeSymbologyAttributesBuilder {
      val address = segment.toRawLongValue()
      return makeIBarcodeSymbologyAttributesBuilder(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeSymbologyAttributesBuilder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1485496647_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeSymbologyAttributesBuilder):
        Array<IBarcodeSymbologyAttributesBuilder?> = (elements as
        Array<IBarcodeSymbologyAttributesBuilder?>).castToImpl<IBarcodeSymbologyAttributesBuilder,IBarcodeSymbologyAttributesBuilder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeSymbologyAttributesBuilder?> =
        arrayOfNulls<IBarcodeSymbologyAttributesBuilder_Impl>(size) as
        Array<IBarcodeSymbologyAttributesBuilder?>
  }
}
