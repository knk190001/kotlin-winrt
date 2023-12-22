package Windows.Media.Editing

import Windows.Foundation.Rect
import Windows.Media.Editing.IMediaOverlayFactory.ABI.IID
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
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaOverlay.ABI::class)
@Signature("rc(Windows.Media.Editing.MediaOverlay;{a902ae5d-7869-4830-8ab1-94dc01c05fa4})")
@WinRTByReference(brClass = MediaOverlay.ByReference::class)
public class MediaOverlay(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaOverlay.WithDefault, IWinRTObject {
  private val __1651766638_Interface: IMediaOverlay.WithDefault by lazy {
    as_1651766638()
  }


  public override val __1651766638_Ptr: JNAPointer? by lazy {
    __1651766638_Interface.__1651766638_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1651766638_Interface)

  public constructor(clip: MediaClip) : this(ABI.activate(clip))

  public constructor(
    clip: MediaClip,
    position: Rect,
    opacity: Double
  ) : this(ABI.activate(clip, position, opacity))

  private fun as_1651766638(): IMediaOverlay.WithDefault {
    if(pointer == NULL) {
      return(IMediaOverlay.ABI.makeIMediaOverlay(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaOverlay>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaOverlay.ABI.makeIMediaOverlay(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaOverlay> {
    public override fun getValue() = MediaOverlay(pointer.getPointer(0))

    public fun setValue(value: MediaOverlay): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaOverlay, MemoryAddress> {
    public val IMediaOverlayFactory_Instance: IMediaOverlayFactory by lazy {
      createIMediaOverlayFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaOverlayFactory(): IMediaOverlayFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Editing.MediaOverlay".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaOverlayFactory.ABI.makeIMediaOverlayFactory(factoryActivatorPtr.value))
    }

    public fun activate(clip: MediaClip): JNAPointer? =
        IMediaOverlayFactory_Instance.Create(clip)?.pointer

    public fun activate(
      clip: MediaClip,
      position: Rect,
      opacity: Double
    ): JNAPointer? = IMediaOverlayFactory_Instance.CreateWithPositionAndOpacity(clip, position,
        opacity)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaOverlay {
      val address = segment.toRawLongValue()
      return MediaOverlay(Pointer(address))
    }

    public override fun toNative(obj: MediaOverlay): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
