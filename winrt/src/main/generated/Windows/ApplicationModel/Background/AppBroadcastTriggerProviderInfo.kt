package Windows.ApplicationModel.Background

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

@ABIMarker(AppBroadcastTriggerProviderInfo.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.AppBroadcastTriggerProviderInfo;{f219352d-9de8-4420-9ce2-5eff8f17376b})")
@WinRTByReference(brClass = AppBroadcastTriggerProviderInfo.ByReference::class)
public class AppBroadcastTriggerProviderInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppBroadcastTriggerProviderInfo.WithDefault, IWinRTObject {
  private val __1353609146_Interface: IAppBroadcastTriggerProviderInfo.WithDefault by lazy {
    as_1353609146()
  }


  public override val __1353609146_Ptr: JNAPointer? by lazy {
    __1353609146_Interface.__1353609146_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1353609146_Interface)

  private fun as_1353609146(): IAppBroadcastTriggerProviderInfo.WithDefault {
    if(pointer == NULL) {
      return(IAppBroadcastTriggerProviderInfo.ABI.makeIAppBroadcastTriggerProviderInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppBroadcastTriggerProviderInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppBroadcastTriggerProviderInfo.ABI.makeIAppBroadcastTriggerProviderInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastTriggerProviderInfo> {
    public override fun getValue() = AppBroadcastTriggerProviderInfo(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastTriggerProviderInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastTriggerProviderInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppBroadcastTriggerProviderInfo {
      val address = segment.toRawLongValue()
      return AppBroadcastTriggerProviderInfo(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastTriggerProviderInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
