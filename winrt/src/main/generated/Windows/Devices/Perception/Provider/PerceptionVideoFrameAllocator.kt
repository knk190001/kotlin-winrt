package Windows.Devices.Perception.Provider

import Windows.Devices.Perception.Provider.IPerceptionVideoFrameAllocatorFactory.ABI.IID
import Windows.Foundation.IClosable
import Windows.Foundation.Size
import Windows.Graphics.Imaging.BitmapAlphaMode
import Windows.Graphics.Imaging.BitmapPixelFormat
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PerceptionVideoFrameAllocator.ABI::class)
@Signature("rc(Windows.Devices.Perception.Provider.PerceptionVideoFrameAllocator;{4c38a7da-fdd8-4ed4-a039-2a6f9b235038})")
@WinRTByReference(brClass = PerceptionVideoFrameAllocator.ByReference::class)
public class PerceptionVideoFrameAllocator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPerceptionVideoFrameAllocator.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __1812257623_Interface: IPerceptionVideoFrameAllocator.WithDefault by lazy {
    as_1812257623()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1812257623_Ptr: JNAPointer? by lazy {
    __1812257623_Interface.__1812257623_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1812257623_Interface, __1260617006_Interface)

  public constructor(
    maxOutstandingFrameCountForWrite: WinDef.UINT,
    format: BitmapPixelFormat,
    resolution: Size,
    alpha: BitmapAlphaMode
  ) : this(ABI.activate(maxOutstandingFrameCountForWrite, format, resolution, alpha))

  private fun as_1812257623(): IPerceptionVideoFrameAllocator.WithDefault {
    if(pointer == NULL) {
      return(IPerceptionVideoFrameAllocator.ABI.makeIPerceptionVideoFrameAllocator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPerceptionVideoFrameAllocator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPerceptionVideoFrameAllocator.ABI.makeIPerceptionVideoFrameAllocator(ref.value))
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
      IByReference<PerceptionVideoFrameAllocator> {
    public override fun getValue() = PerceptionVideoFrameAllocator(pointer.getPointer(0))

    public fun setValue(value: PerceptionVideoFrameAllocator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PerceptionVideoFrameAllocator, MemoryAddress> {
    public val IPerceptionVideoFrameAllocatorFactory_Instance: IPerceptionVideoFrameAllocatorFactory
        by lazy {
      createIPerceptionVideoFrameAllocatorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPerceptionVideoFrameAllocatorFactory():
        IPerceptionVideoFrameAllocatorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Perception.Provider.PerceptionVideoFrameAllocator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPerceptionVideoFrameAllocatorFactory.ABI.makeIPerceptionVideoFrameAllocatorFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      maxOutstandingFrameCountForWrite: WinDef.UINT,
      format: BitmapPixelFormat,
      resolution: Size,
      alpha: BitmapAlphaMode
    ): JNAPointer? =
        IPerceptionVideoFrameAllocatorFactory_Instance.Create(maxOutstandingFrameCountForWrite,
        format, resolution, alpha)?.pointer

    public override fun fromNative(segment: MemoryAddress): PerceptionVideoFrameAllocator {
      val address = segment.toRawLongValue()
      return PerceptionVideoFrameAllocator(Pointer(address))
    }

    public override fun toNative(obj: PerceptionVideoFrameAllocator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
