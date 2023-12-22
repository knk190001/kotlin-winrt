package Windows.UI.Xaml.Controls

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

@ABIMarker(IWebViewUnviewableContentIdentifiedEventArgs2.ABI::class)
@Signature("{9abe1154-36f0-4268-8d88-121eedf45e6a}")
@Guid("9abe115436f042688d88121eedf45e6a")
@WinRTInterface("9abe115436f042688d88121eedf45e6a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewUnviewableContentIdentifiedEventArgs2.ByReference::class)
public interface IWebViewUnviewableContentIdentifiedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MediaType(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewUnviewableContentIdentifiedEventArgs2> {
    public override fun getValue() =
        ABI.makeIWebViewUnviewableContentIdentifiedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IWebViewUnviewableContentIdentifiedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewUnviewableContentIdentifiedEventArgs2 {
    public val __1025038554_Ptr: Pointer?

    public val _1025038554_VtblPtr: Pointer?
      get() = __1025038554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MediaType(): String? {
      val fnPtr = _1025038554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1025038554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWebViewUnviewableContentIdentifiedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1025038554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewUnviewableContentIdentifiedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9abe115436f042688d88121eedf45e6a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewUnviewableContentIdentifiedEventArgs2(ptr: Pointer?): WithDefault =
        IWebViewUnviewableContentIdentifiedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebViewUnviewableContentIdentifiedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIWebViewUnviewableContentIdentifiedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IWebViewUnviewableContentIdentifiedEventArgs2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1025038554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewUnviewableContentIdentifiedEventArgs2):
        Array<IWebViewUnviewableContentIdentifiedEventArgs2?> = (elements as
        Array<IWebViewUnviewableContentIdentifiedEventArgs2?>).castToImpl<IWebViewUnviewableContentIdentifiedEventArgs2,IWebViewUnviewableContentIdentifiedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewUnviewableContentIdentifiedEventArgs2?> =
        arrayOfNulls<IWebViewUnviewableContentIdentifiedEventArgs2_Impl>(size) as
        Array<IWebViewUnviewableContentIdentifiedEventArgs2?>
  }
}
