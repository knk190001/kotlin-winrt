package Windows.UI.Text.Core

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

@ABIMarker(CoreTextCompositionCompletedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextCompositionCompletedEventArgs;{1f34ebb6-b79f-4121-a5e7-fda9b8616e30})")
@WinRTByReference(brClass = CoreTextCompositionCompletedEventArgs.ByReference::class)
public class CoreTextCompositionCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextCompositionCompletedEventArgs.WithDefault, IWinRTObject {
  private val __636625710_Interface: ICoreTextCompositionCompletedEventArgs.WithDefault by lazy {
    as_636625710()
  }


  public override val __636625710_Ptr: JNAPointer? by lazy {
    __636625710_Interface.__636625710_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__636625710_Interface)

  private fun as_636625710(): ICoreTextCompositionCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextCompositionCompletedEventArgs.ABI.makeICoreTextCompositionCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextCompositionCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextCompositionCompletedEventArgs.ABI.makeICoreTextCompositionCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextCompositionCompletedEventArgs> {
    public override fun getValue() = CoreTextCompositionCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreTextCompositionCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextCompositionCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextCompositionCompletedEventArgs {
      val address = segment.toRawLongValue()
      return CoreTextCompositionCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreTextCompositionCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
