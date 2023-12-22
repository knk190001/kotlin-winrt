package Windows.ApplicationModel.Preview.Notes

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

@ABIMarker(NotePlacementChangedPreviewEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Preview.Notes.NotePlacementChangedPreviewEventArgs;{491d57b7-f780-4e7f-a939-9a4caf965214})")
@WinRTByReference(brClass = NotePlacementChangedPreviewEventArgs.ByReference::class)
public class NotePlacementChangedPreviewEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INotePlacementChangedPreviewEventArgs.WithDefault, IWinRTObject {
  private val __2129164296_Interface: INotePlacementChangedPreviewEventArgs.WithDefault by lazy {
    as_2129164296()
  }


  public override val __2129164296_Ptr: JNAPointer? by lazy {
    __2129164296_Interface.__2129164296_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2129164296_Interface)

  private fun as_2129164296(): INotePlacementChangedPreviewEventArgs.WithDefault {
    if(pointer == NULL) {
      return(INotePlacementChangedPreviewEventArgs.ABI.makeINotePlacementChangedPreviewEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INotePlacementChangedPreviewEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INotePlacementChangedPreviewEventArgs.ABI.makeINotePlacementChangedPreviewEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NotePlacementChangedPreviewEventArgs> {
    public override fun getValue() = NotePlacementChangedPreviewEventArgs(pointer.getPointer(0))

    public fun setValue(value: NotePlacementChangedPreviewEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NotePlacementChangedPreviewEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): NotePlacementChangedPreviewEventArgs {
      val address = segment.toRawLongValue()
      return NotePlacementChangedPreviewEventArgs(Pointer(address))
    }

    public override fun toNative(obj: NotePlacementChangedPreviewEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
