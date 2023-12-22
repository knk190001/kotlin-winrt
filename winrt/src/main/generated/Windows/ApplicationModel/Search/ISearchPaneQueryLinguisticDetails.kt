package Windows.ApplicationModel.Search

import Windows.Foundation.Collections.IVectorView
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISearchPaneQueryLinguisticDetails.ABI::class)
@Signature("{82fb460e-0940-4b6d-b8d0-642b30989e15}")
@Guid("82fb460e09404b6db8d0642b30989e15")
@WinRTInterface("82fb460e09404b6db8d0642b30989e15")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneQueryLinguisticDetails.ByReference::class)
public interface ISearchPaneQueryLinguisticDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryTextAlternatives(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun get_QueryTextCompositionStart(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_QueryTextCompositionLength(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneQueryLinguisticDetails> {
    public override fun getValue() =
        ABI.makeISearchPaneQueryLinguisticDetails(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneQueryLinguisticDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneQueryLinguisticDetails {
    public val __459543460_Ptr: Pointer?

    public val _459543460_VtblPtr: Pointer?
      get() = __459543460_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryTextAlternatives(): IVectorView<String?>? {
      val fnPtr = _459543460_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__459543460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_QueryTextCompositionStart(): WinDef.UINT {
      val fnPtr = _459543460_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__459543460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_QueryTextCompositionLength(): WinDef.UINT {
      val fnPtr = _459543460_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__459543460_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ISearchPaneQueryLinguisticDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __459543460_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneQueryLinguisticDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82fb460e09404b6db8d0642b30989e15")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneQueryLinguisticDetails(ptr: Pointer?): WithDefault =
        ISearchPaneQueryLinguisticDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchPaneQueryLinguisticDetails {
      val address = segment.toRawLongValue()
      return makeISearchPaneQueryLinguisticDetails(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneQueryLinguisticDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__459543460_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneQueryLinguisticDetails):
        Array<ISearchPaneQueryLinguisticDetails?> = (elements as
        Array<ISearchPaneQueryLinguisticDetails?>).castToImpl<ISearchPaneQueryLinguisticDetails,ISearchPaneQueryLinguisticDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneQueryLinguisticDetails?> =
        arrayOfNulls<ISearchPaneQueryLinguisticDetails_Impl>(size) as
        Array<ISearchPaneQueryLinguisticDetails?>
  }
}
