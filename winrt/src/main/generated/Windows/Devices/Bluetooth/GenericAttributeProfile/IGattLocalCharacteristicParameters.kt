package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IGattLocalCharacteristicParameters.ABI::class)
@Signature("{faf73db4-4cff-44c7-8445-040e6ead0063}")
@Guid("faf73db44cff44c78445040e6ead0063")
@WinRTInterface("faf73db44cff44c78445040e6ead0063")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattLocalCharacteristicParameters.ByReference::class)
public interface IGattLocalCharacteristicParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_StaticValue(value: IBuffer?): Unit

  @InterfaceMethod(1)
  public fun get_StaticValue(): IBuffer?

  @InterfaceMethod(2)
  public fun put_CharacteristicProperties(value: GattCharacteristicProperties?): Unit

  @InterfaceMethod(3)
  public fun get_CharacteristicProperties(): GattCharacteristicProperties?

  @InterfaceMethod(4)
  public fun put_ReadProtectionLevel(value: GattProtectionLevel?): Unit

  @InterfaceMethod(5)
  public fun get_ReadProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(6)
  public fun put_WriteProtectionLevel(value: GattProtectionLevel?): Unit

  @InterfaceMethod(7)
  public fun get_WriteProtectionLevel(): GattProtectionLevel?

  @InterfaceMethod(8)
  public fun put_UserDescription(value: String?): Unit

  @InterfaceMethod(9)
  public fun get_UserDescription(): String?

  @InterfaceMethod(10)
  public fun get_PresentationFormats(): IVector<GattPresentationFormat?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattLocalCharacteristicParameters> {
    public override fun getValue() =
        ABI.makeIGattLocalCharacteristicParameters(pointer.getPointer(0))

    public fun setValue(value: IGattLocalCharacteristicParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattLocalCharacteristicParameters {
    public val __2105004437_Ptr: Pointer?

    public val _2105004437_VtblPtr: Pointer?
      get() = __2105004437_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_StaticValue(value: IBuffer?): Unit {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_StaticValue(): IBuffer? {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_CharacteristicProperties(value: GattCharacteristicProperties?): Unit {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_CharacteristicProperties(): GattCharacteristicProperties? {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCharacteristicProperties>()
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCharacteristicProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ReadProtectionLevel(value: GattProtectionLevel?): Unit {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ReadProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_WriteProtectionLevel(value: GattProtectionLevel?): Unit {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_WriteProtectionLevel(): GattProtectionLevel? {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattProtectionLevel>()
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattProtectionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_UserDescription(value: String?): Unit {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_UserDescription(): String? {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_PresentationFormats(): IVector<GattPresentationFormat?>? {
      val fnPtr = _2105004437_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<GattPresentationFormat?>>()
      val hr = fn.invokeHR(arrayOf(__2105004437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<GattPresentationFormat?>>(result.getValue())
      return resultValue
    }
  }

  public class IGattLocalCharacteristicParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2105004437_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattLocalCharacteristicParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("faf73db44cff44c78445040e6ead0063")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattLocalCharacteristicParameters(ptr: Pointer?): WithDefault =
        IGattLocalCharacteristicParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattLocalCharacteristicParameters {
      val address = segment.toRawLongValue()
      return makeIGattLocalCharacteristicParameters(Pointer(address))
    }

    public override fun toNative(obj: IGattLocalCharacteristicParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2105004437_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattLocalCharacteristicParameters):
        Array<IGattLocalCharacteristicParameters?> = (elements as
        Array<IGattLocalCharacteristicParameters?>).castToImpl<IGattLocalCharacteristicParameters,IGattLocalCharacteristicParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattLocalCharacteristicParameters?> =
        arrayOfNulls<IGattLocalCharacteristicParameters_Impl>(size) as
        Array<IGattLocalCharacteristicParameters?>
  }
}
