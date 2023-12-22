package Windows.Storage.FileProperties

import Windows.Foundation.IClosable
import Windows.Storage.Streams.IContentTypeProvider
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
import Windows.Storage.Streams.IRandomAccessStream
import Windows.Storage.Streams.IRandomAccessStreamWithContentType
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

@ABIMarker(StorageItemThumbnail.ABI::class)
@Signature("rc(Windows.Storage.FileProperties.StorageItemThumbnail;{cc254827-4b3d-438f-9232-10c76bc7e038})")
@WinRTByReference(brClass = StorageItemThumbnail.ByReference::class)
public class StorageItemThumbnail(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRandomAccessStreamWithContentType.WithDefault,
    IContentTypeProvider.WithDefault, IRandomAccessStream.WithDefault, IOutputStream.WithDefault,
    IClosable.WithDefault, IInputStream.WithDefault, IThumbnailProperties.WithDefault, IWinRTObject
    {
  private val __380663666_Interface: IRandomAccessStreamWithContentType.WithDefault by lazy {
    as_380663666()
  }


  private val __412040816_Interface: IContentTypeProvider.WithDefault by lazy {
    as_412040816()
  }


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


  private val __1431752829_Interface: IThumbnailProperties.WithDefault by lazy {
    as_1431752829()
  }


  public override val __380663666_Ptr: JNAPointer? by lazy {
    __380663666_Interface.__380663666_Ptr
  }


  public override val __412040816_Ptr: JNAPointer? by lazy {
    __412040816_Interface.__412040816_Ptr
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


  public override val __1431752829_Ptr: JNAPointer? by lazy {
    __1431752829_Interface.__1431752829_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__380663666_Interface, __412040816_Interface, __597747131_Interface,
        __591248843_Interface, __1260617006_Interface, __736491754_Interface,
        __1431752829_Interface)

  private fun as_380663666(): IRandomAccessStreamWithContentType.WithDefault {
    if(pointer == NULL) {
      return(IRandomAccessStreamWithContentType.ABI.makeIRandomAccessStreamWithContentType(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRandomAccessStreamWithContentType>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRandomAccessStreamWithContentType.ABI.makeIRandomAccessStreamWithContentType(ref.value))
  }

  private fun as_412040816(): IContentTypeProvider.WithDefault {
    if(pointer == NULL) {
      return(IContentTypeProvider.ABI.makeIContentTypeProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentTypeProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentTypeProvider.ABI.makeIContentTypeProvider(ref.value))
  }

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

  private fun as_1431752829(): IThumbnailProperties.WithDefault {
    if(pointer == NULL) {
      return(IThumbnailProperties.ABI.makeIThumbnailProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IThumbnailProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IThumbnailProperties.ABI.makeIThumbnailProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StorageItemThumbnail> {
    public override fun getValue() = StorageItemThumbnail(pointer.getPointer(0))

    public fun setValue(value: StorageItemThumbnail): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StorageItemThumbnail, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StorageItemThumbnail {
      val address = segment.toRawLongValue()
      return StorageItemThumbnail(Pointer(address))
    }

    public override fun toNative(obj: StorageItemThumbnail): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
