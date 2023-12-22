package Windows.UI.Xaml.Media.Animation

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.UIElement
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectedAnimation.ABI::class)
@Signature("{3518628c-f387-4c25-ac98-44e86c3cadf0}")
@Guid("3518628cf3874c25ac9844e86c3cadf0")
@WinRTInterface("3518628cf3874c25ac9844e86c3cadf0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectedAnimation.ByReference::class)
public interface IConnectedAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Completed(handler: TypedEventHandler<ConnectedAnimation?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun TryStart(destination: UIElement?): Boolean

  @InterfaceMethod(3)
  public fun Cancel(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectedAnimation> {
    public override fun getValue() = ABI.makeIConnectedAnimation(pointer.getPointer(0))

    public fun setValue(value: IConnectedAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectedAnimation {
    public val __1325387007_Ptr: Pointer?

    public val _1325387007_VtblPtr: Pointer?
      get() = __1325387007_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Completed(handler: TypedEventHandler<ConnectedAnimation?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1325387007_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1325387007_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1325387007_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1325387007_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun TryStart(destination: UIElement?): Boolean {
      val fnPtr = _1325387007_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1325387007_Ptr, marshalToNative(destination), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun Cancel(): Unit {
      val fnPtr = _1325387007_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1325387007_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IConnectedAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1325387007_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectedAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3518628cf3874c25ac9844e86c3cadf0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectedAnimation(ptr: Pointer?): WithDefault = IConnectedAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectedAnimation {
      val address = segment.toRawLongValue()
      return makeIConnectedAnimation(Pointer(address))
    }

    public override fun toNative(obj: IConnectedAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1325387007_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectedAnimation): Array<IConnectedAnimation?> =
        (elements as
        Array<IConnectedAnimation?>).castToImpl<IConnectedAnimation,IConnectedAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectedAnimation?> =
        arrayOfNulls<IConnectedAnimation_Impl>(size) as Array<IConnectedAnimation?>
  }
}
