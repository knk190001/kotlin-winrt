package Microsoft.Web.WebView2.Core

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(CoreWebView2Profile_Manual2.ABI::class)
@Signature("{6e62815a-6269-5756-92c3-f08afe17649c}")
@Guid("6e62815a6269575692c3f08afe17649c")
@WinRTInterface("6e62815a6269575692c3f08afe17649c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = CoreWebView2Profile_Manual2.ByReference::class)
public interface CoreWebView2Profile_Manual2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetNonDefaultPermissionSettingsAsync():
      IAsyncOperation<IVectorView<CoreWebView2PermissionSetting?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Profile_Manual2> {
    public override fun getValue() = ABI.makeCoreWebView2Profile_Manual2(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Profile_Manual2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : CoreWebView2Profile_Manual2 {
    public val __1385386460_Ptr: Pointer?

    public val _1385386460_VtblPtr: Pointer?
      get() = __1385386460_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetNonDefaultPermissionSettingsAsync():
        IAsyncOperation<IVectorView<CoreWebView2PermissionSetting?>?>? {
      val fnPtr = _1385386460_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result =
          makeByReferenceType<IAsyncOperation<IVectorView<CoreWebView2PermissionSetting?>?>>()
      val hr = fn.invokeHR(arrayOf(__1385386460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<CoreWebView2PermissionSetting?>?>>(result.getValue())
      return resultValue
    }
  }

  public class CoreWebView2Profile_Manual2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1385386460_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<CoreWebView2Profile_Manual2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e62815a6269575692c3f08afe17649c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeCoreWebView2Profile_Manual2(ptr: Pointer?): WithDefault =
        CoreWebView2Profile_Manual2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Profile_Manual2 {
      val address = segment.toRawLongValue()
      return makeCoreWebView2Profile_Manual2(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Profile_Manual2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1385386460_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: CoreWebView2Profile_Manual2):
        Array<CoreWebView2Profile_Manual2?> = (elements as
        Array<CoreWebView2Profile_Manual2?>).castToImpl<CoreWebView2Profile_Manual2,CoreWebView2Profile_Manual2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<CoreWebView2Profile_Manual2?> =
        arrayOfNulls<CoreWebView2Profile_Manual2_Impl>(size) as Array<CoreWebView2Profile_Manual2?>
  }
}
