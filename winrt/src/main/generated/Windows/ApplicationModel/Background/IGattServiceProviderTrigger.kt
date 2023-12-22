package Windows.ApplicationModel.Background

import Windows.Devices.Bluetooth.GenericAttributeProfile.GattLocalService
import Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceProviderAdvertisingParameters
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

@ABIMarker(IGattServiceProviderTrigger.ABI::class)
@Signature("{ddc6a3e9-1557-4bd8-8542-468aa0c696f6}")
@Guid("ddc6a3e915574bd88542468aa0c696f6")
@WinRTInterface("ddc6a3e915574bd88542468aa0c696f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceProviderTrigger.ByReference::class)
public interface IGattServiceProviderTrigger : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TriggerId(): String?

  @InterfaceMethod(1)
  public fun get_Service(): GattLocalService?

  @InterfaceMethod(2)
  public fun put_AdvertisingParameters(value: GattServiceProviderAdvertisingParameters?): Unit

  @InterfaceMethod(3)
  public fun get_AdvertisingParameters(): GattServiceProviderAdvertisingParameters?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceProviderTrigger> {
    public override fun getValue() = ABI.makeIGattServiceProviderTrigger(pointer.getPointer(0))

    public fun setValue(value: IGattServiceProviderTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceProviderTrigger {
    public val __844913469_Ptr: Pointer?

    public val _844913469_VtblPtr: Pointer?
      get() = __844913469_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TriggerId(): String? {
      val fnPtr = _844913469_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__844913469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Service(): GattLocalService? {
      val fnPtr = _844913469_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattLocalService>()
      val hr = fn.invokeHR(arrayOf(__844913469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattLocalService>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_AdvertisingParameters(value: GattServiceProviderAdvertisingParameters?):
        Unit {
      val fnPtr = _844913469_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__844913469_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_AdvertisingParameters(): GattServiceProviderAdvertisingParameters? {
      val fnPtr = _844913469_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattServiceProviderAdvertisingParameters>()
      val hr = fn.invokeHR(arrayOf(__844913469_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<GattServiceProviderAdvertisingParameters>(result.getValue())
      return resultValue
    }
  }

  public class IGattServiceProviderTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __844913469_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceProviderTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ddc6a3e915574bd88542468aa0c696f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceProviderTrigger(ptr: Pointer?): WithDefault =
        IGattServiceProviderTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceProviderTrigger {
      val address = segment.toRawLongValue()
      return makeIGattServiceProviderTrigger(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceProviderTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__844913469_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceProviderTrigger):
        Array<IGattServiceProviderTrigger?> = (elements as
        Array<IGattServiceProviderTrigger?>).castToImpl<IGattServiceProviderTrigger,IGattServiceProviderTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceProviderTrigger?> =
        arrayOfNulls<IGattServiceProviderTrigger_Impl>(size) as Array<IGattServiceProviderTrigger?>
  }
}
