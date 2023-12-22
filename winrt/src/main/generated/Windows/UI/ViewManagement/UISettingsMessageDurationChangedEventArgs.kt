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

@ABIMarker(UISettingsMessageDurationChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.UISettingsMessageDurationChangedEventArgs;{338aad52-4a5d-5b59-8002-d930f608fd6e})")
@WinRTByReference(brClass = UISettingsMessageDurationChangedEventArgs.ByReference::class)
public class UISettingsMessageDurationChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUISettingsMessageDurationChangedEventArgs.WithDefault, IWinRTObject {
  private val __1939910421_Interface: IUISettingsMessageDurationChangedEventArgs.WithDefault by
      lazy {
    as_1939910421()
  }


  public override val __1939910421_Ptr: JNAPointer? by lazy {
    __1939910421_Interface.__1939910421_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1939910421_Interface)

  private fun as_1939910421(): IUISettingsMessageDurationChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUISettingsMessageDurationChangedEventArgs.ABI.makeIUISettingsMessageDurationChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUISettingsMessageDurationChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUISettingsMessageDurationChangedEventArgs.ABI.makeIUISettingsMessageDurationChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UISettingsMessageDurationChangedEventArgs> {
    public override fun getValue() =
        UISettingsMessageDurationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: UISettingsMessageDurationChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UISettingsMessageDurationChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        UISettingsMessageDurationChangedEventArgs {
      val address = segment.toRawLongValue()
      return UISettingsMessageDurationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UISettingsMessageDurationChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
