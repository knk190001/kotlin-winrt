package Windows.UI.Xaml

import Windows.ApplicationModel.DataTransfer.DataPackageOperation
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.UI.Input.PointerPoint
import Windows.UI.Xaml.Media.Media3D.Transform3D
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

@ABIMarker(IUIElement3.ABI::class)
@Signature("{bc2b28f1-26f2-4aab-b256-3b5350881e37}")
@Guid("bc2b28f126f24aabb2563b5350881e37")
@WinRTInterface("bc2b28f126f24aabb2563b5350881e37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElement3.ByReference::class)
public interface IUIElement3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Transform3D(): Transform3D?

  @InterfaceMethod(1)
  public fun put_Transform3D(value: Transform3D?): Unit

  @InterfaceMethod(2)
  public fun get_CanDrag(): Boolean

  @InterfaceMethod(3)
  public fun put_CanDrag(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun add_DragStarting(handler: TypedEventHandler<UIElement?, DragStartingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_DragStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_DropCompleted(handler: TypedEventHandler<UIElement?, DropCompletedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_DropCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun StartDragAsync(pointerPoint: PointerPoint?): IAsyncOperation<DataPackageOperation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUIElement3> {
    public override fun getValue() = ABI.makeIUIElement3(pointer.getPointer(0))

    public fun setValue(value: IUIElement3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElement3 {
    public val __1021118237_Ptr: Pointer?

    public val _1021118237_VtblPtr: Pointer?
      get() = __1021118237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Transform3D(): Transform3D? {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform3D>()
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform3D>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Transform3D(value: Transform3D?): Unit {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CanDrag(): Boolean {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_CanDrag(value: Boolean): Unit {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_DragStarting(handler: TypedEventHandler<UIElement?,
        DragStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_DragStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_DropCompleted(handler: TypedEventHandler<UIElement?,
        DropCompletedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_DropCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun StartDragAsync(pointerPoint: PointerPoint?):
        IAsyncOperation<DataPackageOperation?>? {
      val fnPtr = _1021118237_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DataPackageOperation?>>()
      val hr = fn.invokeHR(arrayOf(__1021118237_Ptr, marshalToNative(pointerPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DataPackageOperation?>>(result.getValue())
      return resultValue
    }
  }

  public class IUIElement3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1021118237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElement3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc2b28f126f24aabb2563b5350881e37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElement3(ptr: Pointer?): WithDefault = IUIElement3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElement3 {
      val address = segment.toRawLongValue()
      return makeIUIElement3(Pointer(address))
    }

    public override fun toNative(obj: IUIElement3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1021118237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElement3): Array<IUIElement3?> = (elements as
        Array<IUIElement3?>).castToImpl<IUIElement3,IUIElement3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElement3?> =
        arrayOfNulls<IUIElement3_Impl>(size) as Array<IUIElement3?>
  }
}
