package Windows.ApplicationModel.ConversationalAgent

import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(ActivationSignalDetectionConfiguration.ABI::class)
@Signature("rc(Windows.ApplicationModel.ConversationalAgent.ActivationSignalDetectionConfiguration;{40d8be16-5217-581c-9ab2-ce9b2f2e8e00})")
@WinRTByReference(brClass = ActivationSignalDetectionConfiguration.ByReference::class)
public class ActivationSignalDetectionConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivationSignalDetectionConfiguration.WithDefault, IClosable.WithDefault,
    IActivationSignalDetectionConfiguration2.WithDefault, IWinRTObject {
  private val __872327733_Interface: IActivationSignalDetectionConfiguration.WithDefault by lazy {
    as_872327733()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1272355897_Interface: IActivationSignalDetectionConfiguration2.WithDefault by lazy {
    as_1272355897()
  }


  public override val __872327733_Ptr: JNAPointer? by lazy {
    __872327733_Interface.__872327733_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1272355897_Ptr: JNAPointer? by lazy {
    __1272355897_Interface.__1272355897_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__872327733_Interface, __1260617006_Interface, __1272355897_Interface)

  private fun as_872327733(): IActivationSignalDetectionConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IActivationSignalDetectionConfiguration.ABI.makeIActivationSignalDetectionConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivationSignalDetectionConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivationSignalDetectionConfiguration.ABI.makeIActivationSignalDetectionConfiguration(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_1272355897(): IActivationSignalDetectionConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(IActivationSignalDetectionConfiguration2.ABI.makeIActivationSignalDetectionConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivationSignalDetectionConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivationSignalDetectionConfiguration2.ABI.makeIActivationSignalDetectionConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ActivationSignalDetectionConfiguration> {
    public override fun getValue() = ActivationSignalDetectionConfiguration(pointer.getPointer(0))

    public fun setValue(value: ActivationSignalDetectionConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivationSignalDetectionConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ActivationSignalDetectionConfiguration {
      val address = segment.toRawLongValue()
      return ActivationSignalDetectionConfiguration(Pointer(address))
    }

    public override fun toNative(obj: ActivationSignalDetectionConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
