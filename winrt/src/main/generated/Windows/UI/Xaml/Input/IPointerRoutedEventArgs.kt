package Windows.UI.Xaml.Input

import Windows.Foundation.Collections.IVector
import Windows.System.VirtualKeyModifiers
import Windows.UI.Input.PointerPoint
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

@ABIMarker(IPointerRoutedEventArgs.ABI::class)
@Signature("{da628f0a-9752-49e2-bde2-49eccab9194d}")
@Guid("da628f0a975249e2bde249eccab9194d")
@WinRTInterface("da628f0a975249e2bde249eccab9194d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerRoutedEventArgs.ByReference::class)
public interface IPointerRoutedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Pointer(): Pointer?

  @InterfaceMethod(1)
  public fun get_KeyModifiers(): VirtualKeyModifiers?

  @InterfaceMethod(2)
  public fun get_Handled(): Boolean

  @InterfaceMethod(3)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun GetCurrentPoint(relativeTo: UIElement?): PointerPoint?

  @InterfaceMethod(5)
  public fun GetIntermediatePoints(relativeTo: UIElement?): IVector<PointerPoint?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointerRoutedEventArgs> {
    public override fun getValue() = ABI.makeIPointerRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPointerRoutedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerRoutedEventArgs {
    public val __712093685_Ptr: com.sun.jna.Pointer?

    public val _712093685_VtblPtr: com.sun.jna.Pointer?
      get() = __712093685_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Pointer(): Pointer? {
      val fnPtr = _712093685_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Pointer>()
      val hr = fn.invokeHR(arrayOf(__712093685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Pointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _712093685_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__712093685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Handled(): Boolean {
      val fnPtr = _712093685_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__712093685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _712093685_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__712093685_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetCurrentPoint(relativeTo: UIElement?): PointerPoint? {
      val fnPtr = _712093685_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerPoint>()
      val hr = fn.invokeHR(arrayOf(__712093685_Ptr, marshalToNative(relativeTo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerPoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetIntermediatePoints(relativeTo: UIElement?): IVector<PointerPoint?>? {
      val fnPtr = _712093685_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PointerPoint?>>()
      val hr = fn.invokeHR(arrayOf(__712093685_Ptr, marshalToNative(relativeTo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PointerPoint?>>(result.getValue())
      return resultValue
    }
  }

  public class IPointerRoutedEventArgs_Impl(
    ptr: com.sun.jna.Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __712093685_Ptr: com.sun.jna.Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerRoutedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("da628f0a975249e2bde249eccab9194d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerRoutedEventArgs(ptr: com.sun.jna.Pointer?): WithDefault =
        IPointerRoutedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerRoutedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPointerRoutedEventArgs(com.sun.jna.Pointer(address))
    }

    public override fun toNative(obj: IPointerRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(com.sun.jna.Pointer.nativeValue((obj as WithDefault).__712093685_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerRoutedEventArgs): Array<IPointerRoutedEventArgs?>
        = (elements as
        Array<IPointerRoutedEventArgs?>).castToImpl<IPointerRoutedEventArgs,IPointerRoutedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerRoutedEventArgs?> =
        arrayOfNulls<IPointerRoutedEventArgs_Impl>(size) as Array<IPointerRoutedEventArgs?>
  }
}
