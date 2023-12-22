package Windows.Media.Capture

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

@ABIMarker(AppBroadcastProviderSettings.ABI::class)
@Signature("rc(Windows.Media.Capture.AppBroadcastProviderSettings;{c30bdf62-9948-458f-ad50-aa06ec03da08})")
@WinRTByReference(brClass = AppBroadcastProviderSettings.ByReference::class)
public class AppBroadcastProviderSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastProviderSettings.WithDefault, IWinRTObject {
  private val __1102757068_Interface: IAppBroadcastProviderSettings.WithDefault by lazy {
    as_1102757068()
  }


  public override val __1102757068_Ptr: JNAPointer? by lazy {
    __1102757068_Interface.__1102757068_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1102757068_Interface)

  private fun as_1102757068(): IAppBroadcastProviderSettings.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastProviderSettings.ABI.makeIAppBroadcastProviderSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastProviderSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastProviderSettings.ABI.makeIAppBroadcastProviderSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastProviderSettings> {
    public override fun getValue() = AppBroadcastProviderSettings(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastProviderSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastProviderSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastProviderSettings {
      val address = segment.toRawLongValue()
      return AppBroadcastProviderSettings(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastProviderSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
