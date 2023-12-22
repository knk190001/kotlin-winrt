package Windows.Devices.Bluetooth.Background

import Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristic
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattCharacteristicNotificationTriggerDetails.ABI::class)
@Signature("{9ba03b18-0fec-436a-93b1-f46c697532a2}")
@Guid("9ba03b180fec436a93b1f46c697532a2")
@WinRTInterface("9ba03b180fec436a93b1f46c697532a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicNotificationTriggerDetails.ByReference::class)
public interface IGattCharacteristicNotificationTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Characteristic(): GattCharacteristic?

  @InterfaceMethod(1)
  public fun get_Value(): IBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicNotificationTriggerDetails> {
    public override fun getValue() =
        ABI.makeIGattCharacteristicNotificationTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicNotificationTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicNotificationTriggerDetails {
    public val __2118105495_Ptr: Pointer?

    public val _2118105495_VtblPtr: Pointer?
      get() = __2118105495_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Characteristic(): GattCharacteristic? {
      val fnPtr = _2118105495_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCharacteristic>()
      val hr = fn.invokeHR(arrayOf(__2118105495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCharacteristic>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): IBuffer? {
      val fnPtr = _2118105495_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__2118105495_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicNotificationTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2118105495_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicNotificationTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9ba03b180fec436a93b1f46c697532a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicNotificationTriggerDetails(ptr: Pointer?): WithDefault =
        IGattCharacteristicNotificationTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGattCharacteristicNotificationTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicNotificationTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicNotificationTriggerDetails): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2118105495_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicNotificationTriggerDetails):
        Array<IGattCharacteristicNotificationTriggerDetails?> = (elements as
        Array<IGattCharacteristicNotificationTriggerDetails?>).castToImpl<IGattCharacteristicNotificationTriggerDetails,IGattCharacteristicNotificationTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicNotificationTriggerDetails?> =
        arrayOfNulls<IGattCharacteristicNotificationTriggerDetails_Impl>(size) as
        Array<IGattCharacteristicNotificationTriggerDetails?>
  }
}
