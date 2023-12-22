package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IMediaPlayerElementFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaPlayerElement.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.MediaPlayerElement;{3b4ca526-2e25-4598-bc71-d491f8e8de39})")
@WinRTByReference(brClass = MediaPlayerElement.ByReference::class)
public open class MediaPlayerElement(
  ptr: JNAPointer? = NULL
) : Control(ptr), IMediaPlayerElement.WithDefault, IWinRTObject {
  private val __2071327629_Interface: IMediaPlayerElement.WithDefault by lazy {
    as_2071327629()
  }


  public override val __2071327629_Ptr: JNAPointer? by lazy {
    __2071327629_Interface.__2071327629_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2071327629_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2071327629(): IMediaPlayerElement.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerElement.ABI.makeIMediaPlayerElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerElement.ABI.makeIMediaPlayerElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlayerElement> {
    public override fun getValue() = MediaPlayerElement(pointer.getPointer(0))

    public fun setValue(value: MediaPlayerElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlayerElement, MemoryAddress> {
    public val IMediaPlayerElementStatics_Instance: IMediaPlayerElementStatics by lazy {
      createIMediaPlayerElementStatics()
    }


    public val IMediaPlayerElementFactory_Instance: IMediaPlayerElementFactory by lazy {
      createIMediaPlayerElementFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaPlayerElementStatics(): IMediaPlayerElementStatics {
      val refiid = Guid.REFIID(IMediaPlayerElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaPlayerElement".toHandle(),refiid,interfacePtr)
      val result = IMediaPlayerElementStatics.ABI.makeIMediaPlayerElementStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaPlayerElementFactory(): IMediaPlayerElementFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.MediaPlayerElement".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaPlayerElementFactory.ABI.makeIMediaPlayerElementFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMediaPlayerElementFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaPlayerElement {
      val address = segment.toRawLongValue()
      return MediaPlayerElement(Pointer(address))
    }

    public override fun toNative(obj: MediaPlayerElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SourceProperty() = ABI.IMediaPlayerElementStatics_Instance.get_SourceProperty()

    public fun get_AreTransportControlsEnabledProperty() =
        ABI.IMediaPlayerElementStatics_Instance.get_AreTransportControlsEnabledProperty()

    public fun get_PosterSourceProperty() =
        ABI.IMediaPlayerElementStatics_Instance.get_PosterSourceProperty()

    public fun get_StretchProperty() = ABI.IMediaPlayerElementStatics_Instance.get_StretchProperty()

    public fun get_AutoPlayProperty() =
        ABI.IMediaPlayerElementStatics_Instance.get_AutoPlayProperty()

    public fun get_IsFullWindowProperty() =
        ABI.IMediaPlayerElementStatics_Instance.get_IsFullWindowProperty()

    public fun get_MediaPlayerProperty() =
        ABI.IMediaPlayerElementStatics_Instance.get_MediaPlayerProperty()
  }
}
