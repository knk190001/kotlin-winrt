package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IVector
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(SmartCardAppletIdGroup.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardAppletIdGroup;{7db165e6-6264-56f4-5e03-c86385395eb1})")
@WinRTByReference(brClass = SmartCardAppletIdGroup.ByReference::class)
public class SmartCardAppletIdGroup(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardAppletIdGroup.WithDefault, ISmartCardAppletIdGroup2.WithDefault,
    IWinRTObject {
  private val __1558021348_Interface: ISmartCardAppletIdGroup.WithDefault by lazy {
    as_1558021348()
  }


  private val __1054021582_Interface: ISmartCardAppletIdGroup2.WithDefault by lazy {
    as_1054021582()
  }


  public override val __1558021348_Ptr: JNAPointer? by lazy {
    __1558021348_Interface.__1558021348_Ptr
  }


  public override val __1054021582_Ptr: JNAPointer? by lazy {
    __1054021582_Interface.__1054021582_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1558021348_Interface, __1054021582_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    displayName: String,
    appletIds: IVector<IBuffer?>,
    emulationCategory: SmartCardEmulationCategory,
    emulationType: SmartCardEmulationType
  ) : this(ABI.activate(displayName, appletIds, emulationCategory, emulationType))

  private fun as_1558021348(): ISmartCardAppletIdGroup.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardAppletIdGroup.ABI.makeISmartCardAppletIdGroup(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardAppletIdGroup>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardAppletIdGroup.ABI.makeISmartCardAppletIdGroup(ref.value))
  }

  private fun as_1054021582(): ISmartCardAppletIdGroup2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardAppletIdGroup2.ABI.makeISmartCardAppletIdGroup2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardAppletIdGroup2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardAppletIdGroup2.ABI.makeISmartCardAppletIdGroup2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardAppletIdGroup> {
    public override fun getValue() = SmartCardAppletIdGroup(pointer.getPointer(0))

    public fun setValue(value: SmartCardAppletIdGroup): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardAppletIdGroup, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISmartCardAppletIdGroupStatics_Instance: ISmartCardAppletIdGroupStatics by lazy {
      createISmartCardAppletIdGroupStatics()
    }


    public val ISmartCardAppletIdGroupFactory_Instance: ISmartCardAppletIdGroupFactory by lazy {
      createISmartCardAppletIdGroupFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardAppletIdGroup".toHandle(),
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

    public fun createISmartCardAppletIdGroupStatics(): ISmartCardAppletIdGroupStatics {
      val refiid = Guid.REFIID(ISmartCardAppletIdGroupStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardAppletIdGroup".toHandle(),refiid,interfacePtr)
      val result =
          ISmartCardAppletIdGroupStatics.ABI.makeISmartCardAppletIdGroupStatics(interfacePtr.value)
      return result
    }

    public fun createISmartCardAppletIdGroupFactory(): ISmartCardAppletIdGroupFactory {
      val refiid = Guid.REFIID(ISmartCardAppletIdGroupFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardAppletIdGroup".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISmartCardAppletIdGroupFactory.ABI.makeISmartCardAppletIdGroupFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      displayName: String,
      appletIds: IVector<IBuffer?>,
      emulationCategory: SmartCardEmulationCategory,
      emulationType: SmartCardEmulationType
    ): JNAPointer? = ISmartCardAppletIdGroupFactory_Instance.Create(displayName, appletIds,
        emulationCategory, emulationType)?.pointer

    public override fun fromNative(segment: MemoryAddress): SmartCardAppletIdGroup {
      val address = segment.toRawLongValue()
      return SmartCardAppletIdGroup(Pointer(address))
    }

    public override fun toNative(obj: SmartCardAppletIdGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_MaxAppletIds() = ABI.ISmartCardAppletIdGroupStatics_Instance.get_MaxAppletIds()
  }
}
