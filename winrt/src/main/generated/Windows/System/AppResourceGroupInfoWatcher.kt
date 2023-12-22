package Windows.System

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

@ABIMarker(AppResourceGroupInfoWatcher.ABI::class)
@Signature("rc(Windows.System.AppResourceGroupInfoWatcher;{d9b0a0fd-6e5a-4c72-8b17-09fec4a212bd})")
@WinRTByReference(brClass = AppResourceGroupInfoWatcher.ByReference::class)
public class AppResourceGroupInfoWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppResourceGroupInfoWatcher.WithDefault, IWinRTObject {
  private val __421882831_Interface: IAppResourceGroupInfoWatcher.WithDefault by lazy {
    as_421882831()
  }


  public override val __421882831_Ptr: JNAPointer? by lazy {
    __421882831_Interface.__421882831_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__421882831_Interface)

  private fun as_421882831(): IAppResourceGroupInfoWatcher.WithDefault {
    if(pointer == NULL) {
      return(IAppResourceGroupInfoWatcher.ABI.makeIAppResourceGroupInfoWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppResourceGroupInfoWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppResourceGroupInfoWatcher.ABI.makeIAppResourceGroupInfoWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppResourceGroupInfoWatcher> {
    public override fun getValue() = AppResourceGroupInfoWatcher(pointer.getPointer(0))

    public fun setValue(value: AppResourceGroupInfoWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppResourceGroupInfoWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppResourceGroupInfoWatcher {
      val address = segment.toRawLongValue()
      return AppResourceGroupInfoWatcher(Pointer(address))
    }

    public override fun toNative(obj: AppResourceGroupInfoWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
