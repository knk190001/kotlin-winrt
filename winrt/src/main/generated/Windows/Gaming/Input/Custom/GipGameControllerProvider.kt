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

@ABIMarker(GipGameControllerProvider.ABI::class)
@Signature("rc(Windows.Gaming.Input.Custom.GipGameControllerProvider;{dbcf1e19-1af5-45a8-bf02-a0ee50c823fc})")
@WinRTByReference(brClass = GipGameControllerProvider.ByReference::class)
public class GipGameControllerProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGipGameControllerProvider.WithDefault, IGameControllerProvider.WithDefault,
    IWinRTObject {
  private val __1940074835_Interface: IGipGameControllerProvider.WithDefault by lazy {
    as_1940074835()
  }


  private val __314032447_Interface: IGameControllerProvider.WithDefault by lazy {
    as_314032447()
  }


  public override val __1940074835_Ptr: JNAPointer? by lazy {
    __1940074835_Interface.__1940074835_Ptr
  }


  public override val __314032447_Ptr: JNAPointer? by lazy {
    __314032447_Interface.__314032447_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1940074835_Interface, __314032447_Interface)

  private fun as_1940074835(): IGipGameControllerProvider.WithDefault {
    if(pointer == NULL) {
      return(IGipGameControllerProvider.ABI.makeIGipGameControllerProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGipGameControllerProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGipGameControllerProvider.ABI.makeIGipGameControllerProvider(ref.value))
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
      IByReference<GipGameControllerProvider> {
    public override fun getValue() = GipGameControllerProvider(pointer.getPointer(0))

    public fun setValue(value: GipGameControllerProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GipGameControllerProvider, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GipGameControllerProvider {
      val address = segment.toRawLongValue()
      return GipGameControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: GipGameControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
