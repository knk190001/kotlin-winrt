package Windows.Devices.Sensors

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IHingeAngleSensorStatics.ABI::class)
@Signature("{b7b63910-fbb1-4123-89ce-4ea34eb0dfca}")
@Guid("b7b63910fbb1412389ce4ea34eb0dfca")
@WinRTInterface("b7b63910fbb1412389ce4ea34eb0dfca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHingeAngleSensorStatics.ByReference::class)
public interface IHingeAngleSensorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(): String?

  @InterfaceMethod(1)
  public fun GetDefaultAsync(): IAsyncOperation<HingeAngleSensor?>?

  @InterfaceMethod(2)
  public fun GetRelatedToAdjacentPanelsAsync(firstPanelId: String?, secondPanelId: String?):
      IAsyncOperation<HingeAngleSensor?>?

  @InterfaceMethod(3)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<HingeAngleSensor?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHingeAngleSensorStatics> {
    public override fun getValue() = ABI.makeIHingeAngleSensorStatics(pointer.getPointer(0))

    public fun setValue(value: IHingeAngleSensorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHingeAngleSensorStatics {
    public val __1161789879_Ptr: Pointer?

    public val _1161789879_VtblPtr: Pointer?
      get() = __1161789879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1161789879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1161789879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefaultAsync(): IAsyncOperation<HingeAngleSensor?>? {
      val fnPtr = _1161789879_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HingeAngleSensor?>>()
      val hr = fn.invokeHR(arrayOf(__1161789879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HingeAngleSensor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetRelatedToAdjacentPanelsAsync(firstPanelId: String?,
        secondPanelId: String?): IAsyncOperation<HingeAngleSensor?>? {
      val fnPtr = _1161789879_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HingeAngleSensor?>>()
      val hr = fn.invokeHR(arrayOf(__1161789879_Ptr, marshalToNative(firstPanelId),
          marshalToNative(secondPanelId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HingeAngleSensor?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<HingeAngleSensor?>? {
      val fnPtr = _1161789879_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<HingeAngleSensor?>>()
      val hr = fn.invokeHR(arrayOf(__1161789879_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<HingeAngleSensor?>>(result.getValue())
      return resultValue
    }
  }

  public class IHingeAngleSensorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1161789879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHingeAngleSensorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7b63910fbb1412389ce4ea34eb0dfca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHingeAngleSensorStatics(ptr: Pointer?): WithDefault =
        IHingeAngleSensorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHingeAngleSensorStatics {
      val address = segment.toRawLongValue()
      return makeIHingeAngleSensorStatics(Pointer(address))
    }

    public override fun toNative(obj: IHingeAngleSensorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1161789879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHingeAngleSensorStatics):
        Array<IHingeAngleSensorStatics?> = (elements as
        Array<IHingeAngleSensorStatics?>).castToImpl<IHingeAngleSensorStatics,IHingeAngleSensorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHingeAngleSensorStatics?> =
        arrayOfNulls<IHingeAngleSensorStatics_Impl>(size) as Array<IHingeAngleSensorStatics?>
  }
}
