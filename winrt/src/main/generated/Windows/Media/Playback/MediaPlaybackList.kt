package Windows.Media.Playback

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(MediaPlaybackList.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackList;{7f77ee9c-dc42-4e26-a98d-7850df8ec925})")
@WinRTByReference(brClass = MediaPlaybackList.ByReference::class)
public class MediaPlaybackList(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackList.WithDefault, IMediaPlaybackSource.WithDefault,
    IMediaPlaybackList2.WithDefault, IMediaPlaybackList3.WithDefault, IWinRTObject {
  private val __1200877092_Interface: IMediaPlaybackList.WithDefault by lazy {
    as_1200877092()
  }


  private val __1097311199_Interface: IMediaPlaybackSource.WithDefault by lazy {
    as_1097311199()
  }


  private val __1427515762_Interface: IMediaPlaybackList2.WithDefault by lazy {
    as_1427515762()
  }


  private val __1427515761_Interface: IMediaPlaybackList3.WithDefault by lazy {
    as_1427515761()
  }


  public override val __1200877092_Ptr: JNAPointer? by lazy {
    __1200877092_Interface.__1200877092_Ptr
  }


  public override val __1097311199_Ptr: JNAPointer? by lazy {
    __1097311199_Interface.__1097311199_Ptr
  }


  public override val __1427515762_Ptr: JNAPointer? by lazy {
    __1427515762_Interface.__1427515762_Ptr
  }


  public override val __1427515761_Ptr: JNAPointer? by lazy {
    __1427515761_Interface.__1427515761_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1200877092_Interface, __1097311199_Interface, __1427515762_Interface,
        __1427515761_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1200877092(): IMediaPlaybackList.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackList.ABI.makeIMediaPlaybackList(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackList>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackList.ABI.makeIMediaPlaybackList(ref.value))
  }

  private fun as_1097311199(): IMediaPlaybackSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSource.ABI.makeIMediaPlaybackSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSource.ABI.makeIMediaPlaybackSource(ref.value))
  }

  private fun as_1427515762(): IMediaPlaybackList2.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackList2.ABI.makeIMediaPlaybackList2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackList2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackList2.ABI.makeIMediaPlaybackList2(ref.value))
  }

  private fun as_1427515761(): IMediaPlaybackList3.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackList3.ABI.makeIMediaPlaybackList3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackList3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackList3.ABI.makeIMediaPlaybackList3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackList> {
    public override fun getValue() = MediaPlaybackList(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackList): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackList, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Playback.MediaPlaybackList".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackList {
      val address = segment.toRawLongValue()
      return MediaPlaybackList(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
