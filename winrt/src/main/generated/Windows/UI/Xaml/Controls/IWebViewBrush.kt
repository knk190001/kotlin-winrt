package Windows.UI.Xaml.Controls

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebViewBrush.ABI::class)
@Signature("{40e86f75-0cf4-4b72-a4d6-cf5d15780116}")
@Guid("40e86f750cf44b72a4d6cf5d15780116")
@WinRTInterface("40e86f750cf44b72a4d6cf5d15780116")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewBrush.ByReference::class)
public interface IWebViewBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceName(): String?

  @InterfaceMethod(1)
  public fun put_SourceName(value: String?): Unit

  @InterfaceMethod(2)
  public fun Redraw(): Unit

  @InterfaceMethod(3)
  public fun SetSource(source: WebView?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IWebViewBrush>
      {
    public override fun getValue() = ABI.makeIWebViewBrush(pointer.getPointer(0))

    public fun setValue(value: IWebViewBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewBrush {
    public val __1059795133_Ptr: Pointer?

    public val _1059795133_VtblPtr: Pointer?
      get() = __1059795133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceName(): String? {
      val fnPtr = _1059795133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1059795133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SourceName(value: String?): Unit {
      val fnPtr = _1059795133_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1059795133_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Redraw(): Unit {
      val fnPtr = _1059795133_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1059795133_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetSource(source: WebView?): Unit {
      val fnPtr = _1059795133_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1059795133_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWebViewBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1059795133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40e86f750cf44b72a4d6cf5d15780116")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewBrush(ptr: Pointer?): WithDefault = IWebViewBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewBrush {
      val address = segment.toRawLongValue()
      return makeIWebViewBrush(Pointer(address))
    }

    public override fun toNative(obj: IWebViewBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1059795133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewBrush): Array<IWebViewBrush?> = (elements as
        Array<IWebViewBrush?>).castToImpl<IWebViewBrush,IWebViewBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewBrush?> =
        arrayOfNulls<IWebViewBrush_Impl>(size) as Array<IWebViewBrush?>
  }
}
