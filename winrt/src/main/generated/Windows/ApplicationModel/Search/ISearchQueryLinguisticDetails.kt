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

@ABIMarker(ISearchQueryLinguisticDetails.ABI::class)
@Signature("{46a1205b-69c9-4745-b72f-a8a4fc8f24ae}")
@Guid("46a1205b69c94745b72fa8a4fc8f24ae")
@WinRTInterface("46a1205b69c94745b72fa8a4fc8f24ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchQueryLinguisticDetails.ByReference::class)
public interface ISearchQueryLinguisticDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryTextAlternatives(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun get_QueryTextCompositionStart(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_QueryTextCompositionLength(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchQueryLinguisticDetails> {
    public override fun getValue() = ABI.makeISearchQueryLinguisticDetails(pointer.getPointer(0))

    public fun setValue(value: ISearchQueryLinguisticDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchQueryLinguisticDetails {
    public val __1206940244_Ptr: Pointer?

    public val _1206940244_VtblPtr: Pointer?
      get() = __1206940244_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryTextAlternatives(): IVectorView<String?>? {
      val fnPtr = _1206940244_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1206940244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_QueryTextCompositionStart(): WinDef.UINT {
      val fnPtr = _1206940244_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1206940244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_QueryTextCompositionLength(): WinDef.UINT {
      val fnPtr = _1206940244_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1206940244_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ISearchQueryLinguisticDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1206940244_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchQueryLinguisticDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46a1205b69c94745b72fa8a4fc8f24ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchQueryLinguisticDetails(ptr: Pointer?): WithDefault =
        ISearchQueryLinguisticDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchQueryLinguisticDetails {
      val address = segment.toRawLongValue()
      return makeISearchQueryLinguisticDetails(Pointer(address))
    }

    public override fun toNative(obj: ISearchQueryLinguisticDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1206940244_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchQueryLinguisticDetails):
        Array<ISearchQueryLinguisticDetails?> = (elements as
        Array<ISearchQueryLinguisticDetails?>).castToImpl<ISearchQueryLinguisticDetails,ISearchQueryLinguisticDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchQueryLinguisticDetails?> =
        arrayOfNulls<ISearchQueryLinguisticDetails_Impl>(size) as
        Array<ISearchQueryLinguisticDetails?>
  }
}
