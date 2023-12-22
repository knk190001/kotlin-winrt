package Microsoft.Web.WebView2.Core

import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
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

@ABIMarker(CoreWebView2Profile_Manual.ABI::class)
@Signature("{b42bfab4-c4bf-5469-89ac-cadc69e3b0f5}")
@Guid("b42bfab4c4bf546989accadc69e3b0f5")
@WinRTInterface("b42bfab4c4bf546989accadc69e3b0f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = CoreWebView2Profile_Manual.ByReference::class)
public interface CoreWebView2Profile_Manual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ClearBrowsingDataAsync(
    dataKinds: CoreWebView2BrowsingDataKinds?,
    startTime: DateTime?,
    endTime: DateTime?
  ): IAsyncAction?

  @InterfaceMethod(1)
  public fun ClearBrowsingDataAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Profile_Manual> {
    public override fun getValue() = ABI.makeCoreWebView2Profile_Manual(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Profile_Manual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : CoreWebView2Profile_Manual {
    public val __1479330766_Ptr: Pointer?

    public val _1479330766_VtblPtr: Pointer?
      get() = __1479330766_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ClearBrowsingDataAsync(
      dataKinds: CoreWebView2BrowsingDataKinds?,
      startTime: DateTime?,
      endTime: DateTime?
    ): IAsyncAction? {
      val fnPtr = _1479330766_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1479330766_Ptr, marshalToNative(dataKinds),
          marshalToNative(startTime), marshalToNative(endTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ClearBrowsingDataAsync(): IAsyncAction? {
      val fnPtr = _1479330766_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1479330766_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class CoreWebView2Profile_Manual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1479330766_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<CoreWebView2Profile_Manual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b42bfab4c4bf546989accadc69e3b0f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeCoreWebView2Profile_Manual(ptr: Pointer?): WithDefault =
        CoreWebView2Profile_Manual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Profile_Manual {
      val address = segment.toRawLongValue()
      return makeCoreWebView2Profile_Manual(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Profile_Manual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1479330766_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: CoreWebView2Profile_Manual):
        Array<CoreWebView2Profile_Manual?> = (elements as
        Array<CoreWebView2Profile_Manual?>).castToImpl<CoreWebView2Profile_Manual,CoreWebView2Profile_Manual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<CoreWebView2Profile_Manual?> =
        arrayOfNulls<CoreWebView2Profile_Manual_Impl>(size) as Array<CoreWebView2Profile_Manual?>
  }
}
