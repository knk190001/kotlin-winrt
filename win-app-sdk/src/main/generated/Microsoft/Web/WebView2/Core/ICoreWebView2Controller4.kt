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

@ABIMarker(ICoreWebView2Controller4.ABI::class)
@Signature("{94e2862d-4638-54ba-92cf-e31a31499b78}")
@Guid("94e2862d463854ba92cfe31a31499b78")
@WinRTInterface("94e2862d463854ba92cfe31a31499b78")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Controller4.ByReference::class)
public interface ICoreWebView2Controller4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowExternalDrop(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowExternalDrop(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Controller4> {
    public override fun getValue() = ABI.makeICoreWebView2Controller4(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Controller4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Controller4 {
    public val __1207357615_Ptr: Pointer?

    public val _1207357615_VtblPtr: Pointer?
      get() = __1207357615_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowExternalDrop(): Boolean {
      val fnPtr = _1207357615_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1207357615_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowExternalDrop(value: Boolean): Unit {
      val fnPtr = _1207357615_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1207357615_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Controller4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1207357615_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Controller4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94e2862d463854ba92cfe31a31499b78")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Controller4(ptr: Pointer?): WithDefault =
        ICoreWebView2Controller4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Controller4 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Controller4(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Controller4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1207357615_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Controller4):
        Array<ICoreWebView2Controller4?> = (elements as
        Array<ICoreWebView2Controller4?>).castToImpl<ICoreWebView2Controller4,ICoreWebView2Controller4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Controller4?> =
        arrayOfNulls<ICoreWebView2Controller4_Impl>(size) as Array<ICoreWebView2Controller4?>
  }
}
