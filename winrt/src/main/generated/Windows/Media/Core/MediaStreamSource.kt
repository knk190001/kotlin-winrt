package Windows.Media.Core

import Windows.Media.Core.IMediaStreamSourceFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaStreamSource.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSource;{3712d543-45eb-4138-aa62-c01e26f3843f})")
@WinRTByReference(brClass = MediaStreamSource.ByReference::class)
public class MediaStreamSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSource.WithDefault, IMediaSource.WithDefault,
    IMediaStreamSource2.WithDefault, IMediaStreamSource3.WithDefault,
    IMediaStreamSource4.WithDefault, IWinRTObject {
  private val __2144608138_Interface: IMediaStreamSource.WithDefault by lazy {
    as_2144608138()
  }


  private val __1076644650_Interface: IMediaSource.WithDefault by lazy {
    as_1076644650()
  }


  private val __2058342888_Interface: IMediaStreamSource2.WithDefault by lazy {
    as_2058342888()
  }


  private val __2058342889_Interface: IMediaStreamSource3.WithDefault by lazy {
    as_2058342889()
  }


  private val __2058342890_Interface: IMediaStreamSource4.WithDefault by lazy {
    as_2058342890()
  }


  public override val __2144608138_Ptr: JNAPointer? by lazy {
    __2144608138_Interface.__2144608138_Ptr
  }


  public override val __1076644650_Ptr: JNAPointer? by lazy {
    __1076644650_Interface.__1076644650_Ptr
  }


  public override val __2058342888_Ptr: JNAPointer? by lazy {
    __2058342888_Interface.__2058342888_Ptr
  }


  public override val __2058342889_Ptr: JNAPointer? by lazy {
    __2058342889_Interface.__2058342889_Ptr
  }


  public override val __2058342890_Ptr: JNAPointer? by lazy {
    __2058342890_Interface.__2058342890_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2144608138_Interface, __1076644650_Interface, __2058342888_Interface,
        __2058342889_Interface, __2058342890_Interface)

  public constructor(descriptor: IMediaStreamDescriptor) : this(ABI.activate(descriptor))

  public constructor(descriptor: IMediaStreamDescriptor, descriptor2: IMediaStreamDescriptor) :
      this(ABI.activate(descriptor, descriptor2))

  private fun as_2144608138(): IMediaStreamSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSource.ABI.makeIMediaStreamSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSource.ABI.makeIMediaStreamSource(ref.value))
  }

  private fun as_1076644650(): IMediaSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaSource.ABI.makeIMediaSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSource.ABI.makeIMediaSource(ref.value))
  }

  private fun as_2058342888(): IMediaStreamSource2.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSource2.ABI.makeIMediaStreamSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSource2.ABI.makeIMediaStreamSource2(ref.value))
  }

  private fun as_2058342889(): IMediaStreamSource3.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSource3.ABI.makeIMediaStreamSource3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSource3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSource3.ABI.makeIMediaStreamSource3(ref.value))
  }

  private fun as_2058342890(): IMediaStreamSource4.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSource4.ABI.makeIMediaStreamSource4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSource4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSource4.ABI.makeIMediaStreamSource4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSource> {
    public override fun getValue() = MediaStreamSource(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSource, MemoryAddress> {
    public val IMediaStreamSourceFactory_Instance: IMediaStreamSourceFactory by lazy {
      createIMediaStreamSourceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaStreamSourceFactory(): IMediaStreamSourceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MediaStreamSource".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaStreamSourceFactory.ABI.makeIMediaStreamSourceFactory(factoryActivatorPtr.value))
    }

    public fun activate(descriptor: IMediaStreamDescriptor): JNAPointer? =
        IMediaStreamSourceFactory_Instance.CreateFromDescriptor(descriptor)?.pointer

    public fun activate(descriptor: IMediaStreamDescriptor, descriptor2: IMediaStreamDescriptor):
        JNAPointer? = IMediaStreamSourceFactory_Instance.CreateFromDescriptors(descriptor,
        descriptor2)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaStreamSource {
      val address = segment.toRawLongValue()
      return MediaStreamSource(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
