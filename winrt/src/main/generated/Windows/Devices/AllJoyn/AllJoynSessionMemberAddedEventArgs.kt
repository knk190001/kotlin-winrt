package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynSessionMemberAddedEventArgsFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AllJoynSessionMemberAddedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs;{49a2798a-0dd1-46c1-9cd6-27190e503a5e})")
@WinRTByReference(brClass = AllJoynSessionMemberAddedEventArgs.ByReference::class)
public class AllJoynSessionMemberAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynSessionMemberAddedEventArgs.WithDefault, IWinRTObject {
  private val __639633322_Interface: IAllJoynSessionMemberAddedEventArgs.WithDefault by lazy {
    as_639633322()
  }


  public override val __639633322_Ptr: JNAPointer? by lazy {
    __639633322_Interface.__639633322_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__639633322_Interface)

  public constructor(uniqueName: String) : this(ABI.activate(uniqueName))

  private fun as_639633322(): IAllJoynSessionMemberAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynSessionMemberAddedEventArgs.ABI.makeIAllJoynSessionMemberAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynSessionMemberAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynSessionMemberAddedEventArgs.ABI.makeIAllJoynSessionMemberAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynSessionMemberAddedEventArgs> {
    public override fun getValue() = AllJoynSessionMemberAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynSessionMemberAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynSessionMemberAddedEventArgs, MemoryAddress> {
    public val IAllJoynSessionMemberAddedEventArgsFactory_Instance:
        IAllJoynSessionMemberAddedEventArgsFactory by lazy {
      createIAllJoynSessionMemberAddedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynSessionMemberAddedEventArgsFactory():
        IAllJoynSessionMemberAddedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynSessionMemberAddedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynSessionMemberAddedEventArgsFactory.ABI.makeIAllJoynSessionMemberAddedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(uniqueName: String): JNAPointer? =
        IAllJoynSessionMemberAddedEventArgsFactory_Instance.Create(uniqueName)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynSessionMemberAddedEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynSessionMemberAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynSessionMemberAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
