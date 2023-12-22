package Windows.Media.Capture.Frames

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaFrameSourceGroup.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MediaFrameSourceGroup;{7f605b87-4832-4b5f-ae3d-412faab37d34})")
@WinRTByReference(brClass = MediaFrameSourceGroup.ByReference::class)
public class MediaFrameSourceGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaFrameSourceGroup.WithDefault, IWinRTObject {
  private val __427076885_Interface: IMediaFrameSourceGroup.WithDefault by lazy {
    as_427076885()
  }


  public override val __427076885_Ptr: JNAPointer? by lazy {
    __427076885_Interface.__427076885_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__427076885_Interface)

  private fun as_427076885(): IMediaFrameSourceGroup.WithDefault {
    if(pointer == NULL) {
      return(IMediaFrameSourceGroup.ABI.makeIMediaFrameSourceGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaFrameSourceGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaFrameSourceGroup.ABI.makeIMediaFrameSourceGroup(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaFrameSourceGroup> {
    public override fun getValue() = MediaFrameSourceGroup(pointer.getPointer(0))

    public fun setValue(value: MediaFrameSourceGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaFrameSourceGroup, MemoryAddress> {
    public val IMediaFrameSourceGroupStatics_Instance: IMediaFrameSourceGroupStatics by lazy {
      createIMediaFrameSourceGroupStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaFrameSourceGroupStatics(): IMediaFrameSourceGroupStatics {
      val refiid = Guid.REFIID(IMediaFrameSourceGroupStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.Frames.MediaFrameSourceGroup".toHandle(),refiid,interfacePtr)
      val result =
          IMediaFrameSourceGroupStatics.ABI.makeIMediaFrameSourceGroupStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaFrameSourceGroup {
      val address = segment.toRawLongValue()
      return MediaFrameSourceGroup(Pointer(address))
    }

    public override fun toNative(obj: MediaFrameSourceGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindAllAsync() = ABI.IMediaFrameSourceGroupStatics_Instance.FindAllAsync()

    public fun FromIdAsync(id: String) = ABI.IMediaFrameSourceGroupStatics_Instance.FromIdAsync(id)

    public fun GetDeviceSelector() = ABI.IMediaFrameSourceGroupStatics_Instance.GetDeviceSelector()
  }
}
