package Windows.UI.Xaml.Media

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

@ABIMarker(ICompositionTargetStatics3.ABI::class)
@Signature("{bc0a7cd9-6750-4708-994c-2028e0312ac8}")
@Guid("bc0a7cd967504708994c2028e0312ac8")
@WinRTInterface("bc0a7cd967504708994c2028e0312ac8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionTargetStatics3.ByReference::class)
public interface ICompositionTargetStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Rendered(handler: EventHandler<RenderedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Rendered(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionTargetStatics3> {
    public override fun getValue() = ABI.makeICompositionTargetStatics3(pointer.getPointer(0))

    public fun setValue(value: ICompositionTargetStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionTargetStatics3 {
    public val __223136883_Ptr: Pointer?

    public val _223136883_VtblPtr: Pointer?
      get() = __223136883_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Rendered(handler: EventHandler<RenderedEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _223136883_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__223136883_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Rendered(token: EventRegistrationToken?): Unit {
      val fnPtr = _223136883_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__223136883_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionTargetStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __223136883_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionTargetStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc0a7cd967504708994c2028e0312ac8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionTargetStatics3(ptr: Pointer?): WithDefault =
        ICompositionTargetStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionTargetStatics3 {
      val address = segment.toRawLongValue()
      return makeICompositionTargetStatics3(Pointer(address))
    }

    public override fun toNative(obj: ICompositionTargetStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__223136883_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionTargetStatics3):
        Array<ICompositionTargetStatics3?> = (elements as
        Array<ICompositionTargetStatics3?>).castToImpl<ICompositionTargetStatics3,ICompositionTargetStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionTargetStatics3?> =
        arrayOfNulls<ICompositionTargetStatics3_Impl>(size) as Array<ICompositionTargetStatics3?>
  }
}
