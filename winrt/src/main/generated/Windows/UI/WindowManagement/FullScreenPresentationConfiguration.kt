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

@ABIMarker(FullScreenPresentationConfiguration.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.FullScreenPresentationConfiguration;{43d3dcd8-d2a8-503d-a626-15533d6d5f62})")
@WinRTByReference(brClass = FullScreenPresentationConfiguration.ByReference::class)
public class FullScreenPresentationConfiguration(
  ptr: JNAPointer? = NULL
) : AppWindowPresentationConfiguration(ptr), IFullScreenPresentationConfiguration.WithDefault,
    IWinRTObject {
  private val __1519633114_Interface: IFullScreenPresentationConfiguration.WithDefault by lazy {
    as_1519633114()
  }


  public override val __1519633114_Ptr: JNAPointer? by lazy {
    __1519633114_Interface.__1519633114_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1519633114_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1519633114(): IFullScreenPresentationConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IFullScreenPresentationConfiguration.ABI.makeIFullScreenPresentationConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFullScreenPresentationConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFullScreenPresentationConfiguration.ABI.makeIFullScreenPresentationConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FullScreenPresentationConfiguration> {
    public override fun getValue() = FullScreenPresentationConfiguration(pointer.getPointer(0))

    public fun setValue(value: FullScreenPresentationConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FullScreenPresentationConfiguration, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WindowManagement.FullScreenPresentationConfiguration".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): FullScreenPresentationConfiguration {
      val address = segment.toRawLongValue()
      return FullScreenPresentationConfiguration(Pointer(address))
    }

    public override fun toNative(obj: FullScreenPresentationConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
