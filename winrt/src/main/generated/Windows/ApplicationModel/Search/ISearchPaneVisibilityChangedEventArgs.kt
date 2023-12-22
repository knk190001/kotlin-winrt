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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISearchPaneVisibilityChangedEventArgs.ABI::class)
@Signature("{3c4d3046-ac4b-49f2-97d6-020e6182cb9c}")
@Guid("3c4d3046ac4b49f297d6020e6182cb9c")
@WinRTInterface("3c4d3046ac4b49f297d6020e6182cb9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneVisibilityChangedEventArgs.ByReference::class)
public interface ISearchPaneVisibilityChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Visible(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneVisibilityChangedEventArgs> {
    public override fun getValue() =
        ABI.makeISearchPaneVisibilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneVisibilityChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneVisibilityChangedEventArgs {
    public val __755126532_Ptr: Pointer?

    public val _755126532_VtblPtr: Pointer?
      get() = __755126532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Visible(): Boolean {
      val fnPtr = _755126532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__755126532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISearchPaneVisibilityChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __755126532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneVisibilityChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c4d3046ac4b49f297d6020e6182cb9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneVisibilityChangedEventArgs(ptr: Pointer?): WithDefault =
        ISearchPaneVisibilityChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchPaneVisibilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchPaneVisibilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneVisibilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__755126532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneVisibilityChangedEventArgs):
        Array<ISearchPaneVisibilityChangedEventArgs?> = (elements as
        Array<ISearchPaneVisibilityChangedEventArgs?>).castToImpl<ISearchPaneVisibilityChangedEventArgs,ISearchPaneVisibilityChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneVisibilityChangedEventArgs?> =
        arrayOfNulls<ISearchPaneVisibilityChangedEventArgs_Impl>(size) as
        Array<ISearchPaneVisibilityChangedEventArgs?>
  }
}
