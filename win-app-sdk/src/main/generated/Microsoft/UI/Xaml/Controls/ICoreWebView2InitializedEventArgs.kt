package Microsoft.UI.Xaml.Controls

import Windows.Foundation.HResult
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

@ABIMarker(ICoreWebView2InitializedEventArgs.ABI::class)
@Signature("{ee59d277-8b2e-57ab-8631-91d27b12ebd9}")
@Guid("ee59d2778b2e57ab863191d27b12ebd9")
@WinRTInterface("ee59d2778b2e57ab863191d27b12ebd9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2InitializedEventArgs.ByReference::class)
public interface ICoreWebView2InitializedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exception(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2InitializedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreWebView2InitializedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2InitializedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2InitializedEventArgs {
    public val __326855678_Ptr: Pointer?

    public val _326855678_VtblPtr: Pointer?
      get() = __326855678_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exception(): HResult? {
      val fnPtr = _326855678_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__326855678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ICoreWebView2InitializedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __326855678_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2InitializedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee59d2778b2e57ab863191d27b12ebd9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2InitializedEventArgs(ptr: Pointer?): WithDefault =
        ICoreWebView2InitializedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2InitializedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreWebView2InitializedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2InitializedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__326855678_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2InitializedEventArgs):
        Array<ICoreWebView2InitializedEventArgs?> = (elements as
        Array<ICoreWebView2InitializedEventArgs?>).castToImpl<ICoreWebView2InitializedEventArgs,ICoreWebView2InitializedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2InitializedEventArgs?> =
        arrayOfNulls<ICoreWebView2InitializedEventArgs_Impl>(size) as
        Array<ICoreWebView2InitializedEventArgs?>
  }
}
