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

@ABIMarker(MobileBroadbandNetwork.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandNetwork;{cb63928c-0309-4cb6-a8c1-6a5a3c8e1ff6})")
@WinRTByReference(brClass = MobileBroadbandNetwork.ByReference::class)
public class MobileBroadbandNetwork(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandNetwork.WithDefault, IMobileBroadbandNetwork2.WithDefault,
    IMobileBroadbandNetwork3.WithDefault, IWinRTObject {
  private val __149603442_Interface: IMobileBroadbandNetwork.WithDefault by lazy {
    as_149603442()
  }


  private val __342739456_Interface: IMobileBroadbandNetwork2.WithDefault by lazy {
    as_342739456()
  }


  private val __342739457_Interface: IMobileBroadbandNetwork3.WithDefault by lazy {
    as_342739457()
  }


  public override val __149603442_Ptr: JNAPointer? by lazy {
    __149603442_Interface.__149603442_Ptr
  }


  public override val __342739456_Ptr: JNAPointer? by lazy {
    __342739456_Interface.__342739456_Ptr
  }


  public override val __342739457_Ptr: JNAPointer? by lazy {
    __342739457_Interface.__342739457_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__149603442_Interface, __342739456_Interface, __342739457_Interface)

  private fun as_149603442(): IMobileBroadbandNetwork.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandNetwork.ABI.makeIMobileBroadbandNetwork(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandNetwork>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandNetwork.ABI.makeIMobileBroadbandNetwork(ref.value))
  }

  private fun as_342739456(): IMobileBroadbandNetwork2.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandNetwork2.ABI.makeIMobileBroadbandNetwork2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandNetwork2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandNetwork2.ABI.makeIMobileBroadbandNetwork2(ref.value))
  }

  private fun as_342739457(): IMobileBroadbandNetwork3.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandNetwork3.ABI.makeIMobileBroadbandNetwork3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandNetwork3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandNetwork3.ABI.makeIMobileBroadbandNetwork3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandNetwork> {
    public override fun getValue() = MobileBroadbandNetwork(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandNetwork): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandNetwork, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandNetwork {
      val address = segment.toRawLongValue()
      return MobileBroadbandNetwork(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandNetwork): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
