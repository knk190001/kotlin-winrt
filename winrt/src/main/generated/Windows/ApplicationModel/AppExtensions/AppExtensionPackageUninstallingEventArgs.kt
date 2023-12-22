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

@ABIMarker(AppExtensionPackageUninstallingEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppExtensions.AppExtensionPackageUninstallingEventArgs;{60f160c5-171e-40ff-ae98-ab2c20dd4d75})")
@WinRTByReference(brClass = AppExtensionPackageUninstallingEventArgs.ByReference::class)
public class AppExtensionPackageUninstallingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppExtensionPackageUninstallingEventArgs.WithDefault, IWinRTObject {
  private val __23905165_Interface: IAppExtensionPackageUninstallingEventArgs.WithDefault by lazy {
    as_23905165()
  }


  public override val __23905165_Ptr: JNAPointer? by lazy {
    __23905165_Interface.__23905165_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__23905165_Interface)

  private fun as_23905165(): IAppExtensionPackageUninstallingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppExtensionPackageUninstallingEventArgs.ABI.makeIAppExtensionPackageUninstallingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppExtensionPackageUninstallingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppExtensionPackageUninstallingEventArgs.ABI.makeIAppExtensionPackageUninstallingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppExtensionPackageUninstallingEventArgs> {
    public override fun getValue() = AppExtensionPackageUninstallingEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppExtensionPackageUninstallingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppExtensionPackageUninstallingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppExtensionPackageUninstallingEventArgs {
      val address = segment.toRawLongValue()
      return AppExtensionPackageUninstallingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppExtensionPackageUninstallingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
