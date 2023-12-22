package Windows.ApplicationModel.Core

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreApplicationViewTitleBar.ABI::class)
@Signature("{006d35e3-e1f1-431b-9508-29b96926ac53}")
@Guid("006d35e3e1f1431b950829b96926ac53")
@WinRTInterface("006d35e3e1f1431b950829b96926ac53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreApplicationViewTitleBar.ByReference::class)
public interface ICoreApplicationViewTitleBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_ExtendViewIntoTitleBar(value: Boolean): Unit

  @InterfaceMethod(1)
  public fun get_ExtendViewIntoTitleBar(): Boolean

  @InterfaceMethod(2)
  public fun get_SystemOverlayLeftInset(): Double

  @InterfaceMethod(3)
  public fun get_SystemOverlayRightInset(): Double

  @InterfaceMethod(4)
  public fun get_Height(): Double

  @InterfaceMethod(5)
  public fun add_LayoutMetricsChanged(handler: TypedEventHandler<CoreApplicationViewTitleBar?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_LayoutMetricsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(8)
  public fun add_IsVisibleChanged(handler: TypedEventHandler<CoreApplicationViewTitleBar?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_IsVisibleChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreApplicationViewTitleBar> {
    public override fun getValue() = ABI.makeICoreApplicationViewTitleBar(pointer.getPointer(0))

    public fun setValue(value: ICoreApplicationViewTitleBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreApplicationViewTitleBar {
    public val __1351628049_Ptr: Pointer?

    public val _1351628049_VtblPtr: Pointer?
      get() = __1351628049_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_ExtendViewIntoTitleBar(value: Boolean): Unit {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_ExtendViewIntoTitleBar(): Boolean {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SystemOverlayLeftInset(): Double {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SystemOverlayRightInset(): Double {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Height(): Double {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override
        fun add_LayoutMetricsChanged(handler: TypedEventHandler<CoreApplicationViewTitleBar?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_LayoutMetricsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override
        fun add_IsVisibleChanged(handler: TypedEventHandler<CoreApplicationViewTitleBar?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_IsVisibleChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1351628049_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1351628049_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreApplicationViewTitleBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1351628049_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreApplicationViewTitleBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("006d35e3e1f1431b950829b96926ac53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreApplicationViewTitleBar(ptr: Pointer?): WithDefault =
        ICoreApplicationViewTitleBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreApplicationViewTitleBar {
      val address = segment.toRawLongValue()
      return makeICoreApplicationViewTitleBar(Pointer(address))
    }

    public override fun toNative(obj: ICoreApplicationViewTitleBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1351628049_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreApplicationViewTitleBar):
        Array<ICoreApplicationViewTitleBar?> = (elements as
        Array<ICoreApplicationViewTitleBar?>).castToImpl<ICoreApplicationViewTitleBar,ICoreApplicationViewTitleBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreApplicationViewTitleBar?> =
        arrayOfNulls<ICoreApplicationViewTitleBar_Impl>(size) as
        Array<ICoreApplicationViewTitleBar?>
  }
}
