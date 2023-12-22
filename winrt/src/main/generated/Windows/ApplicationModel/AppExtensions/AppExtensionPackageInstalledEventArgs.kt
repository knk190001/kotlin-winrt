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

@ABIMarker(AppExtensionPackageInstalledEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppExtensions.AppExtensionPackageInstalledEventArgs;{39e59234-3351-4a8d-9745-e7d3dd45bc48})")
@WinRTByReference(brClass = AppExtensionPackageInstalledEventArgs.ByReference::class)
public class AppExtensionPackageInstalledEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppExtensionPackageInstalledEventArgs.WithDefault, IWinRTObject {
  private val __1111298265_Interface: IAppExtensionPackageInstalledEventArgs.WithDefault by lazy {
    as_1111298265()
  }


  public override val __1111298265_Ptr: JNAPointer? by lazy {
    __1111298265_Interface.__1111298265_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1111298265_Interface)

  private fun as_1111298265(): IAppExtensionPackageInstalledEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppExtensionPackageInstalledEventArgs.ABI.makeIAppExtensionPackageInstalledEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppExtensionPackageInstalledEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppExtensionPackageInstalledEventArgs.ABI.makeIAppExtensionPackageInstalledEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppExtensionPackageInstalledEventArgs> {
    public override fun getValue() = AppExtensionPackageInstalledEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppExtensionPackageInstalledEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppExtensionPackageInstalledEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppExtensionPackageInstalledEventArgs {
      val address = segment.toRawLongValue()
      return AppExtensionPackageInstalledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppExtensionPackageInstalledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
