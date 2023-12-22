package Windows.Networking.NetworkOperators

import Windows.Networking.NetworkOperators.IMobileBroadbandAntennaSarFactory.ABI.IID
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

@ABIMarker(MobileBroadbandAntennaSar.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandAntennaSar;{b9af4b7e-cbf9-4109-90be-5c06bfd513b6})")
@WinRTByReference(brClass = MobileBroadbandAntennaSar.ByReference::class)
public class MobileBroadbandAntennaSar(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandAntennaSar.WithDefault, IWinRTObject {
  private val __995160675_Interface: IMobileBroadbandAntennaSar.WithDefault by lazy {
    as_995160675()
  }


  public override val __995160675_Ptr: JNAPointer? by lazy {
    __995160675_Interface.__995160675_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__995160675_Interface)

  public constructor(antennaIndex: Int, sarBackoffIndex: Int) : this(ABI.activate(antennaIndex,
      sarBackoffIndex))

  private fun as_995160675(): IMobileBroadbandAntennaSar.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandAntennaSar.ABI.makeIMobileBroadbandAntennaSar(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandAntennaSar>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandAntennaSar.ABI.makeIMobileBroadbandAntennaSar(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandAntennaSar> {
    public override fun getValue() = MobileBroadbandAntennaSar(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandAntennaSar): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandAntennaSar, MemoryAddress> {
    public val IMobileBroadbandAntennaSarFactory_Instance: IMobileBroadbandAntennaSarFactory by
        lazy {
      createIMobileBroadbandAntennaSarFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMobileBroadbandAntennaSarFactory(): IMobileBroadbandAntennaSarFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.MobileBroadbandAntennaSar".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMobileBroadbandAntennaSarFactory.ABI.makeIMobileBroadbandAntennaSarFactory(factoryActivatorPtr.value))
    }

    public fun activate(antennaIndex: Int, sarBackoffIndex: Int): JNAPointer? =
        IMobileBroadbandAntennaSarFactory_Instance.CreateWithIndex(antennaIndex,
        sarBackoffIndex)?.pointer

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandAntennaSar {
      val address = segment.toRawLongValue()
      return MobileBroadbandAntennaSar(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandAntennaSar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
