package Windows.Storage.BulkAccess

import Windows.Storage.BulkAccess.IFileInformationFactoryFactory.ABI.IID
import Windows.Storage.FileProperties.ThumbnailMode
import Windows.Storage.FileProperties.ThumbnailOptions
import Windows.Storage.Search.IStorageQueryResultBase
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(FileInformationFactory.ABI::class)
@Signature("rc(Windows.Storage.BulkAccess.FileInformationFactory;{401d88be-960f-4d6d-a7d0-1a3861e76c83})")
@WinRTByReference(brClass = FileInformationFactory.ByReference::class)
public class FileInformationFactory(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileInformationFactory.WithDefault, IWinRTObject {
  private val __170837521_Interface: IFileInformationFactory.WithDefault by lazy {
    as_170837521()
  }


  public override val __170837521_Ptr: JNAPointer? by lazy {
    __170837521_Interface.__170837521_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__170837521_Interface)

  public constructor(queryResult: IStorageQueryResultBase, mode: ThumbnailMode) :
      this(ABI.activate(queryResult, mode))

  public constructor(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: WinDef.UINT
  ) : this(ABI.activate(queryResult, mode, requestedThumbnailSize))

  public constructor(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: WinDef.UINT,
    thumbnailOptions: ThumbnailOptions
  ) : this(ABI.activate(queryResult, mode, requestedThumbnailSize, thumbnailOptions))

  public constructor(
    queryResult: IStorageQueryResultBase,
    mode: ThumbnailMode,
    requestedThumbnailSize: WinDef.UINT,
    thumbnailOptions: ThumbnailOptions,
    delayLoad: Boolean
  ) : this(ABI.activate(queryResult, mode, requestedThumbnailSize, thumbnailOptions, delayLoad))

  private fun as_170837521(): IFileInformationFactory.WithDefault {
    if(pointer == NULL) {
      return(IFileInformationFactory.ABI.makeIFileInformationFactory(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileInformationFactory>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileInformationFactory.ABI.makeIFileInformationFactory(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileInformationFactory> {
    public override fun getValue() = FileInformationFactory(pointer.getPointer(0))

    public fun setValue(value: FileInformationFactory): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileInformationFactory, MemoryAddress> {
    public val IFileInformationFactoryFactory_Instance: IFileInformationFactoryFactory by lazy {
      createIFileInformationFactoryFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFileInformationFactoryFactory(): IFileInformationFactoryFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.BulkAccess.FileInformationFactory".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IFileInformationFactoryFactory.ABI.makeIFileInformationFactoryFactory(factoryActivatorPtr.value))
    }

    public fun activate(queryResult: IStorageQueryResultBase, mode: ThumbnailMode): JNAPointer? =
        IFileInformationFactoryFactory_Instance.CreateWithMode(queryResult, mode)?.pointer

    public fun activate(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: WinDef.UINT
    ): JNAPointer? = IFileInformationFactoryFactory_Instance.CreateWithModeAndSize(queryResult,
        mode, requestedThumbnailSize)?.pointer

    public fun activate(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: WinDef.UINT,
      thumbnailOptions: ThumbnailOptions
    ): JNAPointer? =
        IFileInformationFactoryFactory_Instance.CreateWithModeAndSizeAndOptions(queryResult, mode,
        requestedThumbnailSize, thumbnailOptions)?.pointer

    public fun activate(
      queryResult: IStorageQueryResultBase,
      mode: ThumbnailMode,
      requestedThumbnailSize: WinDef.UINT,
      thumbnailOptions: ThumbnailOptions,
      delayLoad: Boolean
    ): JNAPointer? =
        IFileInformationFactoryFactory_Instance.CreateWithModeAndSizeAndOptionsAndFlags(queryResult,
        mode, requestedThumbnailSize, thumbnailOptions, delayLoad)?.pointer

    public override fun fromNative(segment: MemoryAddress): FileInformationFactory {
      val address = segment.toRawLongValue()
      return FileInformationFactory(Pointer(address))
    }

    public override fun toNative(obj: FileInformationFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
