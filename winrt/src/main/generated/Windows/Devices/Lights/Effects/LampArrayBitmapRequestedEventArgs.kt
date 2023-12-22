package Windows.Devices.Lights.Effects

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

@ABIMarker(LampArrayBitmapRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Lights.Effects.LampArrayBitmapRequestedEventArgs;{c8b4af9e-fe63-4d51-babd-619defb454ba})")
@WinRTByReference(brClass = LampArrayBitmapRequestedEventArgs.ByReference::class)
public class LampArrayBitmapRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILampArrayBitmapRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1950246979_Interface: ILampArrayBitmapRequestedEventArgs.WithDefault by lazy {
    as_1950246979()
  }


  public override val __1950246979_Ptr: JNAPointer? by lazy {
    __1950246979_Interface.__1950246979_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1950246979_Interface)

  private fun as_1950246979(): ILampArrayBitmapRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ILampArrayBitmapRequestedEventArgs.ABI.makeILampArrayBitmapRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILampArrayBitmapRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILampArrayBitmapRequestedEventArgs.ABI.makeILampArrayBitmapRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LampArrayBitmapRequestedEventArgs> {
    public override fun getValue() = LampArrayBitmapRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: LampArrayBitmapRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LampArrayBitmapRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LampArrayBitmapRequestedEventArgs {
      val address = segment.toRawLongValue()
      return LampArrayBitmapRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: LampArrayBitmapRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
