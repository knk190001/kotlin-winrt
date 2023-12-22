package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynBusObjectStoppedEventArgsFactory.ABI.IID
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

@ABIMarker(AllJoynBusObjectStoppedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynBusObjectStoppedEventArgs;{de102115-ef8e-4d42-b93b-a2ae74519766})")
@WinRTByReference(brClass = AllJoynBusObjectStoppedEventArgs.ByReference::class)
public class AllJoynBusObjectStoppedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynBusObjectStoppedEventArgs.WithDefault, IWinRTObject {
  private val __167833352_Interface: IAllJoynBusObjectStoppedEventArgs.WithDefault by lazy {
    as_167833352()
  }


  public override val __167833352_Ptr: JNAPointer? by lazy {
    __167833352_Interface.__167833352_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__167833352_Interface)

  public constructor(status: Int) : this(ABI.activate(status))

  private fun as_167833352(): IAllJoynBusObjectStoppedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynBusObjectStoppedEventArgs.ABI.makeIAllJoynBusObjectStoppedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynBusObjectStoppedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynBusObjectStoppedEventArgs.ABI.makeIAllJoynBusObjectStoppedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynBusObjectStoppedEventArgs> {
    public override fun getValue() = AllJoynBusObjectStoppedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynBusObjectStoppedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynBusObjectStoppedEventArgs, MemoryAddress> {
    public val IAllJoynBusObjectStoppedEventArgsFactory_Instance:
        IAllJoynBusObjectStoppedEventArgsFactory by lazy {
      createIAllJoynBusObjectStoppedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynBusObjectStoppedEventArgsFactory():
        IAllJoynBusObjectStoppedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynBusObjectStoppedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynBusObjectStoppedEventArgsFactory.ABI.makeIAllJoynBusObjectStoppedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(status: Int): JNAPointer? =
        IAllJoynBusObjectStoppedEventArgsFactory_Instance.Create(status)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynBusObjectStoppedEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynBusObjectStoppedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynBusObjectStoppedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
