package Microsoft.UI.Composition

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

@ABIMarker(CompositionNotificationDeferral.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionNotificationDeferral;{396698b7-437b-5acf-aec9-6342c437faf1})")
@WinRTByReference(brClass = CompositionNotificationDeferral.ByReference::class)
public class CompositionNotificationDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICompositionNotificationDeferral.WithDefault, IWinRTObject {
  private val __869667591_Interface: ICompositionNotificationDeferral.WithDefault by lazy {
    as_869667591()
  }


  public override val __869667591_Ptr: JNAPointer? by lazy {
    __869667591_Interface.__869667591_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__869667591_Interface)

  private fun as_869667591(): ICompositionNotificationDeferral.WithDefault {
    if(pointer == NULL) {
      return(ICompositionNotificationDeferral.ABI.makeICompositionNotificationDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionNotificationDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionNotificationDeferral.ABI.makeICompositionNotificationDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionNotificationDeferral> {
    public override fun getValue() = CompositionNotificationDeferral(pointer.getPointer(0))

    public fun setValue(value: CompositionNotificationDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionNotificationDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionNotificationDeferral {
      val address = segment.toRawLongValue()
      return CompositionNotificationDeferral(Pointer(address))
    }

    public override fun toNative(obj: CompositionNotificationDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
