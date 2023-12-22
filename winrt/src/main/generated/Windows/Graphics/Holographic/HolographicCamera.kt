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

@ABIMarker(HolographicCamera.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicCamera;{e4e98445-9bed-4980-9ba0-e87680d1cb74})")
@WinRTByReference(brClass = HolographicCamera.ByReference::class)
public class HolographicCamera(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHolographicCamera.WithDefault, IHolographicCamera2.WithDefault,
    IHolographicCamera3.WithDefault, IHolographicCamera4.WithDefault,
    IHolographicCamera5.WithDefault, IHolographicCamera6.WithDefault, IWinRTObject {
  private val __484208768_Interface: IHolographicCamera.WithDefault by lazy {
    as_484208768()
  }


  private val __2125569870_Interface: IHolographicCamera2.WithDefault by lazy {
    as_2125569870()
  }


  private val __2125569869_Interface: IHolographicCamera3.WithDefault by lazy {
    as_2125569869()
  }


  private val __2125569868_Interface: IHolographicCamera4.WithDefault by lazy {
    as_2125569868()
  }


  private val __2125569867_Interface: IHolographicCamera5.WithDefault by lazy {
    as_2125569867()
  }


  private val __2125569866_Interface: IHolographicCamera6.WithDefault by lazy {
    as_2125569866()
  }


  public override val __484208768_Ptr: JNAPointer? by lazy {
    __484208768_Interface.__484208768_Ptr
  }


  public override val __2125569870_Ptr: JNAPointer? by lazy {
    __2125569870_Interface.__2125569870_Ptr
  }


  public override val __2125569869_Ptr: JNAPointer? by lazy {
    __2125569869_Interface.__2125569869_Ptr
  }


  public override val __2125569868_Ptr: JNAPointer? by lazy {
    __2125569868_Interface.__2125569868_Ptr
  }


  public override val __2125569867_Ptr: JNAPointer? by lazy {
    __2125569867_Interface.__2125569867_Ptr
  }


  public override val __2125569866_Ptr: JNAPointer? by lazy {
    __2125569866_Interface.__2125569866_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__484208768_Interface, __2125569870_Interface, __2125569869_Interface,
        __2125569868_Interface, __2125569867_Interface, __2125569866_Interface)

  private fun as_484208768(): IHolographicCamera.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCamera.ABI.makeIHolographicCamera(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCamera>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCamera.ABI.makeIHolographicCamera(ref.value))
  }

  private fun as_2125569870(): IHolographicCamera2.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCamera2.ABI.makeIHolographicCamera2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCamera2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCamera2.ABI.makeIHolographicCamera2(ref.value))
  }

  private fun as_2125569869(): IHolographicCamera3.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCamera3.ABI.makeIHolographicCamera3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCamera3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCamera3.ABI.makeIHolographicCamera3(ref.value))
  }

  private fun as_2125569868(): IHolographicCamera4.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCamera4.ABI.makeIHolographicCamera4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCamera4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCamera4.ABI.makeIHolographicCamera4(ref.value))
  }

  private fun as_2125569867(): IHolographicCamera5.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCamera5.ABI.makeIHolographicCamera5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCamera5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCamera5.ABI.makeIHolographicCamera5(ref.value))
  }

  private fun as_2125569866(): IHolographicCamera6.WithDefault {
    if(pointer == NULL) {
      return(IHolographicCamera6.ABI.makeIHolographicCamera6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicCamera6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicCamera6.ABI.makeIHolographicCamera6(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicCamera> {
    public override fun getValue() = HolographicCamera(pointer.getPointer(0))

    public fun setValue(value: HolographicCamera): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicCamera, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HolographicCamera {
      val address = segment.toRawLongValue()
      return HolographicCamera(Pointer(address))
    }

    public override fun toNative(obj: HolographicCamera): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
