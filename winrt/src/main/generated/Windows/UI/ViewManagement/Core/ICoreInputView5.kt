package Windows.UI.ViewManagement.Core

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

@ABIMarker(ICoreInputView5.ABI::class)
@Signature("{136316e0-c6d5-5c57-811e-1ad8a99ba6ab}")
@Guid("136316e0c6d55c57811e1ad8a99ba6ab")
@WinRTInterface("136316e0c6d55c57811e1ad8a99ba6ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreInputView5.ByReference::class)
public interface ICoreInputView5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsKindSupported(type: CoreInputViewKind?): Boolean

  @InterfaceMethod(1)
  public fun add_SupportedKindsChanged(handler: TypedEventHandler<CoreInputView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_SupportedKindsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_PrimaryViewAnimationStarting(handler: TypedEventHandler<CoreInputView?,
      CoreInputViewAnimationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PrimaryViewAnimationStarting(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreInputView5> {
    public override fun getValue() = ABI.makeICoreInputView5(pointer.getPointer(0))

    public fun setValue(value: ICoreInputView5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreInputView5 {
    public val __1575919400_Ptr: Pointer?

    public val _1575919400_VtblPtr: Pointer?
      get() = __1575919400_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsKindSupported(type: CoreInputViewKind?): Boolean {
      val fnPtr = _1575919400_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1575919400_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_SupportedKindsChanged(handler: TypedEventHandler<CoreInputView?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1575919400_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1575919400_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_SupportedKindsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1575919400_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1575919400_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_PrimaryViewAnimationStarting(handler: TypedEventHandler<CoreInputView?,
        CoreInputViewAnimationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1575919400_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1575919400_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PrimaryViewAnimationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1575919400_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1575919400_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreInputView5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1575919400_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreInputView5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("136316e0c6d55c57811e1ad8a99ba6ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreInputView5(ptr: Pointer?): WithDefault = ICoreInputView5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreInputView5 {
      val address = segment.toRawLongValue()
      return makeICoreInputView5(Pointer(address))
    }

    public override fun toNative(obj: ICoreInputView5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1575919400_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreInputView5): Array<ICoreInputView5?> = (elements as
        Array<ICoreInputView5?>).castToImpl<ICoreInputView5,ICoreInputView5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreInputView5?> =
        arrayOfNulls<ICoreInputView5_Impl>(size) as Array<ICoreInputView5?>
  }
}
