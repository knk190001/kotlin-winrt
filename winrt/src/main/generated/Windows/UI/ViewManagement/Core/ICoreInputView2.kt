package Windows.UI.ViewManagement.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
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

@ABIMarker(ICoreInputView2.ABI::class)
@Signature("{0ed726c1-e09a-4ae8-aedf-dfa4857d1a01}")
@Guid("0ed726c1e09a4ae8aedfdfa4857d1a01")
@WinRTInterface("0ed726c1e09a4ae8aedfdfa4857d1a01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputView2.ByReference::class)
public interface ICoreInputView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_XYFocusTransferringFromPrimaryView(handler: TypedEventHandler<CoreInputView?,
      CoreInputViewTransferringXYFocusEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_XYFocusTransferringFromPrimaryView(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_XYFocusTransferredToPrimaryView(handler: TypedEventHandler<CoreInputView?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_XYFocusTransferredToPrimaryView(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun TryTransferXYFocusToPrimaryView(origin: Rect?,
      direction: CoreInputViewXYFocusTransferDirection?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputView2> {
    public override fun getValue() = ABI.makeICoreInputView2(pointer.getPointer(0))

    public fun setValue(value: ICoreInputView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputView2 {
    public val __1575919403_Ptr: Pointer?

    public val _1575919403_VtblPtr: Pointer?
      get() = __1575919403_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_XYFocusTransferringFromPrimaryView(handler: TypedEventHandler<CoreInputView?,
        CoreInputViewTransferringXYFocusEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1575919403_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1575919403_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_XYFocusTransferringFromPrimaryView(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1575919403_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1575919403_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_XYFocusTransferredToPrimaryView(handler: TypedEventHandler<CoreInputView?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1575919403_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1575919403_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_XYFocusTransferredToPrimaryView(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1575919403_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1575919403_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun TryTransferXYFocusToPrimaryView(origin: Rect?,
        direction: CoreInputViewXYFocusTransferDirection?): Boolean {
      val fnPtr = _1575919403_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575919403_Ptr, marshalToNative(origin),
          marshalToNative(direction), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreInputView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1575919403_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ed726c1e09a4ae8aedfdfa4857d1a01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputView2(ptr: Pointer?): WithDefault = ICoreInputView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputView2 {
      val address = segment.toRawLongValue()
      return makeICoreInputView2(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1575919403_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputView2): Array<ICoreInputView2?> = (elements as
        Array<ICoreInputView2?>).castToImpl<ICoreInputView2,ICoreInputView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputView2?> =
        arrayOfNulls<ICoreInputView2_Impl>(size) as Array<ICoreInputView2?>
  }
}
