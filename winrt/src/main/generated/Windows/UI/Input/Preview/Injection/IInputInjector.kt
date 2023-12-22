package Windows.UI.Input.Preview.Injection

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IInputInjector.ABI::class)
@Signature("{8ec26f84-0b02-4bd2-ad7a-3d4658be3e18}")
@Guid("8ec26f840b024bd2ad7a3d4658be3e18")
@WinRTInterface("8ec26f840b024bd2ad7a3d4658be3e18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputInjector.ByReference::class)
public interface IInputInjector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InjectKeyboardInput(input: IIterable<InjectedInputKeyboardInfo?>?): Unit

  @InterfaceMethod(1)
  public fun InjectMouseInput(input: IIterable<InjectedInputMouseInfo?>?): Unit

  @InterfaceMethod(2)
  public fun InitializeTouchInjection(visualMode: InjectedInputVisualizationMode?): Unit

  @InterfaceMethod(3)
  public fun InjectTouchInput(input: IIterable<InjectedInputTouchInfo?>?): Unit

  @InterfaceMethod(4)
  public fun UninitializeTouchInjection(): Unit

  @InterfaceMethod(5)
  public fun InitializePenInjection(visualMode: InjectedInputVisualizationMode?): Unit

  @InterfaceMethod(6)
  public fun InjectPenInput(input: InjectedInputPenInfo?): Unit

  @InterfaceMethod(7)
  public fun UninitializePenInjection(): Unit

  @InterfaceMethod(8)
  public fun InjectShortcut(shortcut: InjectedInputShortcut?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInputInjector>
      {
    public override fun getValue() = ABI.makeIInputInjector(pointer.getPointer(0))

    public fun setValue(value: IInputInjector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputInjector {
    public val __625919853_Ptr: Pointer?

    public val _625919853_VtblPtr: Pointer?
      get() = __625919853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InjectKeyboardInput(input: IIterable<InjectedInputKeyboardInfo?>?): Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun InjectMouseInput(input: IIterable<InjectedInputMouseInfo?>?): Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun InitializeTouchInjection(visualMode: InjectedInputVisualizationMode?):
        Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, marshalToNative(visualMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun InjectTouchInput(input: IIterable<InjectedInputTouchInfo?>?): Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun UninitializeTouchInjection(): Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun InitializePenInjection(visualMode: InjectedInputVisualizationMode?): Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, marshalToNative(visualMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun InjectPenInput(input: InjectedInputPenInfo?): Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun UninitializePenInjection(): Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun InjectShortcut(shortcut: InjectedInputShortcut?): Unit {
      val fnPtr = _625919853_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__625919853_Ptr, marshalToNative(shortcut),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInputInjector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __625919853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputInjector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ec26f840b024bd2ad7a3d4658be3e18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputInjector(ptr: Pointer?): WithDefault = IInputInjector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputInjector {
      val address = segment.toRawLongValue()
      return makeIInputInjector(Pointer(address))
    }

    public override fun toNative(obj: IInputInjector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__625919853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputInjector): Array<IInputInjector?> = (elements as
        Array<IInputInjector?>).castToImpl<IInputInjector,IInputInjector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputInjector?> =
        arrayOfNulls<IInputInjector_Impl>(size) as Array<IInputInjector?>
  }
}
