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

@ABIMarker(IWebViewUnviewableContentIdentifiedEventArgs.ABI::class)
@Signature("{37bc16e1-6062-4678-b20b-6c36ac9c59ac}")
@Guid("37bc16e160624678b20b6c36ac9c59ac")
@WinRTInterface("37bc16e160624678b20b6c36ac9c59ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewUnviewableContentIdentifiedEventArgs.ByReference::class)
public interface IWebViewUnviewableContentIdentifiedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Uri(): Uri?

  @InterfaceMethod(1)
  public fun get_Referrer(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewUnviewableContentIdentifiedEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewUnviewableContentIdentifiedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewUnviewableContentIdentifiedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewUnviewableContentIdentifiedEventArgs {
    public val __1972728408_Ptr: Pointer?

    public val _1972728408_VtblPtr: Pointer?
      get() = __1972728408_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1972728408_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1972728408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Referrer(): Uri? {
      val fnPtr = _1972728408_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1972728408_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewUnviewableContentIdentifiedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1972728408_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewUnviewableContentIdentifiedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("37bc16e160624678b20b6c36ac9c59ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewUnviewableContentIdentifiedEventArgs(ptr: Pointer?): WithDefault =
        IWebViewUnviewableContentIdentifiedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewUnviewableContentIdentifiedEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewUnviewableContentIdentifiedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewUnviewableContentIdentifiedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1972728408_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewUnviewableContentIdentifiedEventArgs):
        Array<IWebViewUnviewableContentIdentifiedEventArgs?> = (elements as
        Array<IWebViewUnviewableContentIdentifiedEventArgs?>).castToImpl<IWebViewUnviewableContentIdentifiedEventArgs,IWebViewUnviewableContentIdentifiedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewUnviewableContentIdentifiedEventArgs?> =
        arrayOfNulls<IWebViewUnviewableContentIdentifiedEventArgs_Impl>(size) as
        Array<IWebViewUnviewableContentIdentifiedEventArgs?>
  }
}
