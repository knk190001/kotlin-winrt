package Windows.Media.Playback

import Windows.Foundation.TimeSpan
import Windows.Media.Playback.IMediaBreakFactory.ABI.IID
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

@ABIMarker(MediaBreak.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaBreak;{714be270-0def-4ebc-a489-6b34930e1558})")
@WinRTByReference(brClass = MediaBreak.ByReference::class)
public class MediaBreak(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaBreak.WithDefault, IWinRTObject {
  private val __1185063276_Interface: IMediaBreak.WithDefault by lazy {
    as_1185063276()
  }


  public override val __1185063276_Ptr: JNAPointer? by lazy {
    __1185063276_Interface.__1185063276_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1185063276_Interface)

  public constructor(insertionMethod: MediaBreakInsertionMethod) :
      this(ABI.activate(insertionMethod))

  public constructor(insertionMethod: MediaBreakInsertionMethod, presentationPosition: TimeSpan) :
      this(ABI.activate(insertionMethod, presentationPosition))

  private fun as_1185063276(): IMediaBreak.WithDefault {
    if(pointer == NULL) {
      return(IMediaBreak.ABI.makeIMediaBreak(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaBreak>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaBreak.ABI.makeIMediaBreak(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaBreak> {
    public override fun getValue() = MediaBreak(pointer.getPointer(0))

    public fun setValue(value: MediaBreak): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaBreak, MemoryAddress> {
    public val IMediaBreakFactory_Instance: IMediaBreakFactory by lazy {
      createIMediaBreakFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaBreakFactory(): IMediaBreakFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Playback.MediaBreak".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaBreakFactory.ABI.makeIMediaBreakFactory(factoryActivatorPtr.value))
    }

    public fun activate(insertionMethod: MediaBreakInsertionMethod): JNAPointer? =
        IMediaBreakFactory_Instance.Create(insertionMethod)?.pointer

    public fun activate(insertionMethod: MediaBreakInsertionMethod, presentationPosition: TimeSpan):
        JNAPointer? = IMediaBreakFactory_Instance.CreateWithPresentationPosition(insertionMethod,
        presentationPosition)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaBreak {
      val address = segment.toRawLongValue()
      return MediaBreak(Pointer(address))
    }

    public override fun toNative(obj: MediaBreak): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
