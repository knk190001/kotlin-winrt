package Windows.Devices.AllJoyn

import Windows.Devices.AllJoyn.IAllJoynMessageInfoFactory.ABI.IID
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

@ABIMarker(AllJoynMessageInfo.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynMessageInfo;{ff2b0127-2c12-4859-aa3a-c74461ee814c})")
@WinRTByReference(brClass = AllJoynMessageInfo.ByReference::class)
public class AllJoynMessageInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynMessageInfo.WithDefault, IWinRTObject {
  private val __619817284_Interface: IAllJoynMessageInfo.WithDefault by lazy {
    as_619817284()
  }


  public override val __619817284_Ptr: JNAPointer? by lazy {
    __619817284_Interface.__619817284_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__619817284_Interface)

  public constructor(senderUniqueName: String) : this(ABI.activate(senderUniqueName))

  private fun as_619817284(): IAllJoynMessageInfo.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynMessageInfo.ABI.makeIAllJoynMessageInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynMessageInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynMessageInfo.ABI.makeIAllJoynMessageInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynMessageInfo> {
    public override fun getValue() = AllJoynMessageInfo(pointer.getPointer(0))

    public fun setValue(value: AllJoynMessageInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynMessageInfo, MemoryAddress> {
    public val IAllJoynMessageInfoFactory_Instance: IAllJoynMessageInfoFactory by lazy {
      createIAllJoynMessageInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAllJoynMessageInfoFactory(): IAllJoynMessageInfoFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynMessageInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynMessageInfoFactory.ABI.makeIAllJoynMessageInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(senderUniqueName: String): JNAPointer? =
        IAllJoynMessageInfoFactory_Instance.Create(senderUniqueName)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynMessageInfo {
      val address = segment.toRawLongValue()
      return AllJoynMessageInfo(Pointer(address))
    }

    public override fun toNative(obj: AllJoynMessageInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
