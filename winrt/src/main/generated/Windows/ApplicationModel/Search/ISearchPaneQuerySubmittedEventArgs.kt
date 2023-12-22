package Windows.ApplicationModel.Search

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

@ABIMarker(ISearchPaneQuerySubmittedEventArgs.ABI::class)
@Signature("{143ba4fc-e9c5-4736-91b2-e8eb9cb88356}")
@Guid("143ba4fce9c5473691b2e8eb9cb88356")
@WinRTInterface("143ba4fce9c5473691b2e8eb9cb88356")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneQuerySubmittedEventArgs.ByReference::class)
public interface ISearchPaneQuerySubmittedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryText(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneQuerySubmittedEventArgs> {
    public override fun getValue() =
        ABI.makeISearchPaneQuerySubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneQuerySubmittedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneQuerySubmittedEventArgs {
    public val __1911384733_Ptr: Pointer?

    public val _1911384733_VtblPtr: Pointer?
      get() = __1911384733_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryText(): String? {
      val fnPtr = _1911384733_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1911384733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _1911384733_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1911384733_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISearchPaneQuerySubmittedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1911384733_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneQuerySubmittedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("143ba4fce9c5473691b2e8eb9cb88356")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneQuerySubmittedEventArgs(ptr: Pointer?): WithDefault =
        ISearchPaneQuerySubmittedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchPaneQuerySubmittedEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchPaneQuerySubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneQuerySubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1911384733_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneQuerySubmittedEventArgs):
        Array<ISearchPaneQuerySubmittedEventArgs?> = (elements as
        Array<ISearchPaneQuerySubmittedEventArgs?>).castToImpl<ISearchPaneQuerySubmittedEventArgs,ISearchPaneQuerySubmittedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneQuerySubmittedEventArgs?> =
        arrayOfNulls<ISearchPaneQuerySubmittedEventArgs_Impl>(size) as
        Array<ISearchPaneQuerySubmittedEventArgs?>
  }
}
