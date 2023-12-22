package Windows.Media

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

@ABIMarker(MediaTimelineController.ABI::class)
@Signature("rc(Windows.Media.MediaTimelineController;{8ed361f3-0b78-4360-bf71-0c841999ea1b})")
@WinRTByReference(brClass = MediaTimelineController.ByReference::class)
public class MediaTimelineController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaTimelineController.WithDefault, IMediaTimelineController2.WithDefault,
    IWinRTObject {
  private val __1902247089_Interface: IMediaTimelineController.WithDefault by lazy {
    as_1902247089()
  }


  private val __1159882335_Interface: IMediaTimelineController2.WithDefault by lazy {
    as_1159882335()
  }


  public override val __1902247089_Ptr: JNAPointer? by lazy {
    __1902247089_Interface.__1902247089_Ptr
  }


  public override val __1159882335_Ptr: JNAPointer? by lazy {
    __1159882335_Interface.__1159882335_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1902247089_Interface, __1159882335_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1902247089(): IMediaTimelineController.WithDefault {
    if(pointer == NULL) {
      return(IMediaTimelineController.ABI.makeIMediaTimelineController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTimelineController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTimelineController.ABI.makeIMediaTimelineController(ref.value))
  }

  private fun as_1159882335(): IMediaTimelineController2.WithDefault {
    if(pointer == NULL) {
      return(IMediaTimelineController2.ABI.makeIMediaTimelineController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTimelineController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTimelineController2.ABI.makeIMediaTimelineController2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaTimelineController> {
    public override fun getValue() = MediaTimelineController(pointer.getPointer(0))

    public fun setValue(value: MediaTimelineController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaTimelineController, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.MediaTimelineController".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MediaTimelineController {
      val address = segment.toRawLongValue()
      return MediaTimelineController(Pointer(address))
    }

    public override fun toNative(obj: MediaTimelineController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
