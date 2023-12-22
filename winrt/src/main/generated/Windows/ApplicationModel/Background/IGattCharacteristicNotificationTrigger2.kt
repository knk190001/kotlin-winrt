package Windows.ApplicationModel.Background

import Windows.Devices.Bluetooth.Background.BluetoothEventTriggeringMode
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

@ABIMarker(IGattCharacteristicNotificationTrigger2.ABI::class)
@Signature("{9322a2c4-ae0e-42f2-b28c-f51372e69245}")
@Guid("9322a2c4ae0e42f2b28cf51372e69245")
@WinRTInterface("9322a2c4ae0e42f2b28cf51372e69245")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicNotificationTrigger2.ByReference::class)
public interface IGattCharacteristicNotificationTrigger2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EventTriggeringMode(): BluetoothEventTriggeringMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicNotificationTrigger2> {
    public override fun getValue() =
        ABI.makeIGattCharacteristicNotificationTrigger2(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicNotificationTrigger2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicNotificationTrigger2 {
    public val __445376875_Ptr: Pointer?

    public val _445376875_VtblPtr: Pointer?
      get() = __445376875_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EventTriggeringMode(): BluetoothEventTriggeringMode? {
      val fnPtr = _445376875_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothEventTriggeringMode>()
      val hr = fn.invokeHR(arrayOf(__445376875_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothEventTriggeringMode>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicNotificationTrigger2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445376875_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicNotificationTrigger2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9322a2c4ae0e42f2b28cf51372e69245")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicNotificationTrigger2(ptr: Pointer?): WithDefault =
        IGattCharacteristicNotificationTrigger2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGattCharacteristicNotificationTrigger2 {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicNotificationTrigger2(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicNotificationTrigger2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445376875_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicNotificationTrigger2):
        Array<IGattCharacteristicNotificationTrigger2?> = (elements as
        Array<IGattCharacteristicNotificationTrigger2?>).castToImpl<IGattCharacteristicNotificationTrigger2,IGattCharacteristicNotificationTrigger2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicNotificationTrigger2?> =
        arrayOfNulls<IGattCharacteristicNotificationTrigger2_Impl>(size) as
        Array<IGattCharacteristicNotificationTrigger2?>
  }
}
