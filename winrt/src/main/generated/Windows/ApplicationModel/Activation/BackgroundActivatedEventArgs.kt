package Windows.ApplicationModel.Activation

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

@ABIMarker(BackgroundActivatedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.BackgroundActivatedEventArgs;{ab14bee0-e760-440e-a91c-44796de3a92d})")
@WinRTByReference(brClass = BackgroundActivatedEventArgs.ByReference::class)
public class BackgroundActivatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBackgroundActivatedEventArgs.WithDefault, IWinRTObject {
  private val __350072093_Interface: IBackgroundActivatedEventArgs.WithDefault by lazy {
    as_350072093()
  }


  public override val __350072093_Ptr: JNAPointer? by lazy {
    __350072093_Interface.__350072093_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__350072093_Interface)

  private fun as_350072093(): IBackgroundActivatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundActivatedEventArgs.ABI.makeIBackgroundActivatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundActivatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundActivatedEventArgs.ABI.makeIBackgroundActivatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundActivatedEventArgs> {
    public override fun getValue() = BackgroundActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: BackgroundActivatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BackgroundActivatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BackgroundActivatedEventArgs {
      val address = segment.toRawLongValue()
      return BackgroundActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: BackgroundActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
