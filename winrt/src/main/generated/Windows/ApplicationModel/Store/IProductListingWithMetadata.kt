package Windows.ApplicationModel.Store

import Windows.ApplicationModel.Store.IProductListing.ABI.IID
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Uri
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProductListingWithMetadata.ABI::class)
@Signature("{124da567-23f8-423e-9532-189943c40ace}")
@Guid("124da56723f8423e9532189943c40ace")
@WinRTInterface("124da56723f8423e9532189943c40ace")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProductListingWithMetadata.ByReference::class)
public interface IProductListingWithMetadata : NativeMapped, IWinRTInterface, IProductListing {
  @InterfaceMethod(0)
  public fun get_Description(): String?

  @InterfaceMethod(1)
  public fun get_Keywords(): IIterable<String?>?

  @InterfaceMethod(2)
  public fun get_ProductType(): ProductType?

  @InterfaceMethod(3)
  public fun get_Tag(): String?

  @InterfaceMethod(4)
  public fun get_ImageUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProductListingWithMetadata> {
    public override fun getValue() = ABI.makeIProductListingWithMetadata(pointer.getPointer(0))

    public fun setValue(value: IProductListingWithMetadata_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProductListingWithMetadata, IProductListing.WithDefault {
    public val __1885946948_Ptr: Pointer?

    public val _1885946948_VtblPtr: Pointer?
      get() = __1885946948_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Description(): String? {
      val fnPtr = _1885946948_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1885946948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Keywords(): IIterable<String?>? {
      val fnPtr = _1885946948_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IIterable<String?>>()
      val hr = fn.invokeHR(arrayOf(__1885946948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IIterable<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ProductType(): ProductType? {
      val fnPtr = _1885946948_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProductType>()
      val hr = fn.invokeHR(arrayOf(__1885946948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProductType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Tag(): String? {
      val fnPtr = _1885946948_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1885946948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ImageUri(): Uri? {
      val fnPtr = _1885946948_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1885946948_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IProductListingWithMetadata_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IProductListing {
    public override val __1217343481_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1885946948_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1885946948_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProductListingWithMetadata, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("124da56723f8423e9532189943c40ace")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProductListingWithMetadata(ptr: Pointer?): WithDefault =
        IProductListingWithMetadata_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProductListingWithMetadata {
      val address = segment.toRawLongValue()
      return makeIProductListingWithMetadata(Pointer(address))
    }

    public override fun toNative(obj: IProductListingWithMetadata): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1885946948_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProductListingWithMetadata):
        Array<IProductListingWithMetadata?> = (elements as
        Array<IProductListingWithMetadata?>).castToImpl<IProductListingWithMetadata,IProductListingWithMetadata_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProductListingWithMetadata?> =
        arrayOfNulls<IProductListingWithMetadata_Impl>(size) as Array<IProductListingWithMetadata?>
  }
}
