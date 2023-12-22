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

@ABIMarker(LauncherUIOptions.ABI::class)
@Signature("rc(Windows.System.LauncherUIOptions;{1b25da6e-8aa6-41e9-8251-4165f5985f49})")
@WinRTByReference(brClass = LauncherUIOptions.ByReference::class)
public class LauncherUIOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILauncherUIOptions.WithDefault, IWinRTObject {
  private val __955518523_Interface: ILauncherUIOptions.WithDefault by lazy {
    as_955518523()
  }


  public override val __955518523_Ptr: JNAPointer? by lazy {
    __955518523_Interface.__955518523_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__955518523_Interface)

  private fun as_955518523(): ILauncherUIOptions.WithDefault {
    if(pointer == NULL) {
      return(ILauncherUIOptions.ABI.makeILauncherUIOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILauncherUIOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILauncherUIOptions.ABI.makeILauncherUIOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LauncherUIOptions> {
    public override fun getValue() = LauncherUIOptions(pointer.getPointer(0))

    public fun setValue(value: LauncherUIOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LauncherUIOptions, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LauncherUIOptions {
      val address = segment.toRawLongValue()
      return LauncherUIOptions(Pointer(address))
    }

    public override fun toNative(obj: LauncherUIOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
