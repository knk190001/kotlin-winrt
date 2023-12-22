package Windows.ApplicationModel.Store

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ProductListing.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.ProductListing;{45a7d6ad-c750-4d9c-947c-b00dcbf9e9c2})")
@WinRTByReference(brClass = ProductListing.ByReference::class)
public class ProductListing(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProductListing.WithDefault, IProductListingWithMetadata.WithDefault,
    IProductListing2.WithDefault, IWinRTObject {
  private val __1217343481_Interface: IProductListing.WithDefault by lazy {
    as_1217343481()
  }


  private val __1885946948_Interface: IProductListingWithMetadata.WithDefault by lazy {
    as_1885946948()
  }


  private val __917057803_Interface: IProductListing2.WithDefault by lazy {
    as_917057803()
  }


  public override val __1217343481_Ptr: JNAPointer? by lazy {
    __1217343481_Interface.__1217343481_Ptr
  }


  public override val __1885946948_Ptr: JNAPointer? by lazy {
    __1885946948_Interface.__1885946948_Ptr
  }


  public override val __917057803_Ptr: JNAPointer? by lazy {
    __917057803_Interface.__917057803_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1217343481_Interface, __1885946948_Interface, __917057803_Interface)

  private fun as_1217343481(): IProductListing.WithDefault {
    if(pointer == NULL) {
      return(IProductListing.ABI.makeIProductListing(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProductListing>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProductListing.ABI.makeIProductListing(ref.value))
  }

  private fun as_1885946948(): IProductListingWithMetadata.WithDefault {
    if(pointer == NULL) {
      return(IProductListingWithMetadata.ABI.makeIProductListingWithMetadata(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProductListingWithMetadata>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProductListingWithMetadata.ABI.makeIProductListingWithMetadata(ref.value))
  }

  private fun as_917057803(): IProductListing2.WithDefault {
    if(pointer == NULL) {
      return(IProductListing2.ABI.makeIProductListing2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProductListing2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProductListing2.ABI.makeIProductListing2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ProductListing>
      {
    public override fun getValue() = ProductListing(pointer.getPointer(0))

    public fun setValue(value: ProductListing): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProductListing, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProductListing {
      val address = segment.toRawLongValue()
      return ProductListing(Pointer(address))
    }

    public override fun toNative(obj: ProductListing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
