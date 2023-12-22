package Windows.UI.UIAutomation.Core

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IRemoteAutomationWindow.ABI::class)
@Signature("{7c607689-496d-512a-9bd5-c050cfaf1428}")
@Guid("7c607689496d512a9bd5c050cfaf1428")
@WinRTInterface("7c607689496d512a9bd5c050cfaf1428")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteAutomationWindow.ByReference::class)
public interface IRemoteAutomationWindow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AutomationProvider(): IUnknown?

  @InterfaceMethod(1)
  public fun UnregisterAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteAutomationWindow> {
    public override fun getValue() = ABI.makeIRemoteAutomationWindow(pointer.getPointer(0))

    public fun setValue(value: IRemoteAutomationWindow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteAutomationWindow {
    public val __944622653_Ptr: Pointer?

    public val _944622653_VtblPtr: Pointer?
      get() = __944622653_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AutomationProvider(): IUnknown? {
      val fnPtr = _944622653_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__944622653_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UnregisterAsync(): IAsyncAction? {
      val fnPtr = _944622653_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__944622653_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteAutomationWindow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __944622653_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteAutomationWindow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c607689496d512a9bd5c050cfaf1428")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteAutomationWindow(ptr: Pointer?): WithDefault =
        IRemoteAutomationWindow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteAutomationWindow {
      val address = segment.toRawLongValue()
      return makeIRemoteAutomationWindow(Pointer(address))
    }

    public override fun toNative(obj: IRemoteAutomationWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__944622653_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteAutomationWindow): Array<IRemoteAutomationWindow?>
        = (elements as
        Array<IRemoteAutomationWindow?>).castToImpl<IRemoteAutomationWindow,IRemoteAutomationWindow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteAutomationWindow?> =
        arrayOfNulls<IRemoteAutomationWindow_Impl>(size) as Array<IRemoteAutomationWindow?>
  }
}
