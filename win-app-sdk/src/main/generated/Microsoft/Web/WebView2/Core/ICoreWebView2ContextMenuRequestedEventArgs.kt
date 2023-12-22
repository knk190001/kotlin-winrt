package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Deferral
import Windows.Foundation.Point
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

@ABIMarker(ICoreWebView2ContextMenuRequestedEventArgs.ABI::class)
@Signature("{d77bdd8c-9b3e-596e-ae80-320c0df4ecbc}")
@Guid("d77bdd8c9b3e596eae80320c0df4ecbc")
@WinRTInterface("d77bdd8c9b3e596eae80320c0df4ecbc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2ContextMenuRequestedEventArgs.ByReference::class)
public interface ICoreWebView2ContextMenuRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MenuItems(): IVector<CoreWebView2ContextMenuItem?>?

  @InterfaceMethod(1)
  public fun get_ContextMenuTarget(): CoreWebView2ContextMenuTarget?

  @InterfaceMethod(2)
  public fun get_Location(): Point?

  @InterfaceMethod(3)
  public fun get_SelectedCommandId(): Int

  @InterfaceMethod(4)
  public fun put_SelectedCommandId(value: Int): Unit

  @InterfaceMethod(5)
  public fun get_Handled(): Boolean

  @InterfaceMethod(6)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(7)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2ContextMenuRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2ContextMenuRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2ContextMenuRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2ContextMenuRequestedEventArgs {
    public val __399359504_Ptr: Pointer?

    public val _399359504_VtblPtr: Pointer?
      get() = __399359504_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MenuItems(): IVector<CoreWebView2ContextMenuItem?>? {
      val fnPtr = _399359504_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<CoreWebView2ContextMenuItem?>>()
      val hr = fn.invokeHR(arrayOf(__399359504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<CoreWebView2ContextMenuItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContextMenuTarget(): CoreWebView2ContextMenuTarget? {
      val fnPtr = _399359504_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2ContextMenuTarget>()
      val hr = fn.invokeHR(arrayOf(__399359504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2ContextMenuTarget>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Location(): Point? {
      val fnPtr = _399359504_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__399359504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SelectedCommandId(): Int {
      val fnPtr = _399359504_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__399359504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_SelectedCommandId(value: Int): Unit {
      val fnPtr = _399359504_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__399359504_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Handled(): Boolean {
      val fnPtr = _399359504_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__399359504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _399359504_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__399359504_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _399359504_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__399359504_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2ContextMenuRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __399359504_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2ContextMenuRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d77bdd8c9b3e596eae80320c0df4ecbc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2ContextMenuRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2ContextMenuRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2ContextMenuRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2ContextMenuRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2ContextMenuRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__399359504_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2ContextMenuRequestedEventArgs):
        Array<ICoreWebView2ContextMenuRequestedEventArgs?> = (elements as
        Array<ICoreWebView2ContextMenuRequestedEventArgs?>).castToImpl<ICoreWebView2ContextMenuRequestedEventArgs,ICoreWebView2ContextMenuRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2ContextMenuRequestedEventArgs?> =
        arrayOfNulls<ICoreWebView2ContextMenuRequestedEventArgs_Impl>(size) as
        Array<ICoreWebView2ContextMenuRequestedEventArgs?>
  }
}
