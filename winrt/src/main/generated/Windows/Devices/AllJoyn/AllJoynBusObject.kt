package Windows.Devices.AllJoyn

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

@ABIMarker(AllJoynBusObject.ABI::class)
@Signature("rc(Windows.Devices.AllJoyn.AllJoynBusObject;{e8fd825e-f73a-490c-8804-04e026643047})")
@WinRTByReference(brClass = AllJoynBusObject.ByReference::class)
public class AllJoynBusObject(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAllJoynBusObject.WithDefault, IWinRTObject {
  private val __1177056882_Interface: IAllJoynBusObject.WithDefault by lazy {
    as_1177056882()
  }


  public override val __1177056882_Ptr: JNAPointer? by lazy {
    __1177056882_Interface.__1177056882_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1177056882_Interface)

  public constructor() : this(ABI.activate())

  public constructor(objectPath: String) : this(ABI.activate(objectPath))

  public constructor(objectPath: String, busAttachment: AllJoynBusAttachment) :
      this(ABI.activate(objectPath, busAttachment))

  private fun as_1177056882(): IAllJoynBusObject.WithDefault {
    if(pointer == NULL) {
      return(IAllJoynBusObject.ABI.makeIAllJoynBusObject(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAllJoynBusObject>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAllJoynBusObject.ABI.makeIAllJoynBusObject(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AllJoynBusObject> {
    public override fun getValue() = AllJoynBusObject(pointer.getPointer(0))

    public fun setValue(value: AllJoynBusObject): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AllJoynBusObject, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAllJoynBusObjectFactory_Instance: IAllJoynBusObjectFactory by lazy {
      createIAllJoynBusObjectFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynBusObject".toHandle(),
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

    public fun createIAllJoynBusObjectFactory(): IAllJoynBusObjectFactory {
      val refiid = Guid.REFIID(IAllJoynBusObjectFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.AllJoyn.AllJoynBusObject".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAllJoynBusObjectFactory.ABI.makeIAllJoynBusObjectFactory(factoryActivatorPtr.value))
    }

    public fun activate(objectPath: String): JNAPointer? =
        IAllJoynBusObjectFactory_Instance.Create(objectPath)?.pointer

    public fun activate(objectPath: String, busAttachment: AllJoynBusAttachment): JNAPointer? =
        IAllJoynBusObjectFactory_Instance.CreateWithBusAttachment(objectPath,
        busAttachment)?.pointer

    public override fun fromNative(segment: MemoryAddress): AllJoynBusObject {
      val address = segment.toRawLongValue()
      return AllJoynBusObject(Pointer(address))
    }

    public override fun toNative(obj: AllJoynBusObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
