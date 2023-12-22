package Microsoft.Windows.AppNotifications.Builder

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

@ABIMarker(AppNotificationBuilder.ABI::class)
@Signature("rc(Microsoft.Windows.AppNotifications.Builder.AppNotificationBuilder;{e801d31f-ce03-505c-adec-8a02724ec9de})")
@WinRTByReference(brClass = AppNotificationBuilder.ByReference::class)
public class AppNotificationBuilder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAppNotificationBuilder.WithDefault, IWinRTObject {
  private val __1432407591_Interface: IAppNotificationBuilder.WithDefault by lazy {
    as_1432407591()
  }


  public override val __1432407591_Ptr: JNAPointer? by lazy {
    __1432407591_Interface.__1432407591_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1432407591_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1432407591(): IAppNotificationBuilder.WithDefault {
    if(pointer == NULL) {
      return(IAppNotificationBuilder.ABI.makeIAppNotificationBuilder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAppNotificationBuilder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAppNotificationBuilder.ABI.makeIAppNotificationBuilder(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppNotificationBuilder> {
    public override fun getValue() = AppNotificationBuilder(pointer.getPointer(0))

    public fun setValue(value: AppNotificationBuilder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppNotificationBuilder, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAppNotificationBuilderStatics_Instance: IAppNotificationBuilderStatics by lazy {
      createIAppNotificationBuilderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.Builder.AppNotificationBuilder".toHandle(),
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

    public fun createIAppNotificationBuilderStatics(): IAppNotificationBuilderStatics {
      val refiid = Guid.REFIID(IAppNotificationBuilderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Windows.AppNotifications.Builder.AppNotificationBuilder".toHandle(),refiid,interfacePtr)
      val result =
          IAppNotificationBuilderStatics.ABI.makeIAppNotificationBuilderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppNotificationBuilder {
      val address = segment.toRawLongValue()
      return AppNotificationBuilder(Pointer(address))
    }

    public override fun toNative(obj: AppNotificationBuilder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsUrgentScenarioSupported() =
        ABI.IAppNotificationBuilderStatics_Instance.IsUrgentScenarioSupported()
  }
}
