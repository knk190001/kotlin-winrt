package Windows.Storage.BulkAccess

import Windows.Storage.IStorageFile
import Windows.Storage.IStorageFile2
import Windows.Storage.IStorageFilePropertiesWithAvailability
import Windows.Storage.IStorageItem
import Windows.Storage.IStorageItem2
import Windows.Storage.IStorageItemProperties
import Windows.Storage.IStorageItemPropertiesWithProvider
import Windows.Storage.Streams.IInputStreamReference
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(FileInformation.ABI::class)
@Signature("rc(Windows.Storage.BulkAccess.FileInformation;{87a5cb8b-8972-4f40-8de0-d86fb179d8fa})")
@WinRTByReference(brClass = FileInformation.ByReference::class)
public class FileInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageItemInformation.WithDefault, IStorageFile.WithDefault,
    IInputStreamReference.WithDefault, IRandomAccessStreamReference.WithDefault,
    IStorageItem.WithDefault, IStorageItemProperties.WithDefault, IStorageItem2.WithDefault,
    IStorageItemPropertiesWithProvider.WithDefault,
    IStorageFilePropertiesWithAvailability.WithDefault, IStorageFile2.WithDefault, IWinRTObject {
  private val __1258609971_Interface: IStorageItemInformation.WithDefault by lazy {
    as_1258609971()
  }


  private val __507486302_Interface: IStorageFile.WithDefault by lazy {
    as_507486302()
  }


  private val __1775956181_Interface: IInputStreamReference.WithDefault by lazy {
    as_1775956181()
  }


  private val __1417919440_Interface: IRandomAccessStreamReference.WithDefault by lazy {
    as_1417919440()
  }


  private val __507586037_Interface: IStorageItem.WithDefault by lazy {
    as_507586037()
  }


  private val __850042616_Interface: IStorageItemProperties.WithDefault by lazy {
    as_850042616()
  }


  private val __1444701987_Interface: IStorageItem2.WithDefault by lazy {
    as_1444701987()
  }


  private val __190620161_Interface: IStorageItemPropertiesWithProvider.WithDefault by lazy {
    as_190620161()
  }


  private val __1432186990_Interface: IStorageFilePropertiesWithAvailability.WithDefault by lazy {
    as_1432186990()
  }


  private val __1447793772_Interface: IStorageFile2.WithDefault by lazy {
    as_1447793772()
  }


  public override val __1258609971_Ptr: JNAPointer? by lazy {
    __1258609971_Interface.__1258609971_Ptr
  }


  public override val __507486302_Ptr: JNAPointer? by lazy {
    __507486302_Interface.__507486302_Ptr
  }


  public override val __1775956181_Ptr: JNAPointer? by lazy {
    __1775956181_Interface.__1775956181_Ptr
  }


  public override val __1417919440_Ptr: JNAPointer? by lazy {
    __1417919440_Interface.__1417919440_Ptr
  }


  public override val __507586037_Ptr: JNAPointer? by lazy {
    __507586037_Interface.__507586037_Ptr
  }


  public override val __850042616_Ptr: JNAPointer? by lazy {
    __850042616_Interface.__850042616_Ptr
  }


  public override val __1444701987_Ptr: JNAPointer? by lazy {
    __1444701987_Interface.__1444701987_Ptr
  }


  public override val __190620161_Ptr: JNAPointer? by lazy {
    __190620161_Interface.__190620161_Ptr
  }


  public override val __1432186990_Ptr: JNAPointer? by lazy {
    __1432186990_Interface.__1432186990_Ptr
  }


  public override val __1447793772_Ptr: JNAPointer? by lazy {
    __1447793772_Interface.__1447793772_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1258609971_Interface, __507486302_Interface, __1775956181_Interface,
        __1417919440_Interface, __507586037_Interface, __850042616_Interface,
        __1444701987_Interface, __190620161_Interface, __1432186990_Interface,
        __1447793772_Interface)

  private fun as_1258609971(): IStorageItemInformation.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemInformation.ABI.makeIStorageItemInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemInformation.ABI.makeIStorageItemInformation(ref.value))
  }

  private fun as_507486302(): IStorageFile.WithDefault {
    if(pointer == NULL) {
      return(IStorageFile.ABI.makeIStorageFile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFile.ABI.makeIStorageFile(ref.value))
  }

  private fun as_1775956181(): IInputStreamReference.WithDefault {
    if(pointer == NULL) {
      return(IInputStreamReference.ABI.makeIInputStreamReference(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputStreamReference>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputStreamReference.ABI.makeIInputStreamReference(ref.value))
  }

  private fun as_1417919440(): IRandomAccessStreamReference.WithDefault {
    if(pointer == NULL) {
      return(IRandomAccessStreamReference.ABI.makeIRandomAccessStreamReference(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRandomAccessStreamReference>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStreamReference.ABI.makeIRandomAccessStreamReference(ref.value))
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

  private fun as_1444701987(): IStorageItem2.WithDefault {
    if(pointer == NULL) {
      return(IStorageItem2.ABI.makeIStorageItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItem2.ABI.makeIStorageItem2(ref.value))
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

  private fun as_1432186990(): IStorageFilePropertiesWithAvailability.WithDefault {
    if(pointer == NULL) {
      return(IStorageFilePropertiesWithAvailability.ABI.makeIStorageFilePropertiesWithAvailability(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFilePropertiesWithAvailability>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFilePropertiesWithAvailability.ABI.makeIStorageFilePropertiesWithAvailability(ref.value))
  }

  private fun as_1447793772(): IStorageFile2.WithDefault {
    if(pointer == NULL) {
      return(IStorageFile2.ABI.makeIStorageFile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageFile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageFile2.ABI.makeIStorageFile2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileInformation> {
    public override fun getValue() = FileInformation(pointer.getPointer(0))

    public fun setValue(value: FileInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FileInformation {
      val address = segment.toRawLongValue()
      return FileInformation(Pointer(address))
    }

    public override fun toNative(obj: FileInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
