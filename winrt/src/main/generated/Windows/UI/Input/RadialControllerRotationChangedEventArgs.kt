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

@ABIMarker(RadialControllerRotationChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerRotationChangedEventArgs;{206aa435-e651-11e5-bf62-2c27d7404e85})")
@WinRTByReference(brClass = RadialControllerRotationChangedEventArgs.ByReference::class)
public class RadialControllerRotationChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerRotationChangedEventArgs.WithDefault,
    IRadialControllerRotationChangedEventArgs2.WithDefault, IWinRTObject {
  private val __1305791766_Interface: IRadialControllerRotationChangedEventArgs.WithDefault by
      lazy {
    as_1305791766()
  }


  private val __1824839032_Interface: IRadialControllerRotationChangedEventArgs2.WithDefault by
      lazy {
    as_1824839032()
  }


  public override val __1305791766_Ptr: JNAPointer? by lazy {
    __1305791766_Interface.__1305791766_Ptr
  }


  public override val __1824839032_Ptr: JNAPointer? by lazy {
    __1824839032_Interface.__1824839032_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1305791766_Interface, __1824839032_Interface)

  private fun as_1305791766(): IRadialControllerRotationChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerRotationChangedEventArgs.ABI.makeIRadialControllerRotationChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerRotationChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerRotationChangedEventArgs.ABI.makeIRadialControllerRotationChangedEventArgs(ref.value))
  }

  private fun as_1824839032(): IRadialControllerRotationChangedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerRotationChangedEventArgs2.ABI.makeIRadialControllerRotationChangedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerRotationChangedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerRotationChangedEventArgs2.ABI.makeIRadialControllerRotationChangedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerRotationChangedEventArgs> {
    public override fun getValue() = RadialControllerRotationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerRotationChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerRotationChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RadialControllerRotationChangedEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerRotationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerRotationChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
