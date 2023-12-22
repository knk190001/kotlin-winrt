package Windows.Foundation.Diagnostics

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

@ABIMarker(RuntimeBrokerErrorSettings.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings;{16369792-b03e-4ba1-8bb8-d28f4ab4d2c0})")
@WinRTByReference(brClass = RuntimeBrokerErrorSettings.ByReference::class)
public class RuntimeBrokerErrorSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IErrorReportingSettings.WithDefault, IWinRTObject {
  private val __1572226410_Interface: IErrorReportingSettings.WithDefault by lazy {
    as_1572226410()
  }


  public override val __1572226410_Ptr: JNAPointer? by lazy {
    __1572226410_Interface.__1572226410_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1572226410_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1572226410(): IErrorReportingSettings.WithDefault {
    if(pointer == NULL) {
      return(IErrorReportingSettings.ABI.makeIErrorReportingSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IErrorReportingSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IErrorReportingSettings.ABI.makeIErrorReportingSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RuntimeBrokerErrorSettings> {
    public override fun getValue() = RuntimeBrokerErrorSettings(pointer.getPointer(0))

    public fun setValue(value: RuntimeBrokerErrorSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RuntimeBrokerErrorSettings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): RuntimeBrokerErrorSettings {
      val address = segment.toRawLongValue()
      return RuntimeBrokerErrorSettings(Pointer(address))
    }

    public override fun toNative(obj: RuntimeBrokerErrorSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
