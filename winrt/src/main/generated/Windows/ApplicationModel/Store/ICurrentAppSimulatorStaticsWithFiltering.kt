package Windows.ApplicationModel.Store

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(ICurrentAppSimulatorStaticsWithFiltering.ABI::class)
@Signature("{617e70e2-f86f-4b54-9666-dde285092c68}")
@Guid("617e70e2f86f4b549666dde285092c68")
@WinRTInterface("617e70e2f86f4b549666dde285092c68")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentAppSimulatorStaticsWithFiltering.ByReference::class)
public interface ICurrentAppSimulatorStaticsWithFiltering : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadListingInformationByProductIdsAsync(productIds: IIterable<String?>?):
      IAsyncOperation<ListingInformation?>?

  @InterfaceMethod(1)
  public fun LoadListingInformationByKeywordsAsync(keywords: IIterable<String?>?):
      IAsyncOperation<ListingInformation?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentAppSimulatorStaticsWithFiltering> {
    public override fun getValue() =
        ABI.makeICurrentAppSimulatorStaticsWithFiltering(pointer.getPointer(0))

    public fun setValue(value: ICurrentAppSimulatorStaticsWithFiltering_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentAppSimulatorStaticsWithFiltering {
    public val __793255785_Ptr: Pointer?

    public val _793255785_VtblPtr: Pointer?
      get() = __793255785_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadListingInformationByProductIdsAsync(productIds: IIterable<String?>?):
        IAsyncOperation<ListingInformation?>? {
      val fnPtr = _793255785_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ListingInformation?>>()
      val hr = fn.invokeHR(arrayOf(__793255785_Ptr, marshalToNative(productIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ListingInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadListingInformationByKeywordsAsync(keywords: IIterable<String?>?):
        IAsyncOperation<ListingInformation?>? {
      val fnPtr = _793255785_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ListingInformation?>>()
      val hr = fn.invokeHR(arrayOf(__793255785_Ptr, marshalToNative(keywords), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ListingInformation?>>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentAppSimulatorStaticsWithFiltering_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __793255785_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentAppSimulatorStaticsWithFiltering, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("617e70e2f86f4b549666dde285092c68")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentAppSimulatorStaticsWithFiltering(ptr: Pointer?): WithDefault =
        ICurrentAppSimulatorStaticsWithFiltering_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICurrentAppSimulatorStaticsWithFiltering {
      val address = segment.toRawLongValue()
      return makeICurrentAppSimulatorStaticsWithFiltering(Pointer(address))
    }

    public override fun toNative(obj: ICurrentAppSimulatorStaticsWithFiltering): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__793255785_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentAppSimulatorStaticsWithFiltering):
        Array<ICurrentAppSimulatorStaticsWithFiltering?> = (elements as
        Array<ICurrentAppSimulatorStaticsWithFiltering?>).castToImpl<ICurrentAppSimulatorStaticsWithFiltering,ICurrentAppSimulatorStaticsWithFiltering_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentAppSimulatorStaticsWithFiltering?> =
        arrayOfNulls<ICurrentAppSimulatorStaticsWithFiltering_Impl>(size) as
        Array<ICurrentAppSimulatorStaticsWithFiltering?>
  }
}
