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

@ABIMarker(AppExtensionPackageUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.AppExtensions.AppExtensionPackageUpdatedEventArgs;{3a83c43f-797e-44b5-ba24-a4c8b5a543d7})")
@WinRTByReference(brClass = AppExtensionPackageUpdatedEventArgs.ByReference::class)
public class AppExtensionPackageUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppExtensionPackageUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __1436209542_Interface: IAppExtensionPackageUpdatedEventArgs.WithDefault by lazy {
    as_1436209542()
  }


  public override val __1436209542_Ptr: JNAPointer? by lazy {
    __1436209542_Interface.__1436209542_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1436209542_Interface)

  private fun as_1436209542(): IAppExtensionPackageUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppExtensionPackageUpdatedEventArgs.ABI.makeIAppExtensionPackageUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppExtensionPackageUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppExtensionPackageUpdatedEventArgs.ABI.makeIAppExtensionPackageUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppExtensionPackageUpdatedEventArgs> {
    public override fun getValue() = AppExtensionPackageUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppExtensionPackageUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppExtensionPackageUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppExtensionPackageUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return AppExtensionPackageUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppExtensionPackageUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
