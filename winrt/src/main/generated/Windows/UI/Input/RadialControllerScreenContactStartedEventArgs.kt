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

@ABIMarker(RadialControllerScreenContactStartedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerScreenContactStartedEventArgs;{206aa436-e651-11e5-bf62-2c27d7404e85})")
@WinRTByReference(brClass = RadialControllerScreenContactStartedEventArgs.ByReference::class)
public class RadialControllerScreenContactStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerScreenContactStartedEventArgs.WithDefault,
    IRadialControllerScreenContactStartedEventArgs2.WithDefault, IWinRTObject {
  private val __212092385_Interface: IRadialControllerScreenContactStartedEventArgs.WithDefault by
      lazy {
    as_212092385()
  }


  private val __2015070607_Interface: IRadialControllerScreenContactStartedEventArgs2.WithDefault by
      lazy {
    as_2015070607()
  }


  public override val __212092385_Ptr: JNAPointer? by lazy {
    __212092385_Interface.__212092385_Ptr
  }


  public override val __2015070607_Ptr: JNAPointer? by lazy {
    __2015070607_Interface.__2015070607_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__212092385_Interface, __2015070607_Interface)

  private fun as_212092385(): IRadialControllerScreenContactStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerScreenContactStartedEventArgs.ABI.makeIRadialControllerScreenContactStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerScreenContactStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerScreenContactStartedEventArgs.ABI.makeIRadialControllerScreenContactStartedEventArgs(ref.value))
  }

  private fun as_2015070607(): IRadialControllerScreenContactStartedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerScreenContactStartedEventArgs2.ABI.makeIRadialControllerScreenContactStartedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerScreenContactStartedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerScreenContactStartedEventArgs2.ABI.makeIRadialControllerScreenContactStartedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerScreenContactStartedEventArgs> {
    public override fun getValue() =
        RadialControllerScreenContactStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerScreenContactStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerScreenContactStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RadialControllerScreenContactStartedEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerScreenContactStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerScreenContactStartedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
