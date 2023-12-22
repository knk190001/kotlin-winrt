package Windows.UI.ViewManagement

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

@ABIMarker(IInputPane.ABI::class)
@Signature("{640ada70-06f3-4c87-a678-9829c9127c28}")
@Guid("640ada7006f34c87a6789829c9127c28")
@WinRTInterface("640ada7006f34c87a6789829c9127c28")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputPane.ByReference::class)
public interface IInputPane : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Showing(handler: TypedEventHandler<InputPane?, InputPaneVisibilityEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Showing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Hiding(handler: TypedEventHandler<InputPane?, InputPaneVisibilityEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Hiding(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_OccludedRect(): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInputPane> {
    public override fun getValue() = ABI.makeIInputPane(pointer.getPointer(0))

    public fun setValue(value: IInputPane_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputPane {
    public val __1005432832_Ptr: Pointer?

    public val _1005432832_VtblPtr: Pointer?
      get() = __1005432832_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Showing(handler: TypedEventHandler<InputPane?,
        InputPaneVisibilityEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1005432832_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1005432832_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Showing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1005432832_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1005432832_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_Hiding(handler: TypedEventHandler<InputPane?,
        InputPaneVisibilityEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1005432832_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1005432832_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Hiding(token: EventRegistrationToken?): Unit {
      val fnPtr = _1005432832_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1005432832_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OccludedRect(): Rect? {
      val fnPtr = _1005432832_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1005432832_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IInputPane_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1005432832_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputPane, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("640ada7006f34c87a6789829c9127c28")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputPane(ptr: Pointer?): WithDefault = IInputPane_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputPane {
      val address = segment.toRawLongValue()
      return makeIInputPane(Pointer(address))
    }

    public override fun toNative(obj: IInputPane): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1005432832_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputPane): Array<IInputPane?> = (elements as
        Array<IInputPane?>).castToImpl<IInputPane,IInputPane_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputPane?> = arrayOfNulls<IInputPane_Impl>(size)
        as Array<IInputPane?>
  }
}
