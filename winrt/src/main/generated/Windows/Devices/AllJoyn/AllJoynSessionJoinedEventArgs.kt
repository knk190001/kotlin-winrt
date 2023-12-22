package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynSessionJoinedEventArgsFactory.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AllJoynSessionJoinedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynSessionJoinedEventArgs;{9e9f5bd0-b5d7-47c5-8dab-b040cc192871})")
@WinRTByReference(brClass = AllJoynSessionJoinedEventArgs.ByReference::class)
public class AllJoynSessionJoinedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynSessionJoinedEventArgs.WithDefault, IWinRTObject {
  private val __1095752567_Interface: IAllJoynSessionJoinedEventArgs.WithDefault by lazy {
    as_1095752567()
  }


  public override val __1095752567_Ptr: JNAPointer? by lazy {
    __1095752567_Interface.__1095752567_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1095752567_Interface)

  public constructor(session: AllJoynSession) : this(ABI.activate(session))

  private fun as_1095752567(): IAllJoynSessionJoinedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynSessionJoinedEventArgs.ABI.makeIAllJoynSessionJoinedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynSessionJoinedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynSessionJoinedEventArgs.ABI.makeIAllJoynSessionJoinedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynSessionJoinedEventArgs> {
    public override fun getValue() = AllJoynSessionJoinedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynSessionJoinedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynSessionJoinedEventArgs, MemoryAddress> {
    public val IAllJoynSessionJoinedEventArgsFactory_Instance: IAllJoynSessionJoinedEventArgsFactory
        by lazy {
      createIAllJoynSessionJoinedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynSessionJoinedEventArgsFactory():
        IAllJoynSessionJoinedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynSessionJoinedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynSessionJoinedEventArgsFactory.ABI.makeIAllJoynSessionJoinedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(session: AllJoynSession): JNAPointer? =
        IAllJoynSessionJoinedEventArgsFactory_Instance.Create(session)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynSessionJoinedEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynSessionJoinedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynSessionJoinedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
