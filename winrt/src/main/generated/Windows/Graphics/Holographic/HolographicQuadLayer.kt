package Windows.Graphics.Holographic

import Windows.Foundation.IClosable
import Windows.Foundation.Size
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.Holographic.IHolographicQuadLayerFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(HolographicQuadLayer.ABI::class)
@Signature("rc(Windows.Graphics.Holographic.HolographicQuadLayer;{30d5a829-7fa4-4026-83bb-d75bae4ea99e})")
@WinRTByReference(brClass = HolographicQuadLayer.ByReference::class)
public class HolographicQuadLayer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClosable.WithDefault, IHolographicQuadLayer.WithDefault, IWinRTObject {
  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __569936399_Interface: IHolographicQuadLayer.WithDefault by lazy {
    as_569936399()
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __569936399_Ptr: JNAPointer? by lazy {
    __569936399_Interface.__569936399_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1260617006_Interface, __569936399_Interface)

  public constructor(size: Size) : this(ABI.activate(size))

  public constructor(size: Size, pixelFormat: DirectXPixelFormat) : this(ABI.activate(size,
      pixelFormat))

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_569936399(): IHolographicQuadLayer.WithDefault {
    if(pointer == NULL) {
      return(IHolographicQuadLayer.ABI.makeIHolographicQuadLayer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHolographicQuadLayer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHolographicQuadLayer.ABI.makeIHolographicQuadLayer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HolographicQuadLayer> {
    public override fun getValue() = HolographicQuadLayer(pointer.getPointer(0))

    public fun setValue(value: HolographicQuadLayer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HolographicQuadLayer, MemoryAddress> {
    public val IHolographicQuadLayerFactory_Instance: IHolographicQuadLayerFactory by lazy {
      createIHolographicQuadLayerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHolographicQuadLayerFactory(): IHolographicQuadLayerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Holographic.HolographicQuadLayer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IHolographicQuadLayerFactory.ABI.makeIHolographicQuadLayerFactory(factoryActivatorPtr.value))
    }

    public fun activate(size: Size): JNAPointer? =
        IHolographicQuadLayerFactory_Instance.Create(size)?.pointer

    public fun activate(size: Size, pixelFormat: DirectXPixelFormat): JNAPointer? =
        IHolographicQuadLayerFactory_Instance.CreateWithPixelFormat(size, pixelFormat)?.pointer

    public override fun fromNative(segment: MemoryAddress): HolographicQuadLayer {
      val address = segment.toRawLongValue()
      return HolographicQuadLayer(Pointer(address))
    }

    public override fun toNative(obj: HolographicQuadLayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
