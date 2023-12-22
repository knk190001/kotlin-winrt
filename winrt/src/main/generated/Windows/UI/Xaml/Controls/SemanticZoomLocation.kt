package Windows.UI.Xaml.Controls

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

@ABIMarker(SemanticZoomLocation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SemanticZoomLocation;{42011736-e3c2-496b-bc4e-d750d4375b9a})")
@WinRTByReference(brClass = SemanticZoomLocation.ByReference::class)
public class SemanticZoomLocation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISemanticZoomLocation.WithDefault, IWinRTObject {
  private val __564583510_Interface: ISemanticZoomLocation.WithDefault by lazy {
    as_564583510()
  }


  public override val __564583510_Ptr: JNAPointer? by lazy {
    __564583510_Interface.__564583510_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__564583510_Interface)

  public constructor() : this(ABI.activate())

  private fun as_564583510(): ISemanticZoomLocation.WithDefault {
    if(pointer == NULL) {
      return(ISemanticZoomLocation.ABI.makeISemanticZoomLocation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISemanticZoomLocation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISemanticZoomLocation.ABI.makeISemanticZoomLocation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SemanticZoomLocation> {
    public override fun getValue() = SemanticZoomLocation(pointer.getPointer(0))

    public fun setValue(value: SemanticZoomLocation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SemanticZoomLocation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SemanticZoomLocation".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SemanticZoomLocation {
      val address = segment.toRawLongValue()
      return SemanticZoomLocation(Pointer(address))
    }

    public override fun toNative(obj: SemanticZoomLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
