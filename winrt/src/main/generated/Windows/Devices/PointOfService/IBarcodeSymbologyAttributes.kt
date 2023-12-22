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

@ABIMarker(IBarcodeSymbologyAttributes.ABI::class)
@Signature("{66413a78-ab7a-4ada-8ece-936014b2ead7}")
@Guid("66413a78ab7a4ada8ece936014b2ead7")
@WinRTInterface("66413a78ab7a4ada8ece936014b2ead7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeSymbologyAttributes.ByReference::class)
public interface IBarcodeSymbologyAttributes : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCheckDigitValidationEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsCheckDigitValidationEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsCheckDigitValidationSupported(): Boolean

  @InterfaceMethod(3)
  public fun get_IsCheckDigitTransmissionEnabled(): Boolean

  @InterfaceMethod(4)
  public fun put_IsCheckDigitTransmissionEnabled(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_IsCheckDigitTransmissionSupported(): Boolean

  @InterfaceMethod(6)
  public fun get_DecodeLength1(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_DecodeLength1(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_DecodeLength2(): WinDef.UINT

  @InterfaceMethod(9)
  public fun put_DecodeLength2(value: WinDef.UINT): Unit

  @InterfaceMethod(10)
  public fun get_DecodeLengthKind(): BarcodeSymbologyDecodeLengthKind?

  @InterfaceMethod(11)
  public fun put_DecodeLengthKind(value: BarcodeSymbologyDecodeLengthKind?): Unit

  @InterfaceMethod(12)
  public fun get_IsDecodeLengthSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeSymbologyAttributes> {
    public override fun getValue() = ABI.makeIBarcodeSymbologyAttributes(pointer.getPointer(0))

    public fun setValue(value: IBarcodeSymbologyAttributes_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeSymbologyAttributes {
    public val __1541652225_Ptr: Pointer?

    public val _1541652225_VtblPtr: Pointer?
      get() = __1541652225_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCheckDigitValidationEnabled(): Boolean {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsCheckDigitValidationEnabled(value: Boolean): Unit {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCheckDigitValidationSupported(): Boolean {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsCheckDigitTransmissionEnabled(): Boolean {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_IsCheckDigitTransmissionEnabled(value: Boolean): Unit {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_IsCheckDigitTransmissionSupported(): Boolean {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_DecodeLength1(): WinDef.UINT {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_DecodeLength1(value: WinDef.UINT): Unit {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_DecodeLength2(): WinDef.UINT {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_DecodeLength2(value: WinDef.UINT): Unit {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DecodeLengthKind(): BarcodeSymbologyDecodeLengthKind? {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeSymbologyDecodeLengthKind>()
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BarcodeSymbologyDecodeLengthKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DecodeLengthKind(value: BarcodeSymbologyDecodeLengthKind?): Unit {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsDecodeLengthSupported(): Boolean {
      val fnPtr = _1541652225_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1541652225_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IBarcodeSymbologyAttributes_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1541652225_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeSymbologyAttributes, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66413a78ab7a4ada8ece936014b2ead7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeSymbologyAttributes(ptr: Pointer?): WithDefault =
        IBarcodeSymbologyAttributes_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBarcodeSymbologyAttributes {
      val address = segment.toRawLongValue()
      return makeIBarcodeSymbologyAttributes(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeSymbologyAttributes): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1541652225_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeSymbologyAttributes):
        Array<IBarcodeSymbologyAttributes?> = (elements as
        Array<IBarcodeSymbologyAttributes?>).castToImpl<IBarcodeSymbologyAttributes,IBarcodeSymbologyAttributes_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBarcodeSymbologyAttributes?> =
        arrayOfNulls<IBarcodeSymbologyAttributes_Impl>(size) as Array<IBarcodeSymbologyAttributes?>
  }
}
