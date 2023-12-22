package Windows.Storage.Streams

import Windows.Foundation.IClosable
import Windows.Storage.FileAccessMode
import Windows.Storage.StorageOpenOptions
import Windows.System.User
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

@ABIMarker(FileRandomAccessStream.ABI::class)
@Signature("rc(Windows.Storage.Streams.FileRandomAccessStream;{905a0fe1-bc53-11df-8c49-001e4fc686da})")
@WinRTByReference(brClass = FileRandomAccessStream.ByReference::class)
public class FileRandomAccessStream(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRandomAccessStream.WithDefault, IOutputStream.WithDefault,
    IClosable.WithDefault, IInputStream.WithDefault, IWinRTObject {
  private val __597747131_Interface: IRandomAccessStream.WithDefault by lazy {
    as_597747131()
  }


  private val __591248843_Interface: IOutputStream.WithDefault by lazy {
    as_591248843()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __736491754_Interface: IInputStream.WithDefault by lazy {
    as_736491754()
  }


  public override val __597747131_Ptr: JNAPointer? by lazy {
    __597747131_Interface.__597747131_Ptr
  }


  public override val __591248843_Ptr: JNAPointer? by lazy {
    __591248843_Interface.__591248843_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __736491754_Ptr: JNAPointer? by lazy {
    __736491754_Interface.__736491754_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__597747131_Interface, __591248843_Interface, __1260617006_Interface,
        __736491754_Interface)

  private fun as_597747131(): IRandomAccessStream.WithDefault {
    if(pointer == NULL) {
      return(IRandomAccessStream.ABI.makeIRandomAccessStream(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRandomAccessStream>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStream.ABI.makeIRandomAccessStream(ref.value))
  }

  private fun as_591248843(): IOutputStream.WithDefault {
    if(pointer == NULL) {
      return(IOutputStream.ABI.makeIOutputStream(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOutputStream>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOutputStream.ABI.makeIOutputStream(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_736491754(): IInputStream.WithDefault {
    if(pointer == NULL) {
      return(IInputStream.ABI.makeIInputStream(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputStream>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputStream.ABI.makeIInputStream(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileRandomAccessStream> {
    public override fun getValue() = FileRandomAccessStream(pointer.getPointer(0))

    public fun setValue(value: FileRandomAccessStream): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileRandomAccessStream, MemoryAddress> {
    public val IFileRandomAccessStreamStatics_Instance: IFileRandomAccessStreamStatics by lazy {
      createIFileRandomAccessStreamStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIFileRandomAccessStreamStatics(): IFileRandomAccessStreamStatics {
      val refiid = Guid.REFIID(IFileRandomAccessStreamStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Streams.FileRandomAccessStream".toHandle(),refiid,interfacePtr)
      val result =
          IFileRandomAccessStreamStatics.ABI.makeIFileRandomAccessStreamStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FileRandomAccessStream {
      val address = segment.toRawLongValue()
      return FileRandomAccessStream(Pointer(address))
    }

    public override fun toNative(obj: FileRandomAccessStream): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun OpenAsync(filePath: String, accessMode: FileAccessMode) =
        ABI.IFileRandomAccessStreamStatics_Instance.OpenAsync(filePath, accessMode)

    public fun OpenAsync(
      filePath: String,
      accessMode: FileAccessMode,
      sharingOptions: StorageOpenOptions,
      openDisposition: FileOpenDisposition
    ) = ABI.IFileRandomAccessStreamStatics_Instance.OpenAsync(filePath, accessMode, sharingOptions,
        openDisposition)

    public fun OpenTransactedWriteAsync(filePath: String) =
        ABI.IFileRandomAccessStreamStatics_Instance.OpenTransactedWriteAsync(filePath)

    public fun OpenTransactedWriteAsync(
      filePath: String,
      openOptions: StorageOpenOptions,
      openDisposition: FileOpenDisposition
    ) = ABI.IFileRandomAccessStreamStatics_Instance.OpenTransactedWriteAsync(filePath, openOptions,
        openDisposition)

    public fun OpenForUserAsync(
      user: User,
      filePath: String,
      accessMode: FileAccessMode
    ) = ABI.IFileRandomAccessStreamStatics_Instance.OpenForUserAsync(user, filePath, accessMode)

    public fun OpenForUserAsync(
      user: User,
      filePath: String,
      accessMode: FileAccessMode,
      sharingOptions: StorageOpenOptions,
      openDisposition: FileOpenDisposition
    ) = ABI.IFileRandomAccessStreamStatics_Instance.OpenForUserAsync(user, filePath, accessMode,
        sharingOptions, openDisposition)

    public fun OpenTransactedWriteForUserAsync(user: User, filePath: String) =
        ABI.IFileRandomAccessStreamStatics_Instance.OpenTransactedWriteForUserAsync(user, filePath)

    public fun OpenTransactedWriteForUserAsync(
      user: User,
      filePath: String,
      openOptions: StorageOpenOptions,
      openDisposition: FileOpenDisposition
    ) = ABI.IFileRandomAccessStreamStatics_Instance.OpenTransactedWriteForUserAsync(user, filePath,
        openOptions, openDisposition)
  }
}
