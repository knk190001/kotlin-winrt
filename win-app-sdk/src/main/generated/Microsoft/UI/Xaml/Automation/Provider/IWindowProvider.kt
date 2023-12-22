package Microsoft.UI.Xaml.Automation.Provider

import Microsoft.UI.Xaml.Automation.WindowInteractionState
import Microsoft.UI.Xaml.Automation.WindowVisualState
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWindowProvider.ABI::class)
@Signature("{83f1df99-9ddf-575e-a651-2ee657fd16e0}")
@Guid("83f1df999ddf575ea6512ee657fd16e0")
@WinRTInterface("83f1df999ddf575ea6512ee657fd16e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowProvider.ByReference::class)
public interface IWindowProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsModal(): Boolean

  @InterfaceMethod(1)
  public fun get_IsTopmost(): Boolean

  @InterfaceMethod(2)
  public fun get_Maximizable(): Boolean

  @InterfaceMethod(3)
  public fun get_Minimizable(): Boolean

  @InterfaceMethod(4)
  public fun get_InteractionState(): WindowInteractionState?

  @InterfaceMethod(5)
  public fun get_VisualState(): WindowVisualState?

  @InterfaceMethod(6)
  public fun Close(): Unit

  @InterfaceMethod(7)
  public fun SetVisualState(state: WindowVisualState?): Unit

  @InterfaceMethod(8)
  public fun WaitForInputIdle(milliseconds: Int): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowProvider> {
    public override fun getValue() = ABI.makeIWindowProvider(pointer.getPointer(0))

    public fun setValue(value: IWindowProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowProvider {
    public val __2118179278_Ptr: Pointer?

    public val _2118179278_VtblPtr: Pointer?
      get() = __2118179278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsModal(): Boolean {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsTopmost(): Boolean {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Maximizable(): Boolean {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Minimizable(): Boolean {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_InteractionState(): WindowInteractionState? {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowInteractionState>()
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowInteractionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_VisualState(): WindowVisualState? {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowVisualState>()
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowVisualState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun Close(): Unit {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SetVisualState(state: WindowVisualState?): Unit {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr, marshalToNative(state),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun WaitForInputIdle(milliseconds: Int): Boolean {
      val fnPtr = _2118179278_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2118179278_Ptr, milliseconds, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IWindowProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2118179278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83f1df999ddf575ea6512ee657fd16e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowProvider(ptr: Pointer?): WithDefault = IWindowProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowProvider {
      val address = segment.toRawLongValue()
      return makeIWindowProvider(Pointer(address))
    }

    public override fun toNative(obj: IWindowProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2118179278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowProvider): Array<IWindowProvider?> = (elements as
        Array<IWindowProvider?>).castToImpl<IWindowProvider,IWindowProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowProvider?> =
        arrayOfNulls<IWindowProvider_Impl>(size) as Array<IWindowProvider?>
  }
}
