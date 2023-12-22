package Windows.Media.Core

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

@ABIMarker(VideoStabilizationEffectEnabledChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.VideoStabilizationEffectEnabledChangedEventArgs;{187eff28-67bb-4713-b900-4168da164529})")
@WinRTByReference(brClass = VideoStabilizationEffectEnabledChangedEventArgs.ByReference::class)
public class VideoStabilizationEffectEnabledChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoStabilizationEffectEnabledChangedEventArgs.WithDefault, IWinRTObject {
  private val __771828890_Interface: IVideoStabilizationEffectEnabledChangedEventArgs.WithDefault by
      lazy {
    as_771828890()
  }


  public override val __771828890_Ptr: JNAPointer? by lazy {
    __771828890_Interface.__771828890_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__771828890_Interface)

  private fun as_771828890(): IVideoStabilizationEffectEnabledChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVideoStabilizationEffectEnabledChangedEventArgs.ABI.makeIVideoStabilizationEffectEnabledChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoStabilizationEffectEnabledChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoStabilizationEffectEnabledChangedEventArgs.ABI.makeIVideoStabilizationEffectEnabledChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VideoStabilizationEffectEnabledChangedEventArgs> {
    public override fun getValue() =
        VideoStabilizationEffectEnabledChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VideoStabilizationEffectEnabledChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoStabilizationEffectEnabledChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        VideoStabilizationEffectEnabledChangedEventArgs {
      val address = segment.toRawLongValue()
      return VideoStabilizationEffectEnabledChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VideoStabilizationEffectEnabledChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
