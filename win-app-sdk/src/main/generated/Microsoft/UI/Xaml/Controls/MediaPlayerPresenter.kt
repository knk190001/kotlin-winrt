package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IMediaPlayerPresenterFactory.ABI.IID
import Microsoft.UI.Xaml.FrameworkElement
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

@ABIMarker(MediaPlayerPresenter.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.MediaPlayerPresenter;{b6a01245-a73c-51ba-8e1a-3447bb277e40})")
@WinRTByReference(brClass = MediaPlayerPresenter.ByReference::class)
public open class MediaPlayerPresenter(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IMediaPlayerPresenter.WithDefault, IWinRTObject {
  private val __947952778_Interface: IMediaPlayerPresenter.WithDefault by lazy {
    as_947952778()
  }


  public override val __947952778_Ptr: JNAPointer? by lazy {
    __947952778_Interface.__947952778_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__947952778_Interface)

  public constructor() : this(ABI.activate())

  private fun as_947952778(): IMediaPlayerPresenter.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerPresenter.ABI.makeIMediaPlayerPresenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerPresenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerPresenter.ABI.makeIMediaPlayerPresenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlayerPresenter> {
    public override fun getValue() = MediaPlayerPresenter(pointer.getPointer(0))

    public fun setValue(value: MediaPlayerPresenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlayerPresenter, MemoryAddress> {
    public val IMediaPlayerPresenterStatics_Instance: IMediaPlayerPresenterStatics by lazy {
      createIMediaPlayerPresenterStatics()
    }


    public val IMediaPlayerPresenterFactory_Instance: IMediaPlayerPresenterFactory by lazy {
      createIMediaPlayerPresenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaPlayerPresenterStatics(): IMediaPlayerPresenterStatics {
      val refiid = Guid.REFIID(IMediaPlayerPresenterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MediaPlayerPresenter".toHandle(),refiid,interfacePtr)
      val result =
          IMediaPlayerPresenterStatics.ABI.makeIMediaPlayerPresenterStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaPlayerPresenterFactory(): IMediaPlayerPresenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.MediaPlayerPresenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaPlayerPresenterFactory.ABI.makeIMediaPlayerPresenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IMediaPlayerPresenterFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaPlayerPresenter {
      val address = segment.toRawLongValue()
      return MediaPlayerPresenter(Pointer(address))
    }

    public override fun toNative(obj: MediaPlayerPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MediaPlayerProperty() =
        ABI.IMediaPlayerPresenterStatics_Instance.get_MediaPlayerProperty()

    public fun get_StretchProperty() =
        ABI.IMediaPlayerPresenterStatics_Instance.get_StretchProperty()

    public fun get_IsFullWindowProperty() =
        ABI.IMediaPlayerPresenterStatics_Instance.get_IsFullWindowProperty()
  }
}
