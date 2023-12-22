package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynSessionLostEventArgsFactory.ABI.IID
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

@ABIMarker(AllJoynSessionLostEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs;{e766a48a-8bb8-4954-ae67-d2fa43d1f96b})")
@WinRTByReference(brClass = AllJoynSessionLostEventArgs.ByReference::class)
public class AllJoynSessionLostEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynSessionLostEventArgs.WithDefault, IWinRTObject {
  private val __351264206_Interface: IAllJoynSessionLostEventArgs.WithDefault by lazy {
    as_351264206()
  }


  public override val __351264206_Ptr: JNAPointer? by lazy {
    __351264206_Interface.__351264206_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__351264206_Interface)

  public constructor(reason: AllJoynSessionLostReason) : this(ABI.activate(reason))

  private fun as_351264206(): IAllJoynSessionLostEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynSessionLostEventArgs.ABI.makeIAllJoynSessionLostEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynSessionLostEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynSessionLostEventArgs.ABI.makeIAllJoynSessionLostEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynSessionLostEventArgs> {
    public override fun getValue() = AllJoynSessionLostEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynSessionLostEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynSessionLostEventArgs, MemoryAddress> {
    public val IAllJoynSessionLostEventArgsFactory_Instance: IAllJoynSessionLostEventArgsFactory by
        lazy {
      createIAllJoynSessionLostEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynSessionLostEventArgsFactory(): IAllJoynSessionLostEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynSessionLostEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynSessionLostEventArgsFactory.ABI.makeIAllJoynSessionLostEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(reason: AllJoynSessionLostReason): JNAPointer? =
        IAllJoynSessionLostEventArgsFactory_Instance.Create(reason)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynSessionLostEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynSessionLostEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynSessionLostEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
