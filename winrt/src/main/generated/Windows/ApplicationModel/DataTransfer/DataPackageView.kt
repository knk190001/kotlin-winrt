package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(DataPackageView.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DataPackageView;{7b840471-5900-4d85-a90b-10cb85fe3552})")
@WinRTByReference(brClass = DataPackageView.ByReference::class)
public class DataPackageView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataPackageView.WithDefault, IDataPackageView2.WithDefault,
    IDataPackageView3.WithDefault, IDataPackageView4.WithDefault, IWinRTObject {
  private val __452360201_Interface: IDataPackageView.WithDefault by lazy {
    as_452360201()
  }


  private val __1138264293_Interface: IDataPackageView2.WithDefault by lazy {
    as_1138264293()
  }


  private val __1138264292_Interface: IDataPackageView3.WithDefault by lazy {
    as_1138264292()
  }


  private val __1138264291_Interface: IDataPackageView4.WithDefault by lazy {
    as_1138264291()
  }


  public override val __452360201_Ptr: JNAPointer? by lazy {
    __452360201_Interface.__452360201_Ptr
  }


  public override val __1138264293_Ptr: JNAPointer? by lazy {
    __1138264293_Interface.__1138264293_Ptr
  }


  public override val __1138264292_Ptr: JNAPointer? by lazy {
    __1138264292_Interface.__1138264292_Ptr
  }


  public override val __1138264291_Ptr: JNAPointer? by lazy {
    __1138264291_Interface.__1138264291_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__452360201_Interface, __1138264293_Interface, __1138264292_Interface,
        __1138264291_Interface)

  private fun as_452360201(): IDataPackageView.WithDefault {
    if(pointer == NULL) {
      return(IDataPackageView.ABI.makeIDataPackageView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackageView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackageView.ABI.makeIDataPackageView(ref.value))
  }

  private fun as_1138264293(): IDataPackageView2.WithDefault {
    if(pointer == NULL) {
      return(IDataPackageView2.ABI.makeIDataPackageView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackageView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackageView2.ABI.makeIDataPackageView2(ref.value))
  }

  private fun as_1138264292(): IDataPackageView3.WithDefault {
    if(pointer == NULL) {
      return(IDataPackageView3.ABI.makeIDataPackageView3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackageView3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackageView3.ABI.makeIDataPackageView3(ref.value))
  }

  private fun as_1138264291(): IDataPackageView4.WithDefault {
    if(pointer == NULL) {
      return(IDataPackageView4.ABI.makeIDataPackageView4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackageView4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackageView4.ABI.makeIDataPackageView4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataPackageView> {
    public override fun getValue() = DataPackageView(pointer.getPointer(0))

    public fun setValue(value: DataPackageView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataPackageView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataPackageView {
      val address = segment.toRawLongValue()
      return DataPackageView(Pointer(address))
    }

    public override fun toNative(obj: DataPackageView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
