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

@ABIMarker(AppResourceGroupBackgroundTaskReport.ABI::class)
@Signature("rc(Windows.System.AppResourceGroupBackgroundTaskReport;{2566e74e-b05d-40c2-9dc1-1a4f039ea120})")
@WinRTByReference(brClass = AppResourceGroupBackgroundTaskReport.ByReference::class)
public class AppResourceGroupBackgroundTaskReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppResourceGroupBackgroundTaskReport.WithDefault, IWinRTObject {
  private val __770774374_Interface: IAppResourceGroupBackgroundTaskReport.WithDefault by lazy {
    as_770774374()
  }


  public override val __770774374_Ptr: JNAPointer? by lazy {
    __770774374_Interface.__770774374_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__770774374_Interface)

  private fun as_770774374(): IAppResourceGroupBackgroundTaskReport.WithDefault {
    if(pointer == NULL) {
      return(IAppResourceGroupBackgroundTaskReport.ABI.makeIAppResourceGroupBackgroundTaskReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppResourceGroupBackgroundTaskReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppResourceGroupBackgroundTaskReport.ABI.makeIAppResourceGroupBackgroundTaskReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppResourceGroupBackgroundTaskReport> {
    public override fun getValue() = AppResourceGroupBackgroundTaskReport(pointer.getPointer(0))

    public fun setValue(value: AppResourceGroupBackgroundTaskReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppResourceGroupBackgroundTaskReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppResourceGroupBackgroundTaskReport {
      val address = segment.toRawLongValue()
      return AppResourceGroupBackgroundTaskReport(Pointer(address))
    }

    public override fun toNative(obj: AppResourceGroupBackgroundTaskReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
