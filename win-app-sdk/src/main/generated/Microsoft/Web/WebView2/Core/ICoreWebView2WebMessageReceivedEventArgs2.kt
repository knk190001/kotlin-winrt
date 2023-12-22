package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(ICoreWebView2WebMessageReceivedEventArgs2.ABI::class)
@Signature("{71dc5fa0-08a0-5dea-9363-799df5021452}")
@Guid("71dc5fa008a05dea9363799df5021452")
@WinRTInterface("71dc5fa008a05dea9363799df5021452")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2WebMessageReceivedEventArgs2.ByReference::class)
public interface ICoreWebView2WebMessageReceivedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdditionalObjects(): IVectorView<IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2WebMessageReceivedEventArgs2> {
    public override fun getValue() =
        ABI.makeICoreWebView2WebMessageReceivedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2WebMessageReceivedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2WebMessageReceivedEventArgs2 {
    public val __1853609622_Ptr: Pointer?

    public val _1853609622_VtblPtr: Pointer?
      get() = __1853609622_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdditionalObjects(): IVectorView<IUnknown?>? {
      val fnPtr = _1853609622_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1853609622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2WebMessageReceivedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1853609622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2WebMessageReceivedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71dc5fa008a05dea9363799df5021452")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2WebMessageReceivedEventArgs2(ptr: Pointer?): WithDefault =
        ICoreWebView2WebMessageReceivedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICoreWebView2WebMessageReceivedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2WebMessageReceivedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2WebMessageReceivedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1853609622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2WebMessageReceivedEventArgs2):
        Array<ICoreWebView2WebMessageReceivedEventArgs2?> = (elements as
        Array<ICoreWebView2WebMessageReceivedEventArgs2?>).castToImpl<ICoreWebView2WebMessageReceivedEventArgs2,ICoreWebView2WebMessageReceivedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2WebMessageReceivedEventArgs2?> =
        arrayOfNulls<ICoreWebView2WebMessageReceivedEventArgs2_Impl>(size) as
        Array<ICoreWebView2WebMessageReceivedEventArgs2?>
  }
}
