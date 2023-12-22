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

@ABIMarker(AppDiagnosticInfoWatcherEventArgs.ABI::class)
@Signature("rc(Windows.System.AppDiagnosticInfoWatcherEventArgs;{7017c716-e1da-4c65-99df-046dff5be71a})")
@WinRTByReference(brClass = AppDiagnosticInfoWatcherEventArgs.ByReference::class)
public class AppDiagnosticInfoWatcherEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppDiagnosticInfoWatcherEventArgs.WithDefault, IWinRTObject {
  private val __922898366_Interface: IAppDiagnosticInfoWatcherEventArgs.WithDefault by lazy {
    as_922898366()
  }


  public override val __922898366_Ptr: JNAPointer? by lazy {
    __922898366_Interface.__922898366_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__922898366_Interface)

  private fun as_922898366(): IAppDiagnosticInfoWatcherEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAppDiagnosticInfoWatcherEventArgs.ABI.makeIAppDiagnosticInfoWatcherEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppDiagnosticInfoWatcherEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppDiagnosticInfoWatcherEventArgs.ABI.makeIAppDiagnosticInfoWatcherEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppDiagnosticInfoWatcherEventArgs> {
    public override fun getValue() = AppDiagnosticInfoWatcherEventArgs(pointer.getPointer(0))

    public fun setValue(value: AppDiagnosticInfoWatcherEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppDiagnosticInfoWatcherEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): AppDiagnosticInfoWatcherEventArgs {
      val address = segment.toRawLongValue()
      return AppDiagnosticInfoWatcherEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AppDiagnosticInfoWatcherEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
