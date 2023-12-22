package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.FrameworkElement
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFlyoutBase.ABI::class)
@Signature("{723eea0b-d12e-430d-a9f0-9bb32bbf9913}")
@Guid("723eea0bd12e430da9f09bb32bbf9913")
@WinRTInterface("723eea0bd12e430da9f09bb32bbf9913")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutBase.ByReference::class)
public interface IFlyoutBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Placement(): FlyoutPlacementMode?

  @InterfaceMethod(1)
  public fun put_Placement(value: FlyoutPlacementMode?): Unit

  @InterfaceMethod(2)
  public fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Opened(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Closed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_Opening(handler: EventHandler<IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Opening(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun ShowAt(placementTarget: FrameworkElement?): Unit

  @InterfaceMethod(9)
  public fun Hide(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFlyoutBase> {
    public override fun getValue() = ABI.makeIFlyoutBase(pointer.getPointer(0))

    public fun setValue(value: IFlyoutBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutBase {
    public val __873998520_Ptr: Pointer?

    public val _873998520_VtblPtr: Pointer?
      get() = __873998520_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Placement(): FlyoutPlacementMode? {
      val fnPtr = _873998520_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutPlacementMode>()
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutPlacementMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Placement(value: FlyoutPlacementMode?): Unit {
      val fnPtr = _873998520_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Opened(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _873998520_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Opened(token: EventRegistrationToken?): Unit {
      val fnPtr = _873998520_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Closed(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _873998520_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Closed(token: EventRegistrationToken?): Unit {
      val fnPtr = _873998520_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Opening(handler: EventHandler<IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _873998520_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Opening(token: EventRegistrationToken?): Unit {
      val fnPtr = _873998520_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun ShowAt(placementTarget: FrameworkElement?): Unit {
      val fnPtr = _873998520_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, marshalToNative(placementTarget),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun Hide(): Unit {
      val fnPtr = _873998520_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__873998520_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFlyoutBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __873998520_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("723eea0bd12e430da9f09bb32bbf9913")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutBase(ptr: Pointer?): WithDefault = IFlyoutBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutBase {
      val address = segment.toRawLongValue()
      return makeIFlyoutBase(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__873998520_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutBase): Array<IFlyoutBase?> = (elements as
        Array<IFlyoutBase?>).castToImpl<IFlyoutBase,IFlyoutBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutBase?> =
        arrayOfNulls<IFlyoutBase_Impl>(size) as Array<IFlyoutBase?>
  }
}
