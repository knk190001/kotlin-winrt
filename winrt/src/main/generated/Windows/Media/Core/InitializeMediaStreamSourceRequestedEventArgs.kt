package Windows.Media.Core

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

@ABIMarker(InitializeMediaStreamSourceRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Core.InitializeMediaStreamSourceRequestedEventArgs;{25bc45e1-9b08-4c2e-a855-4542f1a75deb})")
@WinRTByReference(brClass = InitializeMediaStreamSourceRequestedEventArgs.ByReference::class)
public class InitializeMediaStreamSourceRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInitializeMediaStreamSourceRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1090399363_Interface: IInitializeMediaStreamSourceRequestedEventArgs.WithDefault by
      lazy {
    as_1090399363()
  }


  public override val __1090399363_Ptr: JNAPointer? by lazy {
    __1090399363_Interface.__1090399363_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1090399363_Interface)

  private fun as_1090399363(): IInitializeMediaStreamSourceRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IInitializeMediaStreamSourceRequestedEventArgs.ABI.makeIInitializeMediaStreamSourceRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInitializeMediaStreamSourceRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInitializeMediaStreamSourceRequestedEventArgs.ABI.makeIInitializeMediaStreamSourceRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InitializeMediaStreamSourceRequestedEventArgs> {
    public override fun getValue() =
        InitializeMediaStreamSourceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: InitializeMediaStreamSourceRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InitializeMediaStreamSourceRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        InitializeMediaStreamSourceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return InitializeMediaStreamSourceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: InitializeMediaStreamSourceRequestedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
