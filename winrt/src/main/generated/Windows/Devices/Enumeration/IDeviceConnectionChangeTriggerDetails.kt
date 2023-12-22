package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceConnectionChangeTriggerDetails.ABI::class)
@Signature("{b8578c0c-bbc1-484b-bffa-7b31dcc200b2}")
@Guid("b8578c0cbbc1484bbffa7b31dcc200b2")
@WinRTInterface("b8578c0cbbc1484bbffa7b31dcc200b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceConnectionChangeTriggerDetails.ByReference::class)
public interface IDeviceConnectionChangeTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceConnectionChangeTriggerDetails> {
    public override fun getValue() =
        ABI.makeIDeviceConnectionChangeTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IDeviceConnectionChangeTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceConnectionChangeTriggerDetails {
    public val __34494860_Ptr: Pointer?

    public val _34494860_VtblPtr: Pointer?
      get() = __34494860_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _34494860_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__34494860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceConnectionChangeTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __34494860_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceConnectionChangeTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8578c0cbbc1484bbffa7b31dcc200b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceConnectionChangeTriggerDetails(ptr: Pointer?): WithDefault =
        IDeviceConnectionChangeTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceConnectionChangeTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIDeviceConnectionChangeTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IDeviceConnectionChangeTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__34494860_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceConnectionChangeTriggerDetails):
        Array<IDeviceConnectionChangeTriggerDetails?> = (elements as
        Array<IDeviceConnectionChangeTriggerDetails?>).castToImpl<IDeviceConnectionChangeTriggerDetails,IDeviceConnectionChangeTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceConnectionChangeTriggerDetails?> =
        arrayOfNulls<IDeviceConnectionChangeTriggerDetails_Impl>(size) as
        Array<IDeviceConnectionChangeTriggerDetails?>
  }
}
