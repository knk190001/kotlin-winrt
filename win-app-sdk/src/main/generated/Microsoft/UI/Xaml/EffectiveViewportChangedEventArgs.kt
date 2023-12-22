package Microsoft.UI.Xaml

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

@ABIMarker(EffectiveViewportChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.EffectiveViewportChangedEventArgs;{636e8159-2d82-538a-8483-cd576e41d0df})")
@WinRTByReference(brClass = EffectiveViewportChangedEventArgs.ByReference::class)
public class EffectiveViewportChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEffectiveViewportChangedEventArgs.WithDefault, IWinRTObject {
  private val __1653917801_Interface: IEffectiveViewportChangedEventArgs.WithDefault by lazy {
    as_1653917801()
  }


  public override val __1653917801_Ptr: JNAPointer? by lazy {
    __1653917801_Interface.__1653917801_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1653917801_Interface)

  private fun as_1653917801(): IEffectiveViewportChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IEffectiveViewportChangedEventArgs.ABI.makeIEffectiveViewportChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEffectiveViewportChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEffectiveViewportChangedEventArgs.ABI.makeIEffectiveViewportChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EffectiveViewportChangedEventArgs> {
    public override fun getValue() = EffectiveViewportChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: EffectiveViewportChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EffectiveViewportChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): EffectiveViewportChangedEventArgs {
      val address = segment.toRawLongValue()
      return EffectiveViewportChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: EffectiveViewportChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
