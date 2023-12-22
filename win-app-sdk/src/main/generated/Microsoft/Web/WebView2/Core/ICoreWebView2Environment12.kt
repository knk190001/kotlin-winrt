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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2Environment12.ABI::class)
@Signature("{82531ddb-be63-5254-812f-880d9f0ec54e}")
@Guid("82531ddbbe635254812f880d9f0ec54e")
@WinRTInterface("82531ddbbe635254812f880d9f0ec54e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Environment12.ByReference::class)
public interface ICoreWebView2Environment12 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSharedBuffer(Size: WinDef.ULONG): CoreWebView2SharedBuffer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Environment12> {
    public override fun getValue() = ABI.makeICoreWebView2Environment12(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Environment12_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Environment12 {
    public val __1129133165_Ptr: Pointer?

    public val _1129133165_VtblPtr: Pointer?
      get() = __1129133165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSharedBuffer(Size: WinDef.ULONG): CoreWebView2SharedBuffer? {
      val fnPtr = _1129133165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2SharedBuffer>()
      val hr = fn.invokeHR(arrayOf(__1129133165_Ptr, Size, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2SharedBuffer>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2Environment12_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1129133165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Environment12, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82531ddbbe635254812f880d9f0ec54e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Environment12(ptr: Pointer?): WithDefault =
        ICoreWebView2Environment12_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Environment12 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Environment12(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Environment12): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1129133165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Environment12):
        Array<ICoreWebView2Environment12?> = (elements as
        Array<ICoreWebView2Environment12?>).castToImpl<ICoreWebView2Environment12,ICoreWebView2Environment12_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Environment12?> =
        arrayOfNulls<ICoreWebView2Environment12_Impl>(size) as Array<ICoreWebView2Environment12?>
  }
}
