package Windows.UI.ViewManagement

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

@ABIMarker(UISettingsAutoHideScrollBarsChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.UISettingsAutoHideScrollBarsChangedEventArgs;{87afd4b2-9146-5f02-8f6b-06d454174c0f})")
@WinRTByReference(brClass = UISettingsAutoHideScrollBarsChangedEventArgs.ByReference::class)
public class UISettingsAutoHideScrollBarsChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUISettingsAutoHideScrollBarsChangedEventArgs.WithDefault, IWinRTObject {
  private val __419021654_Interface: IUISettingsAutoHideScrollBarsChangedEventArgs.WithDefault by
      lazy {
    as_419021654()
  }


  public override val __419021654_Ptr: JNAPointer? by lazy {
    __419021654_Interface.__419021654_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__419021654_Interface)

  private fun as_419021654(): IUISettingsAutoHideScrollBarsChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUISettingsAutoHideScrollBarsChangedEventArgs.ABI.makeIUISettingsAutoHideScrollBarsChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettingsAutoHideScrollBarsChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettingsAutoHideScrollBarsChangedEventArgs.ABI.makeIUISettingsAutoHideScrollBarsChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UISettingsAutoHideScrollBarsChangedEventArgs> {
    public override fun getValue() =
        UISettingsAutoHideScrollBarsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UISettingsAutoHideScrollBarsChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UISettingsAutoHideScrollBarsChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UISettingsAutoHideScrollBarsChangedEventArgs {
      val address = segment.toRawLongValue()
      return UISettingsAutoHideScrollBarsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UISettingsAutoHideScrollBarsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
