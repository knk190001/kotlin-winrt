package Windows.UI.Core.Preview

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(ISystemNavigationManagerPreview.ABI::class)
@Signature("{ec5f0488-6425-4777-a536-cb5634427f0d}")
@Guid("ec5f048864254777a536cb5634427f0d")
@WinRTInterface("ec5f048864254777a536cb5634427f0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemNavigationManagerPreview.ByReference::class)
public interface ISystemNavigationManagerPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_CloseRequested(handler: EventHandler<SystemNavigationCloseRequestedPreviewEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_CloseRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemNavigationManagerPreview> {
    public override fun getValue() = ABI.makeISystemNavigationManagerPreview(pointer.getPointer(0))

    public fun setValue(value: ISystemNavigationManagerPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemNavigationManagerPreview {
    public val __96337279_Ptr: Pointer?

    public val _96337279_VtblPtr: Pointer?
      get() = __96337279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_CloseRequested(handler: EventHandler<SystemNavigationCloseRequestedPreviewEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _96337279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__96337279_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_CloseRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _96337279_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__96337279_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemNavigationManagerPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __96337279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemNavigationManagerPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ec5f048864254777a536cb5634427f0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemNavigationManagerPreview(ptr: Pointer?): WithDefault =
        ISystemNavigationManagerPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemNavigationManagerPreview {
      val address = segment.toRawLongValue()
      return makeISystemNavigationManagerPreview(Pointer(address))
    }

    public override fun toNative(obj: ISystemNavigationManagerPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__96337279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemNavigationManagerPreview):
        Array<ISystemNavigationManagerPreview?> = (elements as
        Array<ISystemNavigationManagerPreview?>).castToImpl<ISystemNavigationManagerPreview,ISystemNavigationManagerPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemNavigationManagerPreview?> =
        arrayOfNulls<ISystemNavigationManagerPreview_Impl>(size) as
        Array<ISystemNavigationManagerPreview?>
  }
}
