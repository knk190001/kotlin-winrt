package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IManipulationStartingRoutedEventArgs.ABI::class)
@Signature("{93a99f86-f5a0-5326-91b0-851c897af79f}")
@Guid("93a99f86f5a0532691b0851c897af79f")
@WinRTInterface("93a99f86f5a0532691b0851c897af79f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationStartingRoutedEventArgs.ByReference::class)
public interface IManipulationStartingRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): ManipulationModes?

  @InterfaceMethod(1)
  public fun put_Mode(value: ManipulationModes?): Unit

  @InterfaceMethod(2)
  public fun get_Container(): UIElement?

  @InterfaceMethod(3)
  public fun put_Container(value: UIElement?): Unit

  @InterfaceMethod(4)
  public fun get_Pivot(): ManipulationPivot?

  @InterfaceMethod(5)
  public fun put_Pivot(value: ManipulationPivot?): Unit

  @InterfaceMethod(6)
  public fun get_Handled(): Boolean

  @InterfaceMethod(7)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationStartingRoutedEventArgs> {
    public override fun getValue() =
        ABI.makeIManipulationStartingRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IManipulationStartingRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationStartingRoutedEventArgs {
    public val __1770610676_Ptr: Pointer?

    public val _1770610676_VtblPtr: Pointer?
      get() = __1770610676_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): ManipulationModes? {
      val fnPtr = _1770610676_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationModes>()
      val hr = fn.invokeHR(arrayOf(__1770610676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationModes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Mode(value: ManipulationModes?): Unit {
      val fnPtr = _1770610676_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770610676_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Container(): UIElement? {
      val fnPtr = _1770610676_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__1770610676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Container(value: UIElement?): Unit {
      val fnPtr = _1770610676_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770610676_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Pivot(): ManipulationPivot? {
      val fnPtr = _1770610676_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationPivot>()
      val hr = fn.invokeHR(arrayOf(__1770610676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationPivot>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Pivot(value: ManipulationPivot?): Unit {
      val fnPtr = _1770610676_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770610676_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1770610676_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1770610676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1770610676_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1770610676_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IManipulationStartingRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1770610676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationStartingRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93a99f86f5a0532691b0851c897af79f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationStartingRoutedEventArgs(ptr: Pointer?): WithDefault =
        IManipulationStartingRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationStartingRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIManipulationStartingRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IManipulationStartingRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1770610676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationStartingRoutedEventArgs):
        Array<IManipulationStartingRoutedEventArgs?> = (elements as
        Array<IManipulationStartingRoutedEventArgs?>).castToImpl<IManipulationStartingRoutedEventArgs,IManipulationStartingRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationStartingRoutedEventArgs?> =
        arrayOfNulls<IManipulationStartingRoutedEventArgs_Impl>(size) as
        Array<IManipulationStartingRoutedEventArgs?>
  }
}
