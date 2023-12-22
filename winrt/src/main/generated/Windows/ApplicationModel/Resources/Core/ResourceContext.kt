package Windows.ApplicationModel.Resources.Core

import Windows.Foundation.Collections.IIterable
import Windows.UI.UIContext
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

@ABIMarker(ResourceContext.ABI::class)
@Signature("rc(Windows.ApplicationModel.Resources.Core.ResourceContext;{2fa22f4b-707e-4b27-ad0d-d0d8cd468fd2})")
@WinRTByReference(brClass = ResourceContext.ByReference::class)
public class ResourceContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IResourceContext.WithDefault, IWinRTObject {
  private val __1395976042_Interface: IResourceContext.WithDefault by lazy {
    as_1395976042()
  }


  public override val __1395976042_Ptr: JNAPointer? by lazy {
    __1395976042_Interface.__1395976042_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1395976042_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1395976042(): IResourceContext.WithDefault {
    if(pointer == NULL) {
      return(IResourceContext.ABI.makeIResourceContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IResourceContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IResourceContext.ABI.makeIResourceContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ResourceContext> {
    public override fun getValue() = ResourceContext(pointer.getPointer(0))

    public fun setValue(value: ResourceContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ResourceContext, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IResourceContextStatics4_Instance: IResourceContextStatics4 by lazy {
      createIResourceContextStatics4()
    }


    public val IResourceContextStatics_Instance: IResourceContextStatics by lazy {
      createIResourceContextStatics()
    }


    public val IResourceContextStatics3_Instance: IResourceContextStatics3 by lazy {
      createIResourceContextStatics3()
    }


    public val IResourceContextStatics2_Instance: IResourceContextStatics2 by lazy {
      createIResourceContextStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.Core.ResourceContext".toHandle(),
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

    public fun createIResourceContextStatics4(): IResourceContextStatics4 {
      val refiid = Guid.REFIID(IResourceContextStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.Core.ResourceContext".toHandle(),refiid,interfacePtr)
      val result = IResourceContextStatics4.ABI.makeIResourceContextStatics4(interfacePtr.value)
      return result
    }

    public fun createIResourceContextStatics(): IResourceContextStatics {
      val refiid = Guid.REFIID(IResourceContextStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.Core.ResourceContext".toHandle(),refiid,interfacePtr)
      val result = IResourceContextStatics.ABI.makeIResourceContextStatics(interfacePtr.value)
      return result
    }

    public fun createIResourceContextStatics3(): IResourceContextStatics3 {
      val refiid = Guid.REFIID(IResourceContextStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.Core.ResourceContext".toHandle(),refiid,interfacePtr)
      val result = IResourceContextStatics3.ABI.makeIResourceContextStatics3(interfacePtr.value)
      return result
    }

    public fun createIResourceContextStatics2(): IResourceContextStatics2 {
      val refiid = Guid.REFIID(IResourceContextStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Resources.Core.ResourceContext".toHandle(),refiid,interfacePtr)
      val result = IResourceContextStatics2.ABI.makeIResourceContextStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ResourceContext {
      val address = segment.toRawLongValue()
      return ResourceContext(Pointer(address))
    }

    public override fun toNative(obj: ResourceContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUIContext(context: UIContext) =
        ABI.IResourceContextStatics4_Instance.GetForUIContext(context)

    public fun CreateMatchingContext(result: IIterable<ResourceQualifier?>) =
        ABI.IResourceContextStatics_Instance.CreateMatchingContext(result)

    public fun SetGlobalQualifierValue(
      key: String,
      value: String,
      persistence: ResourceQualifierPersistence
    ) = ABI.IResourceContextStatics3_Instance.SetGlobalQualifierValue(key, value, persistence)

    public fun GetForCurrentView() = ABI.IResourceContextStatics2_Instance.GetForCurrentView()

    public fun SetGlobalQualifierValue(key: String, value: String) =
        ABI.IResourceContextStatics2_Instance.SetGlobalQualifierValue(key, value)

    public fun ResetGlobalQualifierValues() =
        ABI.IResourceContextStatics2_Instance.ResetGlobalQualifierValues()

    public fun ResetGlobalQualifierValues(qualifierNames: IIterable<String?>) =
        ABI.IResourceContextStatics2_Instance.ResetGlobalQualifierValues(qualifierNames)

    public fun GetForViewIndependentUse() =
        ABI.IResourceContextStatics2_Instance.GetForViewIndependentUse()
  }
}
