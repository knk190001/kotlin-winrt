package Windows.UI.Xaml.Controls

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

@ABIMarker(IScrollViewer3.ABI::class)
@Signature("{74e9be21-5de2-595e-bc08-dbd3c577492c}")
@Guid("74e9be215de2595ebc08dbd3c577492c")
@WinRTInterface("74e9be215de2595ebc08dbd3c577492c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewer3.ByReference::class)
public interface IScrollViewer3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_DirectManipulationStarted(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_DirectManipulationStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_DirectManipulationCompleted(handler: EventHandler<IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DirectManipulationCompleted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IScrollViewer3>
      {
    public override fun getValue() = ABI.makeIScrollViewer3(pointer.getPointer(0))

    public fun setValue(value: IScrollViewer3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewer3 {
    public val __174137912_Ptr: Pointer?

    public val _174137912_VtblPtr: Pointer?
      get() = __174137912_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_DirectManipulationStarted(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _174137912_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__174137912_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_DirectManipulationStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _174137912_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137912_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_DirectManipulationCompleted(handler: EventHandler<IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _174137912_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__174137912_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DirectManipulationCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _174137912_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137912_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollViewer3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174137912_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewer3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74e9be215de2595ebc08dbd3c577492c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewer3(ptr: Pointer?): WithDefault = IScrollViewer3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewer3 {
      val address = segment.toRawLongValue()
      return makeIScrollViewer3(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewer3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174137912_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewer3): Array<IScrollViewer3?> = (elements as
        Array<IScrollViewer3?>).castToImpl<IScrollViewer3,IScrollViewer3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewer3?> =
        arrayOfNulls<IScrollViewer3_Impl>(size) as Array<IScrollViewer3?>
  }
}
