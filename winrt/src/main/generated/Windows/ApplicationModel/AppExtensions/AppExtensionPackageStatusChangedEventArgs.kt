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

@ABIMarker(AppExtensionPackageStatusChangedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppExtensions.AppExtensionPackageStatusChangedEventArgs;{1ce17433-1153-44fd-87b1-8ae1050303df})")
@WinRTByReference(brClass = AppExtensionPackageStatusChangedEventArgs.ByReference::class)
public class AppExtensionPackageStatusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppExtensionPackageStatusChangedEventArgs.WithDefault, IWinRTObject {
  private val __740241471_Interface: IAppExtensionPackageStatusChangedEventArgs.WithDefault by
      lazy {
    as_740241471()
  }


  public override val __740241471_Ptr: JNAPointer? by lazy {
    __740241471_Interface.__740241471_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__740241471_Interface)

  private fun as_740241471(): IAppExtensionPackageStatusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppExtensionPackageStatusChangedEventArgs.ABI.makeIAppExtensionPackageStatusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppExtensionPackageStatusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppExtensionPackageStatusChangedEventArgs.ABI.makeIAppExtensionPackageStatusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppExtensionPackageStatusChangedEventArgs> {
    public override fun getValue() =
        AppExtensionPackageStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppExtensionPackageStatusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppExtensionPackageStatusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AppExtensionPackageStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return AppExtensionPackageStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppExtensionPackageStatusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
