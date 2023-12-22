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

@ABIMarker(ProductLicense.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.ProductLicense;{363308c7-2bcf-4c0e-8f2f-e808aaa8f99d})")
@WinRTByReference(brClass = ProductLicense.ByReference::class)
public class ProductLicense(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProductLicense.WithDefault, IProductLicenseWithFulfillment.WithDefault,
    IWinRTObject {
  private val __1232561724_Interface: IProductLicense.WithDefault by lazy {
    as_1232561724()
  }


  private val __1751256788_Interface: IProductLicenseWithFulfillment.WithDefault by lazy {
    as_1751256788()
  }


  public override val __1232561724_Ptr: JNAPointer? by lazy {
    __1232561724_Interface.__1232561724_Ptr
  }


  public override val __1751256788_Ptr: JNAPointer? by lazy {
    __1751256788_Interface.__1751256788_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1232561724_Interface, __1751256788_Interface)

  private fun as_1232561724(): IProductLicense.WithDefault {
    if(pointer == NULL) {
      return(IProductLicense.ABI.makeIProductLicense(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProductLicense>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProductLicense.ABI.makeIProductLicense(ref.value))
  }

  private fun as_1751256788(): IProductLicenseWithFulfillment.WithDefault {
    if(pointer == NULL) {
      return(IProductLicenseWithFulfillment.ABI.makeIProductLicenseWithFulfillment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProductLicenseWithFulfillment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProductLicenseWithFulfillment.ABI.makeIProductLicenseWithFulfillment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ProductLicense>
      {
    public override fun getValue() = ProductLicense(pointer.getPointer(0))

    public fun setValue(value: ProductLicense): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProductLicense, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProductLicense {
      val address = segment.toRawLongValue()
      return ProductLicense(Pointer(address))
    }

    public override fun toNative(obj: ProductLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
