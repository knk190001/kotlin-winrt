package Microsoft.Web.WebView2.Core

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICoreWebView2AcceleratorKeyPressedEventArgs.ABI::class)
@Signature("{41a56100-92a5-59d1-9e71-9222e33ae38b}")
@Guid("41a5610092a559d19e719222e33ae38b")
@WinRTInterface("41a5610092a559d19e719222e33ae38b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2AcceleratorKeyPressedEventArgs.ByReference::class)
public interface ICoreWebView2AcceleratorKeyPressedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyEventKind(): CoreWebView2KeyEventKind?

  @InterfaceMethod(1)
  public fun get_VirtualKey(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_KeyEventLParam(): Int

  @InterfaceMethod(3)
  public fun get_PhysicalKeyStatus(): CoreWebView2PhysicalKeyStatus?

  @InterfaceMethod(4)
  public fun get_Handled(): Boolean

  @InterfaceMethod(5)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2AcceleratorKeyPressedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2AcceleratorKeyPressedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2AcceleratorKeyPressedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2AcceleratorKeyPressedEventArgs {
    public val __1319670992_Ptr: Pointer?

    public val _1319670992_VtblPtr: Pointer?
      get() = __1319670992_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyEventKind(): CoreWebView2KeyEventKind? {
      val fnPtr = _1319670992_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2KeyEventKind>()
      val hr = fn.invokeHR(arrayOf(__1319670992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2KeyEventKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VirtualKey(): WinDef.UINT {
      val fnPtr = _1319670992_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1319670992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_KeyEventLParam(): Int {
      val fnPtr = _1319670992_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1319670992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PhysicalKeyStatus(): CoreWebView2PhysicalKeyStatus? {
      val fnPtr = _1319670992_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__1319670992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PhysicalKeyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1319670992_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1319670992_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1319670992_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1319670992_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2AcceleratorKeyPressedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1319670992_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2AcceleratorKeyPressedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41a5610092a559d19e719222e33ae38b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2AcceleratorKeyPressedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2AcceleratorKeyPressedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2AcceleratorKeyPressedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2AcceleratorKeyPressedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2AcceleratorKeyPressedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1319670992_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2AcceleratorKeyPressedEventArgs):
        Array<ICoreWebView2AcceleratorKeyPressedEventArgs?> = (elements as
        Array<ICoreWebView2AcceleratorKeyPressedEventArgs?>).castToImpl<ICoreWebView2AcceleratorKeyPressedEventArgs,ICoreWebView2AcceleratorKeyPressedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2AcceleratorKeyPressedEventArgs?> =
        arrayOfNulls<ICoreWebView2AcceleratorKeyPressedEventArgs_Impl>(size) as
        Array<ICoreWebView2AcceleratorKeyPressedEventArgs?>
  }
}
