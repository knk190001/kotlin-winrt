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

@ABIMarker(IWebViewControlUnviewableContentIdentifiedEventArgs.ABI::class)
@Signature("{4a9680db-88f2-4e20-b693-b4e2df4aa581}")
@Guid("4a9680db88f24e20b693b4e2df4aa581")
@WinRTInterface("4a9680db88f24e20b693b4e2df4aa581")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewControlUnviewableContentIdentifiedEventArgs.ByReference::class)
public interface IWebViewControlUnviewableContentIdentifiedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_Referrer(): Uri?

  @InterfaceMethod(2)
  public fun get_MediaType(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewControlUnviewableContentIdentifiedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewControlUnviewableContentIdentifiedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewControlUnviewableContentIdentifiedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewControlUnviewableContentIdentifiedEventArgs {
    public val __1838337903_Ptr: Pointer?

    public val _1838337903_VtblPtr: Pointer?
      get() = __1838337903_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1838337903_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1838337903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Referrer(): Uri? {
      val fnPtr = _1838337903_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1838337903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MediaType(): String? {
      val fnPtr = _1838337903_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1838337903_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewControlUnviewableContentIdentifiedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1838337903_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewControlUnviewableContentIdentifiedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a9680db88f24e20b693b4e2df4aa581")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewControlUnviewableContentIdentifiedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewControlUnviewableContentIdentifiedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewControlUnviewableContentIdentifiedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewControlUnviewableContentIdentifiedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewControlUnviewableContentIdentifiedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1838337903_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewControlUnviewableContentIdentifiedEventArgs):
        Array<IWebViewControlUnviewableContentIdentifiedEventArgs?> = (elements as
        Array<IWebViewControlUnviewableContentIdentifiedEventArgs?>).castToImpl<IWebViewControlUnviewableContentIdentifiedEventArgs,IWebViewControlUnviewableContentIdentifiedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IWebViewControlUnviewableContentIdentifiedEventArgs?> =
        arrayOfNulls<IWebViewControlUnviewableContentIdentifiedEventArgs_Impl>(size) as
        Array<IWebViewControlUnviewableContentIdentifiedEventArgs?>
  }
}
