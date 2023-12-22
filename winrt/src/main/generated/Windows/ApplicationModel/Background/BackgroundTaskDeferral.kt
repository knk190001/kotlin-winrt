package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundTaskDeferral.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.BackgroundTaskDeferral;{93cc156d-af27-4dd3-846e-24ee40cadd25})")
@WinRTByReference(brClass = BackgroundTaskDeferral.ByReference::class)
public class BackgroundTaskDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundTaskDeferral.WithDefault, IWinRTObject {
  private val __1838027889_Interface: IBackgroundTaskDeferral.WithDefault by lazy {
    as_1838027889()
  }


  public override val __1838027889_Ptr: JNAPointer? by lazy {
    __1838027889_Interface.__1838027889_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1838027889_Interface)

  private fun as_1838027889(): IBackgroundTaskDeferral.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTaskDeferral.ABI.makeIBackgroundTaskDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTaskDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTaskDeferral.ABI.makeIBackgroundTaskDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTaskDeferral> {
    public override fun getValue() = BackgroundTaskDeferral(pointer.getPointer(0))

    public fun setValue(value: BackgroundTaskDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundTaskDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BackgroundTaskDeferral {
      val address = segment.toRawLongValue()
      return BackgroundTaskDeferral(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTaskDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
