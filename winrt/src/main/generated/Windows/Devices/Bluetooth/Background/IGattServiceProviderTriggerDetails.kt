package Windows.Devices.Bluetooth.Background

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

@ABIMarker(IGattServiceProviderTriggerDetails.ABI::class)
@Signature("{ae8c0625-05ff-4afb-b16a-de95f3cf0158}")
@Guid("ae8c062505ff4afbb16ade95f3cf0158")
@WinRTInterface("ae8c062505ff4afbb16ade95f3cf0158")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattServiceProviderTriggerDetails.ByReference::class)
public interface IGattServiceProviderTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): GattServiceProviderConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattServiceProviderTriggerDetails> {
    public override fun getValue() =
        ABI.makeIGattServiceProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IGattServiceProviderTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattServiceProviderTriggerDetails {
    public val __645319881_Ptr: Pointer?

    public val _645319881_VtblPtr: Pointer?
      get() = __645319881_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): GattServiceProviderConnection? {
      val fnPtr = _645319881_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattServiceProviderConnection>()
      val hr = fn.invokeHR(arrayOf(__645319881_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattServiceProviderConnection>(result.getValue())
      return resultValue
    }
  }

  public class IGattServiceProviderTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __645319881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattServiceProviderTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae8c062505ff4afbb16ade95f3cf0158")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattServiceProviderTriggerDetails(ptr: Pointer?): WithDefault =
        IGattServiceProviderTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattServiceProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIGattServiceProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IGattServiceProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__645319881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattServiceProviderTriggerDetails):
        Array<IGattServiceProviderTriggerDetails?> = (elements as
        Array<IGattServiceProviderTriggerDetails?>).castToImpl<IGattServiceProviderTriggerDetails,IGattServiceProviderTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattServiceProviderTriggerDetails?> =
        arrayOfNulls<IGattServiceProviderTriggerDetails_Impl>(size) as
        Array<IGattServiceProviderTriggerDetails?>
  }
}
