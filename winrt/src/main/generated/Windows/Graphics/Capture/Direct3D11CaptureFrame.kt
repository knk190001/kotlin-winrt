package Windows.Graphics.Capture

import Windows.Foundation.IClosable
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

@ABIMarker(Direct3D11CaptureFrame.ABI::class)
@Signature("rc(Windows.Graphics.Capture.Direct3D11CaptureFrame;{fa50c623-38da-4b32-acf3-fa9734ad800e})")
@WinRTByReference(brClass = Direct3D11CaptureFrame.ByReference::class)
public class Direct3D11CaptureFrame(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDirect3D11CaptureFrame.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __859316092_Interface: IDirect3D11CaptureFrame.WithDefault by lazy {
    as_859316092()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __859316092_Ptr: JNAPointer? by lazy {
    __859316092_Interface.__859316092_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__859316092_Interface, __1260617006_Interface)

  private fun as_859316092(): IDirect3D11CaptureFrame.WithDefault {
    if(pointer == NULL) {
      return(IDirect3D11CaptureFrame.ABI.makeIDirect3D11CaptureFrame(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDirect3D11CaptureFrame>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDirect3D11CaptureFrame.ABI.makeIDirect3D11CaptureFrame(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<Direct3D11CaptureFrame> {
    public override fun getValue() = Direct3D11CaptureFrame(pointer.getPointer(0))

    public fun setValue(value: Direct3D11CaptureFrame): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Direct3D11CaptureFrame, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Direct3D11CaptureFrame {
      val address = segment.toRawLongValue()
      return Direct3D11CaptureFrame(Pointer(address))
    }

    public override fun toNative(obj: Direct3D11CaptureFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
