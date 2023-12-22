package Windows.UI.ViewManagement

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ApplicationViewTransferContext.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.ApplicationViewTransferContext;{8574bc63-3c17-408e-9408-8a1a9ea81bfa})")
@WinRTByReference(brClass = ApplicationViewTransferContext.ByReference::class)
public class ApplicationViewTransferContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IApplicationViewTransferContext.WithDefault, IWinRTObject {
  private val __317404799_Interface: IApplicationViewTransferContext.WithDefault by lazy {
    as_317404799()
  }


  public override val __317404799_Ptr: JNAPointer? by lazy {
    __317404799_Interface.__317404799_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__317404799_Interface)

  public constructor() : this(ABI.activate())

  private fun as_317404799(): IApplicationViewTransferContext.WithDefault {
    if(pointer == NULL) {
      return(IApplicationViewTransferContext.ABI.makeIApplicationViewTransferContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IApplicationViewTransferContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IApplicationViewTransferContext.ABI.makeIApplicationViewTransferContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationViewTransferContext> {
    public override fun getValue() = ApplicationViewTransferContext(pointer.getPointer(0))

    public fun setValue(value: ApplicationViewTransferContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationViewTransferContext, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IApplicationViewTransferContextStatics_Instance:
        IApplicationViewTransferContextStatics by lazy {
      createIApplicationViewTransferContextStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationViewTransferContext".toHandle(),
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

    public fun createIApplicationViewTransferContextStatics():
        IApplicationViewTransferContextStatics {
      val refiid = Guid.REFIID(IApplicationViewTransferContextStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationViewTransferContext".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationViewTransferContextStatics.ABI.makeIApplicationViewTransferContextStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApplicationViewTransferContext {
      val address = segment.toRawLongValue()
      return ApplicationViewTransferContext(Pointer(address))
    }

    public override fun toNative(obj: ApplicationViewTransferContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DataPackageFormatId() =
        ABI.IApplicationViewTransferContextStatics_Instance.get_DataPackageFormatId()
  }
}
