package Windows.Storage

import Windows.Foundation.Uri
import Windows.Storage.Streams.IInputStreamReference
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StorageFile.ABI::class)
@Signature("rc(Windows.Storage.StorageFile;{fa3f6186-4214-428c-a64c-14c9ac7315ea})")
@WinRTByReference(brClass = StorageFile.ByReference::class)
public class StorageFile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStorageFile.WithDefault, IInputStreamReference.WithDefault,
    IRandomAccessStreamReference.WithDefault, IStorageItem.WithDefault,
    IStorageItemProperties.WithDefault, IStorageItemProperties2.WithDefault,
    IStorageItem2.WithDefault, IStorageItemPropertiesWithProvider.WithDefault,
    IStorageFilePropertiesWithAvailability.WithDefault, IStorageFile2.WithDefault, IWinRTObject {
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


  private val __581517270_Interface: IStorageItemProperties2.WithDefault by lazy {
    as_581517270()
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


  public override val __581517270_Ptr: JNAPointer? by lazy {
    __581517270_Interface.__581517270_Ptr
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
    get() = arrayOf(__507486302_Interface, __1775956181_Interface, __1417919440_Interface,
        __507586037_Interface, __850042616_Interface, __581517270_Interface, __1444701987_Interface,
        __190620161_Interface, __1432186990_Interface, __1447793772_Interface)

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

  private fun as_581517270(): IStorageItemProperties2.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemProperties2.ABI.makeIStorageItemProperties2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemProperties2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemProperties2.ABI.makeIStorageItemProperties2(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StorageFile> {
    public override fun getValue() = StorageFile(pointer.getPointer(0))

    public fun setValue(value: StorageFile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageFile, MemoryAddress> {
    public val IStorageFileStatics_Instance: IStorageFileStatics by lazy {
      createIStorageFileStatics()
    }


    public val IStorageFileStatics2_Instance: IStorageFileStatics2 by lazy {
      createIStorageFileStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStorageFileStatics(): IStorageFileStatics {
      val refiid = Guid.REFIID(IStorageFileStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageFile".toHandle(),refiid,interfacePtr)
      val result = IStorageFileStatics.ABI.makeIStorageFileStatics(interfacePtr.value)
      return result
    }

    public fun createIStorageFileStatics2(): IStorageFileStatics2 {
      val refiid = Guid.REFIID(IStorageFileStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.StorageFile".toHandle(),refiid,interfacePtr)
      val result = IStorageFileStatics2.ABI.makeIStorageFileStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StorageFile {
      val address = segment.toRawLongValue()
      return StorageFile(Pointer(address))
    }

    public override fun toNative(obj: StorageFile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetFileFromPathAsync(path: String) =
        ABI.IStorageFileStatics_Instance.GetFileFromPathAsync(path)

    public fun GetFileFromApplicationUriAsync(uri: Uri) =
        ABI.IStorageFileStatics_Instance.GetFileFromApplicationUriAsync(uri)

    public fun CreateStreamedFileAsync(
      displayNameWithExtension: String,
      dataRequested: StreamedFileDataRequestedHandler,
      thumbnail: IRandomAccessStreamReference
    ) = ABI.IStorageFileStatics_Instance.CreateStreamedFileAsync(displayNameWithExtension,
        dataRequested, thumbnail)

    public fun ReplaceWithStreamedFileAsync(
      fileToReplace: IStorageFile,
      dataRequested: StreamedFileDataRequestedHandler,
      thumbnail: IRandomAccessStreamReference
    ) = ABI.IStorageFileStatics_Instance.ReplaceWithStreamedFileAsync(fileToReplace, dataRequested,
        thumbnail)

    public fun CreateStreamedFileFromUriAsync(
      displayNameWithExtension: String,
      uri: Uri,
      thumbnail: IRandomAccessStreamReference
    ) = ABI.IStorageFileStatics_Instance.CreateStreamedFileFromUriAsync(displayNameWithExtension,
        uri, thumbnail)

    public fun ReplaceWithStreamedFileFromUriAsync(
      fileToReplace: IStorageFile,
      uri: Uri,
      thumbnail: IRandomAccessStreamReference
    ) = ABI.IStorageFileStatics_Instance.ReplaceWithStreamedFileFromUriAsync(fileToReplace, uri,
        thumbnail)

    public fun GetFileFromPathForUserAsync(user: User, path: String) =
        ABI.IStorageFileStatics2_Instance.GetFileFromPathForUserAsync(user, path)
  }
}
