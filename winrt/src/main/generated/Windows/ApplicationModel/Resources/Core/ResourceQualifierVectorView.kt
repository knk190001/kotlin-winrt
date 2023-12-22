package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(ResourceQualifierVectorView.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Core.ResourceQualifierVectorView;pinterface({bbe1fa4c-b0e3-4583-baef-1f1b2e483e56};rc(Windows.ApplicationModel.Resources.Core.ResourceQualifier;{785da5b2-4afd-4376-a888-c5f9a6b7a05c})))")
@WinRTByReference(brClass = ResourceQualifierVectorView.ByReference::class)
public class ResourceQualifierVectorView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVectorView<ResourceQualifier?>, IIterable<ResourceQualifier?>, IWinRTObject {
  private val __970637876_Interface: IVectorView<ResourceQualifier?> by lazy {
    as_970637876()
  }


  private val __1449643190_Interface: IIterable<ResourceQualifier?> by lazy {
    as_1449643190()
  }


  public override val __970637876_Type: KType = typeOf<IVectorView<ResourceQualifier?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<ResourceQualifier?>>()

  public override val __970637876_Ptr: JNAPointer? by lazy {
    __970637876_Interface.__970637876_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__970637876_Interface, __1449643190_Interface)

  private fun as_970637876(): IVectorView<ResourceQualifier?> {
    if(pointer == NULL) {
      return(IVectorView.ABI.makeIVectorView<ResourceQualifier?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVectorView<ResourceQualifier?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView.ABI.makeIVectorView<ResourceQualifier?>(ref.value))
  }

  private fun as_1449643190(): IIterable<ResourceQualifier?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<ResourceQualifier?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<ResourceQualifier?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<ResourceQualifier?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceQualifierVectorView> {
    public override fun getValue() = ResourceQualifierVectorView(pointer.getPointer(0))

    public fun setValue(value: ResourceQualifierVectorView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceQualifierVectorView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ResourceQualifierVectorView {
      val address = segment.toRawLongValue()
      return ResourceQualifierVectorView(Pointer(address))
    }

    public override fun toNative(obj: ResourceQualifierVectorView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
