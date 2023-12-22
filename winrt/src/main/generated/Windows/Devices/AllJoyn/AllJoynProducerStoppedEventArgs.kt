package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynProducerStoppedEventArgsFactory.ABI.IID
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

@ABIMarker(AllJoynProducerStoppedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs;{51309770-4937-492d-8080-236439987ceb})")
@WinRTByReference(brClass = AllJoynProducerStoppedEventArgs.ByReference::class)
public class AllJoynProducerStoppedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynProducerStoppedEventArgs.WithDefault, IWinRTObject {
  private val __1120223379_Interface: IAllJoynProducerStoppedEventArgs.WithDefault by lazy {
    as_1120223379()
  }


  public override val __1120223379_Ptr: JNAPointer? by lazy {
    __1120223379_Interface.__1120223379_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1120223379_Interface)

  public constructor(status: Int) : this(ABI.activate(status))

  private fun as_1120223379(): IAllJoynProducerStoppedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynProducerStoppedEventArgs.ABI.makeIAllJoynProducerStoppedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynProducerStoppedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynProducerStoppedEventArgs.ABI.makeIAllJoynProducerStoppedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynProducerStoppedEventArgs> {
    public override fun getValue() = AllJoynProducerStoppedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynProducerStoppedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynProducerStoppedEventArgs, MemoryAddress> {
    public val IAllJoynProducerStoppedEventArgsFactory_Instance:
        IAllJoynProducerStoppedEventArgsFactory by lazy {
      createIAllJoynProducerStoppedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynProducerStoppedEventArgsFactory():
        IAllJoynProducerStoppedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynProducerStoppedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynProducerStoppedEventArgsFactory.ABI.makeIAllJoynProducerStoppedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(status: Int): JNAPointer? =
        IAllJoynProducerStoppedEventArgsFactory_Instance.Create(status)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynProducerStoppedEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynProducerStoppedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynProducerStoppedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
