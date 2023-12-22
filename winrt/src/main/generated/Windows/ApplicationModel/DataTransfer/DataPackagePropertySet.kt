package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
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

@ABIMarker(DataPackagePropertySet.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DataPackagePropertySet;{cd1c93eb-4c4c-443a-a8d3-f5c241e91689})")
@WinRTByReference(brClass = DataPackagePropertySet.ByReference::class)
public class DataPackagePropertySet(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataPackagePropertySet.WithDefault, IMap<String?, IUnknown?>,
    IIterable<IKeyValuePair<String?, IUnknown?>?>, IDataPackagePropertySet2.WithDefault,
    IDataPackagePropertySet3.WithDefault, IDataPackagePropertySet4.WithDefault, IWinRTObject {
  private val __1132950341_Interface: IDataPackagePropertySet.WithDefault by lazy {
    as_1132950341()
  }


  private val __8028824_Interface: IMap<String?, IUnknown?> by lazy {
    as_8028824()
  }


  private val __1449643190_Interface: IIterable<IKeyValuePair<String?, IUnknown?>?> by lazy {
    as_1449643190()
  }


  private val __761722153_Interface: IDataPackagePropertySet2.WithDefault by lazy {
    as_761722153()
  }


  private val __761722152_Interface: IDataPackagePropertySet3.WithDefault by lazy {
    as_761722152()
  }


  private val __761722151_Interface: IDataPackagePropertySet4.WithDefault by lazy {
    as_761722151()
  }


  public override val __8028824_Type: KType = typeOf<IMap<String?, IUnknown?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<IKeyValuePair<String?,
      IUnknown?>?>>()

  public override val __1132950341_Ptr: JNAPointer? by lazy {
    __1132950341_Interface.__1132950341_Ptr
  }


  public override val __8028824_Ptr: JNAPointer? by lazy {
    __8028824_Interface.__8028824_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val __761722153_Ptr: JNAPointer? by lazy {
    __761722153_Interface.__761722153_Ptr
  }


  public override val __761722152_Ptr: JNAPointer? by lazy {
    __761722152_Interface.__761722152_Ptr
  }


  public override val __761722151_Ptr: JNAPointer? by lazy {
    __761722151_Interface.__761722151_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1132950341_Interface, __8028824_Interface, __1449643190_Interface,
        __761722153_Interface, __761722152_Interface, __761722151_Interface)

  private fun as_1132950341(): IDataPackagePropertySet.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySet.ABI.makeIDataPackagePropertySet(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySet>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySet.ABI.makeIDataPackagePropertySet(ref.value))
  }

  private fun as_8028824(): IMap<String?, IUnknown?> {
    if(pointer == NULL) {
      return(IMap.ABI.makeIMap<String?, IUnknown?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMap<String?, IUnknown?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMap.ABI.makeIMap<String?, IUnknown?>(ref.value))
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

  private fun as_761722153(): IDataPackagePropertySet2.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySet2.ABI.makeIDataPackagePropertySet2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySet2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySet2.ABI.makeIDataPackagePropertySet2(ref.value))
  }

  private fun as_761722152(): IDataPackagePropertySet3.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySet3.ABI.makeIDataPackagePropertySet3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySet3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySet3.ABI.makeIDataPackagePropertySet3(ref.value))
  }

  private fun as_761722151(): IDataPackagePropertySet4.WithDefault {
    if(pointer == NULL) {
      return(IDataPackagePropertySet4.ABI.makeIDataPackagePropertySet4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataPackagePropertySet4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataPackagePropertySet4.ABI.makeIDataPackagePropertySet4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataPackagePropertySet> {
    public override fun getValue() = DataPackagePropertySet(pointer.getPointer(0))

    public fun setValue(value: DataPackagePropertySet): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataPackagePropertySet, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataPackagePropertySet {
      val address = segment.toRawLongValue()
      return DataPackagePropertySet(Pointer(address))
    }

    public override fun toNative(obj: DataPackagePropertySet): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
