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

@ABIMarker(CoreTextTextRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextTextRequestedEventArgs;{f096a2d0-41c6-4c02-8b1a-d953b00cabb3})")
@WinRTByReference(brClass = CoreTextTextRequestedEventArgs.ByReference::class)
public class CoreTextTextRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextTextRequestedEventArgs.WithDefault, IWinRTObject {
  private val __743091546_Interface: ICoreTextTextRequestedEventArgs.WithDefault by lazy {
    as_743091546()
  }


  public override val __743091546_Ptr: JNAPointer? by lazy {
    __743091546_Interface.__743091546_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__743091546_Interface)

  private fun as_743091546(): ICoreTextTextRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextTextRequestedEventArgs.ABI.makeICoreTextTextRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextTextRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextTextRequestedEventArgs.ABI.makeICoreTextTextRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextTextRequestedEventArgs> {
    public override fun getValue() = CoreTextTextRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreTextTextRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextTextRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextTextRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreTextTextRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreTextTextRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
