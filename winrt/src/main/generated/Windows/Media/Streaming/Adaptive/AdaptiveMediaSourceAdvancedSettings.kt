package Windows.Media.Streaming.Adaptive

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

@ABIMarker(AdaptiveMediaSourceAdvancedSettings.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceAdvancedSettings;{55db1680-1aeb-47dc-aa08-9a11610ba45a})")
@WinRTByReference(brClass = AdaptiveMediaSourceAdvancedSettings.ByReference::class)
public class AdaptiveMediaSourceAdvancedSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceAdvancedSettings.WithDefault, IWinRTObject {
  private val __1792189668_Interface: IAdaptiveMediaSourceAdvancedSettings.WithDefault by lazy {
    as_1792189668()
  }


  public override val __1792189668_Ptr: JNAPointer? by lazy {
    __1792189668_Interface.__1792189668_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1792189668_Interface)

  private fun as_1792189668(): IAdaptiveMediaSourceAdvancedSettings.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceAdvancedSettings.ABI.makeIAdaptiveMediaSourceAdvancedSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceAdvancedSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceAdvancedSettings.ABI.makeIAdaptiveMediaSourceAdvancedSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceAdvancedSettings> {
    public override fun getValue() = AdaptiveMediaSourceAdvancedSettings(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceAdvancedSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceAdvancedSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AdaptiveMediaSourceAdvancedSettings {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceAdvancedSettings(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceAdvancedSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
