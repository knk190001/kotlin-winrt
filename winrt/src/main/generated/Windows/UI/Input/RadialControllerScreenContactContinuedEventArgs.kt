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

@ABIMarker(RadialControllerScreenContactContinuedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerScreenContactContinuedEventArgs;{206aa437-e651-11e5-bf62-2c27d7404e85})")
@WinRTByReference(brClass = RadialControllerScreenContactContinuedEventArgs.ByReference::class)
public class RadialControllerScreenContactContinuedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerScreenContactContinuedEventArgs.WithDefault,
    IRadialControllerScreenContactContinuedEventArgs2.WithDefault, IWinRTObject {
  private val __1249441413_Interface: IRadialControllerScreenContactContinuedEventArgs.WithDefault
      by lazy {
    as_1249441413()
  }


  private val __77978189_Interface: IRadialControllerScreenContactContinuedEventArgs2.WithDefault by
      lazy {
    as_77978189()
  }


  public override val __1249441413_Ptr: JNAPointer? by lazy {
    __1249441413_Interface.__1249441413_Ptr
  }


  public override val __77978189_Ptr: JNAPointer? by lazy {
    __77978189_Interface.__77978189_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1249441413_Interface, __77978189_Interface)

  private fun as_1249441413(): IRadialControllerScreenContactContinuedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerScreenContactContinuedEventArgs.ABI.makeIRadialControllerScreenContactContinuedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerScreenContactContinuedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerScreenContactContinuedEventArgs.ABI.makeIRadialControllerScreenContactContinuedEventArgs(ref.value))
  }

  private fun as_77978189(): IRadialControllerScreenContactContinuedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerScreenContactContinuedEventArgs2.ABI.makeIRadialControllerScreenContactContinuedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerScreenContactContinuedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerScreenContactContinuedEventArgs2.ABI.makeIRadialControllerScreenContactContinuedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerScreenContactContinuedEventArgs> {
    public override fun getValue() =
        RadialControllerScreenContactContinuedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerScreenContactContinuedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerScreenContactContinuedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RadialControllerScreenContactContinuedEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerScreenContactContinuedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerScreenContactContinuedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
