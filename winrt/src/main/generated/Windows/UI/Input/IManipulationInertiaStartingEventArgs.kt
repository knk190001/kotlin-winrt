package Windows.UI.Input

import Windows.Devices.Input.PointerDeviceType
import Windows.Foundation.Point
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

@ABIMarker(IManipulationInertiaStartingEventArgs.ABI::class)
@Signature("{dd37a898-26bf-467a-9ce5-ccf3fb11371e}")
@Guid("dd37a89826bf467a9ce5ccf3fb11371e")
@WinRTInterface("dd37a89826bf467a9ce5ccf3fb11371e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationInertiaStartingEventArgs.ByReference::class)
public interface IManipulationInertiaStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(1)
  public fun get_Position(): Point?

  @InterfaceMethod(2)
  public fun get_Delta(): ManipulationDelta?

  @InterfaceMethod(3)
  public fun get_Cumulative(): ManipulationDelta?

  @InterfaceMethod(4)
  public fun get_Velocities(): ManipulationVelocities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationInertiaStartingEventArgs> {
    public override fun getValue() =
        ABI.makeIManipulationInertiaStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IManipulationInertiaStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationInertiaStartingEventArgs {
    public val __1619351256_Ptr: Pointer?

    public val _1619351256_VtblPtr: Pointer?
      get() = __1619351256_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _1619351256_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__1619351256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Point? {
      val fnPtr = _1619351256_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1619351256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Delta(): ManipulationDelta? {
      val fnPtr = _1619351256_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__1619351256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Cumulative(): ManipulationDelta? {
      val fnPtr = _1619351256_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__1619351256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Velocities(): ManipulationVelocities? {
      val fnPtr = _1619351256_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationVelocities>()
      val hr = fn.invokeHR(arrayOf(__1619351256_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationVelocities>(result.getValue())
      return resultValue
    }
  }

  public class IManipulationInertiaStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1619351256_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationInertiaStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd37a89826bf467a9ce5ccf3fb11371e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationInertiaStartingEventArgs(ptr: Pointer?): WithDefault =
        IManipulationInertiaStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationInertiaStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeIManipulationInertiaStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IManipulationInertiaStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1619351256_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationInertiaStartingEventArgs):
        Array<IManipulationInertiaStartingEventArgs?> = (elements as
        Array<IManipulationInertiaStartingEventArgs?>).castToImpl<IManipulationInertiaStartingEventArgs,IManipulationInertiaStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationInertiaStartingEventArgs?> =
        arrayOfNulls<IManipulationInertiaStartingEventArgs_Impl>(size) as
        Array<IManipulationInertiaStartingEventArgs?>
  }
}
