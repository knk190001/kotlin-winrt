package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Input.ICommand
import Microsoft.UI.Xaml.Media.Brush
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ISwipeItem.ABI::class)
@Signature("{5e8d4950-b826-510a-b309-77afcdc65b1f}")
@Guid("5e8d4950b826510ab30977afcdc65b1f")
@WinRTInterface("5e8d4950b826510ab30977afcdc65b1f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeItem.ByReference::class)
public interface ISwipeItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_IconSource(): IconSource?

  @InterfaceMethod(3)
  public fun put_IconSource(value: IconSource?): Unit

  @InterfaceMethod(4)
  public fun get_Background(): Brush?

  @InterfaceMethod(5)
  public fun put_Background(value: Brush?): Unit

  @InterfaceMethod(6)
  public fun get_Foreground(): Brush?

  @InterfaceMethod(7)
  public fun put_Foreground(value: Brush?): Unit

  @InterfaceMethod(8)
  public fun get_Command(): ICommand?

  @InterfaceMethod(9)
  public fun put_Command(value: ICommand?): Unit

  @InterfaceMethod(10)
  public fun get_CommandParameter(): IUnknown?

  @InterfaceMethod(11)
  public fun put_CommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(12)
  public fun get_BehaviorOnInvoked(): SwipeBehaviorOnInvoked?

  @InterfaceMethod(13)
  public fun put_BehaviorOnInvoked(value: SwipeBehaviorOnInvoked?): Unit

  @InterfaceMethod(14)
  public fun add_Invoked(handler: TypedEventHandler<SwipeItem?, SwipeItemInvokedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_Invoked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISwipeItem> {
    public override fun getValue() = ABI.makeISwipeItem(pointer.getPointer(0))

    public fun setValue(value: ISwipeItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeItem {
    public val __955171718_Ptr: Pointer?

    public val _955171718_VtblPtr: Pointer?
      get() = __955171718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _955171718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _955171718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IconSource(): IconSource? {
      val fnPtr = _955171718_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconSource>()
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_IconSource(value: IconSource?): Unit {
      val fnPtr = _955171718_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Background(): Brush? {
      val fnPtr = _955171718_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Background(value: Brush?): Unit {
      val fnPtr = _955171718_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Foreground(): Brush? {
      val fnPtr = _955171718_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Foreground(value: Brush?): Unit {
      val fnPtr = _955171718_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Command(): ICommand? {
      val fnPtr = _955171718_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Command(value: ICommand?): Unit {
      val fnPtr = _955171718_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_CommandParameter(): IUnknown? {
      val fnPtr = _955171718_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_CommandParameter(value: IUnknown?): Unit {
      val fnPtr = _955171718_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_BehaviorOnInvoked(): SwipeBehaviorOnInvoked? {
      val fnPtr = _955171718_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeBehaviorOnInvoked>()
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeBehaviorOnInvoked>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_BehaviorOnInvoked(value: SwipeBehaviorOnInvoked?): Unit {
      val fnPtr = _955171718_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_Invoked(handler: TypedEventHandler<SwipeItem?,
        SwipeItemInvokedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _955171718_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_Invoked(token: EventRegistrationToken?): Unit {
      val fnPtr = _955171718_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__955171718_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISwipeItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __955171718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e8d4950b826510ab30977afcdc65b1f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeItem(ptr: Pointer?): WithDefault = ISwipeItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeItem {
      val address = segment.toRawLongValue()
      return makeISwipeItem(Pointer(address))
    }

    public override fun toNative(obj: ISwipeItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__955171718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeItem): Array<ISwipeItem?> = (elements as
        Array<ISwipeItem?>).castToImpl<ISwipeItem,ISwipeItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeItem?> = arrayOfNulls<ISwipeItem_Impl>(size)
        as Array<ISwipeItem?>
  }
}
