package Windows.Web.UI.Interop

import Windows.System.VirtualKey
import Windows.UI.Core.CoreAcceleratorKeyEventType
import Windows.UI.Core.CorePhysicalKeyStatus
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

@ABIMarker(IWebViewControlAcceleratorKeyPressedEventArgs.ABI::class)
@Signature("{77a2a53e-7c74-437d-a290-3ac0d8cd5655}")
@Guid("77a2a53e7c74437da2903ac0d8cd5655")
@WinRTInterface("77a2a53e7c74437da2903ac0d8cd5655")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlAcceleratorKeyPressedEventArgs.ByReference::class)
public interface IWebViewControlAcceleratorKeyPressedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EventType(): CoreAcceleratorKeyEventType?

  @InterfaceMethod(1)
  public fun get_VirtualKey(): VirtualKey?

  @InterfaceMethod(2)
  public fun get_KeyStatus(): CorePhysicalKeyStatus?

  @InterfaceMethod(3)
  public fun get_RoutingStage(): WebViewControlAcceleratorKeyRoutingStage?

  @InterfaceMethod(4)
  public fun get_Handled(): Boolean

  @InterfaceMethod(5)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlAcceleratorKeyPressedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlAcceleratorKeyPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlAcceleratorKeyPressedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlAcceleratorKeyPressedEventArgs {
    public val __73754766_Ptr: Pointer?

    public val _73754766_VtblPtr: Pointer?
      get() = __73754766_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EventType(): CoreAcceleratorKeyEventType? {
      val fnPtr = _73754766_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreAcceleratorKeyEventType>()
      val hr = fn.invokeHR(arrayOf(__73754766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreAcceleratorKeyEventType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VirtualKey(): VirtualKey? {
      val fnPtr = _73754766_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKey>()
      val hr = fn.invokeHR(arrayOf(__73754766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKey>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_KeyStatus(): CorePhysicalKeyStatus? {
      val fnPtr = _73754766_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CorePhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__73754766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CorePhysicalKeyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RoutingStage(): WebViewControlAcceleratorKeyRoutingStage? {
      val fnPtr = _73754766_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebViewControlAcceleratorKeyRoutingStage>()
      val hr = fn.invokeHR(arrayOf(__73754766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<WebViewControlAcceleratorKeyRoutingStage>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Handled(): Boolean {
      val fnPtr = _73754766_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__73754766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _73754766_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__73754766_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewControlAcceleratorKeyPressedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __73754766_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlAcceleratorKeyPressedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("77a2a53e7c74437da2903ac0d8cd5655")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlAcceleratorKeyPressedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlAcceleratorKeyPressedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlAcceleratorKeyPressedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlAcceleratorKeyPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlAcceleratorKeyPressedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__73754766_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlAcceleratorKeyPressedEventArgs):
        Array<IWebViewControlAcceleratorKeyPressedEventArgs?> = (elements as
        Array<IWebViewControlAcceleratorKeyPressedEventArgs?>).castToImpl<IWebViewControlAcceleratorKeyPressedEventArgs,IWebViewControlAcceleratorKeyPressedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlAcceleratorKeyPressedEventArgs?> =
        arrayOfNulls<IWebViewControlAcceleratorKeyPressedEventArgs_Impl>(size) as
        Array<IWebViewControlAcceleratorKeyPressedEventArgs?>
  }
}
