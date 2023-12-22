package Windows.Graphics.Capture

import Windows.Foundation.IClosable
import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.SizeInt32
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Direct3D11CaptureFramePool.ABI::class)
@Signature("rc(Windows.Graphics.Capture.Direct3D11CaptureFramePool;{24eb6d22-1975-422e-82e7-780dbd8ddf24})")
@WinRTByReference(brClass = Direct3D11CaptureFramePool.ByReference::class)
public class Direct3D11CaptureFramePool(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDirect3D11CaptureFramePool.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1828057672_Interface: IDirect3D11CaptureFramePool.WithDefault by lazy {
    as_1828057672()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1828057672_Ptr: JNAPointer? by lazy {
    __1828057672_Interface.__1828057672_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1828057672_Interface, __1260617006_Interface)

  private fun as_1828057672(): IDirect3D11CaptureFramePool.WithDefault {
    if(pointer == NULL) {
      return(IDirect3D11CaptureFramePool.ABI.makeIDirect3D11CaptureFramePool(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDirect3D11CaptureFramePool>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDirect3D11CaptureFramePool.ABI.makeIDirect3D11CaptureFramePool(ref.value))
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
      IByReference<Direct3D11CaptureFramePool> {
    public override fun getValue() = Direct3D11CaptureFramePool(pointer.getPointer(0))

    public fun setValue(value: Direct3D11CaptureFramePool): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Direct3D11CaptureFramePool, MemoryAddress> {
    public val IDirect3D11CaptureFramePoolStatics_Instance: IDirect3D11CaptureFramePoolStatics by
        lazy {
      createIDirect3D11CaptureFramePoolStatics()
    }


    public val IDirect3D11CaptureFramePoolStatics2_Instance: IDirect3D11CaptureFramePoolStatics2 by
        lazy {
      createIDirect3D11CaptureFramePoolStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDirect3D11CaptureFramePoolStatics(): IDirect3D11CaptureFramePoolStatics {
      val refiid = Guid.REFIID(IDirect3D11CaptureFramePoolStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Capture.Direct3D11CaptureFramePool".toHandle(),refiid,interfacePtr)
      val result =
          IDirect3D11CaptureFramePoolStatics.ABI.makeIDirect3D11CaptureFramePoolStatics(interfacePtr.value)
      return result
    }

    public fun createIDirect3D11CaptureFramePoolStatics2(): IDirect3D11CaptureFramePoolStatics2 {
      val refiid = Guid.REFIID(IDirect3D11CaptureFramePoolStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Capture.Direct3D11CaptureFramePool".toHandle(),refiid,interfacePtr)
      val result =
          IDirect3D11CaptureFramePoolStatics2.ABI.makeIDirect3D11CaptureFramePoolStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Direct3D11CaptureFramePool {
      val address = segment.toRawLongValue()
      return Direct3D11CaptureFramePool(Pointer(address))
    }

    public override fun toNative(obj: Direct3D11CaptureFramePool): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun Create(
      device: IDirect3DDevice,
      pixelFormat: DirectXPixelFormat,
      numberOfBuffers: Int,
      size: SizeInt32
    ) = ABI.IDirect3D11CaptureFramePoolStatics_Instance.Create(device, pixelFormat, numberOfBuffers,
        size)

    public fun CreateFreeThreaded(
      device: IDirect3DDevice,
      pixelFormat: DirectXPixelFormat,
      numberOfBuffers: Int,
      size: SizeInt32
    ) = ABI.IDirect3D11CaptureFramePoolStatics2_Instance.CreateFreeThreaded(device, pixelFormat,
        numberOfBuffers, size)
  }
}
