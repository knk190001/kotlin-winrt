package Windows.UI.Input

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

@ABIMarker(RadialControllerControlAcquiredEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerControlAcquiredEventArgs;{206aa439-e651-11e5-bf62-2c27d7404e85})")
@WinRTByReference(brClass = RadialControllerControlAcquiredEventArgs.ByReference::class)
public class RadialControllerControlAcquiredEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerControlAcquiredEventArgs.WithDefault,
    IRadialControllerControlAcquiredEventArgs2.WithDefault, IWinRTObject {
  private val __372387563_Interface: IRadialControllerControlAcquiredEventArgs.WithDefault by lazy {
    as_372387563()
  }


  private val __1340887485_Interface: IRadialControllerControlAcquiredEventArgs2.WithDefault by
      lazy {
    as_1340887485()
  }


  public override val __372387563_Ptr: JNAPointer? by lazy {
    __372387563_Interface.__372387563_Ptr
  }


  public override val __1340887485_Ptr: JNAPointer? by lazy {
    __1340887485_Interface.__1340887485_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__372387563_Interface, __1340887485_Interface)

  private fun as_372387563(): IRadialControllerControlAcquiredEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerControlAcquiredEventArgs.ABI.makeIRadialControllerControlAcquiredEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerControlAcquiredEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerControlAcquiredEventArgs.ABI.makeIRadialControllerControlAcquiredEventArgs(ref.value))
  }

  private fun as_1340887485(): IRadialControllerControlAcquiredEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerControlAcquiredEventArgs2.ABI.makeIRadialControllerControlAcquiredEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerControlAcquiredEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerControlAcquiredEventArgs2.ABI.makeIRadialControllerControlAcquiredEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerControlAcquiredEventArgs> {
    public override fun getValue() = RadialControllerControlAcquiredEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerControlAcquiredEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerControlAcquiredEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RadialControllerControlAcquiredEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerControlAcquiredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerControlAcquiredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
