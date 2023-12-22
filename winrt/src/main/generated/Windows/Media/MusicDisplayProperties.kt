package Windows.Media

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

@ABIMarker(MusicDisplayProperties.ABI::class)
@Signature("rc(Windows.Media.MusicDisplayProperties;{6bbf0c59-d0a0-4d26-92a0-f978e1d18e7b})")
@WinRTByReference(brClass = MusicDisplayProperties.ByReference::class)
public class MusicDisplayProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMusicDisplayProperties.WithDefault, IMusicDisplayProperties2.WithDefault,
    IMusicDisplayProperties3.WithDefault, IWinRTObject {
  private val __732008192_Interface: IMusicDisplayProperties.WithDefault by lazy {
    as_732008192()
  }


  private val __1217417522_Interface: IMusicDisplayProperties2.WithDefault by lazy {
    as_1217417522()
  }


  private val __1217417523_Interface: IMusicDisplayProperties3.WithDefault by lazy {
    as_1217417523()
  }


  public override val __732008192_Ptr: JNAPointer? by lazy {
    __732008192_Interface.__732008192_Ptr
  }


  public override val __1217417522_Ptr: JNAPointer? by lazy {
    __1217417522_Interface.__1217417522_Ptr
  }


  public override val __1217417523_Ptr: JNAPointer? by lazy {
    __1217417523_Interface.__1217417523_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__732008192_Interface, __1217417522_Interface, __1217417523_Interface)

  private fun as_732008192(): IMusicDisplayProperties.WithDefault {
    if(pointer == NULL) {
      return(IMusicDisplayProperties.ABI.makeIMusicDisplayProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMusicDisplayProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMusicDisplayProperties.ABI.makeIMusicDisplayProperties(ref.value))
  }

  private fun as_1217417522(): IMusicDisplayProperties2.WithDefault {
    if(pointer == NULL) {
      return(IMusicDisplayProperties2.ABI.makeIMusicDisplayProperties2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMusicDisplayProperties2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMusicDisplayProperties2.ABI.makeIMusicDisplayProperties2(ref.value))
  }

  private fun as_1217417523(): IMusicDisplayProperties3.WithDefault {
    if(pointer == NULL) {
      return(IMusicDisplayProperties3.ABI.makeIMusicDisplayProperties3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMusicDisplayProperties3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMusicDisplayProperties3.ABI.makeIMusicDisplayProperties3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MusicDisplayProperties> {
    public override fun getValue() = MusicDisplayProperties(pointer.getPointer(0))

    public fun setValue(value: MusicDisplayProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MusicDisplayProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MusicDisplayProperties {
      val address = segment.toRawLongValue()
      return MusicDisplayProperties(Pointer(address))
    }

    public override fun toNative(obj: MusicDisplayProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
