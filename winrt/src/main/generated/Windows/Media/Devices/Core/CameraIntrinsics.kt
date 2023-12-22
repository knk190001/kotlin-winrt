package Windows.Media.Devices.Core

import Windows.Foundation.Numerics.Vector2
import Windows.Foundation.Numerics.Vector3
import Windows.Media.Devices.Core.ICameraIntrinsicsFactory.ABI.IID
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

@ABIMarker(CameraIntrinsics.ABI::class)
@Signature("rc(Windows.Media.Devices.Core.CameraIntrinsics;{0aa6ed32-6589-49da-afde-594270ca0aac})")
@WinRTByReference(brClass = CameraIntrinsics.ByReference::class)
public class CameraIntrinsics(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICameraIntrinsics.WithDefault, ICameraIntrinsics2.WithDefault, IWinRTObject {
  private val __1656399753_Interface: ICameraIntrinsics.WithDefault by lazy {
    as_1656399753()
  }


  private val __191215259_Interface: ICameraIntrinsics2.WithDefault by lazy {
    as_191215259()
  }


  public override val __1656399753_Ptr: JNAPointer? by lazy {
    __1656399753_Interface.__1656399753_Ptr
  }


  public override val __191215259_Ptr: JNAPointer? by lazy {
    __191215259_Interface.__191215259_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1656399753_Interface, __191215259_Interface)

  public constructor(
    focalLength: Vector2,
    principalPoint: Vector2,
    radialDistortion: Vector3,
    tangentialDistortion: Vector2,
    imageWidth: WinDef.UINT,
    imageHeight: WinDef.UINT
  ) : this(ABI.activate(focalLength, principalPoint, radialDistortion, tangentialDistortion,
      imageWidth, imageHeight))

  private fun as_1656399753(): ICameraIntrinsics.WithDefault {
    if(pointer == NULL) {
      return(ICameraIntrinsics.ABI.makeICameraIntrinsics(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICameraIntrinsics>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICameraIntrinsics.ABI.makeICameraIntrinsics(ref.value))
  }

  private fun as_191215259(): ICameraIntrinsics2.WithDefault {
    if(pointer == NULL) {
      return(ICameraIntrinsics2.ABI.makeICameraIntrinsics2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICameraIntrinsics2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICameraIntrinsics2.ABI.makeICameraIntrinsics2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CameraIntrinsics> {
    public override fun getValue() = CameraIntrinsics(pointer.getPointer(0))

    public fun setValue(value: CameraIntrinsics): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CameraIntrinsics, MemoryAddress> {
    public val ICameraIntrinsicsFactory_Instance: ICameraIntrinsicsFactory by lazy {
      createICameraIntrinsicsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICameraIntrinsicsFactory(): ICameraIntrinsicsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Devices.Core.CameraIntrinsics".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICameraIntrinsicsFactory.ABI.makeICameraIntrinsicsFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      focalLength: Vector2,
      principalPoint: Vector2,
      radialDistortion: Vector3,
      tangentialDistortion: Vector2,
      imageWidth: WinDef.UINT,
      imageHeight: WinDef.UINT
    ): JNAPointer? = ICameraIntrinsicsFactory_Instance.Create(focalLength, principalPoint,
        radialDistortion, tangentialDistortion, imageWidth, imageHeight)?.pointer

    public override fun fromNative(segment: MemoryAddress): CameraIntrinsics {
      val address = segment.toRawLongValue()
      return CameraIntrinsics(Pointer(address))
    }

    public override fun toNative(obj: CameraIntrinsics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
