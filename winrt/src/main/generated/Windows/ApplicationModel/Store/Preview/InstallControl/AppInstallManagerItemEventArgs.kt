package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(AppInstallManagerItemEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallManagerItemEventArgs;{bc505743-4674-4dd1-957e-c25682086a14})")
@WinRTByReference(brClass = AppInstallManagerItemEventArgs.ByReference::class)
public class AppInstallManagerItemEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppInstallManagerItemEventArgs.WithDefault, IWinRTObject {
  private val __1048579163_Interface: IAppInstallManagerItemEventArgs.WithDefault by lazy {
    as_1048579163()
  }


  public override val __1048579163_Ptr: JNAPointer? by lazy {
    __1048579163_Interface.__1048579163_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1048579163_Interface)

  private fun as_1048579163(): IAppInstallManagerItemEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppInstallManagerItemEventArgs.ABI.makeIAppInstallManagerItemEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppInstallManagerItemEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppInstallManagerItemEventArgs.ABI.makeIAppInstallManagerItemEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppInstallManagerItemEventArgs> {
    public override fun getValue() = AppInstallManagerItemEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppInstallManagerItemEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppInstallManagerItemEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppInstallManagerItemEventArgs {
      val address = segment.toRawLongValue()
      return AppInstallManagerItemEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppInstallManagerItemEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
