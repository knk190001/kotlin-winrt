package Windows.ApplicationModel.Background

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

@ABIMarker(MediaProcessingTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.MediaProcessingTrigger;{9a95be65-8a52-4b30-9011-cf38040ea8b0})")
@WinRTByReference(brClass = MediaProcessingTrigger.ByReference::class)
public class MediaProcessingTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaProcessingTrigger.WithDefault, IBackgroundTrigger.WithDefault,
    IWinRTObject {
  private val __1473867054_Interface: IMediaProcessingTrigger.WithDefault by lazy {
    as_1473867054()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1473867054_Ptr: JNAPointer? by lazy {
    __1473867054_Interface.__1473867054_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1473867054_Interface, __54213927_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1473867054(): IMediaProcessingTrigger.WithDefault {
    if(pointer == NULL) {
      return(IMediaProcessingTrigger.ABI.makeIMediaProcessingTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaProcessingTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaProcessingTrigger.ABI.makeIMediaProcessingTrigger(ref.value))
  }

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaProcessingTrigger> {
    public override fun getValue() = MediaProcessingTrigger(pointer.getPointer(0))

    public fun setValue(value: MediaProcessingTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaProcessingTrigger, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.MediaProcessingTrigger".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MediaProcessingTrigger {
      val address = segment.toRawLongValue()
      return MediaProcessingTrigger(Pointer(address))
    }

    public override fun toNative(obj: MediaProcessingTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
