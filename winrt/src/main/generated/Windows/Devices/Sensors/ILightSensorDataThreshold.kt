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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILightSensorDataThreshold.ABI::class)
@Signature("{b160afd1-878f-5492-9f2c-33dc3ae584a3}")
@Guid("b160afd1878f54929f2c33dc3ae584a3")
@WinRTInterface("b160afd1878f54929f2c33dc3ae584a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILightSensorDataThreshold.ByReference::class)
public interface ILightSensorDataThreshold : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LuxPercentage(): Float

  @InterfaceMethod(1)
  public fun put_LuxPercentage(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_AbsoluteLux(): Float

  @InterfaceMethod(3)
  public fun put_AbsoluteLux(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILightSensorDataThreshold> {
    public override fun getValue() = ABI.makeILightSensorDataThreshold(pointer.getPointer(0))

    public fun setValue(value: ILightSensorDataThreshold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILightSensorDataThreshold {
    public val __445613251_Ptr: Pointer?

    public val _445613251_VtblPtr: Pointer?
      get() = __445613251_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LuxPercentage(): Float {
      val fnPtr = _445613251_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__445613251_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_LuxPercentage(value: Float): Unit {
      val fnPtr = _445613251_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445613251_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AbsoluteLux(): Float {
      val fnPtr = _445613251_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__445613251_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_AbsoluteLux(value: Float): Unit {
      val fnPtr = _445613251_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__445613251_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILightSensorDataThreshold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445613251_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILightSensorDataThreshold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b160afd1878f54929f2c33dc3ae584a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILightSensorDataThreshold(ptr: Pointer?): WithDefault =
        ILightSensorDataThreshold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILightSensorDataThreshold {
      val address = segment.toRawLongValue()
      return makeILightSensorDataThreshold(Pointer(address))
    }

    public override fun toNative(obj: ILightSensorDataThreshold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445613251_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILightSensorDataThreshold):
        Array<ILightSensorDataThreshold?> = (elements as
        Array<ILightSensorDataThreshold?>).castToImpl<ILightSensorDataThreshold,ILightSensorDataThreshold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILightSensorDataThreshold?> =
        arrayOfNulls<ILightSensorDataThreshold_Impl>(size) as Array<ILightSensorDataThreshold?>
  }
}
