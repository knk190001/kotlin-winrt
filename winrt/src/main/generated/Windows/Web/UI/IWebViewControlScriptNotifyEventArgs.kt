package Windows.Web.UI

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebViewControlScriptNotifyEventArgs.ABI::class)
@Signature("{491de57b-6f49-41bb-b591-51b85b817037}")
@Guid("491de57b6f4941bbb59151b85b817037")
@WinRTInterface("491de57b6f4941bbb59151b85b817037")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlScriptNotifyEventArgs.ByReference::class)
public interface IWebViewControlScriptNotifyEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_Value(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlScriptNotifyEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlScriptNotifyEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlScriptNotifyEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlScriptNotifyEventArgs {
    public val __739412047_Ptr: Pointer?

    public val _739412047_VtblPtr: Pointer?
      get() = __739412047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _739412047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__739412047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _739412047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__739412047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlScriptNotifyEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __739412047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlScriptNotifyEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("491de57b6f4941bbb59151b85b817037")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlScriptNotifyEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlScriptNotifyEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewControlScriptNotifyEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlScriptNotifyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlScriptNotifyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__739412047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlScriptNotifyEventArgs):
        Array<IWebViewControlScriptNotifyEventArgs?> = (elements as
        Array<IWebViewControlScriptNotifyEventArgs?>).castToImpl<IWebViewControlScriptNotifyEventArgs,IWebViewControlScriptNotifyEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewControlScriptNotifyEventArgs?> =
        arrayOfNulls<IWebViewControlScriptNotifyEventArgs_Impl>(size) as
        Array<IWebViewControlScriptNotifyEventArgs?>
  }
}
