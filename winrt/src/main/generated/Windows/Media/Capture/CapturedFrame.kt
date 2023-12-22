package Windows.Media.Capture

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

@ABIMarker(CapturedFrame.ABI::class)
@Signature("rc(Windows.Media.Capture.CapturedFrame;{1dd2de1f-571b-44d8-8e80-a08a1578766e})")
@WinRTByReference(brClass = CapturedFrame.ByReference::class)
public class CapturedFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICapturedFrame.WithDefault, IRandomAccessStreamWithContentType.WithDefault,
    IContentTypeProvider.WithDefault, IRandomAccessStream.WithDefault, IOutputStream.WithDefault,
    IClosable.WithDefault, IInputStream.WithDefault, ICapturedFrameWithSoftwareBitmap.WithDefault,
    ICapturedFrame2.WithDefault, IWinRTObject {
  private val __909988521_Interface: ICapturedFrame.WithDefault by lazy {
    as_909988521()
  }


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


  private val __1029688877_Interface: ICapturedFrameWithSoftwareBitmap.WithDefault by lazy {
    as_1029688877()
  }


  private val __1855126971_Interface: ICapturedFrame2.WithDefault by lazy {
    as_1855126971()
  }


  public override val __909988521_Ptr: JNAPointer? by lazy {
    __909988521_Interface.__909988521_Ptr
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


  public override val __1029688877_Ptr: JNAPointer? by lazy {
    __1029688877_Interface.__1029688877_Ptr
  }


  public override val __1855126971_Ptr: JNAPointer? by lazy {
    __1855126971_Interface.__1855126971_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__909988521_Interface, __380663666_Interface, __412040816_Interface,
        __597747131_Interface, __591248843_Interface, __1260617006_Interface, __736491754_Interface,
        __1029688877_Interface, __1855126971_Interface)

  private fun as_909988521(): ICapturedFrame.WithDefault {
    if(pointer == NULL) {
      return(ICapturedFrame.ABI.makeICapturedFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICapturedFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICapturedFrame.ABI.makeICapturedFrame(ref.value))
  }

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

  private fun as_1029688877(): ICapturedFrameWithSoftwareBitmap.WithDefault {
    if(pointer == NULL) {
      return(ICapturedFrameWithSoftwareBitmap.ABI.makeICapturedFrameWithSoftwareBitmap(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICapturedFrameWithSoftwareBitmap>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICapturedFrameWithSoftwareBitmap.ABI.makeICapturedFrameWithSoftwareBitmap(ref.value))
  }

  private fun as_1855126971(): ICapturedFrame2.WithDefault {
    if(pointer == NULL) {
      return(ICapturedFrame2.ABI.makeICapturedFrame2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICapturedFrame2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICapturedFrame2.ABI.makeICapturedFrame2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CapturedFrame>
      {
    public override fun getValue() = CapturedFrame(pointer.getPointer(0))

    public fun setValue(value: CapturedFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CapturedFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CapturedFrame {
      val address = segment.toRawLongValue()
      return CapturedFrame(Pointer(address))
    }

    public override fun toNative(obj: CapturedFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
