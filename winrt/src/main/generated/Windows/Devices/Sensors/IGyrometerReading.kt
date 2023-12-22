package Windows.Devices.Sensors

import Windows.Foundation.DateTime
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGyrometerReading.ABI::class)
@Signature("{b3d6de5c-1ee4-456f-9de7-e2493b5c8e03}")
@Guid("b3d6de5c1ee4456f9de7e2493b5c8e03")
@WinRTInterface("b3d6de5c1ee4456f9de7e2493b5c8e03")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGyrometerReading.ByReference::class)
public interface IGyrometerReading : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): DateTime?

  @InterfaceMethod(1)
  public fun get_AngularVelocityX(): Double

  @InterfaceMethod(2)
  public fun get_AngularVelocityY(): Double

  @InterfaceMethod(3)
  public fun get_AngularVelocityZ(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGyrometerReading> {
    public override fun getValue() = ABI.makeIGyrometerReading(pointer.getPointer(0))

    public fun setValue(value: IGyrometerReading_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGyrometerReading {
    public val __1157533474_Ptr: Pointer?

    public val _1157533474_VtblPtr: Pointer?
      get() = __1157533474_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _1157533474_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1157533474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AngularVelocityX(): Double {
      val fnPtr = _1157533474_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1157533474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_AngularVelocityY(): Double {
      val fnPtr = _1157533474_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1157533474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_AngularVelocityZ(): Double {
      val fnPtr = _1157533474_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1157533474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IGyrometerReading_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1157533474_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGyrometerReading, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3d6de5c1ee4456f9de7e2493b5c8e03")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGyrometerReading(ptr: Pointer?): WithDefault = IGyrometerReading_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGyrometerReading {
      val address = segment.toRawLongValue()
      return makeIGyrometerReading(Pointer(address))
    }

    public override fun toNative(obj: IGyrometerReading): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1157533474_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGyrometerReading): Array<IGyrometerReading?> = (elements
        as Array<IGyrometerReading?>).castToImpl<IGyrometerReading,IGyrometerReading_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGyrometerReading?> =
        arrayOfNulls<IGyrometerReading_Impl>(size) as Array<IGyrometerReading?>
  }
}
