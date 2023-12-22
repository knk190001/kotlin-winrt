package Windows.Media.Streaming.Adaptive

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

@ABIMarker(AdaptiveMediaSourceDiagnosticAvailableEventArgs.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSourceDiagnosticAvailableEventArgs;{3af64f06-6d9c-494a-b7a9-b3a5dee6ad68})")
@WinRTByReference(brClass = AdaptiveMediaSourceDiagnosticAvailableEventArgs.ByReference::class)
public class AdaptiveMediaSourceDiagnosticAvailableEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSourceDiagnosticAvailableEventArgs.WithDefault,
    IAdaptiveMediaSourceDiagnosticAvailableEventArgs2.WithDefault,
    IAdaptiveMediaSourceDiagnosticAvailableEventArgs3.WithDefault, IWinRTObject {
  private val __1648895988_Interface: IAdaptiveMediaSourceDiagnosticAvailableEventArgs.WithDefault
      by lazy {
    as_1648895988()
  }


  private val __423831974_Interface: IAdaptiveMediaSourceDiagnosticAvailableEventArgs2.WithDefault
      by lazy {
    as_423831974()
  }


  private val __423831975_Interface: IAdaptiveMediaSourceDiagnosticAvailableEventArgs3.WithDefault
      by lazy {
    as_423831975()
  }


  public override val __1648895988_Ptr: JNAPointer? by lazy {
    __1648895988_Interface.__1648895988_Ptr
  }


  public override val __423831974_Ptr: JNAPointer? by lazy {
    __423831974_Interface.__423831974_Ptr
  }


  public override val __423831975_Ptr: JNAPointer? by lazy {
    __423831975_Interface.__423831975_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1648895988_Interface, __423831974_Interface, __423831975_Interface)

  private fun as_1648895988(): IAdaptiveMediaSourceDiagnosticAvailableEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDiagnosticAvailableEventArgs.ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDiagnosticAvailableEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDiagnosticAvailableEventArgs.ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs(ref.value))
  }

  private fun as_423831974(): IAdaptiveMediaSourceDiagnosticAvailableEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDiagnosticAvailableEventArgs2.ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDiagnosticAvailableEventArgs2.ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs2(ref.value))
  }

  private fun as_423831975(): IAdaptiveMediaSourceDiagnosticAvailableEventArgs3.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSourceDiagnosticAvailableEventArgs3.ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSourceDiagnosticAvailableEventArgs3.ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSourceDiagnosticAvailableEventArgs> {
    public override fun getValue() =
        AdaptiveMediaSourceDiagnosticAvailableEventArgs(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSourceDiagnosticAvailableEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSourceDiagnosticAvailableEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        AdaptiveMediaSourceDiagnosticAvailableEventArgs {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSourceDiagnosticAvailableEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSourceDiagnosticAvailableEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
