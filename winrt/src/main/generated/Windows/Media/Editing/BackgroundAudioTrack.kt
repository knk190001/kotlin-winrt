package Windows.Media.Editing

import Windows.Storage.IStorageFile
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

@ABIMarker(BackgroundAudioTrack.ABI::class)
@Signature("rc(Windows.Media.Editing.BackgroundAudioTrack;{4b91b3bd-9e21-4266-a9c2-67dd011a2357})")
@WinRTByReference(brClass = BackgroundAudioTrack.ByReference::class)
public class BackgroundAudioTrack(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundAudioTrack.WithDefault, IWinRTObject {
  private val __183579735_Interface: IBackgroundAudioTrack.WithDefault by lazy {
    as_183579735()
  }


  public override val __183579735_Ptr: JNAPointer? by lazy {
    __183579735_Interface.__183579735_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__183579735_Interface)

  private fun as_183579735(): IBackgroundAudioTrack.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundAudioTrack.ABI.makeIBackgroundAudioTrack(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundAudioTrack>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundAudioTrack.ABI.makeIBackgroundAudioTrack(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundAudioTrack> {
    public override fun getValue() = BackgroundAudioTrack(pointer.getPointer(0))

    public fun setValue(value: BackgroundAudioTrack): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundAudioTrack, MemoryAddress> {
    public val IBackgroundAudioTrackStatics_Instance: IBackgroundAudioTrackStatics by lazy {
      createIBackgroundAudioTrackStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBackgroundAudioTrackStatics(): IBackgroundAudioTrackStatics {
      val refiid = Guid.REFIID(IBackgroundAudioTrackStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Editing.BackgroundAudioTrack".toHandle(),refiid,interfacePtr)
      val result =
          IBackgroundAudioTrackStatics.ABI.makeIBackgroundAudioTrackStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BackgroundAudioTrack {
      val address = segment.toRawLongValue()
      return BackgroundAudioTrack(Pointer(address))
    }

    public override fun toNative(obj: BackgroundAudioTrack): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromEmbeddedAudioTrack(embeddedAudioTrack: EmbeddedAudioTrack) =
        ABI.IBackgroundAudioTrackStatics_Instance.CreateFromEmbeddedAudioTrack(embeddedAudioTrack)

    public fun CreateFromFileAsync(`file`: IStorageFile) =
        ABI.IBackgroundAudioTrackStatics_Instance.CreateFromFileAsync(file)
  }
}
