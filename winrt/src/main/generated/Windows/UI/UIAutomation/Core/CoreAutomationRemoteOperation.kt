package Windows.UI.UIAutomation.Core

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreAutomationRemoteOperation.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.Core.CoreAutomationRemoteOperation;{3ac656f4-e2bc-5c6e-b8e7-b224fb74b060})")
@WinRTByReference(brClass = CoreAutomationRemoteOperation.ByReference::class)
public class CoreAutomationRemoteOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreAutomationRemoteOperation.WithDefault,
    ICoreAutomationRemoteOperation2.WithDefault, IWinRTObject {
  private val __2041023125_Interface: ICoreAutomationRemoteOperation.WithDefault by lazy {
    as_2041023125()
  }


  private val __1152792515_Interface: ICoreAutomationRemoteOperation2.WithDefault by lazy {
    as_1152792515()
  }


  public override val __2041023125_Ptr: JNAPointer? by lazy {
    __2041023125_Interface.__2041023125_Ptr
  }


  public override val __1152792515_Ptr: JNAPointer? by lazy {
    __1152792515_Interface.__1152792515_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2041023125_Interface, __1152792515_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2041023125(): ICoreAutomationRemoteOperation.WithDefault {
    if(pointer == NULL) {
      return(ICoreAutomationRemoteOperation.ABI.makeICoreAutomationRemoteOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreAutomationRemoteOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreAutomationRemoteOperation.ABI.makeICoreAutomationRemoteOperation(ref.value))
  }

  private fun as_1152792515(): ICoreAutomationRemoteOperation2.WithDefault {
    if(pointer == NULL) {
      return(ICoreAutomationRemoteOperation2.ABI.makeICoreAutomationRemoteOperation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreAutomationRemoteOperation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreAutomationRemoteOperation2.ABI.makeICoreAutomationRemoteOperation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreAutomationRemoteOperation> {
    public override fun getValue() = CoreAutomationRemoteOperation(pointer.getPointer(0))

    public fun setValue(value: CoreAutomationRemoteOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreAutomationRemoteOperation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.UIAutomation.Core.CoreAutomationRemoteOperation".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CoreAutomationRemoteOperation {
      val address = segment.toRawLongValue()
      return CoreAutomationRemoteOperation(Pointer(address))
    }

    public override fun toNative(obj: CoreAutomationRemoteOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
