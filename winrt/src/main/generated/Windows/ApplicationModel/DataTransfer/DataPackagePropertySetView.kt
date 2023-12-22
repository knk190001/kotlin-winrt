package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(DataPackagePropertySetView.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView;{b94cec01-0c1a-4c57-be55-75d01289735d})")
@WinRTByReference(brClass = DataPackagePropertySetView.ByReference::class)
public class DataPackagePropertySetView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataPackagePropertySetView.WithDefault,
    IDataPackagePropertySetView2.WithDefault, IDataPackagePropertySetView3.WithDefault,
    IDataPackagePropertySetView4.WithDefault, IDataPackagePropertySetView5.WithDefault,
    IMapView<String?, IUnknown?>, IIterable<IKeyValuePair<String?, IUnknown?>?>, IWinRTObject {
  private val __2143708672_Interface: IDataPackagePropertySetView.WithDefault by lazy {
    as_2143708672()
  }


  private val __2030459442_Interface: IDataPackagePropertySetView2.WithDefault by lazy {
    as_2030459442()
  }


  private val __2030459443_Interface: IDataPackagePropertySetView3.WithDefault by lazy {
    as_2030459443()
  }


  private val __2030459444_Interface: IDataPackagePropertySetView4.WithDefault by lazy {
    as_2030459444()
  }


  private val __2030459445_Interface: IDataPackagePropertySetView5.WithDefault by lazy {
    as_2030459445()
  }


  private val __1676682589_Interface: IMapView<String?, IUnknown?> by lazy {
    as_1676682589()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, IUnknown?>?> by lazy {
    as_1449643190()
  }


  public override val __1676682589_Type: KType = typeOf<IMapView<String?, IUnknown?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      IUnknown?>?>>()

  public override val __2143708672_Ptr: JNAPointer? by lazy {
    __2143708672_Interface.__2143708672_Ptr
  }


  public override val __2030459442_Ptr: JNAPointer? by lazy {
    __2030459442_Interface.__2030459442_Ptr
  }


  public override val __2030459443_Ptr: JNAPointer? by lazy {
    __2030459443_Interface.__2030459443_Ptr
  }


  public override val __2030459444_Ptr: JNAPointer? by lazy {
    __2030459444_Interface.__2030459444_Ptr
  }


  public override val __2030459445_Ptr: JNAPointer? by lazy {
    __2030459445_Interface.__2030459445_Ptr
  }


  public override val __1676682589_Ptr: JNAPointer? by lazy {
    __1676682589_Interface.__1676682589_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2143708672_Interface, __2030459442_Interface, __2030459443_Interface,
        __2030459444_Interface, __2030459445_Interface, __1676682589_Interface,
        __1449643190_Interface)

  private fun as_2143708672(): IDataPackagePropertySetView.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySetView.ABI.makeIDataPackagePropertySetView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySetView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySetView.ABI.makeIDataPackagePropertySetView(ref.value))
  }

  private fun as_2030459442(): IDataPackagePropertySetView2.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySetView2.ABI.makeIDataPackagePropertySetView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySetView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySetView2.ABI.makeIDataPackagePropertySetView2(ref.value))
  }

  private fun as_2030459443(): IDataPackagePropertySetView3.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySetView3.ABI.makeIDataPackagePropertySetView3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySetView3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySetView3.ABI.makeIDataPackagePropertySetView3(ref.value))
  }

  private fun as_2030459444(): IDataPackagePropertySetView4.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySetView4.ABI.makeIDataPackagePropertySetView4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySetView4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySetView4.ABI.makeIDataPackagePropertySetView4(ref.value))
  }

  private fun as_2030459445(): IDataPackagePropertySetView5.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySetView5.ABI.makeIDataPackagePropertySetView5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySetView5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySetView5.ABI.makeIDataPackagePropertySetView5(ref.value))
  }

  private fun as_1676682589(): IMapView<String?, IUnknown?> {
    if(pointer == NULL) {
      return(IMapView.ABI.makeIMapView<String?, IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapView<String?, IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapView.ABI.makeIMapView<String?, IUnknown?>(ref.value))
  }

  private fun as_1449643190(): IIterable<IKeyValuePair<String?, IUnknown?>?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IUnknown?>?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<IKeyValuePair<String?, IUnknown?>?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<IKeyValuePair<String?, IUnknown?>?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataPackagePropertySetView> {
    public override fun getValue() = DataPackagePropertySetView(pointer.getPointer(0))

    public fun setValue(value: DataPackagePropertySetView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataPackagePropertySetView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataPackagePropertySetView {
      val address = segment.toRawLongValue()
      return DataPackagePropertySetView(Pointer(address))
    }

    public override fun toNative(obj: DataPackagePropertySetView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
