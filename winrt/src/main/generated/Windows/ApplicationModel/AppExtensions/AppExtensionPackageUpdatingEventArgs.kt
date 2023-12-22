package Windows.ApplicationModel.AppExtensions

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

@ABIMarker(AppExtensionPackageUpdatingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppExtensions.AppExtensionPackageUpdatingEventArgs;{7ed59329-1a65-4800-a700-b321009e306a})")
@WinRTByReference(brClass = AppExtensionPackageUpdatingEventArgs.ByReference::class)
public class AppExtensionPackageUpdatingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppExtensionPackageUpdatingEventArgs.WithDefault, IWinRTObject {
  private val __1618221511_Interface: IAppExtensionPackageUpdatingEventArgs.WithDefault by lazy {
    as_1618221511()
  }


  public override val __1618221511_Ptr: JNAPointer? by lazy {
    __1618221511_Interface.__1618221511_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1618221511_Interface)

  private fun as_1618221511(): IAppExtensionPackageUpdatingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppExtensionPackageUpdatingEventArgs.ABI.makeIAppExtensionPackageUpdatingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppExtensionPackageUpdatingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppExtensionPackageUpdatingEventArgs.ABI.makeIAppExtensionPackageUpdatingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppExtensionPackageUpdatingEventArgs> {
    public override fun getValue() = AppExtensionPackageUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppExtensionPackageUpdatingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppExtensionPackageUpdatingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppExtensionPackageUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return AppExtensionPackageUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppExtensionPackageUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
