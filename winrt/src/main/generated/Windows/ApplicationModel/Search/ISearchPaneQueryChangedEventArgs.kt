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

@ABIMarker(ISearchPaneQueryChangedEventArgs.ABI::class)
@Signature("{3c064fe9-2351-4248-a529-7110f464a785}")
@Guid("3c064fe923514248a5297110f464a785")
@WinRTInterface("3c064fe923514248a5297110f464a785")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneQueryChangedEventArgs.ByReference::class)
public interface ISearchPaneQueryChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryText(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  @InterfaceMethod(2)
  public fun get_LinguisticDetails(): SearchPaneQueryLinguisticDetails?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneQueryChangedEventArgs> {
    public override fun getValue() = ABI.makeISearchPaneQueryChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneQueryChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneQueryChangedEventArgs {
    public val __947647164_Ptr: Pointer?

    public val _947647164_VtblPtr: Pointer?
      get() = __947647164_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryText(): String? {
      val fnPtr = _947647164_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__947647164_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _947647164_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__947647164_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LinguisticDetails(): SearchPaneQueryLinguisticDetails? {
      val fnPtr = _947647164_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchPaneQueryLinguisticDetails>()
      val hr = fn.invokeHR(arrayOf(__947647164_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchPaneQueryLinguisticDetails>(result.getValue())
      return resultValue
    }
  }

  public class ISearchPaneQueryChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __947647164_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneQueryChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c064fe923514248a5297110f464a785")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneQueryChangedEventArgs(ptr: Pointer?): WithDefault =
        ISearchPaneQueryChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchPaneQueryChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchPaneQueryChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneQueryChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__947647164_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneQueryChangedEventArgs):
        Array<ISearchPaneQueryChangedEventArgs?> = (elements as
        Array<ISearchPaneQueryChangedEventArgs?>).castToImpl<ISearchPaneQueryChangedEventArgs,ISearchPaneQueryChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneQueryChangedEventArgs?> =
        arrayOfNulls<ISearchPaneQueryChangedEventArgs_Impl>(size) as
        Array<ISearchPaneQueryChangedEventArgs?>
  }
}
