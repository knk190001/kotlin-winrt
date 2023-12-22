package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynServiceInfoRemovedEventArgsFactory.ABI.IID
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

@ABIMarker(AllJoynServiceInfoRemovedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynServiceInfoRemovedEventArgs;{3057a95f-1d3f-41f3-8969-e32792627396})")
@WinRTByReference(brClass = AllJoynServiceInfoRemovedEventArgs.ByReference::class)
public class AllJoynServiceInfoRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynServiceInfoRemovedEventArgs.WithDefault, IWinRTObject {
  private val __762173225_Interface: IAllJoynServiceInfoRemovedEventArgs.WithDefault by lazy {
    as_762173225()
  }


  public override val __762173225_Ptr: JNAPointer? by lazy {
    __762173225_Interface.__762173225_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__762173225_Interface)

  public constructor(uniqueName: String) : this(ABI.activate(uniqueName))

  private fun as_762173225(): IAllJoynServiceInfoRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynServiceInfoRemovedEventArgs.ABI.makeIAllJoynServiceInfoRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynServiceInfoRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynServiceInfoRemovedEventArgs.ABI.makeIAllJoynServiceInfoRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynServiceInfoRemovedEventArgs> {
    public override fun getValue() = AllJoynServiceInfoRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: AllJoynServiceInfoRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynServiceInfoRemovedEventArgs, MemoryAddress> {
    public val IAllJoynServiceInfoRemovedEventArgsFactory_Instance:
        IAllJoynServiceInfoRemovedEventArgsFactory by lazy {
      createIAllJoynServiceInfoRemovedEventArgsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynServiceInfoRemovedEventArgsFactory():
        IAllJoynServiceInfoRemovedEventArgsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynServiceInfoRemovedEventArgs".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynServiceInfoRemovedEventArgsFactory.ABI.makeIAllJoynServiceInfoRemovedEventArgsFactory(factoryActivatorPtr.value))
    }

    public fun activate(uniqueName: String): JNAPointer? =
        IAllJoynServiceInfoRemovedEventArgsFactory_Instance.Create(uniqueName)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynServiceInfoRemovedEventArgs {
      val address = segment.toRawLongValue()
      return AllJoynServiceInfoRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: AllJoynServiceInfoRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
