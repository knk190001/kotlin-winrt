package Windows.AI.MachineLearning

import Windows.AI.MachineLearning.ILearningModelDeviceFactory.ABI.IID
import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LearningModelDevice.ABI::class)
@Signature("rc(Windows.AI.MachineLearning.LearningModelDevice;{f5c2c8fe-3f56-4a8c-ac5f-fdb92d8b8252})")
@WinRTByReference(brClass = LearningModelDevice.ByReference::class)
public class LearningModelDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILearningModelDevice.WithDefault, IWinRTObject {
  private val __889104610_Interface: ILearningModelDevice.WithDefault by lazy {
    as_889104610()
  }


  public override val __889104610_Ptr: JNAPointer? by lazy {
    __889104610_Interface.__889104610_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__889104610_Interface)

  public constructor(deviceKind: LearningModelDeviceKind) : this(ABI.activate(deviceKind))

  private fun as_889104610(): ILearningModelDevice.WithDefault {
    if(pointer == NULL) {
      return(ILearningModelDevice.ABI.makeILearningModelDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILearningModelDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILearningModelDevice.ABI.makeILearningModelDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LearningModelDevice> {
    public override fun getValue() = LearningModelDevice(pointer.getPointer(0))

    public fun setValue(value: LearningModelDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LearningModelDevice, MemoryAddress> {
    public val ILearningModelDeviceStatics_Instance: ILearningModelDeviceStatics by lazy {
      createILearningModelDeviceStatics()
    }


    public val ILearningModelDeviceFactory_Instance: ILearningModelDeviceFactory by lazy {
      createILearningModelDeviceFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILearningModelDeviceStatics(): ILearningModelDeviceStatics {
      val refiid = Guid.REFIID(ILearningModelDeviceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.LearningModelDevice".toHandle(),refiid,interfacePtr)
      val result =
          ILearningModelDeviceStatics.ABI.makeILearningModelDeviceStatics(interfacePtr.value)
      return result
    }

    public fun createILearningModelDeviceFactory(): ILearningModelDeviceFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.AI.MachineLearning.LearningModelDevice".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILearningModelDeviceFactory.ABI.makeILearningModelDeviceFactory(factoryActivatorPtr.value))
    }

    public fun activate(deviceKind: LearningModelDeviceKind): JNAPointer? =
        ILearningModelDeviceFactory_Instance.Create(deviceKind)?.pointer

    public override fun fromNative(segment: MemoryAddress): LearningModelDevice {
      val address = segment.toRawLongValue()
      return LearningModelDevice(Pointer(address))
    }

    public override fun toNative(obj: LearningModelDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromDirect3D11Device(device: IDirect3DDevice) =
        ABI.ILearningModelDeviceStatics_Instance.CreateFromDirect3D11Device(device)
  }
}
