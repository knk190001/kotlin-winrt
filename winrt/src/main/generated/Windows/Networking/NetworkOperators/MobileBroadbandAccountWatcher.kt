package Windows.Networking.NetworkOperators

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

@ABIMarker(MobileBroadbandAccountWatcher.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher;{6bf3335e-23b5-449f-928d-5e0d3e04471d})")
@WinRTByReference(brClass = MobileBroadbandAccountWatcher.ByReference::class)
public class MobileBroadbandAccountWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMobileBroadbandAccountWatcher.WithDefault, IWinRTObject {
  private val __618476533_Interface: IMobileBroadbandAccountWatcher.WithDefault by lazy {
    as_618476533()
  }


  public override val __618476533_Ptr: JNAPointer? by lazy {
    __618476533_Interface.__618476533_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__618476533_Interface)

  public constructor() : this(ABI.activate())

  private fun as_618476533(): IMobileBroadbandAccountWatcher.WithDefault {
    if(pointer == NULL) {
      return(IMobileBroadbandAccountWatcher.ABI.makeIMobileBroadbandAccountWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMobileBroadbandAccountWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMobileBroadbandAccountWatcher.ABI.makeIMobileBroadbandAccountWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MobileBroadbandAccountWatcher> {
    public override fun getValue() = MobileBroadbandAccountWatcher(pointer.getPointer(0))

    public fun setValue(value: MobileBroadbandAccountWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MobileBroadbandAccountWatcher, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.NetworkOperators.MobileBroadbandAccountWatcher".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MobileBroadbandAccountWatcher {
      val address = segment.toRawLongValue()
      return MobileBroadbandAccountWatcher(Pointer(address))
    }

    public override fun toNative(obj: MobileBroadbandAccountWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
