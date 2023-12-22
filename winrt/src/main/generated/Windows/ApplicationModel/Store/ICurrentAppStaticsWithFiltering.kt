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

@ABIMarker(ICurrentAppStaticsWithFiltering.ABI::class)
@Signature("{d36d6542-9085-438e-97ba-a25c976be2fd}")
@Guid("d36d65429085438e97baa25c976be2fd")
@WinRTInterface("d36d65429085438e97baa25c976be2fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentAppStaticsWithFiltering.ByReference::class)
public interface ICurrentAppStaticsWithFiltering : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun LoadListingInformationByProductIdsAsync(productIds: IIterable<String?>?):
      IAsyncOperation<ListingInformation?>?

  @InterfaceMethod(1)
  public fun LoadListingInformationByKeywordsAsync(keywords: IIterable<String?>?):
      IAsyncOperation<ListingInformation?>?

  @InterfaceMethod(2)
  public fun ReportProductFulfillment(productId: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentAppStaticsWithFiltering> {
    public override fun getValue() = ABI.makeICurrentAppStaticsWithFiltering(pointer.getPointer(0))

    public fun setValue(value: ICurrentAppStaticsWithFiltering_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentAppStaticsWithFiltering {
    public val __1652438777_Ptr: Pointer?

    public val _1652438777_VtblPtr: Pointer?
      get() = __1652438777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun LoadListingInformationByProductIdsAsync(productIds: IIterable<String?>?):
        IAsyncOperation<ListingInformation?>? {
      val fnPtr = _1652438777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ListingInformation?>>()
      val hr = fn.invokeHR(arrayOf(__1652438777_Ptr, marshalToNative(productIds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ListingInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun LoadListingInformationByKeywordsAsync(keywords: IIterable<String?>?):
        IAsyncOperation<ListingInformation?>? {
      val fnPtr = _1652438777_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ListingInformation?>>()
      val hr = fn.invokeHR(arrayOf(__1652438777_Ptr, marshalToNative(keywords), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ListingInformation?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ReportProductFulfillment(productId: String?): Unit {
      val fnPtr = _1652438777_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1652438777_Ptr, marshalToNative(productId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICurrentAppStaticsWithFiltering_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1652438777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentAppStaticsWithFiltering, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d36d65429085438e97baa25c976be2fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentAppStaticsWithFiltering(ptr: Pointer?): WithDefault =
        ICurrentAppStaticsWithFiltering_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentAppStaticsWithFiltering {
      val address = segment.toRawLongValue()
      return makeICurrentAppStaticsWithFiltering(Pointer(address))
    }

    public override fun toNative(obj: ICurrentAppStaticsWithFiltering): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1652438777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentAppStaticsWithFiltering):
        Array<ICurrentAppStaticsWithFiltering?> = (elements as
        Array<ICurrentAppStaticsWithFiltering?>).castToImpl<ICurrentAppStaticsWithFiltering,ICurrentAppStaticsWithFiltering_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentAppStaticsWithFiltering?> =
        arrayOfNulls<ICurrentAppStaticsWithFiltering_Impl>(size) as
        Array<ICurrentAppStaticsWithFiltering?>
  }
}
