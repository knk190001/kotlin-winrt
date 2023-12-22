package Windows.Devices.Sensors

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ISimpleOrientationSensor.ABI::class)
@Signature("{5ff53856-214a-4dee-a3f9-616f1ab06ffd}")
@Guid("5ff53856214a4deea3f9616f1ab06ffd")
@WinRTInterface("5ff53856214a4deea3f9616f1ab06ffd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISimpleOrientationSensor.ByReference::class)
public interface ISimpleOrientationSensor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentOrientation(): SimpleOrientation?

  @InterfaceMethod(1)
  public fun add_OrientationChanged(handler: TypedEventHandler<SimpleOrientationSensor?,
      SimpleOrientationSensorOrientationChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_OrientationChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISimpleOrientationSensor> {
    public override fun getValue() = ABI.makeISimpleOrientationSensor(pointer.getPointer(0))

    public fun setValue(value: ISimpleOrientationSensor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISimpleOrientationSensor {
    public val __1536968364_Ptr: Pointer?

    public val _1536968364_VtblPtr: Pointer?
      get() = __1536968364_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentOrientation(): SimpleOrientation? {
      val fnPtr = _1536968364_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SimpleOrientation>()
      val hr = fn.invokeHR(arrayOf(__1536968364_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SimpleOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_OrientationChanged(handler: TypedEventHandler<SimpleOrientationSensor?,
        SimpleOrientationSensorOrientationChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1536968364_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1536968364_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_OrientationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1536968364_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1536968364_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISimpleOrientationSensor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1536968364_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISimpleOrientationSensor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ff53856214a4deea3f9616f1ab06ffd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISimpleOrientationSensor(ptr: Pointer?): WithDefault =
        ISimpleOrientationSensor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISimpleOrientationSensor {
      val address = segment.toRawLongValue()
      return makeISimpleOrientationSensor(Pointer(address))
    }

    public override fun toNative(obj: ISimpleOrientationSensor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1536968364_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISimpleOrientationSensor):
        Array<ISimpleOrientationSensor?> = (elements as
        Array<ISimpleOrientationSensor?>).castToImpl<ISimpleOrientationSensor,ISimpleOrientationSensor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISimpleOrientationSensor?> =
        arrayOfNulls<ISimpleOrientationSensor_Impl>(size) as Array<ISimpleOrientationSensor?>
  }
}
