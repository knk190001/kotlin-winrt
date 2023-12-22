package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandModemConfiguration.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandModemConfiguration;{fce035a3-d6cd-4320-b982-be9d3ec7890f})")
@WinRTByReference(brClass = MobileBroadbandModemConfiguration.ByReference::class)
public class MobileBroadbandModemConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandModemConfiguration.WithDefault,
    IMobileBroadbandModemConfiguration2.WithDefault, IWinRTObject {
  private val __107880152_Interface: IMobileBroadbandModemConfiguration.WithDefault by lazy {
    as_107880152()
  }


  private val __950682634_Interface: IMobileBroadbandModemConfiguration2.WithDefault by lazy {
    as_950682634()
  }


  public override val __107880152_Ptr: JNAPointer? by lazy {
    __107880152_Interface.__107880152_Ptr
  }


  public override val __950682634_Ptr: JNAPointer? by lazy {
    __950682634_Interface.__950682634_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__107880152_Interface, __950682634_Interface)

  private fun as_107880152(): IMobileBroadbandModemConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandModemConfiguration.ABI.makeIMobileBroadbandModemConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandModemConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandModemConfiguration.ABI.makeIMobileBroadbandModemConfiguration(ref.value))
  }

  private fun as_950682634(): IMobileBroadbandModemConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandModemConfiguration2.ABI.makeIMobileBroadbandModemConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandModemConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandModemConfiguration2.ABI.makeIMobileBroadbandModemConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandModemConfiguration> {
    public override fun getValue() = MobileBroadbandModemConfiguration(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandModemConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandModemConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandModemConfiguration {
      val address = segment.toRawLongValue()
      return MobileBroadbandModemConfiguration(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandModemConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
