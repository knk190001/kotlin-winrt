package Windows.ApplicationModel.Search

import Windows.ApplicationModel.Search.ISearchPaneQueryChangedEventArgs.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(ISearchPaneSuggestionsRequestedEventArgs.ABI::class)
@Signature("{c89b8a2f-ac56-4460-8d2f-80023bec4fc5}")
@Guid("c89b8a2fac5644608d2f80023bec4fc5")
@WinRTInterface("c89b8a2fac5644608d2f80023bec4fc5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneSuggestionsRequestedEventArgs.ByReference::class)
public interface ISearchPaneSuggestionsRequestedEventArgs : NativeMapped, IWinRTInterface,
    ISearchPaneQueryChangedEventArgs {
  @InterfaceMethod(0)
  public fun get_Request(): SearchPaneSuggestionsRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneSuggestionsRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeISearchPaneSuggestionsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneSuggestionsRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneSuggestionsRequestedEventArgs,
      ISearchPaneQueryChangedEventArgs.WithDefault {
    public val __1620740401_Ptr: Pointer?

    public val _1620740401_VtblPtr: Pointer?
      get() = __1620740401_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): SearchPaneSuggestionsRequest? {
      val fnPtr = _1620740401_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchPaneSuggestionsRequest>()
      val hr = fn.invokeHR(arrayOf(__1620740401_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchPaneSuggestionsRequest>(result.getValue())
      return resultValue
    }
  }

  public class ISearchPaneSuggestionsRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISearchPaneQueryChangedEventArgs
      {
    public override val __947647164_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1620740401_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1620740401_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneSuggestionsRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c89b8a2fac5644608d2f80023bec4fc5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneSuggestionsRequestedEventArgs(ptr: Pointer?): WithDefault =
        ISearchPaneSuggestionsRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISearchPaneSuggestionsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchPaneSuggestionsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneSuggestionsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1620740401_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneSuggestionsRequestedEventArgs):
        Array<ISearchPaneSuggestionsRequestedEventArgs?> = (elements as
        Array<ISearchPaneSuggestionsRequestedEventArgs?>).castToImpl<ISearchPaneSuggestionsRequestedEventArgs,ISearchPaneSuggestionsRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneSuggestionsRequestedEventArgs?> =
        arrayOfNulls<ISearchPaneSuggestionsRequestedEventArgs_Impl>(size) as
        Array<ISearchPaneSuggestionsRequestedEventArgs?>
  }
}
