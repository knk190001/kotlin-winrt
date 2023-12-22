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

@ABIMarker(UISettingsAnimationsEnabledChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.UISettingsAnimationsEnabledChangedEventArgs;{0c7b4b3d-2ea1-533e-894d-415bc5243c29})")
@WinRTByReference(brClass = UISettingsAnimationsEnabledChangedEventArgs.ByReference::class)
public class UISettingsAnimationsEnabledChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUISettingsAnimationsEnabledChangedEventArgs.WithDefault, IWinRTObject {
  private val __1190500500_Interface: IUISettingsAnimationsEnabledChangedEventArgs.WithDefault by
      lazy {
    as_1190500500()
  }


  public override val __1190500500_Ptr: JNAPointer? by lazy {
    __1190500500_Interface.__1190500500_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1190500500_Interface)

  private fun as_1190500500(): IUISettingsAnimationsEnabledChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUISettingsAnimationsEnabledChangedEventArgs.ABI.makeIUISettingsAnimationsEnabledChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettingsAnimationsEnabledChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettingsAnimationsEnabledChangedEventArgs.ABI.makeIUISettingsAnimationsEnabledChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UISettingsAnimationsEnabledChangedEventArgs> {
    public override fun getValue() =
        UISettingsAnimationsEnabledChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UISettingsAnimationsEnabledChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UISettingsAnimationsEnabledChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UISettingsAnimationsEnabledChangedEventArgs {
      val address = segment.toRawLongValue()
      return UISettingsAnimationsEnabledChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UISettingsAnimationsEnabledChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
