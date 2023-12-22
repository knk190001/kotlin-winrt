package Windows.UI.WindowManagement

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DefaultPresentationConfiguration.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.DefaultPresentationConfiguration;{d8c2b53b-2168-5703-a853-d525589fe2b9})")
@WinRTByReference(brClass = DefaultPresentationConfiguration.ByReference::class)
public class DefaultPresentationConfiguration(
  ptr: JNAPointer? = NULL
) : AppWindowPresentationConfiguration(ptr), IDefaultPresentationConfiguration.WithDefault,
    IWinRTObject {
  private val __106615010_Interface: IDefaultPresentationConfiguration.WithDefault by lazy {
    as_106615010()
  }


  public override val __106615010_Ptr: JNAPointer? by lazy {
    __106615010_Interface.__106615010_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__106615010_Interface)

  public constructor() : this(ABI.activate())

  private fun as_106615010(): IDefaultPresentationConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IDefaultPresentationConfiguration.ABI.makeIDefaultPresentationConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDefaultPresentationConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDefaultPresentationConfiguration.ABI.makeIDefaultPresentationConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DefaultPresentationConfiguration> {
    public override fun getValue() = DefaultPresentationConfiguration(pointer.getPointer(0))

    public fun setValue(value: DefaultPresentationConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DefaultPresentationConfiguration, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WindowManagement.DefaultPresentationConfiguration".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DefaultPresentationConfiguration {
      val address = segment.toRawLongValue()
      return DefaultPresentationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: DefaultPresentationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
