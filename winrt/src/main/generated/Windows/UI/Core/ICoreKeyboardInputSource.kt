package Windows.UI.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.System.VirtualKey
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

@ABIMarker(ICoreKeyboardInputSource.ABI::class)
@Signature("{231c9088-e469-4df1-b208-6e490d71cb90}")
@Guid("231c9088e4694df1b2086e490d71cb90")
@WinRTInterface("231c9088e4694df1b2086e490d71cb90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreKeyboardInputSource.ByReference::class)
public interface ICoreKeyboardInputSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCurrentKeyState(virtualKey: VirtualKey?): CoreVirtualKeyStates?

  @InterfaceMethod(1)
  public fun add_CharacterReceived(handler: TypedEventHandler<IUnknown?,
      CharacterReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_CharacterReceived(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_KeyDown(handler: TypedEventHandler<IUnknown?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_KeyDown(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_KeyUp(handler: TypedEventHandler<IUnknown?, KeyEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_KeyUp(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreKeyboardInputSource> {
    public override fun getValue() = ABI.makeICoreKeyboardInputSource(pointer.getPointer(0))

    public fun setValue(value: ICoreKeyboardInputSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreKeyboardInputSource {
    public val __2008525252_Ptr: Pointer?

    public val _2008525252_VtblPtr: Pointer?
      get() = __2008525252_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCurrentKeyState(virtualKey: VirtualKey?): CoreVirtualKeyStates? {
      val fnPtr = _2008525252_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreVirtualKeyStates>()
      val hr = fn.invokeHR(arrayOf(__2008525252_Ptr, marshalToNative(virtualKey), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreVirtualKeyStates>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_CharacterReceived(handler: TypedEventHandler<IUnknown?,
        CharacterReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2008525252_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2008525252_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_CharacterReceived(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _2008525252_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2008525252_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_KeyDown(handler: TypedEventHandler<IUnknown?, KeyEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _2008525252_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2008525252_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_KeyDown(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _2008525252_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2008525252_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_KeyUp(handler: TypedEventHandler<IUnknown?, KeyEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _2008525252_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2008525252_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_KeyUp(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _2008525252_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2008525252_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreKeyboardInputSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2008525252_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreKeyboardInputSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("231c9088e4694df1b2086e490d71cb90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreKeyboardInputSource(ptr: Pointer?): WithDefault =
        ICoreKeyboardInputSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreKeyboardInputSource {
      val address = segment.toRawLongValue()
      return makeICoreKeyboardInputSource(Pointer(address))
    }

    public override fun toNative(obj: ICoreKeyboardInputSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2008525252_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreKeyboardInputSource):
        Array<ICoreKeyboardInputSource?> = (elements as
        Array<ICoreKeyboardInputSource?>).castToImpl<ICoreKeyboardInputSource,ICoreKeyboardInputSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreKeyboardInputSource?> =
        arrayOfNulls<ICoreKeyboardInputSource_Impl>(size) as Array<ICoreKeyboardInputSource?>
  }
}
