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

@ABIMarker(AppDiagnosticInfoWatcher.ABI::class)
@Signature("rc(Windows.System.AppDiagnosticInfoWatcher;{75575070-01d3-489a-9325-52f9cc6ede0a})")
@WinRTByReference(brClass = AppDiagnosticInfoWatcher.ByReference::class)
public class AppDiagnosticInfoWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppDiagnosticInfoWatcher.WithDefault, IWinRTObject {
  private val __856651307_Interface: IAppDiagnosticInfoWatcher.WithDefault by lazy {
    as_856651307()
  }


  public override val __856651307_Ptr: JNAPointer? by lazy {
    __856651307_Interface.__856651307_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__856651307_Interface)

  private fun as_856651307(): IAppDiagnosticInfoWatcher.WithDefault {
    if(pointer == NULL) {
      return(IAppDiagnosticInfoWatcher.ABI.makeIAppDiagnosticInfoWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppDiagnosticInfoWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppDiagnosticInfoWatcher.ABI.makeIAppDiagnosticInfoWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppDiagnosticInfoWatcher> {
    public override fun getValue() = AppDiagnosticInfoWatcher(pointer.getPointer(0))

    public fun setValue(value: AppDiagnosticInfoWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppDiagnosticInfoWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppDiagnosticInfoWatcher {
      val address = segment.toRawLongValue()
      return AppDiagnosticInfoWatcher(Pointer(address))
    }

    public override fun toNative(obj: AppDiagnosticInfoWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
