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

@ABIMarker(XusbGameControllerProvider.ABI::class)
@Signature("rc(Windows.Gaming.Input.Custom.XusbGameControllerProvider;{6e2971eb-0efb-48b4-808b-837643b2f216})")
@WinRTByReference(brClass = XusbGameControllerProvider.ByReference::class)
public class XusbGameControllerProvider(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXusbGameControllerProvider.WithDefault, IGameControllerProvider.WithDefault,
    IWinRTObject {
  private val __346919317_Interface: IXusbGameControllerProvider.WithDefault by lazy {
    as_346919317()
  }


  private val __314032447_Interface: IGameControllerProvider.WithDefault by lazy {
    as_314032447()
  }


  public override val __346919317_Ptr: JNAPointer? by lazy {
    __346919317_Interface.__346919317_Ptr
  }


  public override val __314032447_Ptr: JNAPointer? by lazy {
    __314032447_Interface.__314032447_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__346919317_Interface, __314032447_Interface)

  private fun as_346919317(): IXusbGameControllerProvider.WithDefault {
    if(pointer == NULL) {
      return(IXusbGameControllerProvider.ABI.makeIXusbGameControllerProvider(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXusbGameControllerProvider>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXusbGameControllerProvider.ABI.makeIXusbGameControllerProvider(ref.value))
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
      IByReference<XusbGameControllerProvider> {
    public override fun getValue() = XusbGameControllerProvider(pointer.getPointer(0))

    public fun setValue(value: XusbGameControllerProvider): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XusbGameControllerProvider, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): XusbGameControllerProvider {
      val address = segment.toRawLongValue()
      return XusbGameControllerProvider(Pointer(address))
    }

    public override fun toNative(obj: XusbGameControllerProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
