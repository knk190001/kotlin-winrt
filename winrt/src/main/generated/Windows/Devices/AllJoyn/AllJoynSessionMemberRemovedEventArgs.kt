package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynSessionMemberRemovedEventArgsFactory.ABI.IID
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

@ABIMarker(AllJoynSessionMemberRemovedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs;{409a219f-aa4a-4893-b430-baa1b63c6219})")
@WinRTByReference(brClass = AllJoynSessionMemberRemovedEventArgs.ByReference::class)
public class AllJoynSessionMemberRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynSessionMemberRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1542836534_Interface: IAllJoynSessionMemberRemovedEventArgs.WithDefault by lazy {
    as_1542836534()
  }


  public override val __1542836534_Ptr: JNAPointer? by lazy {
    __1542836534_Interface.__1542836534_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1542836534_Interface)

  public constructor(uniqueName: String) : this(ABI.activate(uniqueName))

  private fun as_1542836534(): IAllJoynSessionMemberRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynSessionMemberRemovedEventArgs.ABI.makeIAllJoynSessionMemberRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynSessionMemberRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynSessionMemberRemovedEventArgs.ABI.makeIAllJoynSessionMemberRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynSessionMemberRemovedEventArgs> {
    public override fun getValue() = AllJoynSessionMemberRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynSessionMemberRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynSessionMemberRemovedEventArgs, MemoryAddress> {
    public val IAllJoynSessionMemberRemovedEventArgsFactory_Instance:
        IAllJoynSessionMemberRemovedEventArgsFactory by lazy {
      createIAllJoynSessionMemberRemovedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynSessionMemberRemovedEventArgsFactory():
        IAllJoynSessionMemberRemovedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynSessionMemberRemovedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynSessionMemberRemovedEventArgsFactory.ABI.makeIAllJoynSessionMemberRemovedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(uniqueName: String): JNAPointer? =
        IAllJoynSessionMemberRemovedEventArgsFactory_Instance.Create(uniqueName)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynSessionMemberRemovedEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynSessionMemberRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynSessionMemberRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
