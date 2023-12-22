package Windows.Gaming.Input.Custom

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

@ABIMarker(HidGameControllerProvider.ABI::class)
@Signature("rc(Windows.Gaming.Input.Custom.HidGameControllerProvider;{95ce3af4-abf0-4b68-a081-3b7de73ff0e7})")
@WinRTByReference(brClass = HidGameControllerProvider.ByReference::class)
public class HidGameControllerProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidGameControllerProvider.WithDefault, IGameControllerProvider.WithDefault,
    IWinRTObject {
  private val __1774588766_Interface: IHidGameControllerProvider.WithDefault by lazy {
    as_1774588766()
  }


  private val __314032447_Interface: IGameControllerProvider.WithDefault by lazy {
    as_314032447()
  }


  public override val __1774588766_Ptr: JNAPointer? by lazy {
    __1774588766_Interface.__1774588766_Ptr
  }


  public override val __314032447_Ptr: JNAPointer? by lazy {
    __314032447_Interface.__314032447_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1774588766_Interface, __314032447_Interface)

  private fun as_1774588766(): IHidGameControllerProvider.WithDefault {
    if(pointer == NULL) {
      return(IHidGameControllerProvider.ABI.makeIHidGameControllerProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidGameControllerProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidGameControllerProvider.ABI.makeIHidGameControllerProvider(ref.value))
  }

  private fun as_314032447(): IGameControllerProvider.WithDefault {
    if(pointer == NULL) {
      return(IGameControllerProvider.ABI.makeIGameControllerProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGameControllerProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGameControllerProvider.ABI.makeIGameControllerProvider(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HidGameControllerProvider> {
    public override fun getValue() = HidGameControllerProvider(pointer.getPointer(0))

    public fun setValue(value: HidGameControllerProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidGameControllerProvider, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HidGameControllerProvider {
      val address = segment.toRawLongValue()
      return HidGameControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: HidGameControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
