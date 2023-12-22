package Microsoft.UI.Composition

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CompositionGraphicsDevice.ABI::class)
@Signature("rc(Microsoft.UI.Composition.CompositionGraphicsDevice;{3d47e3f5-f76c-5f1f-88c0-54a5f2a090d6})")
@WinRTByReference(brClass = CompositionGraphicsDevice.ByReference::class)
public class CompositionGraphicsDevice(
  ptr: JNAPointer? = NULL
) : CompositionObject(ptr), ICompositionGraphicsDevice.WithDefault,
    ICompositionGraphicsDevice2.WithDefault, ICompositionGraphicsDevice3.WithDefault,
    ICompositionGraphicsDevice4.WithDefault, IWinRTObject {
  private val __1714463982_Interface: ICompositionGraphicsDevice.WithDefault by lazy {
    as_1714463982()
  }


  private val __1608775840_Interface: ICompositionGraphicsDevice2.WithDefault by lazy {
    as_1608775840()
  }


  private val __1608775839_Interface: ICompositionGraphicsDevice3.WithDefault by lazy {
    as_1608775839()
  }


  private val __1608775838_Interface: ICompositionGraphicsDevice4.WithDefault by lazy {
    as_1608775838()
  }


  public override val __1714463982_Ptr: JNAPointer? by lazy {
    __1714463982_Interface.__1714463982_Ptr
  }


  public override val __1608775840_Ptr: JNAPointer? by lazy {
    __1608775840_Interface.__1608775840_Ptr
  }


  public override val __1608775839_Ptr: JNAPointer? by lazy {
    __1608775839_Interface.__1608775839_Ptr
  }


  public override val __1608775838_Ptr: JNAPointer? by lazy {
    __1608775838_Interface.__1608775838_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1714463982_Interface, __1608775840_Interface, __1608775839_Interface,
        __1608775838_Interface)

  private fun as_1714463982(): ICompositionGraphicsDevice.WithDefault {
    if(pointer == NULL) {
      return(ICompositionGraphicsDevice.ABI.makeICompositionGraphicsDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionGraphicsDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionGraphicsDevice.ABI.makeICompositionGraphicsDevice(ref.value))
  }

  private fun as_1608775840(): ICompositionGraphicsDevice2.WithDefault {
    if(pointer == NULL) {
      return(ICompositionGraphicsDevice2.ABI.makeICompositionGraphicsDevice2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionGraphicsDevice2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionGraphicsDevice2.ABI.makeICompositionGraphicsDevice2(ref.value))
  }

  private fun as_1608775839(): ICompositionGraphicsDevice3.WithDefault {
    if(pointer == NULL) {
      return(ICompositionGraphicsDevice3.ABI.makeICompositionGraphicsDevice3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionGraphicsDevice3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionGraphicsDevice3.ABI.makeICompositionGraphicsDevice3(ref.value))
  }

  private fun as_1608775838(): ICompositionGraphicsDevice4.WithDefault {
    if(pointer == NULL) {
      return(ICompositionGraphicsDevice4.ABI.makeICompositionGraphicsDevice4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICompositionGraphicsDevice4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICompositionGraphicsDevice4.ABI.makeICompositionGraphicsDevice4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CompositionGraphicsDevice> {
    public override fun getValue() = CompositionGraphicsDevice(pointer.getPointer(0))

    public fun setValue(value: CompositionGraphicsDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CompositionGraphicsDevice, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CompositionGraphicsDevice {
      val address = segment.toRawLongValue()
      return CompositionGraphicsDevice(Pointer(address))
    }

    public override fun toNative(obj: CompositionGraphicsDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
