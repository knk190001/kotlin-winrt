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

@ABIMarker(ICoreFrameworkInputView.ABI::class)
@Signature("{d77c94ae-46b8-5d4a-9489-8ddec3d639a6}")
@Guid("d77c94ae46b85d4a94898ddec3d639a6")
@WinRTInterface("d77c94ae46b85d4a94898ddec3d639a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreFrameworkInputView.ByReference::class)
public interface ICoreFrameworkInputView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_PrimaryViewAnimationStarting(handler: TypedEventHandler<CoreFrameworkInputView?,
      CoreFrameworkInputViewAnimationStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_PrimaryViewAnimationStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_OcclusionsChanged(handler: TypedEventHandler<CoreFrameworkInputView?,
      CoreFrameworkInputViewOcclusionsChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_OcclusionsChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreFrameworkInputView> {
    public override fun getValue() = ABI.makeICoreFrameworkInputView(pointer.getPointer(0))

    public fun setValue(value: ICoreFrameworkInputView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreFrameworkInputView {
    public val __1422234749_Ptr: Pointer?

    public val _1422234749_VtblPtr: Pointer?
      get() = __1422234749_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_PrimaryViewAnimationStarting(handler: TypedEventHandler<CoreFrameworkInputView?,
        CoreFrameworkInputViewAnimationStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1422234749_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1422234749_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_PrimaryViewAnimationStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _1422234749_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422234749_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_OcclusionsChanged(handler: TypedEventHandler<CoreFrameworkInputView?,
        CoreFrameworkInputViewOcclusionsChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1422234749_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1422234749_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_OcclusionsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1422234749_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1422234749_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreFrameworkInputView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1422234749_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreFrameworkInputView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d77c94ae46b85d4a94898ddec3d639a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreFrameworkInputView(ptr: Pointer?): WithDefault =
        ICoreFrameworkInputView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreFrameworkInputView {
      val address = segment.toRawLongValue()
      return makeICoreFrameworkInputView(Pointer(address))
    }

    public override fun toNative(obj: ICoreFrameworkInputView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1422234749_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreFrameworkInputView): Array<ICoreFrameworkInputView?>
        = (elements as
        Array<ICoreFrameworkInputView?>).castToImpl<ICoreFrameworkInputView,ICoreFrameworkInputView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreFrameworkInputView?> =
        arrayOfNulls<ICoreFrameworkInputView_Impl>(size) as Array<ICoreFrameworkInputView?>
  }
}
