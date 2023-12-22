package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynAcceptSessionJoinerEventArgsFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Byte
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AllJoynAcceptSessionJoinerEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs;{4efb5365-3e8a-4257-8f10-539ce0d56c0f})")
@WinRTByReference(brClass = AllJoynAcceptSessionJoinerEventArgs.ByReference::class)
public class AllJoynAcceptSessionJoinerEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynAcceptSessionJoinerEventArgs.WithDefault, IWinRTObject {
  private val __1830336163_Interface: IAllJoynAcceptSessionJoinerEventArgs.WithDefault by lazy {
    as_1830336163()
  }


  public override val __1830336163_Ptr: JNAPointer? by lazy {
    __1830336163_Interface.__1830336163_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1830336163_Interface)

  public constructor(
    uniqueName: String,
    sessionPort: WinDef.USHORT,
    trafficType: AllJoynTrafficType,
    proximity: Byte,
    acceptSessionJoiner: IAllJoynAcceptSessionJoiner
  ) : this(ABI.activate(uniqueName, sessionPort, trafficType, proximity, acceptSessionJoiner))

  private fun as_1830336163(): IAllJoynAcceptSessionJoinerEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynAcceptSessionJoinerEventArgs.ABI.makeIAllJoynAcceptSessionJoinerEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynAcceptSessionJoinerEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynAcceptSessionJoinerEventArgs.ABI.makeIAllJoynAcceptSessionJoinerEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynAcceptSessionJoinerEventArgs> {
    public override fun getValue() = AllJoynAcceptSessionJoinerEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynAcceptSessionJoinerEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynAcceptSessionJoinerEventArgs, MemoryAddress> {
    public val IAllJoynAcceptSessionJoinerEventArgsFactory_Instance:
        IAllJoynAcceptSessionJoinerEventArgsFactory by lazy {
      createIAllJoynAcceptSessionJoinerEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynAcceptSessionJoinerEventArgsFactory():
        IAllJoynAcceptSessionJoinerEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynAcceptSessionJoinerEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynAcceptSessionJoinerEventArgsFactory.ABI.makeIAllJoynAcceptSessionJoinerEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      uniqueName: String,
      sessionPort: WinDef.USHORT,
      trafficType: AllJoynTrafficType,
      proximity: Byte,
      acceptSessionJoiner: IAllJoynAcceptSessionJoiner
    ): JNAPointer? = IAllJoynAcceptSessionJoinerEventArgsFactory_Instance.Create(uniqueName,
        sessionPort, trafficType, proximity, acceptSessionJoiner)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynAcceptSessionJoinerEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynAcceptSessionJoinerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynAcceptSessionJoinerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
