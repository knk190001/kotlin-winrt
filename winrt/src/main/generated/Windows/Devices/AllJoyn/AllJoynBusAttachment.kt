package Windows.Devices.AllJoyn

import Windows.Foundation.Collections.IIterable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AllJoynBusAttachment.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynBusAttachment;{f309f153-1eed-42c3-a20e-436d41fe62f6})")
@WinRTByReference(brClass = AllJoynBusAttachment.ByReference::class)
public class AllJoynBusAttachment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynBusAttachment.WithDefault, IAllJoynBusAttachment2.WithDefault,
    IWinRTObject {
  private val __733708302_Interface: IAllJoynBusAttachment.WithDefault by lazy {
    as_733708302()
  }


  private val __1270120832_Interface: IAllJoynBusAttachment2.WithDefault by lazy {
    as_1270120832()
  }


  public override val __733708302_Ptr: JNAPointer? by lazy {
    __733708302_Interface.__733708302_Ptr
  }


  public override val __1270120832_Ptr: JNAPointer? by lazy {
    __1270120832_Interface.__1270120832_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__733708302_Interface, __1270120832_Interface)

  public constructor() : this(ABI.activate())

  public constructor(connectionSpecification: String) : this(ABI.activate(connectionSpecification))

  private fun as_733708302(): IAllJoynBusAttachment.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynBusAttachment.ABI.makeIAllJoynBusAttachment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynBusAttachment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynBusAttachment.ABI.makeIAllJoynBusAttachment(ref.value))
  }

  private fun as_1270120832(): IAllJoynBusAttachment2.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynBusAttachment2.ABI.makeIAllJoynBusAttachment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynBusAttachment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynBusAttachment2.ABI.makeIAllJoynBusAttachment2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynBusAttachment> {
    public override fun getValue() = AllJoynBusAttachment(pointer.getPointer(0))

    public fun setValue(value: AllJoynBusAttachment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynBusAttachment, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAllJoynBusAttachmentStatics_Instance: IAllJoynBusAttachmentStatics by lazy {
      createIAllJoynBusAttachmentStatics()
    }


    public val IAllJoynBusAttachmentFactory_Instance: IAllJoynBusAttachmentFactory by lazy {
      createIAllJoynBusAttachmentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynBusAttachment".toHandle(),
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

    public fun createIAllJoynBusAttachmentStatics(): IAllJoynBusAttachmentStatics {
      val refiid = Guid.REFIID(IAllJoynBusAttachmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynBusAttachment".toHandle(),refiid,interfacePtr)
      val result =
          IAllJoynBusAttachmentStatics.ABI.makeIAllJoynBusAttachmentStatics(interfacePtr.value)
      return result
    }

    public fun createIAllJoynBusAttachmentFactory(): IAllJoynBusAttachmentFactory {
      val refiid = Guid.REFIID(IAllJoynBusAttachmentFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynBusAttachment".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynBusAttachmentFactory.ABI.makeIAllJoynBusAttachmentFactory(factoryActivatorPtr.value))
    }

    public fun activate(connectionSpecification: String): JNAPointer? =
        IAllJoynBusAttachmentFactory_Instance.Create(connectionSpecification)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynBusAttachment {
      val address = segment.toRawLongValue()
      return AllJoynBusAttachment(Pointer(address))
    }

    public override fun toNative(obj: AllJoynBusAttachment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefault() = ABI.IAllJoynBusAttachmentStatics_Instance.GetDefault()

    public fun GetWatcher(requiredInterfaces: IIterable<String?>) =
        ABI.IAllJoynBusAttachmentStatics_Instance.GetWatcher(requiredInterfaces)
  }
}
