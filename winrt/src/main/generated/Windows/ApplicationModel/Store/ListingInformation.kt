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

@ABIMarker(ListingInformation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.ListingInformation;{588b4abf-bc74-4383-b78c-99606323dece})")
@WinRTByReference(brClass = ListingInformation.ByReference::class)
public class ListingInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IListingInformation.WithDefault, IListingInformation2.WithDefault,
    IWinRTObject {
  private val __972667782_Interface: IListingInformation.WithDefault by lazy {
    as_972667782()
  }


  private val __87930120_Interface: IListingInformation2.WithDefault by lazy {
    as_87930120()
  }


  public override val __972667782_Ptr: JNAPointer? by lazy {
    __972667782_Interface.__972667782_Ptr
  }


  public override val __87930120_Ptr: JNAPointer? by lazy {
    __87930120_Interface.__87930120_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__972667782_Interface, __87930120_Interface)

  private fun as_972667782(): IListingInformation.WithDefault {
    if(pointer == NULL) {
      return(IListingInformation.ABI.makeIListingInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListingInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListingInformation.ABI.makeIListingInformation(ref.value))
  }

  private fun as_87930120(): IListingInformation2.WithDefault {
    if(pointer == NULL) {
      return(IListingInformation2.ABI.makeIListingInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IListingInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IListingInformation2.ABI.makeIListingInformation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ListingInformation> {
    public override fun getValue() = ListingInformation(pointer.getPointer(0))

    public fun setValue(value: ListingInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ListingInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ListingInformation {
      val address = segment.toRawLongValue()
      return ListingInformation(Pointer(address))
    }

    public override fun toNative(obj: ListingInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
