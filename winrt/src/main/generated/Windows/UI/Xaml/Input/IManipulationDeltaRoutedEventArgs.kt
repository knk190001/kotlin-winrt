package Windows.UI.Xaml.Input

import Windows.Devices.Input.PointerDeviceType
import Windows.Foundation.Point
import Windows.UI.Input.ManipulationDelta
import Windows.UI.Input.ManipulationVelocities
import Windows.UI.Xaml.UIElement
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IManipulationDeltaRoutedEventArgs.ABI::class)
@Signature("{400d5794-4c6f-491d-82d6-3517109399c6}")
@Guid("400d57944c6f491d82d63517109399c6")
@WinRTInterface("400d57944c6f491d82d63517109399c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationDeltaRoutedEventArgs.ByReference::class)
public interface IManipulationDeltaRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Container(): UIElement?

  @InterfaceMethod(1)
  public fun get_Position(): Point?

  @InterfaceMethod(2)
  public fun get_IsInertial(): Boolean

  @InterfaceMethod(3)
  public fun get_Delta(): ManipulationDelta?

  @InterfaceMethod(4)
  public fun get_Cumulative(): ManipulationDelta?

  @InterfaceMethod(5)
  public fun get_Velocities(): ManipulationVelocities?

  @InterfaceMethod(6)
  public fun get_Handled(): Boolean

  @InterfaceMethod(7)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(9)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationDeltaRoutedEventArgs> {
    public override fun getValue() =
        ABI.makeIManipulationDeltaRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IManipulationDeltaRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationDeltaRoutedEventArgs {
    public val __1771136809_Ptr: Pointer?

    public val _1771136809_VtblPtr: Pointer?
      get() = __1771136809_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Container(): UIElement? {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Point? {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsInertial(): Boolean {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Delta(): ManipulationDelta? {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Cumulative(): ManipulationDelta? {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Velocities(): ManipulationVelocities? {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationVelocities>()
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationVelocities>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun Complete(): Unit {
      val fnPtr = _1771136809_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1771136809_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IManipulationDeltaRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1771136809_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationDeltaRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("400d57944c6f491d82d63517109399c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationDeltaRoutedEventArgs(ptr: Pointer?): WithDefault =
        IManipulationDeltaRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationDeltaRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIManipulationDeltaRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IManipulationDeltaRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1771136809_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationDeltaRoutedEventArgs):
        Array<IManipulationDeltaRoutedEventArgs?> = (elements as
        Array<IManipulationDeltaRoutedEventArgs?>).castToImpl<IManipulationDeltaRoutedEventArgs,IManipulationDeltaRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationDeltaRoutedEventArgs?> =
        arrayOfNulls<IManipulationDeltaRoutedEventArgs_Impl>(size) as
        Array<IManipulationDeltaRoutedEventArgs?>
  }
}
