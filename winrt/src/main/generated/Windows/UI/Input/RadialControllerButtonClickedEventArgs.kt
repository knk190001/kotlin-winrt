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

@ABIMarker(RadialControllerButtonClickedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RadialControllerButtonClickedEventArgs;{206aa438-e651-11e5-bf62-2c27d7404e85})")
@WinRTByReference(brClass = RadialControllerButtonClickedEventArgs.ByReference::class)
public class RadialControllerButtonClickedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRadialControllerButtonClickedEventArgs.WithDefault,
    IRadialControllerButtonClickedEventArgs2.WithDefault, IWinRTObject {
  private val __1472965429_Interface: IRadialControllerButtonClickedEventArgs.WithDefault by lazy {
    as_1472965429()
  }


  private val __1582712007_Interface: IRadialControllerButtonClickedEventArgs2.WithDefault by lazy {
    as_1582712007()
  }


  public override val __1472965429_Ptr: JNAPointer? by lazy {
    __1472965429_Interface.__1472965429_Ptr
  }


  public override val __1582712007_Ptr: JNAPointer? by lazy {
    __1582712007_Interface.__1582712007_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1472965429_Interface, __1582712007_Interface)

  private fun as_1472965429(): IRadialControllerButtonClickedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerButtonClickedEventArgs.ABI.makeIRadialControllerButtonClickedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerButtonClickedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerButtonClickedEventArgs.ABI.makeIRadialControllerButtonClickedEventArgs(ref.value))
  }

  private fun as_1582712007(): IRadialControllerButtonClickedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IRadialControllerButtonClickedEventArgs2.ABI.makeIRadialControllerButtonClickedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRadialControllerButtonClickedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRadialControllerButtonClickedEventArgs2.ABI.makeIRadialControllerButtonClickedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RadialControllerButtonClickedEventArgs> {
    public override fun getValue() = RadialControllerButtonClickedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RadialControllerButtonClickedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RadialControllerButtonClickedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RadialControllerButtonClickedEventArgs {
      val address = segment.toRawLongValue()
      return RadialControllerButtonClickedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RadialControllerButtonClickedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
