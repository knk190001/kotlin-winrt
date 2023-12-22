package Windows.UI.ViewManagement

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

@ABIMarker(ApplicationViewConsolidatedEventArgs.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.ApplicationViewConsolidatedEventArgs;{514449ec-7ea2-4de7-a6a6-7dfbaaebb6fb})")
@WinRTByReference(brClass = ApplicationViewConsolidatedEventArgs.ByReference::class)
public class ApplicationViewConsolidatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationViewConsolidatedEventArgs.WithDefault,
    IApplicationViewConsolidatedEventArgs2.WithDefault, IWinRTObject {
  private val __205798567_Interface: IApplicationViewConsolidatedEventArgs.WithDefault by lazy {
    as_205798567()
  }


  private val __2084788231_Interface: IApplicationViewConsolidatedEventArgs2.WithDefault by lazy {
    as_2084788231()
  }


  public override val __205798567_Ptr: JNAPointer? by lazy {
    __205798567_Interface.__205798567_Ptr
  }


  public override val __2084788231_Ptr: JNAPointer? by lazy {
    __2084788231_Interface.__2084788231_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__205798567_Interface, __2084788231_Interface)

  private fun as_205798567(): IApplicationViewConsolidatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewConsolidatedEventArgs.ABI.makeIApplicationViewConsolidatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewConsolidatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewConsolidatedEventArgs.ABI.makeIApplicationViewConsolidatedEventArgs(ref.value))
  }

  private fun as_2084788231(): IApplicationViewConsolidatedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewConsolidatedEventArgs2.ABI.makeIApplicationViewConsolidatedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewConsolidatedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewConsolidatedEventArgs2.ABI.makeIApplicationViewConsolidatedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationViewConsolidatedEventArgs> {
    public override fun getValue() = ApplicationViewConsolidatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ApplicationViewConsolidatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationViewConsolidatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ApplicationViewConsolidatedEventArgs {
      val address = segment.toRawLongValue()
      return ApplicationViewConsolidatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ApplicationViewConsolidatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
