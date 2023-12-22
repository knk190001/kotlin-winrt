package Windows.Storage.BulkAccess

import Windows.Storage.IStorageFolder
import Windows.Storage.IStorageFolder2
import Windows.Storage.IStorageItem
import Windows.Storage.IStorageItem2
import Windows.Storage.IStorageItemProperties
import Windows.Storage.IStorageItemPropertiesWithProvider
import Windows.Storage.Search.IStorageFolderQueryOperations
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

@ABIMarker(FolderInformation.ABI::class)
@Signature("rc(Windows.Storage.BulkAccess.FolderInformation;{87a5cb8b-8972-4f40-8de0-d86fb179d8fa})")
@WinRTByReference(brClass = FolderInformation.ByReference::class)
public class FolderInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageItemInformation.WithDefault, IStorageFolder.WithDefault,
    IStorageItem.WithDefault, IStorageItemProperties.WithDefault,
    IStorageFolderQueryOperations.WithDefault, IStorageItem2.WithDefault,
    IStorageFolder2.WithDefault, IStorageItemPropertiesWithProvider.WithDefault, IWinRTObject {
  private val __1258609971_Interface: IStorageItemInformation.WithDefault by lazy {
    as_1258609971()
  }


  private val __1926392112_Interface: IStorageFolder.WithDefault by lazy {
    as_1926392112()
  }


  private val __507586037_Interface: IStorageItem.WithDefault by lazy {
    as_507586037()
  }


  private val __850042616_Interface: IStorageItemProperties.WithDefault by lazy {
    as_850042616()
  }


  private val __1216874446_Interface: IStorageFolderQueryOperations.WithDefault by lazy {
    as_1216874446()
  }


  private val __1444701987_Interface: IStorageItem2.WithDefault by lazy {
    as_1444701987()
  }


  private val __411386722_Interface: IStorageFolder2.WithDefault by lazy {
    as_411386722()
  }


  private val __190620161_Interface: IStorageItemPropertiesWithProvider.WithDefault by lazy {
    as_190620161()
  }


  public override val __1258609971_Ptr: JNAPointer? by lazy {
    __1258609971_Interface.__1258609971_Ptr
  }


  public override val __1926392112_Ptr: JNAPointer? by lazy {
    __1926392112_Interface.__1926392112_Ptr
  }


  public override val __507586037_Ptr: JNAPointer? by lazy {
    __507586037_Interface.__507586037_Ptr
  }


  public override val __850042616_Ptr: JNAPointer? by lazy {
    __850042616_Interface.__850042616_Ptr
  }


  public override val __1216874446_Ptr: JNAPointer? by lazy {
    __1216874446_Interface.__1216874446_Ptr
  }


  public override val __1444701987_Ptr: JNAPointer? by lazy {
    __1444701987_Interface.__1444701987_Ptr
  }


  public override val __411386722_Ptr: JNAPointer? by lazy {
    __411386722_Interface.__411386722_Ptr
  }


  public override val __190620161_Ptr: JNAPointer? by lazy {
    __190620161_Interface.__190620161_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1258609971_Interface, __1926392112_Interface, __507586037_Interface,
        __850042616_Interface, __1216874446_Interface, __1444701987_Interface,
        __411386722_Interface, __190620161_Interface)

  private fun as_1258609971(): IStorageItemInformation.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemInformation.ABI.makeIStorageItemInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemInformation.ABI.makeIStorageItemInformation(ref.value))
  }

  private fun as_1926392112(): IStorageFolder.WithDefault {
    if(pointer == NULL) {
      return(IStorageFolder.ABI.makeIStorageFolder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFolder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolder.ABI.makeIStorageFolder(ref.value))
  }

  private fun as_507586037(): IStorageItem.WithDefault {
    if(pointer == NULL) {
      return(IStorageItem.ABI.makeIStorageItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItem.ABI.makeIStorageItem(ref.value))
  }

  private fun as_850042616(): IStorageItemProperties.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemProperties.ABI.makeIStorageItemProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemProperties.ABI.makeIStorageItemProperties(ref.value))
  }

  private fun as_1216874446(): IStorageFolderQueryOperations.WithDefault {
    if(pointer == NULL) {
      return(IStorageFolderQueryOperations.ABI.makeIStorageFolderQueryOperations(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFolderQueryOperations>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolderQueryOperations.ABI.makeIStorageFolderQueryOperations(ref.value))
  }

  private fun as_1444701987(): IStorageItem2.WithDefault {
    if(pointer == NULL) {
      return(IStorageItem2.ABI.makeIStorageItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItem2.ABI.makeIStorageItem2(ref.value))
  }

  private fun as_411386722(): IStorageFolder2.WithDefault {
    if(pointer == NULL) {
      return(IStorageFolder2.ABI.makeIStorageFolder2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFolder2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFolder2.ABI.makeIStorageFolder2(ref.value))
  }

  private fun as_190620161(): IStorageItemPropertiesWithProvider.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemPropertiesWithProvider.ABI.makeIStorageItemPropertiesWithProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemPropertiesWithProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemPropertiesWithProvider.ABI.makeIStorageItemPropertiesWithProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FolderInformation> {
    public override fun getValue() = FolderInformation(pointer.getPointer(0))

    public fun setValue(value: FolderInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FolderInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FolderInformation {
      val address = segment.toRawLongValue()
      return FolderInformation(Pointer(address))
    }

    public override fun toNative(obj: FolderInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
