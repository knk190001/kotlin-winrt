package Windows.Media.Core

import Windows.Media.Core.IVideoStreamDescriptorFactory.ABI.IID
import Windows.Media.MediaProperties.VideoEncodingProperties
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

@ABIMarker(VideoStreamDescriptor.ABI::class)
@Signature("rc(Windows.Media.Core.VideoStreamDescriptor;{12ee0d55-9c2b-4440-8057-2c7a90f0cbec})")
@WinRTByReference(brClass = VideoStreamDescriptor.ByReference::class)
public class VideoStreamDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoStreamDescriptor.WithDefault, IMediaStreamDescriptor.WithDefault,
    IMediaStreamDescriptor2.WithDefault, IVideoStreamDescriptor2.WithDefault, IWinRTObject {
  private val __1359228427_Interface: IVideoStreamDescriptor.WithDefault by lazy {
    as_1359228427()
  }


  private val __1209088862_Interface: IMediaStreamDescriptor.WithDefault by lazy {
    as_1209088862()
  }


  private val __1172950892_Interface: IMediaStreamDescriptor2.WithDefault by lazy {
    as_1172950892()
  }


  private val __813591773_Interface: IVideoStreamDescriptor2.WithDefault by lazy {
    as_813591773()
  }


  public override val __1359228427_Ptr: JNAPointer? by lazy {
    __1359228427_Interface.__1359228427_Ptr
  }


  public override val __1209088862_Ptr: JNAPointer? by lazy {
    __1209088862_Interface.__1209088862_Ptr
  }


  public override val __1172950892_Ptr: JNAPointer? by lazy {
    __1172950892_Interface.__1172950892_Ptr
  }


  public override val __813591773_Ptr: JNAPointer? by lazy {
    __813591773_Interface.__813591773_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1359228427_Interface, __1209088862_Interface, __1172950892_Interface,
        __813591773_Interface)

  public constructor(encodingProperties: VideoEncodingProperties) :
      this(ABI.activate(encodingProperties))

  private fun as_1359228427(): IVideoStreamDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IVideoStreamDescriptor.ABI.makeIVideoStreamDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoStreamDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoStreamDescriptor.ABI.makeIVideoStreamDescriptor(ref.value))
  }

  private fun as_1209088862(): IMediaStreamDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamDescriptor.ABI.makeIMediaStreamDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamDescriptor.ABI.makeIMediaStreamDescriptor(ref.value))
  }

  private fun as_1172950892(): IMediaStreamDescriptor2.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamDescriptor2.ABI.makeIMediaStreamDescriptor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamDescriptor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamDescriptor2.ABI.makeIMediaStreamDescriptor2(ref.value))
  }

  private fun as_813591773(): IVideoStreamDescriptor2.WithDefault {
    if(pointer == NULL) {
      return(IVideoStreamDescriptor2.ABI.makeIVideoStreamDescriptor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoStreamDescriptor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoStreamDescriptor2.ABI.makeIVideoStreamDescriptor2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoStreamDescriptor> {
    public override fun getValue() = VideoStreamDescriptor(pointer.getPointer(0))

    public fun setValue(value: VideoStreamDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoStreamDescriptor, MemoryAddress> {
    public val IVideoStreamDescriptorFactory_Instance: IVideoStreamDescriptorFactory by lazy {
      createIVideoStreamDescriptorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIVideoStreamDescriptorFactory(): IVideoStreamDescriptorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.VideoStreamDescriptor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IVideoStreamDescriptorFactory.ABI.makeIVideoStreamDescriptorFactory(factoryActivatorPtr.value))
    }

    public fun activate(encodingProperties: VideoEncodingProperties): JNAPointer? =
        IVideoStreamDescriptorFactory_Instance.Create(encodingProperties)?.pointer

    public override fun fromNative(segment: MemoryAddress): VideoStreamDescriptor {
      val address = segment.toRawLongValue()
      return VideoStreamDescriptor(Pointer(address))
    }

    public override fun toNative(obj: VideoStreamDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
