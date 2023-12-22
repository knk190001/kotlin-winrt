package Windows.Networking.Sockets

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

@ABIMarker(StreamSocketControl.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamSocketControl;{fe25adf1-92ab-4af3-9992-0f4c85e36cc4})")
@WinRTByReference(brClass = StreamSocketControl.ByReference::class)
public class StreamSocketControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStreamSocketControl.WithDefault, IStreamSocketControl2.WithDefault,
    IStreamSocketControl3.WithDefault, IStreamSocketControl4.WithDefault, IWinRTObject {
  private val __496111342_Interface: IStreamSocketControl.WithDefault by lazy {
    as_496111342()
  }


  private val __1800417632_Interface: IStreamSocketControl2.WithDefault by lazy {
    as_1800417632()
  }


  private val __1800417633_Interface: IStreamSocketControl3.WithDefault by lazy {
    as_1800417633()
  }


  private val __1800417634_Interface: IStreamSocketControl4.WithDefault by lazy {
    as_1800417634()
  }


  public override val __496111342_Ptr: JNAPointer? by lazy {
    __496111342_Interface.__496111342_Ptr
  }


  public override val __1800417632_Ptr: JNAPointer? by lazy {
    __1800417632_Interface.__1800417632_Ptr
  }


  public override val __1800417633_Ptr: JNAPointer? by lazy {
    __1800417633_Interface.__1800417633_Ptr
  }


  public override val __1800417634_Ptr: JNAPointer? by lazy {
    __1800417634_Interface.__1800417634_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__496111342_Interface, __1800417632_Interface, __1800417633_Interface,
        __1800417634_Interface)

  private fun as_496111342(): IStreamSocketControl.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketControl.ABI.makeIStreamSocketControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketControl.ABI.makeIStreamSocketControl(ref.value))
  }

  private fun as_1800417632(): IStreamSocketControl2.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketControl2.ABI.makeIStreamSocketControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketControl2.ABI.makeIStreamSocketControl2(ref.value))
  }

  private fun as_1800417633(): IStreamSocketControl3.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketControl3.ABI.makeIStreamSocketControl3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketControl3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketControl3.ABI.makeIStreamSocketControl3(ref.value))
  }

  private fun as_1800417634(): IStreamSocketControl4.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketControl4.ABI.makeIStreamSocketControl4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketControl4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketControl4.ABI.makeIStreamSocketControl4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamSocketControl> {
    public override fun getValue() = StreamSocketControl(pointer.getPointer(0))

    public fun setValue(value: StreamSocketControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamSocketControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StreamSocketControl {
      val address = segment.toRawLongValue()
      return StreamSocketControl(Pointer(address))
    }

    public override fun toNative(obj: StreamSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
