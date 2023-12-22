package Windows.ApplicationModel.Activation

import Windows.ApplicationModel.Search.SearchPaneQueryLinguisticDetails
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

@ABIMarker(ISearchActivatedEventArgsWithLinguisticDetails.ABI::class)
@Signature("{c09f33da-08ab-4931-9b7c-451025f21f81}")
@Guid("c09f33da08ab49319b7c451025f21f81")
@WinRTInterface("c09f33da08ab49319b7c451025f21f81")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchActivatedEventArgsWithLinguisticDetails.ByReference::class)
public interface ISearchActivatedEventArgsWithLinguisticDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LinguisticDetails(): SearchPaneQueryLinguisticDetails?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchActivatedEventArgsWithLinguisticDetails> {
    public override fun getValue() =
        ABI.makeISearchActivatedEventArgsWithLinguisticDetails(pointer.getPointer(0))

    public fun setValue(value: ISearchActivatedEventArgsWithLinguisticDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchActivatedEventArgsWithLinguisticDetails {
    public val __1454051392_Ptr: Pointer?

    public val _1454051392_VtblPtr: Pointer?
      get() = __1454051392_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LinguisticDetails(): SearchPaneQueryLinguisticDetails? {
      val fnPtr = _1454051392_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SearchPaneQueryLinguisticDetails>()
      val hr = fn.invokeHR(arrayOf(__1454051392_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SearchPaneQueryLinguisticDetails>(result.getValue())
      return resultValue
    }
  }

  public class ISearchActivatedEventArgsWithLinguisticDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1454051392_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchActivatedEventArgsWithLinguisticDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c09f33da08ab49319b7c451025f21f81")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchActivatedEventArgsWithLinguisticDetails(ptr: Pointer?): WithDefault =
        ISearchActivatedEventArgsWithLinguisticDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISearchActivatedEventArgsWithLinguisticDetails {
      val address = segment.toRawLongValue()
      return makeISearchActivatedEventArgsWithLinguisticDetails(Pointer(address))
    }

    public override fun toNative(obj: ISearchActivatedEventArgsWithLinguisticDetails): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1454051392_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchActivatedEventArgsWithLinguisticDetails):
        Array<ISearchActivatedEventArgsWithLinguisticDetails?> = (elements as
        Array<ISearchActivatedEventArgsWithLinguisticDetails?>).castToImpl<ISearchActivatedEventArgsWithLinguisticDetails,ISearchActivatedEventArgsWithLinguisticDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchActivatedEventArgsWithLinguisticDetails?> =
        arrayOfNulls<ISearchActivatedEventArgsWithLinguisticDetails_Impl>(size) as
        Array<ISearchActivatedEventArgsWithLinguisticDetails?>
  }
}
