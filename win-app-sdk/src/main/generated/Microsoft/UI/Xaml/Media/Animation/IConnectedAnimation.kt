package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Composition.ICompositionAnimationBase
import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.Collections.IIterable
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IConnectedAnimation.ABI::class)
@Signature("{a9c1c6ad-7670-589c-a608-9b5c01cec71f}")
@Guid("a9c1c6ad7670589ca6089b5c01cec71f")
@WinRTInterface("a9c1c6ad7670589ca6089b5c01cec71f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IConnectedAnimation.ByReference::class)
public interface IConnectedAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsScaleAnimationEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsScaleAnimationEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_Configuration(): ConnectedAnimationConfiguration?

  @InterfaceMethod(3)
  public fun put_Configuration(value: ConnectedAnimationConfiguration?): Unit

  @InterfaceMethod(4)
  public fun add_Completed(handler: TypedEventHandler<ConnectedAnimation?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun TryStart(destination: UIElement?): Boolean

  @InterfaceMethod(7)
  public fun TryStart(destination: UIElement?, coordinatedElements: IIterable<UIElement?>?): Boolean

  @InterfaceMethod(8)
  public fun Cancel(): Unit

  @InterfaceMethod(9)
  public fun SetAnimationComponent(component: ConnectedAnimationComponent?,
      animation: ICompositionAnimationBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IConnectedAnimation> {
    public override fun getValue() = ABI.makeIConnectedAnimation(pointer.getPointer(0))

    public fun setValue(value: IConnectedAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IConnectedAnimation {
    public val __422733750_Ptr: Pointer?

    public val _422733750_VtblPtr: Pointer?
      get() = __422733750_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsScaleAnimationEnabled(): Boolean {
      val fnPtr = _422733750_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsScaleAnimationEnabled(value: Boolean): Unit {
      val fnPtr = _422733750_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Configuration(): ConnectedAnimationConfiguration? {
      val fnPtr = _422733750_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ConnectedAnimationConfiguration>()
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ConnectedAnimationConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Configuration(value: ConnectedAnimationConfiguration?): Unit {
      val fnPtr = _422733750_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Completed(handler: TypedEventHandler<ConnectedAnimation?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _422733750_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _422733750_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun TryStart(destination: UIElement?): Boolean {
      val fnPtr = _422733750_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr, marshalToNative(destination), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun TryStart(destination: UIElement?,
        coordinatedElements: IIterable<UIElement?>?): Boolean {
      val fnPtr = _422733750_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr, marshalToNative(destination),
          marshalToNative(coordinatedElements), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun Cancel(): Unit {
      val fnPtr = _422733750_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun SetAnimationComponent(component: ConnectedAnimationComponent?,
        animation: ICompositionAnimationBase?): Unit {
      val fnPtr = _422733750_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__422733750_Ptr, marshalToNative(component),
          marshalToNative(animation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IConnectedAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __422733750_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IConnectedAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9c1c6ad7670589ca6089b5c01cec71f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIConnectedAnimation(ptr: Pointer?): WithDefault = IConnectedAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IConnectedAnimation {
      val address = segment.toRawLongValue()
      return makeIConnectedAnimation(Pointer(address))
    }

    public override fun toNative(obj: IConnectedAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__422733750_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IConnectedAnimation): Array<IConnectedAnimation?> =
        (elements as
        Array<IConnectedAnimation?>).castToImpl<IConnectedAnimation,IConnectedAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IConnectedAnimation?> =
        arrayOfNulls<IConnectedAnimation_Impl>(size) as Array<IConnectedAnimation?>
  }
}
