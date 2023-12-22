package Microsoft.UI.Xaml.Input

import Microsoft.UI.Input.ManipulationDelta
import Microsoft.UI.Input.PointerDeviceType
import Microsoft.UI.Xaml.UIElement
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IManipulationStartedRoutedEventArgs.ABI::class)
@Signature("{61857950-5821-5652-9fdf-c6277c5886f5}")
@Guid("61857950582156529fdfc6277c5886f5")
@WinRTInterface("61857950582156529fdfc6277c5886f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationStartedRoutedEventArgs.ByReference::class)
public interface IManipulationStartedRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Container(): UIElement?

  @InterfaceMethod(1)
  public fun get_Position(): Point?

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(5)
  public fun get_Cumulative(): ManipulationDelta?

  @InterfaceMethod(6)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationStartedRoutedEventArgs> {
    public override fun getValue() =
        ABI.makeIManipulationStartedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IManipulationStartedRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationStartedRoutedEventArgs {
    public val __695031517_Ptr: Pointer?

    public val _695031517_VtblPtr: Pointer?
      get() = __695031517_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Container(): UIElement? {
      val fnPtr = _695031517_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__695031517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Point? {
      val fnPtr = _695031517_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__695031517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _695031517_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__695031517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _695031517_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__695031517_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _695031517_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__695031517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Cumulative(): ManipulationDelta? {
      val fnPtr = _695031517_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__695031517_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun Complete(): Unit {
      val fnPtr = _695031517_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__695031517_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IManipulationStartedRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __695031517_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationStartedRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61857950582156529fdfc6277c5886f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationStartedRoutedEventArgs(ptr: Pointer?): WithDefault =
        IManipulationStartedRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationStartedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIManipulationStartedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IManipulationStartedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__695031517_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationStartedRoutedEventArgs):
        Array<IManipulationStartedRoutedEventArgs?> = (elements as
        Array<IManipulationStartedRoutedEventArgs?>).castToImpl<IManipulationStartedRoutedEventArgs,IManipulationStartedRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationStartedRoutedEventArgs?> =
        arrayOfNulls<IManipulationStartedRoutedEventArgs_Impl>(size) as
        Array<IManipulationStartedRoutedEventArgs?>
  }
}
