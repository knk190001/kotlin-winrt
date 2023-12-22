package Microsoft.UI.Xaml

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

@ABIMarker(LaunchActivatedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.LaunchActivatedEventArgs;{d505cea9-1bcb-5b29-a8be-944e00f06f78})")
@WinRTByReference(brClass = LaunchActivatedEventArgs.ByReference::class)
public class LaunchActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILaunchActivatedEventArgs.WithDefault, IWinRTObject {
  private val __782645280_Interface: ILaunchActivatedEventArgs.WithDefault by lazy {
    as_782645280()
  }


  public override val __782645280_Ptr: JNAPointer? by lazy {
    __782645280_Interface.__782645280_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__782645280_Interface)

  private fun as_782645280(): ILaunchActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILaunchActivatedEventArgs.ABI.makeILaunchActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILaunchActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILaunchActivatedEventArgs.ABI.makeILaunchActivatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LaunchActivatedEventArgs> {
    public override fun getValue() = LaunchActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LaunchActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LaunchActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LaunchActivatedEventArgs {
      val address = segment.toRawLongValue()
      return LaunchActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LaunchActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
