package Windows.UI.Xaml.Controls

import Windows.ApplicationModel.Search.SearchQueryLinguisticDetails
import Windows.System.VirtualKeyModifiers
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

@ABIMarker(ISearchBoxQuerySubmittedEventArgs.ABI::class)
@Signature("{126e90fd-3c4e-4ccb-9aef-4705d19fe548}")
@Guid("126e90fd3c4e4ccb9aef4705d19fe548")
@WinRTInterface("126e90fd3c4e4ccb9aef4705d19fe548")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchBoxQuerySubmittedEventArgs.ByReference::class)
public interface ISearchBoxQuerySubmittedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryText(): String?

  @InterfaceMethod(1)
  public fun get_Language(): String?

  @InterfaceMethod(2)
  public fun get_LinguisticDetails(): SearchQueryLinguisticDetails?

  @InterfaceMethod(3)
  public fun get_KeyModifiers(): VirtualKeyModifiers?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchBoxQuerySubmittedEventArgs> {
    public override fun getValue() =
        ABI.makeISearchBoxQuerySubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchBoxQuerySubmittedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchBoxQuerySubmittedEventArgs {
    public val __77684829_Ptr: Pointer?

    public val _77684829_VtblPtr: Pointer?
      get() = __77684829_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryText(): String? {
      val fnPtr = _77684829_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__77684829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Language(): String? {
      val fnPtr = _77684829_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__77684829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LinguisticDetails(): SearchQueryLinguisticDetails? {
      val fnPtr = _77684829_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchQueryLinguisticDetails>()
      val hr = fn.invokeHR(arrayOf(__77684829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchQueryLinguisticDetails>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_KeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _77684829_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__77684829_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }
  }

  public class ISearchBoxQuerySubmittedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __77684829_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchBoxQuerySubmittedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("126e90fd3c4e4ccb9aef4705d19fe548")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchBoxQuerySubmittedEventArgs(ptr: Pointer?): WithDefault =
        ISearchBoxQuerySubmittedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchBoxQuerySubmittedEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchBoxQuerySubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchBoxQuerySubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__77684829_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchBoxQuerySubmittedEventArgs):
        Array<ISearchBoxQuerySubmittedEventArgs?> = (elements as
        Array<ISearchBoxQuerySubmittedEventArgs?>).castToImpl<ISearchBoxQuerySubmittedEventArgs,ISearchBoxQuerySubmittedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchBoxQuerySubmittedEventArgs?> =
        arrayOfNulls<ISearchBoxQuerySubmittedEventArgs_Impl>(size) as
        Array<ISearchBoxQuerySubmittedEventArgs?>
  }
}
