package Microsoft.UI.Xaml.Input

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

@ABIMarker(ITappedRoutedEventArgs.ABI::class)
@Signature("{73f74b8c-3709-547e-8e0c-51c03c89126a}")
@Guid("73f74b8c3709547e8e0c51c03c89126a")
@WinRTInterface("73f74b8c3709547e8e0c51c03c89126a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITappedRoutedEventArgs.ByReference::class)
public interface ITappedRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(1)
  public fun get_Handled(): Boolean

  @InterfaceMethod(2)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun GetPosition(relativeTo: UIElement?): Point?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITappedRoutedEventArgs> {
    public override fun getValue() = ABI.makeITappedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITappedRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITappedRoutedEventArgs {
    public val __208957115_Ptr: Pointer?

    public val _208957115_VtblPtr: Pointer?
      get() = __208957115_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _208957115_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__208957115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Handled(): Boolean {
      val fnPtr = _208957115_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__208957115_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _208957115_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__208957115_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetPosition(relativeTo: UIElement?): Point? {
      val fnPtr = _208957115_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__208957115_Ptr, marshalToNative(relativeTo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }
  }

  public class ITappedRoutedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __208957115_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITappedRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73f74b8c3709547e8e0c51c03c89126a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITappedRoutedEventArgs(ptr: Pointer?): WithDefault =
        ITappedRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITappedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeITappedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITappedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__208957115_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITappedRoutedEventArgs): Array<ITappedRoutedEventArgs?> =
        (elements as
        Array<ITappedRoutedEventArgs?>).castToImpl<ITappedRoutedEventArgs,ITappedRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITappedRoutedEventArgs?> =
        arrayOfNulls<ITappedRoutedEventArgs_Impl>(size) as Array<ITappedRoutedEventArgs?>
  }
}
