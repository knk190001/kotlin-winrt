package Windows.UI.ApplicationSettings

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

@ABIMarker(SettingsPaneCommandsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs;{205f5d24-1b48-4629-a6ca-2fdfedafb75d})")
@WinRTByReference(brClass = SettingsPaneCommandsRequestedEventArgs.ByReference::class)
public class SettingsPaneCommandsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISettingsPaneCommandsRequestedEventArgs.WithDefault, IWinRTObject {
  private val __152522719_Interface: ISettingsPaneCommandsRequestedEventArgs.WithDefault by lazy {
    as_152522719()
  }


  public override val __152522719_Ptr: JNAPointer? by lazy {
    __152522719_Interface.__152522719_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__152522719_Interface)

  private fun as_152522719(): ISettingsPaneCommandsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISettingsPaneCommandsRequestedEventArgs.ABI.makeISettingsPaneCommandsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISettingsPaneCommandsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISettingsPaneCommandsRequestedEventArgs.ABI.makeISettingsPaneCommandsRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SettingsPaneCommandsRequestedEventArgs> {
    public override fun getValue() = SettingsPaneCommandsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SettingsPaneCommandsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SettingsPaneCommandsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SettingsPaneCommandsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return SettingsPaneCommandsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SettingsPaneCommandsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
