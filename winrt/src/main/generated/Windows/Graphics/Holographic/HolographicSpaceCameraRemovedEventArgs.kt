package Windows.Graphics.Holographic

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

@ABIMarker(HolographicSpaceCameraRemovedEventArgs.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicSpaceCameraRemovedEventArgs;{805444a8-f2ae-322e-8da9-836a0a95a4c1})")
@WinRTByReference(brClass = HolographicSpaceCameraRemovedEventArgs.ByReference::class)
public class HolographicSpaceCameraRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicSpaceCameraRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1825117561_Interface: IHolographicSpaceCameraRemovedEventArgs.WithDefault by lazy {
    as_1825117561()
  }


  public override val __1825117561_Ptr: JNAPointer? by lazy {
    __1825117561_Interface.__1825117561_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1825117561_Interface)

  private fun as_1825117561(): IHolographicSpaceCameraRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHolographicSpaceCameraRemovedEventArgs.ABI.makeIHolographicSpaceCameraRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicSpaceCameraRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicSpaceCameraRemovedEventArgs.ABI.makeIHolographicSpaceCameraRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicSpaceCameraRemovedEventArgs> {
    public override fun getValue() = HolographicSpaceCameraRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HolographicSpaceCameraRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicSpaceCameraRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicSpaceCameraRemovedEventArgs {
      val address = segment.toRawLongValue()
      return HolographicSpaceCameraRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HolographicSpaceCameraRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
