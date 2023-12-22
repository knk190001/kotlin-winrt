package Windows.Media.Devices

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(RegionOfInterest.ABI::class)
@Signature("rc(Windows.Media.Devices.RegionOfInterest;{e5ecc834-ce66-4e05-a78f-cf391a5ec2d1})")
@WinRTByReference(brClass = RegionOfInterest.ByReference::class)
public class RegionOfInterest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRegionOfInterest.WithDefault, IRegionOfInterest2.WithDefault, IWinRTObject {
  private val __1999242070_Interface: IRegionOfInterest.WithDefault by lazy {
    as_1999242070()
  }


  private val __1846962076_Interface: IRegionOfInterest2.WithDefault by lazy {
    as_1846962076()
  }


  public override val __1999242070_Ptr: JNAPointer? by lazy {
    __1999242070_Interface.__1999242070_Ptr
  }


  public override val __1846962076_Ptr: JNAPointer? by lazy {
    __1846962076_Interface.__1846962076_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1999242070_Interface, __1846962076_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1999242070(): IRegionOfInterest.WithDefault {
    if(pointer == NULL) {
      return(IRegionOfInterest.ABI.makeIRegionOfInterest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRegionOfInterest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRegionOfInterest.ABI.makeIRegionOfInterest(ref.value))
  }

  private fun as_1846962076(): IRegionOfInterest2.WithDefault {
    if(pointer == NULL) {
      return(IRegionOfInterest2.ABI.makeIRegionOfInterest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRegionOfInterest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRegionOfInterest2.ABI.makeIRegionOfInterest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RegionOfInterest> {
    public override fun getValue() = RegionOfInterest(pointer.getPointer(0))

    public fun setValue(value: RegionOfInterest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RegionOfInterest, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Devices.RegionOfInterest".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): RegionOfInterest {
      val address = segment.toRawLongValue()
      return RegionOfInterest(Pointer(address))
    }

    public override fun toNative(obj: RegionOfInterest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
