package Windows.Devices.Sensors

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

@ABIMarker(ISensorDataThresholdTriggerDetails.ABI::class)
@Signature("{9106f1b7-e88d-48b1-bc90-619c7b349391}")
@Guid("9106f1b7e88d48b1bc90619c7b349391")
@WinRTInterface("9106f1b7e88d48b1bc90619c7b349391")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISensorDataThresholdTriggerDetails.ByReference::class)
public interface ISensorDataThresholdTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_SensorType(): SensorType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISensorDataThresholdTriggerDetails> {
    public override fun getValue() =
        ABI.makeISensorDataThresholdTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: ISensorDataThresholdTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISensorDataThresholdTriggerDetails {
    public val __1526039333_Ptr: Pointer?

    public val _1526039333_VtblPtr: Pointer?
      get() = __1526039333_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1526039333_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1526039333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SensorType(): SensorType? {
      val fnPtr = _1526039333_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SensorType>()
      val hr = fn.invokeHR(arrayOf(__1526039333_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SensorType>(result.getValue())
      return resultValue
    }
  }

  public class ISensorDataThresholdTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1526039333_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISensorDataThresholdTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9106f1b7e88d48b1bc90619c7b349391")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISensorDataThresholdTriggerDetails(ptr: Pointer?): WithDefault =
        ISensorDataThresholdTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISensorDataThresholdTriggerDetails {
      val address = segment.toRawLongValue()
      return makeISensorDataThresholdTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: ISensorDataThresholdTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1526039333_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISensorDataThresholdTriggerDetails):
        Array<ISensorDataThresholdTriggerDetails?> = (elements as
        Array<ISensorDataThresholdTriggerDetails?>).castToImpl<ISensorDataThresholdTriggerDetails,ISensorDataThresholdTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISensorDataThresholdTriggerDetails?> =
        arrayOfNulls<ISensorDataThresholdTriggerDetails_Impl>(size) as
        Array<ISensorDataThresholdTriggerDetails?>
  }
}
