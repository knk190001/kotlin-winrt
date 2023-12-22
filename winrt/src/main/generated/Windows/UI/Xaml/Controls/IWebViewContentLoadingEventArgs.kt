package Windows.UI.Xaml.Controls

import Windows.Foundation.Uri
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

@ABIMarker(IWebViewContentLoadingEventArgs.ABI::class)
@Signature("{6e2980bb-98b8-413e-8129-971c6f7e4c8a}")
@Guid("6e2980bb98b8413e8129971c6f7e4c8a")
@WinRTInterface("6e2980bb98b8413e8129971c6f7e4c8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewContentLoadingEventArgs.ByReference::class)
public interface IWebViewContentLoadingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewContentLoadingEventArgs> {
    public override fun getValue() = ABI.makeIWebViewContentLoadingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewContentLoadingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewContentLoadingEventArgs {
    public val __652575255_Ptr: Pointer?

    public val _652575255_VtblPtr: Pointer?
      get() = __652575255_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _652575255_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__652575255_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewContentLoadingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __652575255_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewContentLoadingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e2980bb98b8413e8129971c6f7e4c8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewContentLoadingEventArgs(ptr: Pointer?): WithDefault =
        IWebViewContentLoadingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewContentLoadingEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewContentLoadingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewContentLoadingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__652575255_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewContentLoadingEventArgs):
        Array<IWebViewContentLoadingEventArgs?> = (elements as
        Array<IWebViewContentLoadingEventArgs?>).castToImpl<IWebViewContentLoadingEventArgs,IWebViewContentLoadingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewContentLoadingEventArgs?> =
        arrayOfNulls<IWebViewContentLoadingEventArgs_Impl>(size) as
        Array<IWebViewContentLoadingEventArgs?>
  }
}
