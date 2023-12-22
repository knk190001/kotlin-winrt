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

@ABIMarker(AppResourceGroupInfoWatcherEventArgs.ABI::class)
@Signature("rc(Windows.System.AppResourceGroupInfoWatcherEventArgs;{7a787637-6302-4d2f-bf89-1c12d0b2a6b9})")
@WinRTByReference(brClass = AppResourceGroupInfoWatcherEventArgs.ByReference::class)
public class AppResourceGroupInfoWatcherEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppResourceGroupInfoWatcherEventArgs.WithDefault, IWinRTObject {
  private val __326002568_Interface: IAppResourceGroupInfoWatcherEventArgs.WithDefault by lazy {
    as_326002568()
  }


  public override val __326002568_Ptr: JNAPointer? by lazy {
    __326002568_Interface.__326002568_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__326002568_Interface)

  private fun as_326002568(): IAppResourceGroupInfoWatcherEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppResourceGroupInfoWatcherEventArgs.ABI.makeIAppResourceGroupInfoWatcherEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppResourceGroupInfoWatcherEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppResourceGroupInfoWatcherEventArgs.ABI.makeIAppResourceGroupInfoWatcherEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppResourceGroupInfoWatcherEventArgs> {
    public override fun getValue() = AppResourceGroupInfoWatcherEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppResourceGroupInfoWatcherEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppResourceGroupInfoWatcherEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppResourceGroupInfoWatcherEventArgs {
      val address = segment.toRawLongValue()
      return AppResourceGroupInfoWatcherEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppResourceGroupInfoWatcherEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
